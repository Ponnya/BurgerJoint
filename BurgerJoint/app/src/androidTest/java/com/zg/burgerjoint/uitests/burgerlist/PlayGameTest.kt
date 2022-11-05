package com.zg.burgerjoint.uitests.burgerlist

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.zg.burgerjoint.R
import com.zg.burgerjoint.activities.MainActivity
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class PlayGameTest {
/*    private val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)*/

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

 /*   @Before
    fun setUp() {
        activityTestRule.launchActivity(Intent())
    }*/

    @Test
    fun tapOnCart_navigateToCartList() {
        onView(withId(R.id.btnPlayGame))
            .perform(click())
        onView(withId(R.id.ivGameBurger))
            .check(matches(isDisplayed()))
    }
}