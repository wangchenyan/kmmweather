package top.wangchenyan.kmmweather.android

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.blankj.utilcode.util.GsonUtils
import top.wangchenyan.kmmweather.bean.AllWeatherData
import top.wangchenyan.kmmweather.bean.ForecastWeatherData
import top.wangchenyan.kmmweather.bean.NowWeatherData

/**
 * Created by wangchenyan.top on 2023/3/15.
 */

@Composable
fun WeatherPageView() {
    val viewModel: WeatherViewModel = viewModel()
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
                .background(Color(0xFF3700B3))
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "KMM Weather",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Cache",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    viewModel.getWeatherFromCache()
                })
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Net",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    viewModel.getWeatherFromNet()
                })
        }
        when (viewModel.status.value) {
            WeatherViewModel.PageState.Init -> {
                Box(modifier = Modifier.fillMaxSize()) {
                    Text(text = "请选择加载方式", modifier = Modifier.align(Alignment.Center))
                }
            }
            WeatherViewModel.PageState.Loading -> {
                Box(modifier = Modifier.fillMaxSize()) {
                    CircularProgressIndicator(
                        Modifier.align(Alignment.Center)
                    )
                }
            }
            is WeatherViewModel.PageState.Success -> {
                val data = (viewModel.status.value as WeatherViewModel.PageState.Success).data
                WeatherView(data = data)
            }
            is WeatherViewModel.PageState.Fail -> {
                Box(modifier = Modifier.fillMaxSize()) {
                    val message =
                        (viewModel.status.value as WeatherViewModel.PageState.Fail).message
                    Text(text = message, modifier = Modifier.align(Alignment.Center))
                }
            }
        }
    }
}

@Composable
fun WeatherView(data: AllWeatherData) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp)
    ) {
        NowWeatherView(data = data.now)
        Spacer(modifier = Modifier.height(16.dp))
        ForecastWeatherView(data = data.forecast)
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        val nowData = GsonUtils.fromJson(nowWeatherJson, NowWeatherData::class.java)
        val forecastData = GsonUtils.fromJson(forecaseJson, ForecastWeatherData::class.java)
        WeatherView(data = AllWeatherData(nowData, forecastData))
    }
}