import java.io.*

fun main() {
    val br = System.`in`.bufferedReader()
    
    var N = br.readLine().toInt()
    var result = ""
    
    if (N == 0) {
        println(N)
        return
    }
    
    while (N != 0) {
        if (N % -2 == -1) {
            result = ((N % -2)+2).toString() + result
            N = (N / -2) + 1
        }
        else {
            result = (N % -2).toString() + result
            N = N / -2
        }
    }
    
    println(result)
}