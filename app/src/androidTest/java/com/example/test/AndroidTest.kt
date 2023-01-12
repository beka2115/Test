package com.example.test

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class AndroidTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.firstNum)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.firstNum)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.secondNum)).perform(ViewActions.typeText("5"))
            Espresso.onView(withId(R.id.secondNum)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.btnCalculate)).perform(ViewActions.click())
            Espresso.onView(withId(R.id.textMain))
                .check(ViewAssertions.matches(ViewMatchers.withText("9.0")))
        }
    }

    @Test
    fun simpleDivide() {
        runBlocking {
            Espresso.onView(withId(R.id.firstNum)).perform(ViewActions.typeText("25"))
            Espresso.onView(withId(R.id.firstNum)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.secondNum)).perform(ViewActions.typeText("5"))
            Espresso.onView(withId(R.id.secondNum)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.btnDivide)).perform(ViewActions.click())
            Espresso.onView(withId(R.id.textMain))
                .check(ViewAssertions.matches(ViewMatchers.withText("5.0")))
        }
    }

}