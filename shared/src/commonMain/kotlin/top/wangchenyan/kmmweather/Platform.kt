package top.wangchenyan.kmmweather

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform