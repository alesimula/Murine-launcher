package android.os;

public final class BinderProxy implements android.os.IBinder {
    volatile boolean mWarnOnBlocking;
    private static volatile android.os.Binder.ProxyTransactListener sTransactListener;
    private static final android.os.BinderProxy.ProxyMap sProxyMap = null;
    private static final int NATIVE_ALLOCATION_SIZE = 1000;
    private final long mNativeData = 0L;
    public static void setTransactListener(android.os.Binder.ProxyTransactListener p0) {}
    public static android.os.BinderProxy.InterfaceCount[] getSortedInterfaceCounts(int p0) { return null; }
    public static int getProxyCount() { return 0; }
    public static void dumpProxyDebugInfo() {}
    private static android.os.BinderProxy getInstance(long p0, long p1) { return null; }
    private BinderProxy(long p0) {}
    public native boolean pingBinder();
    public native boolean isBinderAlive();
    public android.os.IInterface queryLocalInterface(java.lang.String p0) { return null; }
    public boolean transact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
    private static native long getNativeFinalizer();
    public native java.lang.String getInterfaceDescriptor() throws android.os.RemoteException;
    public native boolean transactNative(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException;
    public native void linkToDeath(android.os.IBinder.DeathRecipient p0, int p1) throws android.os.RemoteException;
    public native boolean unlinkToDeath(android.os.IBinder.DeathRecipient p0, int p1);
    public void dump(java.io.FileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
    public void dumpAsync(java.io.FileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
    public void shellCommand(java.io.FileDescriptor p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.lang.String[] p3, android.os.ShellCallback p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
    private static void sendDeathNotice(android.os.IBinder.DeathRecipient p0) {}

    private static final class ProxyMap {
        private static final int LOG_MAIN_INDEX_SIZE = 8;
        private static final int MAIN_INDEX_SIZE = 256;
        private static final int MAIN_INDEX_MASK = 255;
        private static final int CRASH_AT_SIZE = 20000;
        private int mWarnBucketSize;
        private static final int WARN_INCREMENT = 10;
        private int mRandom;
        static final int MAX_NUM_INTERFACES_TO_DUMP = 10;
        private final java.lang.Long[][] mMainIndexKeys = null;
        private final java.util.ArrayList<java.lang.ref.WeakReference<android.os.BinderProxy>>[] mMainIndexValues = null;
        private ProxyMap() {}
        private static int hash(long p0) { return 0; }
        private int size() { return 0; }
        private int unclearedSize() { return 0; }
        private void remove(int p0, int p1) {}
        android.os.BinderProxy get(long p0) { return null; }
        void set(long p0, android.os.BinderProxy p1) {}
        private android.os.BinderProxy.InterfaceCount[] getSortedInterfaceCounts(int p0) { return null; }
        private void dumpProxyInterfaceCounts() {}
        private void dumpPerUidProxyCounts() {}
    }

    private static class NoImagePreloadHolder {
        public static final long sNativeFinalizer = Long.valueOf(0L);
        private NoImagePreloadHolder() {}
    }

    public static final class InterfaceCount {
        private final java.lang.String mInterfaceName = null;
        private final int mCount = 0;
        InterfaceCount(java.lang.String p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
