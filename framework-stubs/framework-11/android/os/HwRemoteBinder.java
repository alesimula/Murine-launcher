package android.os;

public class HwRemoteBinder implements android.os.IHwBinder {
    private static final java.lang.String TAG = "HwRemoteBinder";
    private long mNativeContext;
    public HwRemoteBinder() {}
    public android.os.IHwInterface queryLocalInterface(java.lang.String p0) { return null; }
    public final native void transact(int p0, android.os.HwParcel p1, android.os.HwParcel p2, int p3) throws android.os.RemoteException;
    public native boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1);
    public native boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0);
    private static final native long native_init();
    private final native void native_setup_empty();
    private static final void sendDeathNotice(android.os.IHwBinder.DeathRecipient p0, long p1) {}
    public final native boolean equals(java.lang.Object p0);
    public final native int hashCode();
}
