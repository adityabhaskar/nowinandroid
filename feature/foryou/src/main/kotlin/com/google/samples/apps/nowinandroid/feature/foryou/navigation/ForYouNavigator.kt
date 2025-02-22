package com.google.samples.apps.nowinandroid.feature.foryou.navigation

import androidx.navigation.NavGraphBuilder
import com.google.samples.apps.nowinandroid.core.navigation.NiaNavigator
import com.google.samples.apps.nowinandroid.feature.foryou.navigation.ForYouNavigator.Actions
import kotlinx.serialization.Serializable

// Assume that this file lives in `:api` module

@Serializable
data object ForYouBaseRoute // route to base navigation graph

/**
 * Navigator for the ForYou feature.
 */
interface ForYouNavigator: NiaNavigator<ForYouBaseRoute, Actions, Unit> {
    /**
     * Actions & slots hoisted up from ForYou screen.
     * @property onTopicClick - Called when a topic is clicked, contains the ID of the topic
     * @property topicDestination - Destination for topic content
     */
    class Actions(
        val onTopicClick: (String) -> Unit,
        val topicDestination: (NavGraphBuilder) -> Unit,
    )
}