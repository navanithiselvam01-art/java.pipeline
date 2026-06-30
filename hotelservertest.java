public class hotelServerTest {

    public static void main(String[] args) {

        hotelServer server = new hotelServer();

        if (server != null) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1);
        }
    }
}
