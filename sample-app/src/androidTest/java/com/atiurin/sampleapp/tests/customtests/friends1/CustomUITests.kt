package com.atiurin.sampleapp.tests.customtests.friends1

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.steps.friends1.AddresseePageSteps
import com.atiurin.sampleapp.steps.friends1.CustomClicksPageSteps
import com.atiurin.sampleapp.steps.friends1.LandingPageSteps
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Rule
import org.junit.Test

class CustomUITests : BaseTest() {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun firstTest() {
        LandingPageSteps
            .openDashboard()
            .tapOnRossGeller()
        AddresseePageSteps
            .checkAddresseeName()
            .typeText("Hello, Ross!")
            .tapSendButton()
            .checkSentText()
    }

    @Test
    fun secondTest() {
        LandingPageSteps
            .openDashboard()
            .openBurgerMenu()
            .tapOnCustomClicks()
        CustomClicksPageSteps
            .tapTopLeft()
            .tapTopRight()
            .tapBottomRight()
            .tapBottomLeft()
    }

}