public class Mathematics {

    /**
     * Считает гипотенузу по катетам.
     * Формула - с*с = a*a + b*b
     * @return гипотенуза
     */
    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a*a + b*b);
    }
}
