import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry

object Utils {

    fun getResourceString(id: Int): String {
        val targetContext: Context = InstrumentationRegistry.getInstrumentation().targetContext
        return targetContext.resources.getString(id)
    }
}
