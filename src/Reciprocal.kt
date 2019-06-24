
fun isPrime(number:Int):Boolean{
    (2 until Math.sqrt(number.toDouble()).toInt() + 1).forEach { i ->
        if(number%i == 0)
            return false
    }
    return true
}

fun permutation(number:Int):Set<Int>{
    var numbers = mutableSetOf<Int>()
    var num:String = number.toString()
    var numTmp:String = num

    (0 until num.length - 1).forEach {i ->
        numTmp = numTmp.substring(1, numTmp.length) + num[i]
        numbers.add(numTmp.toInt())
    }

    return numbers
}

fun main(args: Array<String> ) {
    //circularPrimes(1000000)
    var numbers = mutableSetOf<Int>()

    (1 until 1000001).forEach { i ->

        if(isPrime(i)){
            var p:Boolean = true
            permutation(i).forEach { j -> p = p&&isPrime(j) }
            if(p)
                numbers.add(i)
        }
    }

    println(numbers)
    println(numbers.size)
}