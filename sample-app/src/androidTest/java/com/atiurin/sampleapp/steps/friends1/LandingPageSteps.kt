package com.atiurin.sampleapp.steps.friends1

import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.UiElements
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.burgerMenu
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.burgerMenu2
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.customClicks
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.dashboard
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.rossGeller
import com.atiurin.ultron.extensions.clickCenterLeft
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.tap

object LandingPageSteps {
    fun openDashboard(): LandingPageSteps {
        dashboard.isDisplayed()
        return this
    }

    fun tapOnRossGeller(): AddresseePageSteps {
        rossGeller.tap()
        return AddresseePageSteps
    }

    fun openBurgerMenu(): LandingPageSteps {
        burgerMenu.clickCenterLeft()
        return this
    }

    fun tapOnCustomClicks(): CustomClicksPageSteps {
        customClicks.tap()
        return CustomClicksPageSteps
    }

    fun openBurgerMenu2(): LandingPageSteps {
        burgerMenu2.tap()
        return this
    }

    fun openUiElements(): UiElementsPageSteps{
        UiElements.tap()
        return UiElementsPageSteps
    }
}