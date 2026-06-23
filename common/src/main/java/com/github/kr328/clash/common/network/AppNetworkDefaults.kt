package com.github.kr328.clash.common.network

/** Shared timeouts and UA defaults for app-initiated HTTP (metadata, GitHub API, helpers). */
object AppNetworkDefaults {
    const val CONNECT_TIMEOUT_MS: Int = 15_000
    const val READ_TIMEOUT_MS: Int = 15_000
}
