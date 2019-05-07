package fr.kaijiro.diamond_kata

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test


class DiamondTest {

    @Test
    internal fun drawDiamondWithLetterA() {
        val diamondDrawer = DiamondDrawer()
        val diamondDrawn = diamondDrawer.drawForLetter('A')
        assertThat(diamondDrawn).isEqualTo("A")
    }
}