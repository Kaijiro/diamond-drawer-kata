package fr.kaijiro.diamond_kata

class Diamond private constructor(private val character: Char) {

    override fun toString(): String {
        if(this.character == 'D'){
            return buildString {
                append(addSpaces(3))
                appendln("A")

                append(addSpaces(2))
                append("B")
                append(addSpaces(1))
                appendln("B")

                append(addSpaces(1))
                append("C")
                append(addSpaces(3))
                appendln("C")

                append("D")
                append(addSpaces(5))
                appendln("D")

                append(addSpaces(1))
                append("C")
                append(addSpaces(3))
                appendln("C")

                append(addSpaces(2))
                append("B")
                append(addSpaces(1))
                appendln("B")

                append(addSpaces(3))
                append("A")
            }
        }

        if(this.character == 'C'){
            return buildString {
                append(addSpaces(2))
                appendln("A")

                append(addSpaces(1))
                append("B")
                append(addSpaces(1))
                appendln("B")

                append("C")
                append(addSpaces(3))
                appendln("C")

                append(addSpaces(1))
                append("B")
                append(addSpaces(1))
                appendln("B")

                append(addSpaces(2))
                append("A")
            }
        }

        if(this.character == 'B'){
            return buildString {
                append(addSpaces(1))
                appendln("A")

                append("B")
                append(addSpaces(1))
                appendln("B")

                append(addSpaces(1))
                append("A")
            }
        }

        return buildString {
            append("A")
        }
    }

    private fun addSpaces(spacesNumber: Int): String {
        var spacesString = ""
        for(i in 0 until spacesNumber){
            spacesString += " "
        }

        return spacesString
    }


    companion object {
        fun of(character: Char): Diamond = Diamond(character)
    }
}