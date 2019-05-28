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

        append(addSpaces(offset))

        if (characterCode == 'A'.toInt()) {
            appendln('A')
        } else {
            append(character)
            append(addSpaces(calculateSpaceBetweenLetters(characterCode)))
            appendln(character)
        }
    }

    private fun calculateSpaceBetweenLetters(characterCode: Int) = -1 + 2 * (characterCode - 'A'.toInt())

    private fun addSpaces(spacesNumber: Int): String {
        var spacesString = ""
        for(i in 0 until spacesNumber){
            spacesString += " "
        }

        return spacesString
    }

    companion object {
        fun of(character: Char): Diamond = Diamond(character.toUpperCase())
    }
}