import BaseTestPlan.checkElementIsDisplayed
import BaseTestPlan.checkMatchesStringInElement
import BaseTestPlan.checkStringInComponentHostIsDisplayed
import BaseTestPlan.clickBottomToolbarButton
import BaseTestPlan.clickButton
import androidx.test.rule.ActivityTestRule
import com.maubis.scarlet.base.MainActivity
import org.junit.Rule
import org.junit.Test
import ui.*

class TestPlan {

    @Rule
    @JvmField
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkEmptyNotes() {
        HomePage().recyclerView.clickRecyclerViewItem(1)
    }

    @Test
    fun checkTitleContent() {
        checkMatchesStringInElement(HomePage().toolbarTitleView, HomePage().appToolbarTitle)
    }

    @Test
    fun checkSearchButton() {
        clickButton(HomePage().searchIconButton)
        checkElementIsDisplayed(SearchScreen().searchBox)
    }

    @Test
    fun checkSettingsButton() {
        clickButton(HomePage().settingsIconButton)
        checkStringInComponentHostIsDisplayed(SettingsBottomSheet().settingsBottomSheetTitle)
    }

    @Test
    fun checkDebugButton() {
        clickButton(HomePage().debugIconButton)
        checkStringInComponentHostIsDisplayed(DebugBottomSheet().debugBottomSheetTitle)
    }

    @Test
    fun checkMenuButton() {
        clickBottomToolbarButton(HomePage().menuIconButtonNumber)
        checkStringInComponentHostIsDisplayed(HomeBottomSheet().homeMenuString)
    }

    @Test
    fun checkNotebookButton() {
        clickBottomToolbarButton(HomePage().notebookIconButtonNumber)
        checkMatchesStringInElement(
            NotebookBottomSheet().notebookToolbarTitleView,
            NotebookBottomSheet().notebookTitle
        )
    }

    @Test
    fun checkAddListButton() {
        clickBottomToolbarButton(HomePage().addListIconButtonNumber)
        checkElementIsDisplayed(AddListScreen().addListAdvancedNoteRecycler)
    }

    @Test
    fun noteListAddListButton() {
        clickBottomToolbarButton(HomePage().addNoteListIconButtonNumber)
        checkElementIsDisplayed(AddNoteScreen().addNoteAdvancedNoteRecycler)
    }
}
