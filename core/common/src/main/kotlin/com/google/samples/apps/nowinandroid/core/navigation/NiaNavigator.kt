package com.google.samples.apps.nowinandroid.core.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions

/**
 * Generic interface for a route destination.
 *
 * @param Route Generic type representing the class for the route
 * @param Actions Generic type representing the class for the actions/callbacks that may need
 * hoisting from the destination.
 * @param Properties Generic type representing the class for the properties that may need to be
 * passed down to the destination.
 */
interface NiaNavigator<Route, Actions, Properties> {
    /**
     * Navigates to the [route] with the given [navOptions].
     */
    fun navigateToRoute(
        navController: NavController,
        route: Route,
        navOptions: NavOptions?,
    )

    /**
     * Creates the destination component/subgraph. Callbacks/slots are hoisted as part of [actions],
     * and properties are passed down as part of [properties].
     */
    fun screen(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        actions: Actions,
        properties: Properties
    )
}