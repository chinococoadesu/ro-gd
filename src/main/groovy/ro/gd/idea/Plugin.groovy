package ro.gd.idea

/**
 * Created by zenghuiying on 2015/3/22.
 */
class Plugin extends org.gradle.api.tasks.bundling.Zip implements ro.gd.Kernel {

    def release() {
        into(lib(project.name)) {
            from sourceSets().main.output
        }

        into(lib()) {
            from(outLib())
        }

        destinationDir = releaseDir()
    }

    def pj() {
        getProject()
    }

    def sourceSets() {
        new ro.gd.Plugin().sourceSets()
    }

    def releaseDir(... args) {
        buildPath(file("${project.rootDir.path}/release", args))
    }

    def outLib(... args) {
        path("${buildDir}/output/lib", args)
    }

    def lib(... args) {
        path("${project.name}/lib", args)
    }
}
