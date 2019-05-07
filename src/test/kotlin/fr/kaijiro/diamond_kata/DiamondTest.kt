package fr.kaijiro.diamond_kata

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File
import java.nio.charset.Charset


class DiamondTest {

    @Test
    internal fun `diamond for letter A should be just a single letter A`() {
        val diamondDrawer = DiamondDrawer()
        val diamondDrawn = diamondDrawer.drawForLetter('A')
        assertThat(diamondDrawn).isEqualTo("A")
    }

    @Test
    internal fun `diamond for letter B should be a diamond with A and B letters`() {
        val diamondDrawer = DiamondDrawer()
        val diamondDrawn = diamondDrawer.drawForLetter('B')
        val diamondExpected = File("src/test/resources/diamondB.txt").readText(Charset.defaultCharset())
        assertThat(diamondDrawn).isEqualTo(diamondExpected)
    }
}