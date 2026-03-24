package com.android.internal.inputmethod;

public abstract class ImeTracing {
    static final java.lang.String TAG = "imeTracing";
    public static final java.lang.String PROTO_ARG = "--proto-com-android-imetracing";
    public static final int IME_TRACING_FROM_CLIENT = 0;
    public static final int IME_TRACING_FROM_IMS = 1;
    public static final int IME_TRACING_FROM_IMMS = 2;
    static boolean sEnabled;
    com.android.internal.view.IInputMethodManager mService;
    protected boolean mDumpInProgress;
    protected final java.lang.Object mDumpInProgressLock = null;
    ImeTracing() throws android.os.ServiceManager.ServiceNotFoundException {}
    public static com.android.internal.inputmethod.ImeTracing getInstance() { return null; }
    public void sendToService(byte[] p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
    public final void startImeTrace() {}
    public final void stopImeTrace() {}
    public abstract void addToBuffer(android.util.proto.ProtoOutputStream p0, int p1);
    public abstract void triggerClientDump(java.lang.String p0, android.view.inputmethod.InputMethodManager p1, byte[] p2);
    public abstract void triggerServiceDump(java.lang.String p0, com.android.internal.inputmethod.ImeTracing.ServiceDumper p1, byte[] p2);
    public abstract void triggerManagerServiceDump(java.lang.String p0);
    public void saveForBugreport(java.io.PrintWriter p0) {}
    public void setEnabled(boolean p0) {}
    public boolean isEnabled() { return false; }
    public boolean isAvailable() { return false; }
    public abstract void startTrace(java.io.PrintWriter p0);
    public abstract void stopTrace(java.io.PrintWriter p0);
    protected void logAndPrintln(java.io.PrintWriter p0, java.lang.String p1) {}

    @java.lang.FunctionalInterface
    public static interface ServiceDumper {
        public void dumpToProto(android.util.proto.ProtoOutputStream p0, byte[] p1);
    }
}
