package ro.gd

/**
 * Created by zenghuiying on 2015/3/24.
 */
class Conf {
    static rt(... args) {
        def _rt = new File(".").getCanonicalPath()
        ro.File.join(_rt, args)
    }

    static void main(args) {
        def r = Conf.rt('smth')
        println "r:$r"
    }
}

