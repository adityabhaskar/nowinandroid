/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.feature.bookmarks.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.google.samples.apps.nowinandroid.feature.bookmarks.BookmarksRoute
import com.google.samples.apps.nowinandroid.feature.bookmarks.navigation.BookmarksNavigator.Actions

internal class BookmarksNavigatorImpl : BookmarksNavigator {
    override fun navigateToRoute(
        navController: NavController,
        route: BookmarksRoute,
        navOptions: NavOptions?,
    ) {
        navController.navigate(route = route, navOptions)
    }

    override fun screen(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        actions: Actions,
        properties: Unit,
    ) {
        with(navGraphBuilder) {
            composable<BookmarksRoute> {
                BookmarksRoute(actions.onTopicClick, actions.onShowSnackbar)
            }
        }
    }
}