package fr.kaijiro.diamond_kata

class Diamond private constructor(private val character: Char) {

    override fun toString(): String {
        if(character == 'A'){
            return "A"
        }

        return buildString {
            for(characterCode in 'A'.toInt()..character.toInt()){
                val offset = character.toInt() - characterCode
                append(addSpaces(offset))

                if(characterCode == 'A'.toInt()){
                    appendln('A')
                } else {
                    append(characterCode.toChar())
                    append(addSpaces(-1 + 2 * (characterCode - 'A'.toInt())))
                    appendln(characterCode.toChar())
                }
            }

            for(characterCode in (character.toInt() - 1) downTo 'A'.toInt()){
                val offset = character.toInt() - characterCode
                append(addSpaces(offset))

                if(characterCode == 'A'.toInt()){
                    append('A')
                } else {
                    append(characterCode.toChar())
                    append(addSpaces(-1 + 2 * (characterCode - 'A'.toInt())))
                    appendln(characterCode.toChar())
                }
            }
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