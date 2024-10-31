package proxy;

public class DocumentProxy implements Document{
    private RealDocument realDocument;

    public DocumentProxy(RealDocument realDocument) {
        this.realDocument = realDocument;
    }

    @Override
    public String getCreationDate() {
        return realDocument.getCreationDate();
    }

    @Override
    public String getContent(User user) {
        if (AccessControlService.getInstance().isAllowed(user.getUsername(), realDocument.getIdentifier())) {
            return realDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access denied for user: " + user.getUsername());
        }
    }

    @Override
    public int getIdentifier() {
        return realDocument.getIdentifier();
    }
}
