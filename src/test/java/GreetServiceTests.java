import org.junit.jupiter.api.Test;

public class GreetServiceTests {

    @Test
    void testGreet() {
        GreetService greetService = new GreetService();
        for (int i = 0; i < 10; i++) {
            greetService.greet("wcz" + i);
        }
    }
}
