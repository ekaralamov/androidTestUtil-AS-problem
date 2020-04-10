package app.ekaralamov.androidtestutilasproblem

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BuddyTest {
    @Test
    fun buddyIsInstalled() {
        InstrumentationRegistry.getInstrumentation().targetContext.packageManager
            .getPackageInfo("app.ekaralamov.androidtestutilasproblem.buddy", 0)
    }
}
