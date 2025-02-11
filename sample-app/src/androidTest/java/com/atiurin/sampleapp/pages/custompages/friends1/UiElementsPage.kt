package com.atiurin.sampleapp.pages.custompages.friends1

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.data.Constants.CLICKABLE_BUTTON
import com.atiurin.sampleapp.data.Constants.ENABLE_BUTTON
import com.atiurin.sampleapp.data.Constants.GONE
import com.atiurin.sampleapp.data.Constants.INVISIBLE
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf

object UiElementsPage {
    val simpleButton: Matcher<View> by lazy{ withId(R.id.button1) }
    val enableButton: Matcher<View> by lazy{ allOf(withId(R.id.checkbox_enable), withText(ENABLE_BUTTON)) }
    val clickableButton: Matcher<View> by lazy{ allOf(withId(R.id.checkbox_clickable), withText(
        CLICKABLE_BUTTON)) }
    val goneButton: Matcher<View> by lazy{ allOf(withId(R.id.radio_gone), withText(GONE)) }
    val invisibleButton: Matcher<View> by lazy{ allOf(withId(R.id.radio_invisible), withText(
        INVISIBLE)) }
    val clickCounter: Matcher<View> by lazy{ allOf(withId(R.id.last_event_status)) }



}