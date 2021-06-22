package com.marciotrindade.cucumber1.test

import android.os.Bundle
import androidx.test.runner.AndroidJUnitRunner
import com.marciotrindade.cucumber1.BuildConfig
import cucumber.api.CucumberOptions
import cucumber.api.android.CucumberInstrumentationCore
import org.junit.Test


@CucumberOptions(
    features = ["features"],
    glue = ["com.marciotrindade.cucumber1.test"],
    tags = ["@login"]
)
class Instrumentation : AndroidJUnitRunner() {
    private val instrumentationCore = CucumberInstrumentationCore(this)
    override fun onCreate(bundle: Bundle) {
        val tags: String =BuildConfig.TEST_TAGS
        if (!tags.isEmpty()) {
            bundle.putString(CUCUMBER_TAGS_KEY, tags.replace("\\s".toRegex(), ""))
        }

        instrumentationCore.create(bundle)
        super.onCreate(bundle)
    }

    override fun onStart() {
        waitForIdleSync()
        instrumentationCore.start()
    }

    companion object {
        private const val CUCUMBER_TAGS_KEY = "tags"
        private const val CUCUMBER_SCENARIO_KEY = "name"
    }

    @Test
    fun runTest(){

    }
}

