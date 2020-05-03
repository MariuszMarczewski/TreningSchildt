package interfaceTest;

public class DemoParametrizedMain {
    public static void main(String[] args) {
        DemoParametrized<String> demoString = (a, b) -> {
            if(a.compareTo(b) > 0){
                return true;
            }
            return false;
        };

//        if(demoString.test("abraka", "rowerek")){
//            System.out.println("Pierwszy string jest dłuższy drugiego");
//        } else {
//            System.out.println("Drugi string jest dłuższy od pierwszego lub dłuość obu stringów jest jednakowa");
//        }

    }


}
