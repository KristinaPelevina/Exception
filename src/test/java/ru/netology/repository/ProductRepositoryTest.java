
package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.exception.NotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    ProductRepository repository = new ProductRepository();
    private Book book1 = new Book (1, "Дети капитана Гранта", 789, "Жюль Верн");
    private Book book2 = new Book(2,"Парфюмер", 456, "Патрик Зюскинд");

    @BeforeEach
    void setUp() {
        repository.save(book1);
        repository.save(book2);
    }

    @Test
    public void shouldRemoveIfExists() {
        int removeId = 2;
        repository.removeById(removeId);
        Product[] expected = new Product[]{book1};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnNullIfNotExists() {
        int removeId = 3;
        repository.findById(removeId);
        Product expected = null;
        Product actual = repository.findById(removeId);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveByIdIfNotExist() {
        int removeId = 3;
        assertThrows(NotFoundException.class, () -> repository.removeById(removeId));
    }
}