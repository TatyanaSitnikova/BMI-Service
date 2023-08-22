public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98;
        double highMetres = 1.87;
        int index = service.calculate(weightKg, highMetres);
        System.out.println(index);
    }
}