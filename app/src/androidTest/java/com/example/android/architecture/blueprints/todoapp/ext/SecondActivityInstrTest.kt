package com.example.android.architecture.blueprints.todoapp.ext

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android.architecture.blueprints.todoapp.R
import com.example.android.architecture.blueprints.todoapp.di.TasksRepositoryModule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject

@RunWith(AndroidJUnit4::class)
@HiltAndroidTest
@UninstallModules(TasksRepositoryModule::class)
class SecondActivityInstrTest {
    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var controller: SampleController

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun testOnCreate() {
        val scenario = ActivityScenario.launch(SecondActivity::class.java)
        Assert.assertEquals(6, controller.sum(3, 3))
        Espresso.onView(ViewMatchers.withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText(R.string.second_activity)))
        Espresso.onView(ViewMatchers.withId(R.id.textViewSum)).check(ViewAssertions.matches(ViewMatchers.withText("4")))
        scenario.close()
    }
}