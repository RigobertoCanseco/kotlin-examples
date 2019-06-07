class Greeter{
    private var intVar: Int = 0;
    private var stringVar: String = "";
    private var doubleVar: Double = .0;
    private var charVar: Char = ' ';
    private var booleanvar: Boolean = !false;

    constructor(intVar: Int, stringVar: String, doubleVar: Double, charVar: Char, booleanvar: Boolean) {
        this.intVar = intVar
        this.stringVar = stringVar
        this.doubleVar = doubleVar
        this.charVar = charVar
        this.booleanvar = booleanvar
    }

    constructor()

    fun getStringVar(): String{
        return this.stringVar;
    }

    fun greet(name: String): String{
        var rem = 1;
        var a = 0;
        var b = 0;
        while (rem != 0) {
            try {
                rem = a % b
                a = b
                b = rem
            }catch (e:Exception){
                System.out.println(e.stackTrace);
                break;
            }
        }

        println(b);
        return "Hello $name !!";

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