package test

import org.junit.Test
import org.mockito.Mockito

class TargetTestKotlin {
    @Test
    fun test() {
        val mockTarget = Mockito.mock(Target::class.java)
        Mockito.`when`(
            mockTarget.target(
                Mockito.argThat<String> { true },
                mapper = Mockito.argThat<Function1<String, Int>> { true })
        ).thenReturn(100)
        assert(mockTarget.target("Hello World") { 1 } == 100)
    }
}
