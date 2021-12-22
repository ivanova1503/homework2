package ivanova;

import org.junit.jupiter.api.*;

//@DisplayName("First Test")



public class ClassWork {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Это метод стоит перед всеми тестами");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Это метод стоит после всех тестов");
    }


    @BeforeEach
    void openYandex() {
        //open(ya.ru);
        System.out.println("Яндекс открыт");
    }

    @AfterEach
    void takeScreen() {
        //takeScreen();
        System.out.println("Скриншот сделан");
    }



    @Test
    void firstTest() {
        Assertions.assertTrue(true);
        System.out.println("             First test");
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(true);
        System.out.println("            Second test");
    }


}
