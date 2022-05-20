package com.example.unittestingexample


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid useername and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Susheet",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Manish",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Vasu",
            "",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Manish",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Vasu",
            "abc1",
            "abc1"
        )
        assertThat(result).isFalse()
    }
}