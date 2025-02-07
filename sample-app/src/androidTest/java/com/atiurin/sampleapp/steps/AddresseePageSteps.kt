package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.custompages.AddresseePage.addressee
import com.atiurin.sampleapp.pages.custompages.AddresseePage.sendButton
import com.atiurin.sampleapp.pages.custompages.AddresseePage.sentText
import com.atiurin.sampleapp.pages.custompages.AddresseePage.textInputBar
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText

object AddresseePageSteps {
    fun checkAddresseeName(): AddresseePageSteps {
        addressee.isDisplayed().hasText("Ross Geller")
        return this
    }

    fun typeText(message: String): AddresseePageSteps {
        textInputBar.typeText(message)
        return this
    }

    fun tapSendButton(): AddresseePageSteps {
        sendButton.tap()
        return this
    }

    fun checkSentText(): AddresseePageSteps {
        sentText.isDisplayed()
        return this
    }
}