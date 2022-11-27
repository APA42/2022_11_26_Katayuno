//package com.codely.demo
//
//import org.junit.jupiter.api.BeforeEach
//import org.junit.jupiter.api.Disabled
//import org.junit.jupiter.api.Test
//import org.mockito.ArgumentMatchers
//import org.mockito.Mockito
//import org.mockito.Mockito.*
//import kotlin.test.assertEquals
//
//
////1 -> 50%
////2 -> 70%
////3 -> hago bufanda
////
////Nombre de 5 amigos
////
////primera tienda 50% de conseguir algo
////Segunda tienda 75% de conseguir algo
////Fail Bufanda
////Existo 0 bufandas
//
//open class GiftFinder(val shop1: Shop1) {
//    fun findGiftFor(amigos: List<String>): Map<String, String> {
//        val result = mutableMapOf<String, String>()
//        amigos.forEach {
//            var present = "Bufanda"
//            if (shop1.findGiftFor(it)) {
//                present = "Present"
//            }
//            result[it] = present
//        }
//        return result
//
////        amigos.forEach()
////        val result = mapOf(
////            "APA" to "Bufanda",
////            "Iñigo" to "Bufanda",
////            "Amaia" to "Bufanda",
////            "Zurixe" to "Bufanda",
////            "Ana" to "Bufanda")
////
////        return result
//    }
//}
//
//open class Shop1 {
//    open fun findGiftFor(friend: String) :Boolean {
//
//        //return TODO("Provide the return value")
//        return true
//    }
//}
//
//
//class GiftFinderTest {
//
//    lateinit var shop1: Shop1
//    lateinit var sut : GiftFinder
//
//    @BeforeEach
//    fun beforeEachAPA() {
//        shop1 = mock(Shop1::class.java)
//        sut = GiftFinder(shop1)
//    }
//
//    @Test
//    fun `setup`(){
//        val amigos = listOf("APA", "Iñigo", "Amaia", "Zurixe", "Ana") // val simila a final
//
//        val result = sut.findGiftFor(amigos)
//
//        val expectedResult = mapOf(
//            "APA" to "Bufanda",
//            "Iñigo" to "Bufanda",
//            "Amaia" to "Bufanda",
//            "Zurixe" to "Bufanda",
//            "Ana" to "Bufanda")
//        assertEquals(expectedResult, result)
//    }
//
////    @Test
////    @Disabled
////    fun `setup 2`(){
////        val amigos = listOf("APA", "Iñigo", "Amaia", "Zurixe", "Ana") // val simila a final
////
////        val result = sut.findGiftFor(amigos)
////
////        val expectedResult = mapOf(
////            "APA" to "Present",
////            "Iñigo" to "Bufanda",
////            "Amaia" to "Bufanda",
////            "Zurixe" to "Bufanda",
////            "Ana" to "Bufanda")
////        assertEquals(expectedResult, result)
////    }
////
//    @Test
//    fun `I can fins a gift in a shop with certain percentage` () {
//        // Pillo un amigo
//        // entro en la primera tienda
//        // tengo 50% probabilidad para ese amigo
//        val amigos = listOf("APA", "Iñigo", "Amaia", "Zurixe", "Ana") // val simila a final
//
//        `when`(shop1.findGiftFor("APA")).thenReturn(true)
//        `when`(shop1.findGiftFor("Iñigo")).thenReturn(false)
//        `when`(shop1.findGiftFor("Amaia")).thenReturn(true)
//        `when`(shop1.findGiftFor("Zurixe")).thenReturn(false)
//        `when`(shop1.findGiftFor("Ana")).thenReturn(true)
//
//        val result = sut.findGiftFor(amigos)
//
//        val expectedResult = mapOf(
//            "APA" to "Present",
//            "Iñigo" to "Bufanda",
//            "Amaia" to "Present",
//            "Zurixe" to "Bufanda",
//            "Ana" to "Present")
//        assertEquals(expectedResult, result)
//    }
//    @Test
//    fun `I can fins a gift in a shop with certain percentage 2222` () {
//        // Pillo un amigo
//        // entro en la primera tienda
//        // tengo 50% probabilidad para ese amigo
//        val amigos = listOf("APA", "Iñigo", "Amaia", "Zurixe", "Ana") // val simila a final
//
//        `when`(shop1.findGiftFor("APA")).thenReturn(false)
//        `when`(shop1.findGiftFor("Iñigo")).thenReturn(false)
//        `when`(shop1.findGiftFor("Amaia")).thenReturn(false)
//        `when`(shop1.findGiftFor("Zurixe")).thenReturn(false)
//        `when`(shop1.findGiftFor("Ana")).thenReturn(true)
//
//        val result = sut.findGiftFor(amigos)
//
//        val expectedResult = mapOf(
//            "APA" to "Bufanda",
//            "Iñigo" to "Bufanda",
//            "Amaia" to "Bufanda",
//            "Zurixe" to "Bufanda",
//            "Ana" to "Present")
//        assertEquals(expectedResult, result)
//    }
//
//}
//
//
