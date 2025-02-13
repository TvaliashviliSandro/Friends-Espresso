package com.atiurin.sampleapp.pages.custompages.friends1

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.data.Constants.OPEN_NAV_DRAWER
import com.atiurin.sampleapp.data.Constants.ROSS_GELLER
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf

object LandingPage {
    val burgerMenu: Matcher<View> by lazy{ withId(R.id.toolbar) }
    val dashboard: Matcher<View> by lazy{ withId(R.id.drawer_layout) }
    val rossGeller: Matcher<View> by lazy { allOf(withId(R.id.tv_name), withText(ROSS_GELLER)) }
    val customClicks: Matcher<View> by lazy { allOf(withId(R.id.custom_clicks_nav_item)) }
    val burgerMenu2: Matcher<View> by lazy { withContentDescription(OPEN_NAV_DRAWER) }
    val UiElements: Matcher<View> by lazy { allOf(withId(R.id.ui_elements))}
    val customName: Matcher<View> by lazy { withId(R.id.tv_name) }
}