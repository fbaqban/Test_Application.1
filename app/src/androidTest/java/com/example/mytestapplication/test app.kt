package com.example.mytestapplication

import android.provider.ContactsContract
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@RunWith(AndroidJUnit4::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//class `test app` {
//        @Test
//        fun first() {
//                launchActivity<SplashScreenActivity>().use {
//                        waitStartup()
//                        Espresso.onView(ViewMatchers.isRoot())
//                                .perform(OrientationChangeAction.orientationPortrait())
//        }
//
//}