package com.loc.newsapp.presentation.onboarding



import com.loc.newsapp.R
import androidx.annotation.DrawableRes

data class Page(
    val tittle:String,
    val description:String,
    @DrawableRes val image:Int
)


val pages = listOf(
    Page(
        tittle = "Lorem ipsum",
        description = "Lorejsbfbhdabf",
        image = R.drawable.onboarding3

    ),
    Page(
        tittle = "Lorem ipsum",
        description = "Lorejsbfbhdabf",
        image = R.drawable.onboarding1

    ),
    Page(
        tittle = "Lorem ipsum",
        description = "Lorejsbfbhdabf",
        image = R.drawable.onboarding2

    )
)