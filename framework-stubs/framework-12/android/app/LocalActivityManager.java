package android.app;

@java.lang.Deprecated
public class LocalActivityManager {
    private static final java.lang.String TAG = "LocalActivityManager";
    private static final boolean localLOGV = false;
    static final int RESTORED = 0;
    static final int INITIALIZING = 1;
    static final int CREATED = 2;
    static final int STARTED = 3;
    static final int RESUMED = 4;
    static final int DESTROYED = 5;
    private final android.app.ActivityThread mActivityThread = null;
    private final android.app.Activity mParent = null;
    private android.app.LocalActivityManager.LocalActivityRecord mResumed;
    private final java.util.Map<java.lang.String, android.app.LocalActivityManager.LocalActivityRecord> mActivities = null;
    private final java.util.ArrayList<android.app.LocalActivityManager.LocalActivityRecord> mActivityArray = null;
    private boolean mSingleMode;
    private boolean mFinishing;
    private int mCurState;
    public LocalActivityManager(android.app.Activity p0, boolean p1) {}
    private void moveToState(android.app.LocalActivityManager.LocalActivityRecord p0, int p1) {}
    private void performPause(android.app.LocalActivityManager.LocalActivityRecord p0, boolean p1) {}
    public android.view.Window startActivity(java.lang.String p0, android.content.Intent p1) { return null; }
    private android.view.Window performDestroy(android.app.LocalActivityManager.LocalActivityRecord p0, boolean p1) { return null; }
    public android.view.Window destroyActivity(java.lang.String p0, boolean p1) { return null; }
    public android.app.Activity getCurrentActivity() { return null; }
    public java.lang.String getCurrentId() { return null; }
    public android.app.Activity getActivity(java.lang.String p0) { return null; }
    public void dispatchCreate(android.os.Bundle p0) {}
    public android.os.Bundle saveInstanceState() { return null; }
    public void dispatchResume() {}
    public void dispatchPause(boolean p0) {}
    public void dispatchStop() {}
    public java.util.HashMap<java.lang.String, java.lang.Object> dispatchRetainNonConfigurationInstance() { return null; }
    public void removeAllActivities() {}
    public void dispatchDestroy(boolean p0) {}

    private static class LocalActivityRecord extends android.os.Binder {
        final java.lang.String id = null;
        android.content.Intent intent;
        android.content.pm.ActivityInfo activityInfo;
        android.app.Activity activity;
        android.view.Window window;
        android.os.Bundle instanceState;
        int curState;
        LocalActivityRecord(java.lang.String p0, android.content.Intent p1) { super(); }
    }
}
