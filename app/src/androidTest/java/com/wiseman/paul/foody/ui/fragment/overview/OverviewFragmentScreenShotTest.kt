package com.wiseman.paul.foody.ui.fragment.overview

import androidx.core.os.bundleOf
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.karumi.shot.FragmentScenarioUtils.waitForFragment
import com.karumi.shot.ScreenshotTest
import com.wiseman.paul.foody.R
import com.wiseman.paul.foody.models.Result
import com.wiseman.paul.foody.util.Constants
import org.junit.Test

class OverviewFragmentScreenShotTest : ScreenshotTest {

    @Test
    fun overViewFragmentScreenShotTest() {
        // The "fragmentArgs" argument is optional.
        val result = Result(
            aggregateLikes = 0,
            cheap = true,
            dairyFree = true,
            extendedIngredients = listOf(),
            glutenFree = false,
            id = 3,
            image = "image",
            license = "Github licenced",
            readyInMinutes = 40,
            sourceName = "Github Api",
            sourceUrl = "com.youtube.com",
            summary = "this is a nice meal",
            title = "Egusi soup",
            vegan = false,
            veryHealthy = true,
            vegetarian = false,
        )
        val fragmentArgs = bundleOf(Constants.RECIPE_RESULT_KEY to result)
        val fragmentScenario = launchFragmentInContainer<OverviewFragment>(
            fragmentArgs
        )
        onView(withId(R.id.title_textView)).check(matches(withText(result.title)))

        val fragment = fragmentScenario.waitForFragment()
        compareScreenshot(fragment)
    }


}

