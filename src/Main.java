public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 75;
        double heightMeters = 1.75;
        int bmi = service.calculate(weightKg, heightMeters);
        ;
        System.out.println(bmi);
    }
}