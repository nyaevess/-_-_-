public class Main {
    public static void main(String[] args) {
        // Вираз 1
        double a1 = -3.45, b1 = -2.34, c1 = 1.45, d1 = 0.83;
        double y1 = (5 * c1) / Math.cos(a1)
                + Math.sqrt(Math.sinh(Math.abs(b1) * c1) / Math.tan(d1));
        System.out.println("Результат вираз 1 (y1): " + y1);

        // Вираз 2
        double a2 = -2.86, b2 = 1.62, c2 = 10.874, d2 = -2.91;
        double y2 = (Math.log(Math.abs(2 * d2))) / (3 * Math.tan(b2))
                - c2 / Math.sqrt(Math.abs(d2));
        System.out.println("Результат вираз 2 (y2): " + y2);

        // Вираз 3
        double a3 = 1.234, b3 = -3.12, c3 = 5.45, d3 = 2.0;
        double y3 = Math.pow(2 * Math.sin(a3) + Math.cos(b3) * Math.sqrt(c3), d3);
        System.out.println("Результат вираз 3 (y3): " + y3);
    }
}