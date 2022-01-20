import androidx.test.espresso.action.ViewActions.click
import androidx.test.rule.ActivityTestRule
import com.maubis.scarlet.base.MainActivity
import org.junit.Rule
import org.junit.Test

class TestPlan {

    @Rule
    @JvmField
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun openApp() {
    }

    @Test
    fun clickEmptyNotes() {
        actionOnRecyclerViewItem(HomePage().recyclerView, 1, click())
    }
}
