package top.wangchenyan.kmmweather.android

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blankj.utilcode.util.Utils
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import top.wangchenyan.kmmweather.Weather
import top.wangchenyan.kmmweather.bean.AllWeatherData
import top.wangchenyan.kmmweather.db.DatabaseDriverFactory

/**
 * Created by wangchenyan.top on 2023/3/16.
 */
class WeatherViewModel : ViewModel() {
    var status = mutableStateOf<PageState>(PageState.Init)
    private val weather = Weather(DatabaseDriverFactory(Utils.getApp()))

    fun getWeatherFromNet() {
        status.value = PageState.Loading
        viewModelScope.launch {
            status.value = try {
                PageState.Success(weather.getAllFromNet())
            } catch (e: Exception) {
                PageState.Fail(e.localizedMessage ?: "error")
            }
        }
    }

    fun getWeatherFromCache() {
        status.value = PageState.Loading
        viewModelScope.launch {
            status.value = try {
                delay(1000)
                val data = weather.getAllFromDb()
                if (data == null) {
                    PageState.Fail("no cache")
                } else {
                    PageState.Success(data)
                }
            } catch (e: Exception) {
                PageState.Fail(e.localizedMessage ?: "error")
            }
        }
    }

    sealed class PageState {
        object Init : PageState()
        object Loading : PageState()
        class Success(val data: AllWeatherData) : PageState()
        class Fail(val message: String) : PageState()
    }
}