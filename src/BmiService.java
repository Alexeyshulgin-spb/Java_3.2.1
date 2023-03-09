public class BmiService {
    public int calculate(int weightKg, double heightMeters) {
        return (int) (weightKg / heightMeters / heightMeters);
    }
}
