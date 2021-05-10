public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        //service.calculate(amount, registered);
        long actual = service.calculate(amount, registered);

        boolean passed = expected == actual;

        // выводим результат
        System.out.println(passed);
    }
}

