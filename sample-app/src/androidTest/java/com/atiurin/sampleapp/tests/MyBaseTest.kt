package com.atiurin.sampleapp.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.repositories.CURRENT_USER
import com.atiurin.sampleapp.managers.AccountManager
import com.atiurin.ultron.core.config.UltronConfig
import com.atiurin.ultron.listeners.TimeListener
import org.junit.BeforeClass
import org.junit.Rule

abstract class MyBaseTest {
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    companion object {
        @BeforeClass
        @JvmStatic
        fun speedUpAutomator() {
            UltronConfig.UiAutomator.speedUp()
            UltronConfig.addGlobalListener(TimeListener())
            UltronConfig.removeGlobalListener(TimeListener::class.java)

            AccountManager(InstrumentationRegistry.getInstrumentation().targetContext).login(
                CURRENT_USER.login, CURRENT_USER.password
            )
        }
    }
}
