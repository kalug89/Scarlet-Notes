import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule

open class BaseTestPlan {

    @get:Rule
    var mActivityRule = ActivityScenarioRule<Activity>(
        Intent().setComponent(
            ComponentName(
                "com.bijoysingh.quicknote",
                "com.maubis.scarlet.base.MainActivity"
            )
        )
    )
}
