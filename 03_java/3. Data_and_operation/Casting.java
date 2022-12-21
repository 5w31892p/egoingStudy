public class Casting {
    public static void main(String[] args) {

        double a = 1.1; // 1.1
        double b = 1; // 1.0, 자동 컨버팅
        double b2 = (double) 1; // 1.0, 수동 컨버팅
        System.out.println(b);

//        int c = 1.1;
        double d = 1.1; // 1.1
        int e = (int) 1.1; // 1
        System.out.println(d);

//        1 to String
        String f = Integer.toString(1);
        System.out.println(f.getClass()); // class java.lang.String
    }
}