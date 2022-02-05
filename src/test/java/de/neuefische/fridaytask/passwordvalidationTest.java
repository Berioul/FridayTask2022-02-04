package de.neuefische.fridaytask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidationTest {
    @Test
    void lengthShouldBe8() {
        //given
        String pass = "oualdfo6";

        //when

        boolean valid = PasswordValidation.checkPass(pass);


        //then
        assertTrue(valid);
    }

    @Test
    void shouldCountainOnlyDigit() {
        //given
        String pass1 = "898089";

        //when
        boolean valid1 = PasswordValidation.checkPass(pass1);

        //then
        assertFalse(valid1);

    }

    @Test
    void shouldCountainOnlyLetters() {
        //given
        String pass1 = "oualidihdsfhidl";

        //when
        boolean valid1 = PasswordValidation.checkPass(pass1);

        //then
        assertFalse(valid1);

    }


}