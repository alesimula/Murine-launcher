package android.os;

public class HwRemoteBinder implements android.os.IHwBinder {
    public HwRemoteBinder() {}
    public android.os.IHwInterface queryLocalInterface(java.lang.String p0) { return null; }
    public final native void transact(int p0, android.os.HwParcel p1, android.os.HwParcel p2, int p3) throws android.os.RemoteException;
    public native boolean linkToDeath(android.os.IHwBinder.DeathRecipient p0, long p1);
    public native boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient p0);
    public final native boolean equals(java.lang.Object p0);
    public final native int hashCode();
}
