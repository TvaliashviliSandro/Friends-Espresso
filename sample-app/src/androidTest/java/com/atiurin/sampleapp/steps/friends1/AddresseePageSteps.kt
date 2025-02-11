package com.atiurin.sampleapp.steps.friends1

import com.atiurin.sampleapp.data.Constants.ROSS_GELLER
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.addressee
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.sendButton
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.sentText
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.textInputBar
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText

object AddresseePageSteps {
    fun checkAddresseeName(): AddresseePageSteps {
        addressee.isDisplayed().hasText(ROSS_GELLER)
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