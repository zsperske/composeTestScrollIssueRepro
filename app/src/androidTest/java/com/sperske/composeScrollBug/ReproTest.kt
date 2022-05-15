package com.sperske.composeScrollBug

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performScrollTo
import androidx.test.core.app.launchActivity
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ReproTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun test() {
    launchActivity<MainActivity>().use {
      composeTestRule.onNodeWithText("Compose View 3").performScrollTo()
      composeTestRule.onNodeWithText("Compose View 3").assertIsDisplayed()
    }
  }

}