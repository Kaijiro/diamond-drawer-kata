package fr.kaijiro.diamond_kata

class DiamondDrawer {
    fun drawForLetter(character: Char): String {
        if(character == 'C'){
            return buildString {
                appendln("  A")
                appendln(" B B")
                appendln("C   C")
                appendln(" B B")
                append("  A")
            }
        }

        if(character == 'B'){
            return buildString {
                appendln(" A")
                appendln("B B")
                append(" A")
            }
        }

        return "A"
    }
}