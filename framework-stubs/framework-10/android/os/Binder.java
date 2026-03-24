package android.os;

public class Binder implements android.os.IBinder {
    private static final boolean FIND_POTENTIAL_LEAKS = false;
    public static final boolean CHECK_PARCEL_SIZE = false;
    static final java.lang.String TAG = "Binder";
    public static boolean LOG_RUNTIME_EXCEPTION;
    public static final int UNSET_WORKSOURCE = -1;
    private static volatile java.lang.String sDumpDisabled;
    private static volatile android.os.TransactionTracker sTransactionTracker;
    private static com.android.internal.os.BinderInternal.Observer sObserver;
    private static final int NATIVE_ALLOCATION_SIZE = 500;
    private static volatile boolean sTracingEnabled;
    static volatile boolean sWarnOnBlocking;
    @android.annotation.UnsupportedAppUsage
    private final long mObject = 0L;
    private android.os.IInterface mOwner;
    private java.lang.String mDescriptor;
    private static volatile com.android.internal.os.BinderInternal.WorkSourceProvider sWorkSourceProvider;
    private static native long getNativeFinalizer();
    public static void enableTracing() {}
    public static void disableTracing() {}
    public static boolean isTracingEnabled() { return false; }
    public static synchronized android.os.TransactionTracker getTransactionTracker() { return null; }
    public static void setObserver(com.android.internal.os.BinderInternal.Observer p0) {}
    public static void setWarnOnBlocking(boolean p0) {}
    public static android.os.IBinder allowBlocking(android.os.IBinder p0) { return null; }
    public static android.os.IBinder defaultBlocking(android.os.IBinder p0) { return null; }
    public static void copyAllowBlocking(android.os.IBinder p0, android.os.IBinder p1) {}
    public static final native int getCallingPid();
    public static final native int getCallingUid();
    public static final native boolean isHandlingTransaction();
    public static final int getCallingUidOrThrow() { return 0; }
    public static final android.os.UserHandle getCallingUserHandle() { return null; }
    public static final native long clearCallingIdentity();
    public static final native void restoreCallingIdentity(long p0);
    public static final void withCleanCallingIdentity(com.android.internal.util.FunctionalUtils.ThrowingRunnable p0) {}
    public static final <T extends java.lang.Object> T withCleanCallingIdentity(com.android.internal.util.FunctionalUtils.ThrowingSupplier<T> p0) { return null; }
    public static final native void setThreadStrictModePolicy(int p0);
    public static final native int getThreadStrictModePolicy();
    public static final native long setCallingWorkSourceUid(int p0);
    public static final native int getCallingWorkSourceUid();
    public static final native long clearCallingWorkSource();
    public static final native void restoreCallingWorkSource(long p0);
    public static final native void flushPendingCommands();
    public static final void joinThreadPool() {}
    public static final boolean isProxy(android.os.IInterface p0) { return false; }
    public static final native void blockUntilThreadAvailable();
    public Binder() {}
    public Binder(java.lang.String p0) {}
    public void attachInterface(android.os.IInterface p0, java.lang.String p1) {}
    public java.lang.String getInterfaceDescriptor() { return null; }
    public boolean pingBinder() { return false; }
    public boolean isBinderAlive() { return false; }
    public android.os.IInterface queryLocalInterface(java.lang.String p0) { return null; }
    public static void setDumpDisabled(java.lang.String p0) {}
    @android.annotation.SystemApi
    public static void setProxyTransactListener(android.os.Binder.ProxyTransactListener p0) {}
    protected boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
    public java.lang.String getTransactionName(int p0) { return null; }
    public void dump(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    void doDump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void dumpAsync(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void shellCommand(java.io.FileDescriptor p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.lang.String[] p3, android.os.ShellCallback p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
    public void onShellCommand(java.io.FileDescriptor p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.lang.String[] p3, android.os.ShellCallback p4, android.os.ResultReceiver p5) throws android.os.RemoteException {}
    public final boolean transact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
    public void linkToDeath(android.os.IBinder.DeathRecipient p0, int p1) {}
    public boolean unlinkToDeath(android.os.IBinder.DeathRecipient p0, int p1) { return false; }
    static void checkParcel(android.os.IBinder p0, int p1, android.os.Parcel p2, java.lang.String p3) {}
    private static native long getNativeBBinderHolder();
    private static native long getFinalizer();
    public static void setWorkSourceProvider(com.android.internal.os.BinderInternal.WorkSourceProvider p0) {}
    @android.annotation.UnsupportedAppUsage
    private boolean execTransact(int p0, long p1, long p2, int p3) { return false; }
    private boolean execTransactInternal(int p0, long p1, long p2, int p3, int p4) { return false; }

    @android.annotation.SystemApi
    public static interface ProxyTransactListener {
        public java.lang.Object onTransactStarted(android.os.IBinder p0, int p1);
        public void onTransactEnded(java.lang.Object p0);
    }

    public static class PropagateWorkSourceTransactListener implements android.os.Binder.ProxyTransactListener {
        public PropagateWorkSourceTransactListener() {}
        public java.lang.Object onTransactStarted(android.os.IBinder p0, int p1) { return null; }
        public void onTransactEnded(java.lang.Object p0) {}
    }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }
}
