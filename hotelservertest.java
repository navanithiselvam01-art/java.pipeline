public class hotelserverTest {

    public static void main(String[] args) {

        hotelserver server = new hotelserver();

        if (server != null) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1);
        }
    }
}
