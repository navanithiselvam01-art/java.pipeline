import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HotelServerTest {

    @Test
    public void testClassCreation() {
        HotelServer server = new HotelServer();
        assertNotNull(server);
    }

    @Test
    public void testClassName() {
        HotelServer server = new HotelServer();
        assertEquals("HotelServer", server.getClass().getSimpleName());
    }

    @Test
    public void testObjectType() {
        HotelServer server = new HotelServer();
        assertTrue(server instanceof HotelServer);
    }

    @Test
    public void testMainMethodExists() {
        try {
            java.lang.reflect.Method method =
                    HotelServer.class.getMethod("main", String[].class);

            assertNotNull(method);
            assertTrue(java.lang.reflect.Modifier.isStatic(method.getModifiers()));
        } catch (Exception e) {
            fail("Main method not found");
        }
    }

    @Test
    public void testServerClassLoaded() {
        assertDoesNotThrow(() -> Class.forName("HotelServer"));
    }
}
