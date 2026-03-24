package android.view;

class RemoteAccessibilityController {
    RemoteAccessibilityController(android.view.View p0) {}
    void assosciateHierarchy(android.view.accessibility.IAccessibilityEmbeddedConnection p0, android.os.IBinder p1, int p2) {}
    void disassosciateHierarchy() {}
    boolean alreadyAssociated(android.view.accessibility.IAccessibilityEmbeddedConnection p0) { return false; }
    boolean connected() { return false; }
    android.os.IBinder getLeashToken() { return null; }
    void setWindowMatrix(android.graphics.Matrix p0, boolean p1) {}

    private static final class RemoteAccessibilityEmbeddedConnection implements android.os.IBinder.DeathRecipient {
        RemoteAccessibilityEmbeddedConnection(android.view.RemoteAccessibilityController p0, android.view.accessibility.IAccessibilityEmbeddedConnection p1, android.os.IBinder p2) {}
        android.view.accessibility.IAccessibilityEmbeddedConnection getConnection() { return null; }
        android.os.IBinder getLeashToken() { return null; }
        void linkToDeath() throws android.os.RemoteException {}
        void unlinkToDeath() {}
        public void binderDied() {}
    }
}
