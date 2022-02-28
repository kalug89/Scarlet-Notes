package ui

import ContextUtils.getResourceString
import clickBottomToolbarButton
import com.bijoysingh.quicknote.R

const val HOME_PAGE_BOTTOM_BAR_MENU_BUTTON_NUMBER = 0
const val HOME_PAGE_BOTTOM_BAR_NOTEBOOK_BUTTON_NUMBER = 1
const val HOME_PAGE_BOTTOM_BAR_ADD_BUTTON_NUMBER = 2
const val HOME_PAGE_BOTTOM_BAR_ADD_NOTE_BUTTON_NUMBER = 3

class HomePage {

    val recyclerView = R.id.recycler_view
    val toolbarTitleView = R.id.toolbarTitle
    val searchIconButton = R.id.toolbarIconSearch
    val settingsIconButton = R.id.toolbarIconSettings
    val debugIconButton = R.id.toolbarIconDebug
    val appToolbarTitle = getResourceString(R.string.app_name)

    fun clickAddNoteButton() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_ADD_NOTE_BUTTON_NUMBER)
    }
}
