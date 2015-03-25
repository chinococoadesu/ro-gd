package ro.gd

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import ro.Pj

/**
 * Created by zenghuiying on 2015/3/24.
 */
class PluginTest extends ro.gd.TestCase {
    void testSourceSets() {
        def r = p().getConfigurations()
        println "r: ${r}"
    }
}
