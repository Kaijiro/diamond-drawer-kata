package fr.kaijiro.diamond_kata

class Diamond private constructor(private val character: Char) {

    override fun toString(): String {
        return buildString {
            val characterCode = character.toInt()

            for(actualCharacterCode in 'A'.toInt()..characterCode){
                addDiamondLayer(actualCharacterCode)
            }

            for(actualCharacterCode in (characterCode - 1) downTo 'A'.toInt()){
                addDiamondLayer(actualCharacterCode)
            }
        }.trimEnd()
    }

    private fun StringBuilder.addDiamondLayer(characterCode: Int) {
        val offset = character.toInt() - characterCode
        val character = characterCode.toChar()

        addSpaces(offset)

        if (characterCode == 'A'.toInt()) {
            appendln('A')
        } else {
            append(character)
            addSpaces(calculateSpaceBetweenLetters(characterCode))
            appendln(character)
        }
    }

    private fun StringBuilder.addSpaces(spacesNumber: Int) {
        for(i in 0 until spacesNumber){
            append(" ")
        }
    }

    private fun calculateSpaceBetweenLetters(characterCode: Int) = -1 + 2 * (characterCode - 'A'.toInt())

    companion object {
        fun of(character: Char): Diamond {
            if(character in 'a'..'z'){
                return Diamond(character.toUpperCase())
            }

            if(character < 'A' || character > 'Z'){
                throw IllegalArgumentException()
            }

            return Diamond(character)
        }
    }
}