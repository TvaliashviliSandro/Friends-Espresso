package com.atiurin.sampleapp.tests.espresso

import com.atiurin.sampleapp.data.Constants.CHANGE_NAME_STRING
import com.atiurin.sampleapp.data.Constants.DRINK_STRING
import com.atiurin.sampleapp.data.Constants.EMMET_BROWN
import com.atiurin.sampleapp.data.Constants.FRIEND_17
import com.atiurin.sampleapp.data.Constants.FRIEND_25
import com.atiurin.sampleapp.data.Constants.HERO_STRING
import com.atiurin.sampleapp.steps.friends1.AddresseePageSteps
import com.atiurin.sampleapp.steps.friends1.LandingPageSteps
import com.atiurin.sampleapp.tests.MyBaseTest
import org.junit.Test

class ILoveMyFriendsTest : MyBaseTest(){

    @Test
    fun emmetBrownTest(){
        LandingPageSteps
            .findFriend(EMMET_BROWN)
        AddresseePageSteps
            .validateChatIsOpen()
            .typeText(DRINK_STRING)
            .tapSendButton()
            .validateCustomTextSent(DRINK_STRING)
    }

    @Test
    fun  friend17Test(){
        LandingPageSteps.findFriend(FRIEND_17)
        AddresseePageSteps
            .validateChatIsOpen()
            .clickMoreOptions()
            .clearChat()
            .typeText(CHANGE_NAME_STRING)
            .tapSendButton()
            .validateCustomTextSent(CHANGE_NAME_STRING)
    }

    @Test
    fun  friend25Test(){
        LandingPageSteps.findFriend(FRIEND_25)
        AddresseePageSteps
            .validateChatIsOpen()
            .typeText(HERO_STRING)
            .tapSendButton()
            .validateCustomTextSent(HERO_STRING)
    }
}
