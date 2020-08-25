package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product(1, "Дети капитана Гранта", 789);

    @Test
    void shouldMatchByNameIfExists() {
        String text = "Дети капитана Гранта";
        assertTrue(product.matches(text));
    }

    @Test
    void shouldMatchByNameIfNotExists() {
        String text = "Парфюмер";
        assertFalse(product.matches(text));
    }
}