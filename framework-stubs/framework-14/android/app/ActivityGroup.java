package android.app;

@java.lang.Deprecated
public class ActivityGroup extends android.app.Activity {
    static final java.lang.String PARENT_NON_CONFIG_INSTANCE_KEY = "android:parent_non_config_instance";
    protected android.app.LocalActivityManager mLocalActivityManager;
    public ActivityGroup() { super(); }
    public ActivityGroup(boolean p0) { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    protected void onResume() {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    protected void onPause() {}
    protected void onStop() {}
    protected void onDestroy() {}
    public java.util.HashMap<java.lang.String, java.lang.Object> onRetainNonConfigurationChildInstances() { return null; }
    public android.app.Activity getCurrentActivity() { return null; }
    public final android.app.LocalActivityManager getLocalActivityManager() { return null; }
    void dispatchActivityResult(java.lang.String p0, int p1, int p2, android.content.Intent p3, java.lang.String p4) {}
}
