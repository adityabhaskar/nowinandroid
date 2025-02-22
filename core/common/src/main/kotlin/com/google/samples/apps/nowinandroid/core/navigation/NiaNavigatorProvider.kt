package com.google.samples.apps.nowinandroid.core.navigation

/**
 * Provides [NiaNavigator] instances for routes/destinations.
 * Individual [NiaNavigator] instances can then be used to create or navigate to destinations.
 */
interface NiaNavigatorProvider {
    fun <T: NiaNavigator<out Any, out Any, out Any>> get(clazz: Class<T>): T
}