package android.os;

@android.annotation.SystemApi
public abstract class HwBinder implements android.os.IHwBinder {
    public HwBinder() {}
    public final native void transact(int p0, android.os.HwParcel p1, android.os.HwParcel p2, int p3) throws android.os.RemoteException;
    public abstract void onTransact(int p0, android.os.HwParcel p1, android.os.HwParcel p2, int p3) throws android.os.RemoteException;
    public final native void registerService(java.lang.String p0) throws android.os.RemoteException;
    public static final android.os.IHwBinder getService(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException, java.util.NoSuchElementException { return null; }
    public static final native android.os.IHwBinder getService(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException, java.util.NoSuchElementException;
    public static final native void setTrebleTestingOverride(boolean p0);
    public static final native void configureRpcThreadpool(long p0, boolean p1);
    public static final native void joinRpcThreadpool();
    public static void enableInstrumentation() {}
    public static void reportSyspropChanged() {}
}
