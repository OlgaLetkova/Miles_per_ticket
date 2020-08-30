public class Main {
    public static void main(String[] args) {
        int ticketPrice = 550000;
        int oneMile = 2000;
        // Значения переменных ticketPrise и oneMile подставляем с копейками, два последних знака-копейки.
        int quantityOfMiles = ticketPrice / oneMile;
        System.out.println(quantityOfMiles);
    }
}