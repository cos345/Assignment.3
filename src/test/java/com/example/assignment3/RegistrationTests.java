package com.example.assignment3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RegistrationTests {
    @Test
   public void TestValidEmail() {
        assertFalse(RegistrationForm.checkEmail("thisisnotanemail"));
        assertTrue(RegistrationForm.checkEmail("123@xyz.com"));
    }
}