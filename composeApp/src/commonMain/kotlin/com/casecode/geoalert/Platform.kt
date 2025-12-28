package com.casecode.geoalert

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform