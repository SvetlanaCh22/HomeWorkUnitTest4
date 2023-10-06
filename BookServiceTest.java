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
        // ������� �������� ������
        Book book1 = new Book(1234567890, Book 1);
        Book book2 = new Book(2345678901, Book 2);
        List<Book> expectedBooks = Arrays.asList(book1, book2);

        // ����������� ���-������
        Mockito.when(mockBookRepository.getAllBooks()).thenReturn(expectedBooks);

        // �������� �����, ������� ������ ������������ ���-������
        List<Book> actualBooks = bookService.getAllBooks();

        // ��������� ���������
        Assertions.assertEquals(expectedBooks, actualBooks);
    }

    @Test
    public void testGetBookByISBN() {
        // ������� �������� ������
        String isbn = 1234567890;
        Book expectedBook = new Book(isbn, Book 1);

        // ����������� ���-������
        Mockito.when(mockBookRepository.getBookByISBN(isbn)).thenReturn(expectedBook);

        // �������� �����, ������� ������ ������������ ���-������
        Book actualBook = bookService.getBookByISBN(isbn);

        // ��������� ���������
        Assertions.assertEquals(expectedBook, actualBook);
    }
}