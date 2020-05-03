package interfaceTest;

public class DemoMain {
    public static void main(String[] args) {
        Demo demo = (a, b) -> {
            if(a % 2 == 0 || b % 2 == 0){
                System.out.println("Good job!");
                return true;
            }
            return false;
        };

        boolean test = demo.test(5, 8);

        System.out.println(test);
    }
}
