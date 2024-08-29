package abstractFactory;

public class TextFieldB extends TextField {

    private String text;

    public TextFieldB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println(
                "                /|  /|  ---------------------------\n" +
                "                ||__||  |                         |\n" +
                "               /   O O\\__  I have a horny little  |\n" +
                "              /          \\   operating system     |\n" +
                "             /      \\     \\                       |\n" +
                "            /   _    \\     \\ ----------------------\n" +
                "           /    |\\____\\     \\      ||\n" +
                "          /     | | | |\\____/      ||\n" +
                "         /       \\| | | |/ |     __||\n" +
                "        /  /  \\   -------  |_____| ||\n" +
                "       /   |   |           |       --|\n" +
                "       |   |   |           |_____  --|\n" +
                "       |  |_|_|_|          |     \\----\n" +
                "       /\\                  |\n" +
                "      / /\\        |        /\n" +
                "     / /  |       |       |\n" +
                " ___/ /   |       |       |\n" +
                "|____/    c_c_c_C/ \\C_c_c_c\n"+text);
    }

    @Override
    public void setText(String newText) {
        this.text = newText;
    }
}
