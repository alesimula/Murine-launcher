package android.net.lowpan;

public class LowpanManager {
    private static final java.lang.String TAG = null;
    private final java.util.Map<java.lang.Integer, android.net.lowpan.ILowpanManagerListener> mListenerMap = null;
    private final java.util.Map<java.lang.String, android.net.lowpan.LowpanInterface> mInterfaceCache = null;
    private final java.util.Map<android.os.IBinder, java.lang.ref.WeakReference<android.net.lowpan.LowpanInterface>> mBinderCache = null;
    private final android.net.lowpan.ILowpanManager mService = null;
    private final android.content.Context mContext = null;
    private final android.os.Looper mLooper = null;
    public static android.net.lowpan.LowpanManager from(android.content.Context p0) { return null; }
    public static android.net.lowpan.LowpanManager getManager() { return null; }
    LowpanManager(android.net.lowpan.ILowpanManager p0) {}
    public LowpanManager(android.content.Context p0, android.net.lowpan.ILowpanManager p1) {}
    public LowpanManager(android.content.Context p0, android.net.lowpan.ILowpanManager p1, android.os.Looper p2) {}
    public android.net.lowpan.LowpanInterface getInterfaceNoCreate(android.net.lowpan.ILowpanInterface p0) { return null; }
    public android.net.lowpan.LowpanInterface getInterface(android.net.lowpan.ILowpanInterface p0) { return null; }
    public android.net.lowpan.LowpanInterface getInterface(java.lang.String p0) { return null; }
    public android.net.lowpan.LowpanInterface getInterface() { return null; }
    public java.lang.String[] getInterfaceList() { return null; }
    public void registerCallback(android.net.lowpan.LowpanManager.Callback p0, android.os.Handler p1) throws android.net.lowpan.LowpanException {}
    public void registerCallback(android.net.lowpan.LowpanManager.Callback p0) throws android.net.lowpan.LowpanException {}
    public void unregisterCallback(android.net.lowpan.LowpanManager.Callback p0) {}

    public static abstract class Callback {
        public Callback() {}
        public void onInterfaceAdded(android.net.lowpan.LowpanInterface p0) {}
        public void onInterfaceRemoved(android.net.lowpan.LowpanInterface p0) {}
    }
}
