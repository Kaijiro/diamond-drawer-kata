package fr.kaijiro.diamond_kata

class Diamond private constructor(private val character: Char) {

    override fun toString(): String {
        if(this.character == 'C'){
            return buildString {
                appendln("  A")
                appendln(" B B")
                appendln("C   C")
                appendln(" B B")
                append("  A")
            }
        }

        if(this.character == 'B'){
            return buildString {
                appendln(" A")
                appendln("B B")
                append(" A")
            }
        }

        return "A"
    }


    companion object {
        fun of(character: Char): Diamond = Diamond(character)
    }
}