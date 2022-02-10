import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
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
