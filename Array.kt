import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    var array = arrayOf(1,2,3,4,5)
    var isHave = false
    for (i in array.indices) {
        if (array[i] == a) {
            isHave = true
            break
        }
    }
        if (isHave){
            println("bor")
        }else{
           println("yo'q")
        }
    }