package com.atiurin.sampleapp.steps.friends1

import com.atiurin.sampleapp.pages.custompages.friends1.CustomClicksPage.bottomLeft
import com.atiurin.sampleapp.pages.custompages.friends1.CustomClicksPage.bottomRight
import com.atiurin.sampleapp.pages.custompages.friends1.CustomClicksPage.topLeft
import com.atiurin.sampleapp.pages.custompages.friends1.CustomClicksPage.topRight
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