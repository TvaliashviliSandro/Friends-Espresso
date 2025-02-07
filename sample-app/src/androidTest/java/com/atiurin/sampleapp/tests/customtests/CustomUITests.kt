package com.atiurin.sampleapp.tests.customtests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.pages.custompages.AddresseePage
import com.atiurin.sampleapp.pages.custompages.CustomClicksPage
import com.atiurin.sampleapp.pages.custompages.LandingPage
import com.atiurin.sampleapp.steps.AddresseePageSteps
import com.atiurin.sampleapp.steps.CustomClicksPageSteps
import com.atiurin.sampleapp.steps.LandingPageSteps
import com.atiurin.sampleapp.tests.BaseTest
import com.atiurin.ultron.extensions.clickCenterLeft
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText
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