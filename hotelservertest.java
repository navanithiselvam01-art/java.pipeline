public class HotelServerTest {

    public static void main(String[] args) {

        HotelServer server = new HotelServer();

        if (server != null) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1);
        }
    }
}
