package com.atiurin.sampleapp.tests.customtests.friends2

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.steps.friends1.LandingPageSteps
import com.atiurin.sampleapp.steps.friends1.UiElementsPageSteps
import com.atiurin.sampleapp.tests.BaseTest
import com.atiurin.sampleapp.tests.UiElementsTest
import org.junit.Rule
import org.junit.Test

class UIElementsTests : BaseTest(){
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun firstTest(){
        LandingPageSteps
            .openDashboard()
            .openBurgerMenu2()
            .openUiElements()
        UiElementsPageSteps
            .checkPageLoaded()
            .unmarkEnableButton()
            .unmarkClickableButton()
            .validateButtonsUnmarked()
            .selectInvisible()
            .validateSimpleButtonEnabled()
    }

    @Test
    fun secondTest(){
        LandingPageSteps
            .openDashboard()
            .openBurgerMenu2()
            .openUiElements()
        UiElementsPageSteps
            .checkPageLoaded()
            .clickSimpleButton8Times()
            .validateClickedAmount()
            .selectGoneButton()
            .validateSimpleButtonVisibility()

    }


}