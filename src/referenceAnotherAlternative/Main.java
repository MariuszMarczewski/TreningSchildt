package referenceAnotherAlternative;

public class Main {
    public static void main(String[] args) {
        MyNum ob = new MyNum(12);
        MyIntNumInterface m = MyNum::isFactor;

        if(m.test(ob, 4)){
            System.out.println("Good job!");
        }
    }
}
