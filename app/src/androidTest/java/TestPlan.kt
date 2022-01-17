import androidx.test.rule.ActivityTestRule
import com.maubis.scarlet.base.MainActivity
import org.junit.Rule
import org.junit.Test

class TestPlan {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun openApp() {
        Thread.sleep(2000)
    }

    @Test
    fun clickEmptyNotes() {
        EspressoBaseTest().clickRecyclerViewItem(HomePage().getRecyclerView(), 1)
    }
}