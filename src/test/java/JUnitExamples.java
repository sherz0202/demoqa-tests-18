import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Here is beforeAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Here is beforeEach");
    }

    @AfterEach
    void AfterEach(){
        System.out.println("Here is AfterEach");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("Here is AfterAll");
    }

    @Test
    void firstTest(){
        System.out.println("Here is first test");
    }

    @Test
    void secondTest(){
        System.out.println("Here is second test");
    }
}
