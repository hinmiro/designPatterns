package proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class AccessControlService {
    private static AccessControlService instance = null;
    private Map<String, ArrayList<Integer>> userAccess;

    private AccessControlService() {
        userAccess = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        instance = instance == null ? new AccessControlService() : instance;
        return instance;
    }

    public void setUser(String username) {
        userAccess.put(username, new ArrayList<>());
    }

    public void addAccess(String username, int d) {
        userAccess.get(username).add(d);
    }

    public boolean isAllowed(String username, int d) {
        ArrayList<Integer> accessList = userAccess.get(username);
        return accessList != null && accessList.contains(d);
    }

}
