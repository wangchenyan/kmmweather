package top.wangchenyan.kmmweather.android

/**
 * Created by wangchenyan.top on 2023/3/15.
 */

val nowWeatherJson = "{\n" +
        "\"code\": \"200\",\n" +
        "\"updateTime\": \"2023-03-15T10:32+08:00\",\n" +
        "\"fxLink\": \"https://www.qweather.com/weather/hangzhou-101210101.html\",\n" +
        "\"now\": {\n" +
        "\"obsTime\": \"2023-03-15T10:18+08:00\",\n" +
        "\"temp\": \"19\",\n" +
        "\"feelsLike\": \"16\",\n" +
        "\"icon\": \"101\",\n" +
        "\"text\": \"多云\",\n" +
        "\"wind360\": \"180\",\n" +
        "\"windDir\": \"南风\",\n" +
        "\"windScale\": \"3\",\n" +
        "\"windSpeed\": \"15\",\n" +
        "\"humidity\": \"44\",\n" +
        "\"precip\": \"0.0\",\n" +
        "\"pressure\": \"1013\",\n" +
        "\"vis\": \"14\",\n" +
        "\"cloud\": \"91\",\n" +
        "\"dew\": \"4\"\n" +
        "},\n" +
        "\"refer\": {\n" +
        "\"sources\": [\n" +
        "\"QWeather\",\n" +
        "\"NMC\",\n" +
        "\"ECMWF\"\n" +
        "],\n" +
        "\"license\": [\n" +
        "\"CC BY-SA 4.0\"\n" +
        "]\n" +
        "}\n" +
        "}"

