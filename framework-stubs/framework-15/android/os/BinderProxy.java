package android.os;

public final class BinderProxy implements android.os.IBinder {
    volatile boolean mWarnOnBlocking;
    public static void setTransactListener(android.os.Binder.ProxyTransactListener p0) {}
    public static android.os.BinderProxy.InterfaceCount[] getSortedInterfaceCounts(int p0) { return null; }
    public static int getProxyCount() { return 0; }
    public static void dumpProxyDebugInfo() {}
    public native boolean pingBinder();
    public native boolean isBinderAlive();
    public android.os.IInterface queryLocalInterface(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public native android.os.IBinder getExtension() throws android.os.RemoteException;
    public boolean transact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
    public native java.lang.String getInterfaceDescriptor() throws android.os.RemoteException;
    public native boolean transactNative(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException;
    public void linkToDeath(android.os.IBinder.DeathRecipient p0, int p1) throws android.os.RemoteException {}
    public boolean unlinkToDeath(android.os.IBinder.DeathRecipient p0, int p1) { return false; }
    public void dump(java.io.FileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
    public void dumpAsync(java.io.FileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException {}
    public void shellCommand(java.io.FileDescriptor p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.lang.String[] p3, android.os.ShellCallback p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}

    private static class BinderProxyMapSizeException extends java.lang.AssertionError {
        BinderProxyMapSizeException(java.lang.String p0) { super(); }
    }

    public static final class InterfaceCount {
        InterfaceCount(java.lang.String p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    private static class NoImagePreloadHolder {
        public static final long sNativeFinalizer = Long.valueOf(0L);
    }

    private static final class ProxyMap {
        static final int MAX_NUM_INTERFACES_TO_DUMP = 10;
        android.os.BinderProxy get(long p0) { return null; }
        void set(long p0, android.os.BinderProxy p1) {}
    }
}
