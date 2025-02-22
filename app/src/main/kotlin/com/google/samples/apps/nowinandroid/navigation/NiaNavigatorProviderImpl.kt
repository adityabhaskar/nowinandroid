package com.google.samples.apps.nowinandroid.navigation

import com.google.samples.apps.nowinandroid.core.navigation.NiaNavigator
import com.google.samples.apps.nowinandroid.core.navigation.NiaNavigatorProvider
import javax.inject.Inject

internal class NiaNavigatorProviderImpl @Inject constructor(
    // Key should be the Class for the navigator, value should be the navigator instance itself
    private val navigators: Map<@JvmSuppressWildcards Class<*>, @JvmSuppressWildcards NiaNavigator<*, *, *>>,
): NiaNavigatorProvider {
    override fun <T : NiaNavigator<out Any, out Any, out Any>> get(clazz: Class<T>): T {
        return navigators[clazz] as T
    }
}