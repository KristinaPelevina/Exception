package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book = new Book(1, "Дети капитана Гранта", 789, "Жюль Верн");

    @Test
    public void shouldMatchByNameIfExists() {
        String text = "Дети капитана Гранта";
        assertTrue(book.matches(text));
    }

    @Test
    public void shouldMatchByNameIfNotExists() {
        String text = "Парфюмер";
        assertFalse(book.matches(text));
    }

    @Test
    public void shouldMatchByAuthorIfExists() {
        String text = "Жюль Верн";
        assertTrue(book.matches(text));
    }

    @Test
    public void shouldMatchByAuthorIfNotExists() {
        String text = "Патрик Зюскинд";
        assertFalse(book.matches(text));
    }
}