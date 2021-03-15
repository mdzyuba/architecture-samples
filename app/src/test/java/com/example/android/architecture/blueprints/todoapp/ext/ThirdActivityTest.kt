package com.example.android.architecture.blueprints.todoapp.ext

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.architecture.blueprints.todoapp.R
import com.example.android.architecture.blueprints.todoapp.di.TasksRepositoryModule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
@HiltAndroidTest
@UninstallModules(TasksRepositoryModule::class)
class ThirdActivityTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun testGetController() {
        val scenario = ActivityScenario.launch(ThirdActivity::class.java)
        Espresso.onView(ViewMatchers.withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText(R.string.third_activity)))
        Espresso.onView(ViewMatchers.withId(R.id.textViewSum)).check(ViewAssertions.matches(ViewMatchers.withText("6")))
        scenario.close()
    }

    fun foo() {
    }
}