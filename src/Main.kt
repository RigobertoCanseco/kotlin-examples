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