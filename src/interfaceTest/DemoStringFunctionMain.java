package interfaceTest;

public class DemoStringFunctionMain {
    public static void main(String[] args) {
        String str = "Wyrażenia regularne rozszerzają możliwości Javy";
        System.out.println(str);
        System.out.println();

        DemoStringFunction demo = (s) -> {
            String result = "";
            for(int i = s.length() - 1; i >= 0; i--){
                result += s.charAt(i);
            }
            return result;
        };

        System.out.println(demo.func(str));
        System.out.println();

        DemoStringFunctionBroker dsf = new DemoStringFunctionBroker();
        String zegarek = dsf.changeString(demo, "zegarek");
        System.out.println(zegarek);
        System.out.println();

        String testString = "wrotki";

        String resultTest = dsf.changeString((s) -> {
            String result = "";
            for (int i = 0; i < s.length() - 1; i++) {
                char c = s.charAt(i);
                if(Character.isUpperCase(c)){
                    result += Character.toLowerCase(c);
                } else {
                    result += Character.toUpperCase(c);
                }
            }
            return result;
        }, testString);

        System.out.println(resultTest);


    }
}
