import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello, World!", hello.getMessage());
    }
}

