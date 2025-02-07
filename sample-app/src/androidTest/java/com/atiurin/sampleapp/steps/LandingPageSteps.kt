package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.custompages.LandingPage.burgerMenu
import com.atiurin.sampleapp.pages.custompages.LandingPage.customClicks
import com.atiurin.sampleapp.pages.custompages.LandingPage.dashboard
import com.atiurin.sampleapp.pages.custompages.LandingPage.rossGeller
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
}