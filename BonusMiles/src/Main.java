public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2000; // стоимость билета (руб)
        int moneyOfOneMile = 20; // сумма (руб) за начисление 1 мили

        int bonus = ticketPrice / moneyOfOneMile; // бонусы миль
        System.out.println("Вам начислено :" + bonus + " миля(ь)");
    }
}
