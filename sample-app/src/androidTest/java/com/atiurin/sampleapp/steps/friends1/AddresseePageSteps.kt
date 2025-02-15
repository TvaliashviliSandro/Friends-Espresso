package com.atiurin.sampleapp.steps.friends1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.data.Constants.ROSS_GELLER
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.addressee
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.addresseePageCheck
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.clearConversation
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.customSentText
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.sendButton
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.sentText
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.settingsButton
import com.atiurin.sampleapp.pages.custompages.friends1.AddresseePage.textInputBar
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText
import org.hamcrest.Matchers.allOf

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

    fun validateChatIsOpen(): AddresseePageSteps{
        addresseePageCheck.isDisplayed()

        return this
    }

    fun validateCustomTextSent(sentText: String): AddresseePageSteps{
        onView(allOf(customSentText, withText(sentText))).isDisplayed()

        return this
    }

    fun clickMoreOptions(): AddresseePageSteps{
        settingsButton.tap()

        return this
    }

    fun clearChat(): AddresseePageSteps{
        clearConversation.tap()

        return this
    }
}
