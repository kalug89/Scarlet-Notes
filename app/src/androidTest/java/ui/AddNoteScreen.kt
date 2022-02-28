package ui

import ContextUtils.getResourceString
import checkHintOnEditInRecyclerView
import clickBottomHorizontalViewButton
import clickBottomToolbarButton
import com.bijoysingh.quicknote.R

const val NOTE_SCREEN_BOTTOM_BAR_ADD_SMALL_HEADING_NUMBER = 1
const val NOTE_SCREEN_BOTTOM_BAR_ADD_ITEM_BUTTON_NUMBER = 2
const val NOTE_SCREEN_BOTTOM_BAR_ADD_QUOTED_BUTTON_NUMBER = 3
const val NOTE_SCREEN_BOTTOM_BAR_EXTEND_MENU_BUTTON_NUMBER = 4
const val NOTE_SCREEN_BOTTOM_ADD_CODE_MENU_NUMBER = 5

const val NOTE_SCREEN_BOTTOM_BAR_HORIZONTAL_NUMBER = 0

const val NOTE_SCREEN_EDIT_TEXT_POSITION_FIRST = 0
const val NOTE_SCREEN_EDIT_TEXT_POSITION_SECOND = 1

const val NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_THIRD = 2
const val NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_FOURTH = 3

class AddNoteScreen {

    val addNoteAdvancedNoteRecycler = R.id.advanced_note_recycler

    fun clickAddNoteButton() {
        clickBottomToolbarButton(HOME_PAGE_BOTTOM_BAR_ADD_NOTE_BUTTON_NUMBER)
    }

    fun clickSecondButtonOnBottomToolbar() {
        clickBottomToolbarButton(NOTE_SCREEN_BOTTOM_BAR_ADD_SMALL_HEADING_NUMBER)
    }

    fun clickThirdButtonOnBottomToolbar() {
        clickBottomToolbarButton(NOTE_SCREEN_BOTTOM_BAR_ADD_ITEM_BUTTON_NUMBER)
    }

    fun clickFourthButtonOnBottomToolbar() {
        clickBottomToolbarButton(NOTE_SCREEN_BOTTOM_BAR_ADD_QUOTED_BUTTON_NUMBER)
    }

    fun clickFifthButtonOnBottomToolbar() {
        clickBottomToolbarButton(NOTE_SCREEN_BOTTOM_BAR_EXTEND_MENU_BUTTON_NUMBER)
    }

    fun clickFifthBottomHorizontalViewButton() {
        clickBottomHorizontalViewButton(
            NOTE_SCREEN_BOTTOM_BAR_HORIZONTAL_NUMBER,
            NOTE_SCREEN_BOTTOM_ADD_CODE_MENU_NUMBER
        )
    }

    fun verifySecondSpecificInputIsAndHasTextInput() {
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_SECOND,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_THIRD,
            getResourceString(R.string.format_hint_text)
        )
    }

    fun verifySecondSpecificInputIsAndHasCodeInput() {
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_SECOND,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_THIRD,
            getResourceString(R.string.format_hint_code)
        )
    }

    fun verifyFirstSpecificInputIsAndHasHeadingInput() {
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_FIRST,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_THIRD,
            getResourceString(R.string.format_hint_heading)
        )
    }

    fun verifyThirdSpecificInputIsAndHasListInput() {
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_SECOND,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_FOURTH,
            getResourceString(R.string.format_hint_list)
        )
    }

    fun verifyThirdSpecificInputIsAndHasQuoteInput() {
        checkHintOnEditInRecyclerView(
            NOTE_SCREEN_EDIT_TEXT_POSITION_SECOND,
            NOTE_SCREEN_EDIT_TEXT_HINT_ELEMENT_FOURTH,
            getResourceString(R.string.format_hint_quote)
        )
    }
}
