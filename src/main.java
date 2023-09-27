public class main {

    public static void main(String[] args) {
        double ticketPrice = 1000;
        int milesPer20Rub = 1;

        int milesEarned = (int) (ticketPrice / 20) * milesPer20Rub;
        System.out.println("Количество начисленных миль: " + milesEarned);
    }
}
