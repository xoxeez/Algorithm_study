import java.io.*

fun main() {
    val br = System.`in`.bufferedReader()
    
    var N = br.readLine().toInt()
    var count = 0
    
    while (N >= 5) {
        count += N / 5
        N /= 5
    }
    
    println(count)
}