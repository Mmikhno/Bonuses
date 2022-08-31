public class Main {

    public static void main(String[] args) {
        //Начальный счет
        double startAmount = 100.59;
        //сумма пополнения
        int amount = 1100;
        //бонусные начисления за каждые 100 руб.
        int bonus = 1;

        //int step = 100;
        int finalBonuses = 0;
        double total;

        if (amount > 1000) {
            finalBonuses = amount * 1 / 100;
        }

        total = startAmount + amount + finalBonuses;
        System.out.println("Итоговая сумма составляет " + total);
        System.out.println("Начисленные бонусы: " + finalBonuses);
        //доп код 31.08.2022
        System.out.println("итоговая сумма минус начисленные бонусы составляет:" + (total - finalBonuses));
    }
}
