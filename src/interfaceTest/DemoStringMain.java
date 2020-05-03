package interfaceTest;

public class DemoStringMain {
    public static void main(String[] args) {
        DemoString demo = (str, str1) -> {
            if (str.indexOf(str1) > -1){
                return true;
            }
            return false;
        };

        boolean b = demo.checkString("abc", "abcd");
        System.out.println(b);
    }
}
