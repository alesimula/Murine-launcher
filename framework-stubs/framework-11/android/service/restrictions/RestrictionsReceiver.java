package android.service.restrictions;

public abstract class RestrictionsReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "RestrictionsReceiver";
    public RestrictionsReceiver() { super(); }
    public abstract void onRequestPermission(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.os.PersistableBundle p4);
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}
}
