import java.util.*

fun main(args: Array<String> ){
    var greter: Greeter = Greeter("Juan");
//    println(greter.greet("Rigoberto"));
//    println(greter.getStringVar());
//
//    greter say "Hola";
//    greter.say();
//

//    var g1 = Greeter("Juan");
//    var g2 = Greeter("Luis");
//
//    var g3 = g1 + g2;
//
//    g3.say()
//
//   g3 = g1 plus g2;
//    g3.say()

    var child: Child = Child()
    child.foo()

    val e1 = Employee("John Doe")
    val e2 = Employee("John Doe")
    println(e1)
    println(e1 == e2)

    executor(::doThis)

    executor(listOf(1..1000).flatten())

    with(child, {
        date = Date(2019,6, 10);
    })

    var arr = emptyArray<Int>();
    arr += 1
    arr += 2
    arr += 3
    arr += 4
    arr += 5
    println(arr.size)
    println(Arrays.toString(arr))

    var arr2 = arrayOfNulls<Int>(2)
    println(arr2.size)

    arr2.set(0, 1)
    arr2.set(1, 2)
    println(arr2.size)

    arr2.forEach{ i -> print("$i, ")

    }

    val fruits = mutableListOf<String>("Apple")
    fruits.add("Orange")
    fruits.add(1, "Banana")
    fruits.add("Guava")

    val numbers = (1..1000).toMutableSet()
    numbers.removeIf { i->i%2==0 }
    numbers.removeIf { i->i%3==0 }
    numbers.removeIf { i->i%4==0 }
    numbers.removeIf { i->i%5==0 }
    numbers.removeIf { i->i%6==0 }
    numbers.removeIf { i->i%7==0 }
    numbers.removeIf { i->i%8==0 }
    numbers.removeIf { i->i%9==0 }

    numbers.forEach { e -> println(e) }


    var dict = hashMapOf<String, Int>("foo" to 1)
    var dict2 = mutableMapOf<String, Int>("foo" to 1)
    dict["hola"] = 2
    dict2["hola"] = 2
    dict.set("world", 3)
    dict2.set("world", 3)

    println(dict2)
}


interface A {
    fun foo() {
        println("A:foo")
    }

}
interface B {
    fun foo() {
        println("B:foo")
    }
}
class Child : A, B, Greeter() {
    internal var date = Date();
    override fun foo () {
        super<A>.foo();
        super<B>.foo();

        println("Child:foo")
    }

    init {
        println("init");
    }

    override fun func() {
    }
}

data class Employee(val name:String)

fun doThis() {
    println ("action")
}

fun executor(action:() -> Unit) {
    action()
}


fun executor(numbers:List<Int>) {
    var sum = 0;
    numbers.forEach {
        if ( it % 2 == 0 ) {
            sum += it
        }
    }
    println("Sum of all even numbers = $sum")
}