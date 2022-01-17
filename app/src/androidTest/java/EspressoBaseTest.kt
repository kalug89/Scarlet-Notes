import androidx.annotation.IdRes
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId

open class EspressoBaseTest {

    fun clickRecyclerViewItem(@IdRes viewId: Int, viewItem: Int) {
        onView(withId(viewId))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                    viewItem,
                    click()
                )
            )
    }
}
