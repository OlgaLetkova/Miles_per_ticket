public class Main {
    public static void main(String[] args) {
        int TicketPrice;
        // TicketPrise подставляем с копейками, два последних знака-копейки.
        int OneMile;
        // OneMile подставляем с копейками.
        TicketPrice = 550000;
        OneMile = 2000;
        int QuantityOfMiles = TicketPrice / OneMile;
        System.out.println(QuantityOfMiles);
    }
}