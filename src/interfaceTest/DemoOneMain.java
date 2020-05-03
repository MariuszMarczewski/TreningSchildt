package interfaceTest;

public class DemoOneMain {

    public static void main(String[] args) {

        DemoOne demoOne = (a) -> {

            if(a < 2) {
                return false;
            }

            for (int i = 2; i < a/i; i++) {
                if(a % i != 0){
                    return true;
                }
            }
            return false;
        };

        boolean check = demoOne.check(7);

//        System.out.println(check);

        DemoOneBroker demo = new DemoOneBroker();
        boolean check1 = demo.check(7);
        System.out.println(check1);


    }
}
