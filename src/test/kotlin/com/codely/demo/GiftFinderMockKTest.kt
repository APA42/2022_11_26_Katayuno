package com.codely.demo

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GiftFinderMockKTest {

    @Test
    fun `setup`(){
        val shop1 = mockk<Shop1>()
        val sut = GiftFinder(shop1)
        val amigos = listOf("APA", "Iñigo", "Amaia", "Zurixe", "Ana") // val simila a final

        every { shop1.findGiftFor("APA") }.returns(true)
        every { shop1.findGiftFor("Iñigo") }.returns(false)
        every { shop1.findGiftFor("Amaia") }.returns(true)
        every { shop1.findGiftFor("Zurixe") }.returns(false)
        every { shop1.findGiftFor("Ana") }.returns(true)

        val result = sut.findGiftFor(amigos)

        val expectedResult = mapOf(
            "APA" to "Present",
            "Iñigo" to "Bufanda",
            "Amaia" to "Present",
            "Zurixe" to "Bufanda",
            "Ana" to "Present"
        )
        assertEquals(expectedResult, result)
    }

}

class GiftFinder(val shop1: Shop1) {
    fun findGiftFor(amigos: List<String>): Map<String, String> {
        TODO("Not yet implemented")
    }

}

class Shop1 {
    fun findGiftFor(friend: String) :Boolean {
        return TODO("Provide the return value")
    }
}
