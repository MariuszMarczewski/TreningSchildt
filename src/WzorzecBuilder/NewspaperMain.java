package WzorzecBuilder;

public class NewspaperMain {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper.Builder()
                .editor("Warzecha")
                .title("Sieci")
                .build();

        System.out.println(newspaper.getTitle());
        System.out.println(newspaper.getEditor());
        System.out.println(newspaper.getPages());
    }
}
