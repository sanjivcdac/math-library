package com.example.mathlib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResolveMerchantTest {

    @Test
    public void testResolveSingleMerchant() {
        ResolveMerchant resolver = new ResolveMerchant();
        String result = resolver.resolveSingleMerchant("12345");

        // Since the method always returns "Test", we expect "Test" as result
        assertEquals("Test", result, "The merchant name should be 'Test'");
    }}