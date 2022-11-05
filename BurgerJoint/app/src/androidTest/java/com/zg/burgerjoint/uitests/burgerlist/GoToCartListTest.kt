package com.zg.burgerjoint.uitests.burgerlist

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.zg.burgerjoint.R
import com.zg.burgerjoint.activities.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class GoToCartListTest {

    /* private val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)*/

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

/*    @Before
    open fun setUp() {

        activityTestRule.launchActivity(Intent())
    }*/

    @Test
    fun tapOnCart_navigateToCartList() {
        onView(withId(R.id.ivCart))
            .perform(click())

        onView(withId(R.id.btnCheckOut))
            .check(matches(isDisplayed()))

    }
}

