public class Main {
    public static void main(String[] args) {

        int initial = 100;
        int sumForBonus = 1000; //минимальная сумма пополнения для начисления бонусов, по сути строчка оказалась не нужна
        int sumAdd = 1011;

        if (sumAdd > 1000) {
            System.out.println("На вашем счёте: " + (initial + sumAdd));
            System.out.println("Вам начислены бонусы: " + sumAdd / 100);
        } else {
            System.out.println("На вашем счёте: " + (initial + sumAdd));
            System.out.println("Для начисления бонусов - пополните счёт более чем на 1000");
        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}