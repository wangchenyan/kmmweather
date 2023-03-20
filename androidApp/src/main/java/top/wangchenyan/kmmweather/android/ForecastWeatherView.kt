package top.wangchenyan.kmmweather.android

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.blankj.utilcode.util.TimeUtils
import top.wangchenyan.kmmweather.android.R
import top.wangchenyan.kmmweather.bean.Daily
import top.wangchenyan.kmmweather.bean.ForecastWeatherData

/**
 * Created by wangchenyan.top on 2023/3/15.
 */
@Composable
fun ForecastWeatherView(data: ForecastWeatherData) {
    Column(
        Modifier
            .fillMaxWidth()
            .background(
                color = Color(0xFFF7F8F9),
                shape = RoundedCornerShape(10.dp)
            )
            .padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        data.daily.forEach {
            WeatherForecastItem(data = it)
        }
    }
}

@Composable
fun WeatherForecastItem(data: Daily) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = TimeUtils.date2String(
                TimeUtils.string2Date(data.fxDate, "yyyy-MM-dd"),
                "MM月dd日"
            ), color = Color.Black, fontSize = 14.sp
        )
        Spacer(modifier = Modifier.width(20.dp))
        Icon(
            painter = painterResource(
                id = IconMap[data.iconDay] ?: R.drawable.ic_100,
            ),
            contentDescription = data.textDay,
            modifier = Modifier
                .width(20.dp)
                .height(20.dp),
            tint = Colors.Blue
        )
        Text(
            modifier = Modifier.weight(1f),
            text = data.textDay,
            color = Color.Black,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            modifier = Modifier.weight(1f),
            text = "${data.tempMin}°-${data.tempMax}°",
            color = Color.Black,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }
}
