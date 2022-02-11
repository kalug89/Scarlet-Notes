import org.junit.Test
import ui.*

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
        clickBottomToolbarButton(MENU_ICON_BUTTON_NUMBER)
        checkStringInComponentHostIsDisplayed(homeBottomSheet.homeMenuString)
    }

    @Test
    fun checkNotebookButton() {
        clickBottomToolbarButton(NOTEBOOK_ICON_BUTTON_NUMBER)
        checkMatchesStringInElement(
            notebookBottomSheet.notebookToolbarTitleView,
            notebookBottomSheet.notebookTitle
        )
    }

    @Test
    fun checkAddListButton() {
        clickBottomToolbarButton(ADD_LIST_ICON_BUTTON_NUMBER)
        checkElementIsDisplayed(addListScreen.addListAdvancedNoteRecycler)
    }

    @Test
    fun noteListAddListButton() {
        clickBottomToolbarButton(ADD_NOTE_LIST_ICON_BUTTON_NUMBER)
        checkElementIsDisplayed(addNoteScreen.addNoteAdvancedNoteRecycler)
    }
}
