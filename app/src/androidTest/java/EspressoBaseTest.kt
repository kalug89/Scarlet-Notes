import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.bijoysingh.quicknote.R
import com.facebook.litho.testing.espresso.ComponentHostMatchers
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.AllOf.allOf

    fun clickButton(@IdRes viewId: Int) {
        onView(withId(viewId)).perform(click())
    }

    fun checkMatchesStringInElement(@IdRes viewId: Int, content: String) {
        onView(withId(viewId)).check(matches(withText(content)))
    }

    fun checkStringInComponentHostIsDisplayed(text: String) {
        onView(
            ComponentHostMatchers.componentHost(
                ComponentHostMatchers.withText(text)
            )
        )
            .check(matches(isDisplayed()))
    }

    fun checkElementIsDisplayed(@IdRes viewId: Int) {
        onView(withId(viewId)).check(matches(isDisplayed()))
    }

    fun clickBottomToolbarButton(item: Int) {
        onView(
            allOf(
                childAtPosition(
                    childAtPosition(
                        withId(R.id.lithoBottomToolbar), 0
                    ), item
                )
            )
        )
            .perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
