package ro.gd

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder

/**
 * Created by zenghuiying on 2015/3/24.
 */
class TestCase extends ro.TestCase {
    Project p() {
        def builder = ProjectBuilder.builder()
        builder.withProjectDir(new File(Conf.rt()))
        builder.build()
    }
}
