package android.window;

public class TaskSnapshotManager {
    public static final int RESOLUTION_HIGH = 1;
    public static final int RESOLUTION_LOW = 2;
    public static final int RESOLUTION_ANY = 3;
    public static android.window.TaskSnapshotManager getInstance() { return null; }
    public android.window.TaskSnapshot getTaskSnapshot(int p0, int p1) throws android.os.RemoteException { return null; }
    public android.window.TaskSnapshot takeTaskSnapshot(int p0, boolean p1) throws android.os.RemoteException { return null; }
    public static boolean isResolutionMatch(android.window.TaskSnapshot p0, int p1) { return false; }
    public static int convertRetrieveFlag(boolean p0) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Resolution {
    }
}
