package com.daniil.halushka.todoapp.util

import androidx.fragment.app.Fragment
import com.daniil.halushka.todoapp.constants.Constants.APP_ACTIVITY

fun replaceFragment(
    fragment: Fragment,
    dataContainer: Int,
    addStack: Boolean = true
) {
    APP_ACTIVITY.supportFragmentManager.beginTransaction().apply {
        if (addStack) {
            addToBackStack(null)
        }
        replace(dataContainer, fragment)
        commit()
    }
}
