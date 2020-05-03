package WzorzecProxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFileFromDisc(fileName);
    }

    private void loadFileFromDisc(String fileName) {
        System.out.println("Loading file from disc: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying file: " + fileName);
    }
}
