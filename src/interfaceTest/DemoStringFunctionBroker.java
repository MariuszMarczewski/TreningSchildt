package interfaceTest;

public class DemoStringFunctionBroker {
    String changeString(DemoStringFunction df, String str){
        return df.func(str);
    }
}
