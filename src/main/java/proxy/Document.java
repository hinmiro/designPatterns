package proxy;

public interface Document {
    String getCreationDate();
    String getContent(User user);
    int getIdentifier();
}
