public class StringApp {
    public static void main(String[] args) {

        // Character VS String
        System.out.println("Hello"); // string (문자, character모음)
        System.out.println('H'); // character (한글자만 표현)
        System.out.println("H"); // string

        System.out.println("Hello " +
                "world");
        // New line
        System.out.println("Hello \nWorld"); // 줄바꿈

        // Escape
        System.out.println("Hello \"World\""); // 따옴표 일반 문자열 만드려면 앞에 \ 붙히기
        // Hello "World"
    }
}
