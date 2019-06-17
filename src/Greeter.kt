class Greeter{
    private var intVar: Int = 0
    private var stringVar: String = ""
    private var doubleVar: Double = .0
    private var charVar: Char = ' '
    private var booleanvar: Boolean = !false
    private var name: String? = null

    constructor(intVar: Int, stringVar: String, doubleVar: Double, charVar: Char, booleanvar: Boolean) {
        this.intVar = intVar
        this.stringVar = stringVar
        this.doubleVar = doubleVar
        this.charVar = charVar
        this.booleanvar = booleanvar
    }

    constructor(name: String){
        this.name = name
    }



    infix fun say(msg: String) = println("$name is saying $msg")
    
    infix operator fun plus(greeter: Greeter) : Greeter {
        this.name += "${greeter.name}"
        
        return this
    }


    infix operator fun times (greeter: Greeter) : Greeter {
        this.name += "${greeter.name}"

        return this
    }


    fun say() = println("$name")

    fun getStringVar(): Any{
        var finally = fun(): Int{
            return 0
        }

        return finally()
    }

    fun greet(name: String): String{
        var rem = 1
        var a = 0
        var b = 0
        while (rem != 0) {
            try {
                rem = a % b
                a = b
                b = rem
            }catch (e:Exception){
                System.out.println(e.stackTrace)
                break
            }
        }
        return "Hello $name !!"
    }


    override fun toString(): String {
        return "Greeter(intVar=$intVar, stringVar='$stringVar', doubleVar=$doubleVar, charVar=$charVar, booleanvar=$booleanvar)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Greeter

        if (intVar != other.intVar) return false
        if (stringVar != other.stringVar) return false
        if (doubleVar != other.doubleVar) return false
        if (charVar != other.charVar) return false
        if (booleanvar != other.booleanvar) return false

        return true
    }

    override fun hashCode(): Int {
        var result = intVar
        result = 31 * result + stringVar.hashCode()
        result = 31 * result + doubleVar.hashCode()
        result = 31 * result + charVar.hashCode()
        result = 31 * result + booleanvar.hashCode()
        return result
    }


}