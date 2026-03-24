package android.app;

class ReceiverRestrictedContext extends android.content.ContextWrapper {
    @android.annotation.UnsupportedAppUsage
    ReceiverRestrictedContext(android.content.Context p0) { super(null); }
    public android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1) { return null; }
    public android.content.Intent registerReceiver(android.content.BroadcastReceiver p0, android.content.IntentFilter p1, java.lang.String p2, android.os.Handler p3) { return null; }
    public android.content.Intent registerReceiverAsUser(android.content.BroadcastReceiver p0, android.os.UserHandle p1, android.content.IntentFilter p2, java.lang.String p3, android.os.Handler p4) { return null; }
    public boolean bindService(android.content.Intent p0, android.content.ServiceConnection p1, int p2) { return false; }
    public boolean bindService(android.content.Intent p0, int p1, java.util.concurrent.Executor p2, android.content.ServiceConnection p3) { return false; }
    public boolean bindIsolatedService(android.content.Intent p0, int p1, java.lang.String p2, java.util.concurrent.Executor p3, android.content.ServiceConnection p4) { return false; }
}
