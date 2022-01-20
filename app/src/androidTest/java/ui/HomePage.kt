package ui

import Utils.getResourceString
import com.bijoysingh.quicknote.R

class HomePage {

    val recyclerView = R.id.recycler_view
    val toolbarTitleView = R.id.toolbarTitle
    val searchIconButton = R.id.toolbarIconSearch
    val settingsIconButton = R.id.toolbarIconSettings
    val debugIconButton = R.id.toolbarIconDebug
    val appToolbarTitle = getResourceString(R.string.app_name)

    val menuIconButtonNumber = 0
    val notebookIconButtonNumber = 1
    val addListIconButtonNumber = 2
    val addNoteListIconButtonNumber = 3
}
