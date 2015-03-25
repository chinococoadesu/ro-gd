package ro.gd.idea

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder

/**
 *
 * Created by zenghuiying on 2015/3/22.
 */
class PluginTest extends ro.gd.TestCase {

    Project p

    void setUp() {
        this.p = ProjectBuilder.builder().build()
    }

    void testRelease() {
        def t = p.task('releasePlugin', type: ro.gd.idea.Plugin) {
            release()
        }
    }
}
