package ui

import ContextUtils.getResourceString
import com.bijoysingh.quicknote.R

const val MENU_ICON_BUTTON_NUMBER = 0
const val NOTEBOOK_ICON_BUTTON_NUMBER = 1
const val ADD_LIST_ICON_BUTTON_NUMBER = 2
const val ADD_NOTE_LIST_ICON_BUTTON_NUMBER = 3

class HomePage {

    val recyclerView = R.id.recycler_view
    val toolbarTitleView = R.id.toolbarTitle
    val searchIconButton = R.id.toolbarIconSearch
    val settingsIconButton = R.id.toolbarIconSettings
    val debugIconButton = R.id.toolbarIconDebug
    val appToolbarTitle = getResourceString(R.string.app_name)
}
