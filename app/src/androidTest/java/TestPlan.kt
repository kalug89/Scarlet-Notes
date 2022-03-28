import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import ui.*

@RunWith(AndroidJUnit4::class)
class TestPlan : BaseTestPlan() {

    private val homePage = HomePage()
    private val searchScreen = SearchScreen()
    private val settingsBottomSheet = SettingsBottomSheet()
    private val debugBottomSheet = DebugBottomSheet()
    private val homeBottomSheet = HomeBottomSheet()
    private val notebookBottomSheet = NotebookBottomSheet()
    private val addListScreen = AddListScreen()
    private val addNoteScreen = AddNoteScreen()

    @Test
    fun checkEmptyNotes() {
        homePage.recyclerView.clickRecyclerViewItem(1)
    }

    @Test
    fun checkNoteScreenHeadingEditText() {
        addNoteScreen.run {
            clickAddNoteButton()
            verifyFirstSpecificInputIsAndHasHeadingInput()
        }
    }

    @Test
    fun checkNoteScreenAddContentEditText() {
        addNoteScreen.run {
            clickAddNoteButton()
            verifySecondSpecificInputIsAndHasTextInput()
        }
    }

    @Test
    fun checkNoteScreenAddItemEditText() {
        addNoteScreen.run {
            clickAddNoteButton()
            clickAddItemButtonOnBottomBar()
            verifyThirdSpecificInputIsAndHasListInput()
        }
    }

    @Test
    fun checkNoteScreenAddQuotedEditText() {
        addNoteScreen.run {
            clickAddNoteButton()
            clickAddQuotedButtonOnBottomBar()
            verifyThirdSpecificInputIsAndHasQuoteInput()
        }
    }

    @Test
    fun checkNoteScreenSmallHeadingEditText() {
        addNoteScreen.run {
            clickAddNoteButton()
            clickExtendMenuButtonOnBottomBar()
            clickAddSmallHeadingButtonOnBottomBar()
            verifyFirstSpecificInputIsAndHasHeadingInput()
        }
    }

    @Test
    fun checkNoteScreenAddCodeEditText() {
        addNoteScreen.run {
            clickAddNoteButton()
            clickExtendMenuButtonOnBottomBar()
            clickFifthBottomHorizontalViewButton()
            verifySecondSpecificInputIsAndHasCodeInput()
        }
    }

    @Test
    fun checkTitleContent() {
        checkMatchesStringInElement(homePage.toolbarTitleView, homePage.appToolbarTitle)
    }

    @Test
    fun checkSearchButton() {
        clickButton(homePage.searchIconButton)
        checkElementIsDisplayed(searchScreen.searchBox)
    }

    @Test
    fun checkSettingsButton() {
        clickButton(homePage.settingsIconButton)
        checkStringInComponentHostIsDisplayed(settingsBottomSheet.settingsBottomSheetTitle)
    }

    @Test
    fun checkDebugButton() {
        clickButton(homePage.debugIconButton)
        checkStringInComponentHostIsDisplayed(debugBottomSheet.debugBottomSheetTitle)
    }

    @Test
    fun checkMenuButton() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_MENU_BUTTON_NUMBER)
        checkStringInComponentHostIsDisplayed(homeBottomSheet.homeMenuString)
    }

    @Test
    fun checkNotebookButton() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_NOTEBOOK_BUTTON_NUMBER)
        checkMatchesStringInElement(
            notebookBottomSheet.notebookToolbarTitleView,
            notebookBottomSheet.notebookTitle
        )
    }

    @Test
    fun checkAddListButton() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_ADD_BUTTON_NUMBER)
        checkElementIsDisplayed(addListScreen.addListAdvancedNoteRecycler)
    }

    @Test
    fun noteListAddListButton() {
        homePage.clickAddNoteButton()
        checkElementIsDisplayed(addNoteScreen.addNoteAdvancedNoteRecycler)
    }
}
