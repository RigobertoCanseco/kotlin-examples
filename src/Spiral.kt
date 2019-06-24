import kotlin.concurrent.fixedRateTimer

fun sum(limit: Int):Int{
    var numbers: ArrayList<Int> = ArrayList()
    var c:Int = 1
    numbers.add(c)

    (2 until limit step 2).forEach{ p ->
        (1 until 5).forEach{i ->numbers.add(c+p*i) }
        c = numbers.last()
    }
    return numbers.sum()
}
//669171001
fun main(args: Array<String> ) {
    var s = sum(1002)
    println("Suma: $s")
    s(1002)
}


fun s(limit:Int):Int{
    var n: ArrayList<Int> = ArrayList(1)
    (0 until limit).forEach{ i -> print("$i, ") }
    return n.sum();
}