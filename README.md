Решение домашнего задания 4 по Unit тестам

1) Ответы на вопросы в файле "Задание 1. Ответ письменно на вопросы.rtf"

2) BookServiceTest.java - В этом примере мы используем аннотацию @Mock из Mockito для создания мок-объекта класса BookRepository.
   В методе setUp() мы инициализируем мок-объекты с помощью MockitoAnnotations.initMocks(this) и создаем экземпляр BookService, передавая мок-объект mockBookRepository.
   Затем мы настраиваем поведение мок-объекта с помощью метода Mockito.when() и указываем, какой результат он должен возвращать при вызове определенных методов.
   В наших тестах мы вызываем методы getAllBooks() и getBookByISBN() у bookService и проверяем, возвращаются ли ожидаемые результаты, используя Assertions.assertEquals().
   Когда мы запускаем наши unit-тесты, Mockito будет использовать мок-объект mockBookRepository вместо реального объекта BookRepository.
   Это позволяет нам изолировать тестируемый класс BookService от зависимостей и проверить его логику без реальных вызовов к базе данных.