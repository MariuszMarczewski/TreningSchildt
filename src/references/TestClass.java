package references;

public class TestClass {

//    public static int returnVal(int a){
//        return a;
//    }

      static boolean isPrime(int a){
          if (a < 2) {
              return false;
          }
          for (int i = 2; i < a / i; i++) {
              if( a % i == 0){
                  return false;
              }
          }
          return true;
      }

}
