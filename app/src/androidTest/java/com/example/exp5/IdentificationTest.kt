package com.example.exp5

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test for student identification.
 */
@RunWith(AndroidJUnit4::class)
class IdentificationTest {

    @Test
    fun showUserDetails() {
        val name = "ARADHYA RAJ"
        val usn = "25MCAR0089"
        
        // Print to logcat for identification
        println("STUDENT_NAME: $name")
        println("STUDENT_USN: $usn")

        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.exp5", appContext.packageName)
        
        // Assertions to verify the test data is present
        assertEquals("ARADHYA RAJ", name)
        assertEquals("25MCAR0089", usn)
    }
}
