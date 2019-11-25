package com.techsqually.java.library.lang;

import java.io.IOException;

public class RunTimeTest {

    public static void main(String[] args) throws IOException {


        Runtime runtime  = Runtime.getRuntime();

        /**
         * To Get feature number runtime.feature()
         * To Get interim number runtime.interim()
         * To Get update number runtime.update()
         * To Get patch number runtime.patch()
         * To Get build number runtime.build()
         * To Get prelease information number runtime.pre()
         * To Get optional information information number runtime.optional()
         * To compare versions
         *         compareTo()
         *         compareToIgnoreOptional()
         *         equals()
         *         equalsIgnoreOptional()
         *
         * */

        /**Get memory used in Process*/
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());
/**ADDED AS PART OF JAVA 9
 * Release Versioning
 * Version : feature Release counter.interim release counter.update release counter.patch release counter
 * feature_release_counter: 10/11 etc
 * interim_release_counter: interim release counter will be zero, it's defined possible for future use
 * update_release_counter: indicates the number of a release that addresses security and possibly other problems
 * path release counter: specifies a number of a release that addresses a serous flaw that must be fixed as soon as possible
 *
 * With new feature releases , interim , update and path release counter are set to zero
 * */
        //        System.out.println(Runtime.version());

        /**It opens note pad using java*/
         Process process = runtime.exec("notepad");

        //        process.destroy();
//        System.out.println(process.exitValue());
        System.out.println(process.isAlive());



    }

}
