package typySparametryzowane;

public class Main {
    public static void main(String[] args) {
//        Genom<Integer> gen = new Genom<>(12);
//        gen.showType();
//        System.out.println();
//
//        Genom<String> gen1 = new Genom<>("wariacja");
//        gen1.showType();

//        GenomDouble<String, Integer> genomDouble = new GenomDouble<>("krowa", 21);
//        genomDouble.showTypes();

        GenomNumber<Double> gen1 = new GenomNumber<>(2.28);
        GenomNumber<Integer> gen2 = new GenomNumber<>(3);
        System.out.println(gen1.fraction());


    }
}
