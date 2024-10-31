package proxy;

import java.util.Date;

public class RealDocument implements Document {
    private static int increment;
    private int id;
    private String content;
    private String creationDate;

    public RealDocument(String content) {
        this.content = content;
        creationDate = new Date().toString();
        this.id = increment++;
    }

    @Override
    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public int getIdentifier() {
        return id;
    }
}
