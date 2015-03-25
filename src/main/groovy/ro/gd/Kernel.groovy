package ro.gd
/**
 * Created by roroco on 3/18/15.
 */

import ro.Sh
trait Kernel {
    def sh(... args) {
        Sh.sh(args)
//        ls = []
//
//        finCmd = ["/bin/sh", "-c", cmd]
//        p = Runtime.getRuntime().exec(finCmd)
//        rdr = new BufferedReader(new InputStreamReader(p.getInputStream()))
//        int exitCode = 0
//
//        exitCode = p.waitFor()
//
//        if (exitCode != 0) {
//            println "exitCode: " + exitCode
//            throw Err.ii("'", cmd, "'", "fail")
//        }
//
//        while (rdr.ready()) {
//            l = rdr.readLine()
//            ls.putAt(l)
//            println(l)
//        }
//
//        return ls.join("\n")
    }

    def path(prefix, args) {
        File finPath = new File(prefix)

        for (arg in args) {
            finPath = new File(finPath, arg)
        }
        finPath
    }

    def ro(... args) {
        sh("cd ~/Dropbox/rbs/ro_r4j ro", args)
    }
}
