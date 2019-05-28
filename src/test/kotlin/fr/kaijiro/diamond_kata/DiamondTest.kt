package fr.kaijiro.diamond_kata

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.io.File
import java.nio.charset.Charset


class DiamondTest {

    @Test
    internal fun `diamond for letter A should be just a single letter A`() {
        val diamond = Diamond.of('A')

        val diamondDrawn = diamond.toString()

        assertThat(diamondDrawn).isEqualTo("A")
    }

    @Test
    internal fun `diamond for letter B should be a diamond with A and B letters`() {
        val diamond = Diamond.of('B')

        val diamondDrawn = diamond.toString()

        val diamondExpected = File("src/test/resources/diamondB.txt").readText(Charset.defaultCharset())
        assertThat(diamondDrawn).isEqualTo(diamondExpected)
    }

    @Test
    internal fun `diamond for letter C should be a diamond with A B and C letters`() {
        val diamond = Diamond.of('C')

        val diamondDrawn = diamond.toString()

        val diamondExpected = File("src/test/resources/diamondC.txt").readText(Charset.defaultCharset())
        assertThat(diamondDrawn).isEqualTo(diamondExpected)
    }

    @Test
    internal fun `diamond for letter D should be a diamond with A B C and D letters`() {
        val diamond = Diamond.of('D')

        val diamondDrawn = diamond.toString()

        val diamondExpected = File("src/test/resources/diamondD.txt").readText(Charset.defaultCharset())
        assertThat(diamondDrawn).isEqualTo(diamondExpected)
    }

    @Test
    internal fun `diamond for letter 'c' should be the same diamond for the letter 'C'`() {
        val diamond = Diamond.of('c')

        val diamondDrawn = diamond.toString()

        val diamondExpected = File("src/test/resources/diamondC.txt").readText(Charset.defaultCharset())
        assertThat(diamondDrawn).isEqualTo(diamondExpected)
    }

    @ParameterizedTest
    @ValueSource(chars = ['1', ',', '}'])
    internal fun `diamond should only be instantiated from letters`(character: Char) {
        assertThatThrownBy {
            Diamond.of(character)
        } .isInstanceOf(IllegalArgumentException::class.java)
    }
}