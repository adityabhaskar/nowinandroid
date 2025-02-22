package com.google.samples.apps.nowinandroid.feature.bookmarks.navigation

import com.google.samples.apps.nowinandroid.core.navigation.NiaNavigator
import com.google.samples.apps.nowinandroid.feature.bookmarks.navigation.BookmarksNavigator.Actions
import kotlinx.serialization.Serializable

@Serializable
object BookmarksRoute

/**
 * Navigator for the bookmarks feature.
 */
interface BookmarksNavigator: NiaNavigator<BookmarksRoute, Actions, Unit> {
    /**
     * Actions hoisted up from Bookmarks screen.
     */
    class Actions(
        val onTopicClick: (String) -> Unit,
        val onShowSnackbar: suspend (String, String?) -> Boolean,
    )
}