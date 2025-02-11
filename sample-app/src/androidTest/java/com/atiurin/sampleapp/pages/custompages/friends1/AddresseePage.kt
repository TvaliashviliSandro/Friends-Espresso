package com.atiurin.sampleapp.pages.custompages.friends1

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.data.Constants.HELLO_ROSS


object AddresseePage {
    val addressee: Matcher<View> by lazy { allOf(withId(R.id.toolbar_title)) }
    val textInputBar: Matcher<View> by lazy { allOf(withId(R.id.message_input_text)) }
    val sendButton: Matcher<View> by lazy { allOf(withId(R.id.send_button)) }
    val sentText: Matcher<View> by lazy { allOf(withId(R.id.message_text), withText(HELLO_ROSS)) }
}