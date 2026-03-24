package android.view;

class RemoteAccessibilityController {
    private static final java.lang.String TAG = "RemoteAccessibilityController";
    private int mHostId;
    private android.view.RemoteAccessibilityController.RemoteAccessibilityEmbeddedConnection mConnectionWrapper;
    private android.graphics.Matrix mScreenMatrixForEmbeddedHierarchy;
    private final float[] mMatrixValues = null;
    private android.view.View mHostView;
    RemoteAccessibilityController(android.view.View p0) {}
    private void runOnUiThread(java.lang.Runnable p0) {}
    void assosciateHierarchy(android.view.accessibility.IAccessibilityEmbeddedConnection p0, android.os.IBinder p1, int p2) {}
    void disassosciateHierarchy() {}
    boolean alreadyAssociated(android.view.accessibility.IAccessibilityEmbeddedConnection p0) { return false; }
    boolean connected() { return false; }
    android.os.IBinder getLeashToken() { return null; }
    private void setRemoteAccessibilityEmbeddedConnection(android.view.accessibility.IAccessibilityEmbeddedConnection p0, android.os.IBinder p1) {}
    private android.view.RemoteAccessibilityController.RemoteAccessibilityEmbeddedConnection getRemoteAccessibilityEmbeddedConnection() { return null; }
    void setScreenMatrix(android.graphics.Matrix p0) {}

    private final class RemoteAccessibilityEmbeddedConnection implements android.os.IBinder.DeathRecipient {
        private final android.view.accessibility.IAccessibilityEmbeddedConnection mConnection = null;
        private final android.os.IBinder mLeashToken = null;
        RemoteAccessibilityEmbeddedConnection(android.view.RemoteAccessibilityController p0, android.view.accessibility.IAccessibilityEmbeddedConnection p1, android.os.IBinder p2) {}
        android.view.accessibility.IAccessibilityEmbeddedConnection getConnection() { return null; }
        android.os.IBinder getLeashToken() { return null; }
        void linkToDeath() throws android.os.RemoteException {}
        void unlinkToDeath() {}
        public void binderDied() {}
    }
}
