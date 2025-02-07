package com.atiurin.sampleapp.pages.custompages

import android.service.autofill.FieldClassification.Match
import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf

object LandingPage {
    val burgerMenu: Matcher<View> by lazy{ withId(R.id.toolbar) }
    val dashboard: Matcher<View> by lazy{ withId(R.id.drawer_layout) }
    val rossGeller: Matcher<View> by lazy { allOf(withId(R.id.tv_name), withText("Ross Geller")) }
    val customClicks: Matcher<View> by lazy { allOf(withId(R.id.custom_clicks_nav_item)) }
}