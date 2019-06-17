fun main(args: Array<String> ){
//    var greter: Greeter = Greeter("Juan");
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
class Child : A, B {
    override fun foo () {
        super<A>.foo();
        super<B>.foo();

        println("Child:foo")
    }

    constructor(){
        println("constructor")
    }

    init {
        println("init");
    }

}