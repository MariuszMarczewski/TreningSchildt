package referencesAlternativ;

import java.nio.file.DirectoryStream;

public class MyIntNumMain {
    public static void main(String[] args) {
        MyIntNum ob = new MyIntNum(12);
        TestInterface t = ob::isFactor;

        boolean test = t.test(3);
        System.out.println(test);

    }
}
