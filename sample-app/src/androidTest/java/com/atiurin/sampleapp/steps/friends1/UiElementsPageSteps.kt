package com.atiurin.sampleapp.steps.friends1

import com.atiurin.sampleapp.data.Constants.CLICK_8
import com.atiurin.sampleapp.pages.custompages.friends1.LandingPage.dashboard
import com.atiurin.sampleapp.pages.custompages.friends1.UiElementsPage.clickCounter
import com.atiurin.sampleapp.pages.custompages.friends1.UiElementsPage.clickableButton
import com.atiurin.sampleapp.pages.custompages.friends1.UiElementsPage.enableButton
import com.atiurin.sampleapp.pages.custompages.friends1.UiElementsPage.goneButton
import com.atiurin.sampleapp.pages.custompages.friends1.UiElementsPage.invisibleButton
import com.atiurin.sampleapp.pages.custompages.friends1.UiElementsPage.simpleButton
import com.atiurin.ultron.extensions.hasText
import com.atiurin.ultron.extensions.isChecked
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.isNotChecked
import com.atiurin.ultron.extensions.isNotDisplayed
import com.atiurin.ultron.extensions.isNotEnabled
import com.atiurin.ultron.extensions.tap

object UiElementsPageSteps {
    fun checkPageLoaded(): UiElementsPageSteps {
        simpleButton.isDisplayed()
        return this
    }

    fun unmarkEnableButton(): UiElementsPageSteps{
        enableButton.isChecked()
        enableButton.tap()
        return this
    }

    fun unmarkClickableButton(): UiElementsPageSteps{
        clickableButton.isChecked()
        clickableButton.tap()
        return this
    }

    fun validateButtonsUnmarked(): UiElementsPageSteps{
        clickableButton.isNotChecked()
        enableButton.isNotChecked()
        return this
    }

    fun selectInvisible(): UiElementsPageSteps{
        invisibleButton.isNotChecked()
        invisibleButton.tap()
        return this
    }

    fun validateSimpleButtonVisibility(): UiElementsPageSteps{
        simpleButton.isNotDisplayed()
        return this
    }

    fun clickSimpleButton8Times(): UiElementsPageSteps{
        simpleButton
        for (i in 0 until 8){
            simpleButton.tap()
        }

        return this
    }

    fun validateClickedAmount(): UiElementsPageSteps{
        clickCounter.hasText(CLICK_8)
        return this
    }

    fun selectGoneButton(): UiElementsPageSteps{
        goneButton.isNotChecked()
        goneButton.tap()
        return this
    }

    fun validateSimpleButtonEnabled(): UiElementsPageSteps{
        simpleButton.isNotEnabled()
        return this
    }



}