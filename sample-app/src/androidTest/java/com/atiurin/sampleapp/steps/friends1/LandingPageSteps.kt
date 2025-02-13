package com.atiurin.sampleapp.steps.friends1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.helper.swiper
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.UiElements
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.burgerMenu
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.burgerMenu2
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.customClicks
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.customName
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.dashboard
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.rossGeller
import com.atiurin.ultron.extensions.clickCenterLeft
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.tap
import org.hamcrest.Matchers.allOf

object LandingPageSteps {

    fun findFriend(friendName: String) {
        var attempts = 0
        val maxAttempts = 20

        while (attempts < maxAttempts) {
            try {
                onView(allOf(customName, withText(friendName)))
                    .perform(click())
                return
            } catch (e: Exception) {
                swiper(400, 300, 15)
                attempts++
            }
        }
        throw NoSuchElementException("friend with name $friendName not found after $maxAttempts swipes")
    }

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
