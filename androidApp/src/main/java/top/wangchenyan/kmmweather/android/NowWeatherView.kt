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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import top.wangchenyan.kmmweather.android.R
import top.wangchenyan.kmmweather.bean.NowWeatherData

/**
 * Created by wangchenyan.top on 2023/3/15.
 */
@Composable
fun NowWeatherView(data: NowWeatherData) {
    Column(
        Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.linearGradient(
                    listOf(Color(0xFFD0DAE8), Color(0xFFA5B3C5)),
                    start = Offset(Float.POSITIVE_INFINITY, 0f),
                    end = Offset(0f, Float.POSITIVE_INFINITY)
                ),
                shape = RoundedCornerShape(10.dp)
            )
            .padding(horizontal = 16.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(text = "杭州市", color = Color.Black, fontSize = 16.sp)
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = "浙江省/中国", color = Color.Gray, fontSize = 11.sp)
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = data.updateTime,
                color = Color.Gray,
                fontSize = 11.sp
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column {
                Spacer(modifier = Modifier.height(12.dp))
                Icon(
                    painter = painterResource(
                        id = IconMap[data.now.icon] ?: R.drawable.ic_100,
                    ),
                    contentDescription = data.now.text,
                    modifier = Modifier
                        .width(64.dp)
                        .height(64.dp),
                    tint = Colors.Blue
                )
            }
            Column {
                Text(
                    text = "${data.now.temp}°",
                    color = Color.Black,
                    fontSize = 48.sp,
                    modifier = Modifier.height(54.dp)
                )
                Text(
                    text = data.now.text,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color(0x20FFFFFF), RoundedCornerShape(6.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = "${data.now.windScale}级",
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = data.now.windDir,
                    color = Color.Gray,
                    fontSize = 13.sp,
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = "${data.now.humidity}%",
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "相对湿度",
                    color = Color.Gray,
                    fontSize = 13.sp,
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = "${data.now.pressure}百帕",
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "大气压强",
                    color = Color.Gray,
                    fontSize = 13.sp,
                )
            }
        }
    }
}