package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone smartphone1 = new Smartphone(1, "Apple", 45000, "China");

    @Test
    public void shouldMatchByNameIfExists() {
        String text = "Apple";
        assertTrue(smartphone1.matches(text));
    }

    @Test
    public void shouldMatchByNameIfNotExists() {
        String text = "Samsung";
        assertFalse(smartphone1.matches(text));
    }

    @Test
    public void shouldMatchByManufacturerIfExists() {
        String text = "China";
        assertTrue(smartphone1.matches(text));
    }

    @Test
    public void shouldMatchByManufacturerIfNotExists() {
        String text = "Japan";
        assertFalse(smartphone1.matches(text));
    }
}