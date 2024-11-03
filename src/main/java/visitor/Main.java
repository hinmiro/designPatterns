package visitor;

public class Main {
    public static void main(String[] args) {

        // Size calculator demo
        SizeCalculatorVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();

        FileSystemElement directory = new Directory();
        FileSystemElement music = new Directory();
        directory.addElement(new File("cat_image.png", 4.2));
        directory.addElement(new File("week_calendar.pdf", 1.6));
        directory.addElement(new File("big_file.exe", 124.8));
        music.addElement(new File("low_beats.mp3", 3.5));
        music.addElement(new File("classicMusic.mp3", 3.1));
        directory.addElement(music);

        directory.accept(sizeCalculatorVisitor);

        SearchVisitor searchVisitor = new SearchVisitor(".*.mp3");

        directory.accept(searchVisitor);


    }
}
