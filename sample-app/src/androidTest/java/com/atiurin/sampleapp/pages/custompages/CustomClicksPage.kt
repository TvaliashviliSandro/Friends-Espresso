package com.atiurin.sampleapp.pages.custompages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.hasBackground
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf

object CustomClicksPage {
    val customClicksPage: Matcher<View> by lazy{ allOf(withId(R.id.frameLayout))}
    val topLeft: Matcher<View> by lazy { allOf(withId(R.id.rB_top_left)) }
    val topRight: Matcher<View> by lazy { allOf(withId(R.id.rB_top_right)) }
    val bottomLeft: Matcher<View> by lazy { allOf(withId(R.id.rB_bottom_left)) }
    val bottomRight: Matcher<View> by lazy { allOf(withId(R.id.rB_bottom_right)) }

}