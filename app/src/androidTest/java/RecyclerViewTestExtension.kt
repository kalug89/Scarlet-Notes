import androidx.annotation.IdRes
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers

fun actionOnRecyclerViewItem(@IdRes viewId: Int, viewItem: Int, action: ViewAction) {
    Espresso.onView(ViewMatchers.withId(viewId))
        .perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                viewItem,
                action
            )
        )
}
