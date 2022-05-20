package com.example.unittestingexample

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class PracticeTestFibo{

    @Test
    fun `0 returns 0`(){
        val result = Practice.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `1 returns 1`(){
        val result = Practice.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `3 returns 2`(){
        val result = Practice.fib(2)
        assertThat(result).isEqualTo(2)
    }

}