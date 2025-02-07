package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.custompages.CustomClicksPage.bottomLeft
import com.atiurin.sampleapp.pages.custompages.CustomClicksPage.bottomRight
import com.atiurin.sampleapp.pages.custompages.CustomClicksPage.topLeft
import com.atiurin.sampleapp.pages.custompages.CustomClicksPage.topRight
import com.atiurin.ultron.extensions.tap

object CustomClicksPageSteps {
    fun tapTopLeft(): CustomClicksPageSteps {
        topLeft.tap().isChecked()
        return this
    }

    fun tapTopRight(): CustomClicksPageSteps {
        topRight.tap().isChecked()
        return this
    }

    fun tapBottomRight(): CustomClicksPageSteps {
        bottomRight.tap().isChecked()
        return this
    }

    fun tapBottomLeft(): CustomClicksPageSteps {
        bottomLeft.tap().isChecked()
        return this
    }
}