val forecaseJson = "{\n" +
        "\"code\": \"200\",\n" +
        "\"updateTime\": \"2023-03-15T15:35+08:00\",\n" +
        "\"fxLink\": \"https://www.qweather.com/weather/hangzhou-101210101.html\",\n" +
        "\"daily\": [\n" +
        "{\n" +
        "\"fxDate\": \"2023-03-15\",\n" +
        "\"sunrise\": \"06:10\",\n" +
        "\"sunset\": \"18:08\",\n" +
        "\"moonrise\": \"00:56\",\n" +
        "\"moonset\": \"11:05\",\n" +
        "\"moonPhase\": \"下弦月\",\n" +
        "\"moonPhaseIcon\": \"806\",\n" +
        "\"tempMax\": \"26\",\n" +
        "\"tempMin\": \"10\",\n" +
        "\"iconDay\": \"101\",\n" +
        "\"textDay\": \"多云\",\n" +
        "\"iconNight\": \"151\",\n" +
        "\"textNight\": \"多云\",\n" +
        "\"wind360Day\": \"0\",\n" +
        "\"windDirDay\": \"北风\",\n" +
        "\"windScaleDay\": \"4-5\",\n" +
        "\"windSpeedDay\": \"34\",\n" +
        "\"wind360Night\": \"0\",\n" +
        "\"windDirNight\": \"北风\",\n" +
        "\"windScaleNight\": \"3-4\",\n" +
        "\"windSpeedNight\": \"24\",\n" +
        "\"humidity\": \"76\",\n" +
        "\"precip\": \"0.0\",\n" +
        "\"pressure\": \"1024\",\n" +
        "\"vis\": \"25\",\n" +
        "\"cloud\": \"25\",\n" +
        "\"uvIndex\": \"7\"\n" +
        "},\n" +
        "{\n" +
        "\"fxDate\": \"2023-03-16\",\n" +
        "\"sunrise\": \"06:09\",\n" +
        "\"sunset\": \"18:09\",\n" +
        "\"moonrise\": \"02:03\",\n" +
        "\"moonset\": \"12:08\",\n" +
        "\"moonPhase\": \"残月\",\n" +
        "\"moonPhaseIcon\": \"807\",\n" +
        "\"tempMax\": \"13\",\n" +
        "\"tempMin\": \"10\",\n" +
        "\"iconDay\": \"104\",\n" +
        "\"textDay\": \"阴\",\n" +
        "\"iconNight\": \"305\",\n" +
        "\"textNight\": \"小雨\",\n" +
        "\"wind360Day\": \"90\",\n" +
        "\"windDirDay\": \"东风\",\n" +
        "\"windScaleDay\": \"4-5\",\n" +
        "\"windSpeedDay\": \"34\",\n" +
        "\"wind360Night\": \"45\",\n" +
        "\"windDirNight\": \"东北风\",\n" +
        "\"windScaleNight\": \"3-4\",\n" +
        "\"windSpeedNight\": \"24\",\n" +
        "\"humidity\": \"89\",\n" +
        "\"precip\": \"0.0\",\n" +
        "\"pressure\": \"1019\",\n" +
        "\"vis\": \"15\",\n" +
        "\"cloud\": \"25\",\n" +
        "\"uvIndex\": \"7\"\n" +
        "},\n" +
        "{\n" +
        "\"fxDate\": \"2023-03-17\",\n" +
        "\"sunrise\": \"06:08\",\n" +
        "\"sunset\": \"18:09\",\n" +
        "\"moonrise\": \"03:03\",\n" +
        "\"moonset\": \"13:17\",\n" +
        "\"moonPhase\": \"残月\",\n" +
        "\"moonPhaseIcon\": \"807\",\n" +
        "\"tempMax\": \"11\",\n" +
        "\"tempMin\": \"9\",\n" +
        "\"iconDay\": \"314\",\n" +
        "\"textDay\": \"小到中雨\",\n" +
        "\"iconNight\": \"305\",\n" +
        "\"textNight\": \"小雨\",\n" +
        "\"wind360Day\": \"315\",\n" +
        "\"windDirDay\": \"西北风\",\n" +
        "\"windScaleDay\": \"3-4\",\n" +
        "\"windSpeedDay\": \"24\",\n" +
        "\"wind360Night\": \"315\",\n" +
        "\"windDirNight\": \"西北风\",\n" +
        "\"windScaleNight\": \"3-4\",\n" +
        "\"windSpeedNight\": \"16\",\n" +
        "\"humidity\": \"85\",\n" +
        "\"precip\": \"5.1\",\n" +
        "\"pressure\": \"1021\",\n" +
        "\"vis\": \"24\",\n" +
        "\"cloud\": \"68\",\n" +
        "\"uvIndex\": \"2\"\n" +
        "},\n" +
        "{\n" +
        "\"fxDate\": \"2023-03-18\",\n" +
        "\"sunrise\": \"06:07\",\n" +
        "\"sunset\": \"18:10\",\n" +
        "\"moonrise\": \"03:56\",\n" +
        "\"moonset\": \"14:29\",\n" +
        "\"moonPhase\": \"残月\",\n" +
        "\"moonPhaseIcon\": \"807\",\n" +
        "\"tempMax\": \"13\",\n" +
        "\"tempMin\": \"8\",\n" +
        "\"iconDay\": \"104\",\n" +
        "\"textDay\": \"阴\",\n" +
        "\"iconNight\": \"104\",\n" +
        "\"textNight\": \"阴\",\n" +
        "\"wind360Day\": \"45\",\n" +
        "\"windDirDay\": \"东北风\",\n" +
        "\"windScaleDay\": \"3-4\",\n" +
        "\"windSpeedDay\": \"16\",\n" +
        "\"wind360Night\": \"90\",\n" +
        "\"windDirNight\": \"东风\",\n" +
        "\"windScaleNight\": \"3-4\",\n" +
        "\"windSpeedNight\": \"16\",\n" +
        "\"humidity\": \"71\",\n" +
        "\"precip\": \"0.0\",\n" +
        "\"pressure\": \"1019\",\n" +
        "\"vis\": \"25\",\n" +
        "\"cloud\": \"25\",\n" +
        "\"uvIndex\": \"2\"\n" +
        "},\n" +
        "{\n" +
        "\"fxDate\": \"2023-03-19\",\n" +
        "\"sunrise\": \"06:05\",\n" +
        "\"sunset\": \"18:10\",\n" +
        "\"moonrise\": \"04:41\",\n" +
        "\"moonset\": \"15:39\",\n" +
        "\"moonPhase\": \"残月\",\n" +
        "\"moonPhaseIcon\": \"807\",\n" +
        "\"tempMax\": \"12\",\n" +
        "\"tempMin\": \"8\",\n" +
        "\"iconDay\": \"305\",\n" +
        "\"textDay\": \"小雨\",\n" +
        "\"iconNight\": \"305\",\n" +
        "\"textNight\": \"小雨\",\n" +
        "\"wind360Day\": \"90\",\n" +
        "\"windDirDay\": \"东风\",\n" +
        "\"windScaleDay\": \"3-4\",\n" +
        "\"windSpeedDay\": \"16\",\n" +
        "\"wind360Night\": \"0\",\n" +
        "\"windDirNight\": \"北风\",\n" +
        "\"windScaleNight\": \"1-2\",\n" +
        "\"windSpeedNight\": \"3\",\n" +
        "\"humidity\": \"93\",\n" +
        "\"precip\": \"1.0\",\n" +
        "\"pressure\": \"1013\",\n" +
        "\"vis\": \"24\",\n" +
        "\"cloud\": \"55\",\n" +
        "\"uvIndex\": \"5\"\n" +
        "},\n" +
        "{\n" +
        "\"fxDate\": \"2023-03-20\",\n" +
        "\"sunrise\": \"06:04\",\n" +
        "\"sunset\": \"18:11\",\n" +
        "\"moonrise\": \"05:20\",\n" +
        "\"moonset\": \"16:48\",\n" +
        "\"moonPhase\": \"残月\",\n" +
        "\"moonPhaseIcon\": \"807\",\n" +
        "\"tempMax\": \"19\",\n" +
        "\"tempMin\": \"10\",\n" +
        "\"iconDay\": \"305\",\n" +
        "\"textDay\": \"小雨\",\n" +
        "\"iconNight\": \"315\",\n" +
        "\"textNight\": \"中到大雨\",\n" +
        "\"wind360Day\": \"90\",\n" +
        "\"windDirDay\": \"东风\",\n" +
        "\"windScaleDay\": \"3-4\",\n" +
        "\"windSpeedDay\": \"16\",\n" +
        "\"wind360Night\": \"0\",\n" +
        "\"windDirNight\": \"北风\",\n" +
        "\"windScaleNight\": \"1-2\",\n" +
        "\"windSpeedNight\": \"3\",\n" +
        "\"humidity\": \"93\",\n" +
        "\"precip\": \"1.0\",\n" +
        "\"pressure\": \"1008\",\n" +
        "\"vis\": \"25\",\n" +
        "\"cloud\": \"55\",\n" +
        "\"uvIndex\": \"2\"\n" +
        "},\n" +
        "{\n" +
        "\"fxDate\": \"2023-03-21\",\n" +
        "\"sunrise\": \"06:03\",\n" +
        "\"sunset\": \"18:12\",\n" +
        "\"moonrise\": \"05:55\",\n" +
        "\"moonset\": \"17:54\",\n" +
        "\"moonPhase\": \"新月\",\n" +
        "\"moonPhaseIcon\": \"800\",\n" +
        "\"tempMax\": \"23\",\n" +
        "\"tempMin\": \"15\",\n" +
        "\"iconDay\": \"307\",\n" +
        "\"textDay\": \"大雨\",\n" +
        "\"iconNight\": \"314\",\n" +
        "\"textNight\": \"小到中雨\",\n" +
        "\"wind360Day\": \"180\",\n" +
        "\"windDirDay\": \"南风\",\n" +
        "\"windScaleDay\": \"3-4\",\n" +
        "\"windSpeedDay\": \"16\",\n" +
        "\"wind360Night\": \"0\",\n" +
        "\"windDirNight\": \"北风\",\n" +
        "\"windScaleNight\": \"1-2\",\n" +
        "\"windSpeedNight\": \"3\",\n" +
        "\"humidity\": \"98\",\n" +
        "\"precip\": \"12.6\",\n" +
        "\"pressure\": \"1005\",\n" +
        "\"vis\": \"21\",\n" +
        "\"cloud\": \"76\",\n" +
        "\"uvIndex\": \"2\"\n" +
        "}\n" +
        "],\n" +
        "\"refer\": {\n" +
        "\"sources\": [\n" +
        "\"QWeather\",\n" +
        "\"NMC\",\n" +
        "\"ECMWF\"\n" +
        "],\n" +
        "\"license\": [\n" +
        "\"CC BY-SA 4.0\"\n" +
        "]\n" +
        "}\n" +
        "}"