import ContextUtils.getResourceString
import com.bijoysingh.quicknote.R
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
    fun checkNoteScreenHeadingEditText() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_ADD_NOTE_BUTTON_NUMBER)
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_FIRST,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_THIRD,
            getResourceString(R.string.format_hint_heading)
        )
    }

    @Test
    fun checkNoteScreenAddContentEditText() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_ADD_NOTE_BUTTON_NUMBER)
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_SECOND,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_THIRD,
            getResourceString(R.string.format_hint_text)
        )
    }

    @Test
    fun checkNoteScreenAddItemEditText() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_ADD_NOTE_BUTTON_NUMBER)
        clickBottomToolbarButton(NOTE_SCREEN_BOTTOM_BAR_ADD_ITEM_BUTTON_NUMBER)
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_SECOND,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_FOURTH,
            getResourceString(R.string.format_hint_list)
        )
    }

    @Test
    fun checkNoteScreenAddQuotedEditText() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_ADD_NOTE_BUTTON_NUMBER)
        clickBottomToolbarButton(NOTE_SCREEN_BOTTOM_BAR_ADD_QUOTED_BUTTON_NUMBER)
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_SECOND,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_FOURTH,
            getResourceString(R.string.format_hint_quote)
        )
    }

    @Test
    fun checkNoteScreenSmallHeadingEditText() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_ADD_NOTE_BUTTON_NUMBER)
        clickBottomToolbarButton(NOTE_SCREEN_BOTTOM_BAR_EXTEND_MENU_BUTTON_NUMBER)
        clickBottomToolbarButton(NOTE_SCREEN_BOTTOM_BAR_ADD_SMALL_HEADING_NUMBER)
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_FIRST,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_THIRD,
            getResourceString(R.string.format_hint_heading)
        )
    }

    @Test
    fun checkNoteScreenAddCodeEditText() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_ADD_NOTE_BUTTON_NUMBER)
        clickBottomToolbarButton(NOTE_SCREEN_BOTTOM_BAR_EXTEND_MENU_BUTTON_NUMBER)

        clickBottomHorizontalViewButton(
            NOTE_SCREEN_BOTTOM_BAR_HORIZONTAL_NUMBER,
            NOTE_SCREEN_BOTTOM_ADD_CODE_MENU_NUMBER
        )
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_SECOND,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_THIRD,
            getResourceString(R.string.format_hint_code)
        )
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
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_ADD_NOTE_BUTTON_NUMBER)
        checkElementIsDisplayed(addNoteScreen.addNoteAdvancedNoteRecycler)
    }
}
