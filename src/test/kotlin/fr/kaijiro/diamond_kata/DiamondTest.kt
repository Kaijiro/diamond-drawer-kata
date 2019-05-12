package fr.kaijiro.diamond_kata

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
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
}