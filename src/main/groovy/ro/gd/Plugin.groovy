package ro.gd

import org.gradle.api.Project

/**
 * Created by roroco on 3/17/15.
 */


class Plugin implements org.gradle.api.Plugin<Project> {
    Project p
    void apply(Project project) {
        p = project
        project.extensions.kernel = new _Kernel()
    }

    class _Kernel implements Kernel {
    }
}


