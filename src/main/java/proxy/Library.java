package proxy;

import java.util.HashMap;

public class Library {
    HashMap<Integer, Document> documents;

    public Library() {
        documents = new HashMap<>();
    }

    private void addDocument(Document document) {
        documents.put(document.getIdentifier(), document);
        System.out.println("A new Document added to library.");
    }

    public Document getDocument(int id) {
        return documents.get(id);
    }

    public DocumentProxy createProtectedDocument(String content, User user) {
        RealDocument realDocument = new RealDocument(content);
        DocumentProxy proxy = new DocumentProxy(realDocument);
        addDocument(proxy);
        AccessControlService.getInstance().setUser(user.username);
        AccessControlService.getInstance().addAccess(user.getUsername(), realDocument.getIdentifier());
        return proxy;
    }

    public RealDocument createUnprotectedDocument(String content, User user) {
        RealDocument document = new RealDocument(content);
        addDocument(document);
        return document;
    }
}
