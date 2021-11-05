package utility

import java.util.Random as javaRand
import kotlin.random.Random as kotRand

class Helper {

    companion object {

        /**
         * Import Java's Random class and Kotlin's random class.
         * Get the nextInt() from both one thousand times, each time recording whether or not the Java or the Kotlin
         * random number was higher.
         * Print out the final score.
         * */


        @JvmStatic
        fun randomComparator( bound : Int = 1000) {

            for (i in bound downTo 0 step 1) {
                val ktRnd : Int = kotRand(System.nanoTime()).nextInt(bound)
                val jvRnd : Int = javaRand().nextInt(bound)

                if (ktRnd > jvRnd) {
                    println("KotRand: $ktRnd")
                } else println("JavaRand: $jvRnd")

            }
            return
        }
    }

}

fun main() {
    Helper.randomComparator()
}