package fr.kaijiro.diamond_kata

class DiamondDrawer {
    fun drawForLetter(character: Char): String {
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