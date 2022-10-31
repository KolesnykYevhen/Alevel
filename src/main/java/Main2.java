public class Main2 {
    public static void main(String[] args) {
        {
            int a = 7, b = 8, c = 7;
            if (a + b >= c && b + c >= a && a + c >= b) {
                double p = (a + b + c) / 2.0;
                double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(S);
            } else {
                System.out.println("Це не трикутник");
            }
            System.out.println("Zadanie 2");
        }
        {
            int a = (int) (Math.random() * 1000);
            System.out.println(a);
            int b = (int) (Math.random() * 1000);
            System.out.println(b);
            int c = (int) (Math.random() * 1000);
            System.out.println(c);
            int min = Math.abs(a) < Math.abs(b) ? Math.abs(a) : Math.abs(b);
            min = Math.abs(min) < Math.abs(c) ? Math.abs(min) : Math.abs(c);
            System.out.println("Найменше за модулем = " + min);
        }
        System.out.println("Zadanie 3");
        {
            int = (int) (Math.random() * 1000);
            if (a % 2 == 0) {
                System.out.println(a + " - Парне");
            } else {
                System.out.println(a + " - Непарне");
            }
        }
    }
}