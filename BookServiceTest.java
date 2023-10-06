import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

public class BookServiceTest {
    @Mock
    private BookRepository mockBookRepository;

    private BookService bookService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(mockBookRepository);
    }

    @Test
    public void testGetAllBooks() {
        // Создаем тестовые данные
        Book book1 = new Book(1234567890, Book 1);
        Book book2 = new Book(2345678901, Book 2);
        List<Book> expectedBooks = Arrays.asList(book1, book2);

        // Настраиваем мок-объект
        Mockito.when(mockBookRepository.getAllBooks()).thenReturn(expectedBooks);

        // Вызываем метод, который должен использовать мок-объект
        List<Book> actualBooks = bookService.getAllBooks();

        // Проверяем результат
        Assertions.assertEquals(expectedBooks, actualBooks);
    }

    @Test
    public void testGetBookByISBN() {
        // Создаем тестовые данные
        String isbn = 1234567890;
        Book expectedBook = new Book(isbn, Book 1);

        // Настраиваем мок-объект
        Mockito.when(mockBookRepository.getBookByISBN(isbn)).thenReturn(expectedBook);

        // Вызываем метод, который должен использовать мок-объект
        Book actualBook = bookService.getBookByISBN(isbn);

        // Проверяем результат
        Assertions.assertEquals(expectedBook, actualBook);
    }
}