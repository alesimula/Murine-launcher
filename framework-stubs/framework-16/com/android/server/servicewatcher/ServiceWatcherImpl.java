package com.android.server.servicewatcher;

class ServiceWatcherImpl<TBoundServiceInfo extends com.android.server.servicewatcher.ServiceWatcher.BoundServiceInfo> implements com.android.server.servicewatcher.ServiceWatcher, com.android.server.servicewatcher.ServiceWatcher.ServiceChangedListener {
    static final java.lang.String TAG = "ServiceWatcher";
    static final boolean D = Boolean.valueOf(false);
    static final long RETRY_DELAY_MS = 15000L;
    final android.content.Context mContext = null;
    final android.os.Handler mHandler = null;
    final java.lang.String mTag = null;
    final com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<TBoundServiceInfo> mServiceSupplier = null;
    @android.annotation.Nullable
    final com.android.server.servicewatcher.ServiceWatcher.ServiceListener<? super TBoundServiceInfo> mServiceListener = null;
    ServiceWatcherImpl(android.content.Context p0, android.os.Handler p1, java.lang.String p2, com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<TBoundServiceInfo> p3, com.android.server.servicewatcher.ServiceWatcher.ServiceListener<? super TBoundServiceInfo> p4) {}
    ServiceWatcherImpl(android.content.Context p0, android.os.Handler p1, java.lang.String p2, boolean p3, com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<TBoundServiceInfo> p4, com.android.server.servicewatcher.ServiceWatcher.ServiceListener<? super TBoundServiceInfo> p5) {}
    public boolean checkServiceResolves() { return false; }
    public synchronized void register() {}
    public synchronized void unregister() {}
    public synchronized void onServiceChanged() {}
    public synchronized void runOnBinder(com.android.server.servicewatcher.ServiceWatcher.BinderOperation p0) {}
    synchronized void onServiceChanged(boolean p0) {}
    public java.lang.String toString() { return null; }
    public void dump(java.io.PrintWriter p0) {}

    private class MyServiceConnection implements android.content.ServiceConnection {
        MyServiceConnection(TBoundServiceInfo p0) {}
        @android.annotation.Nullable
        TBoundServiceInfo getBoundServiceInfo() { return null; }
        boolean isConnected() { return false; }
        void bind() {}
        void unbind() {}
        void runOnBinder(com.android.server.servicewatcher.ServiceWatcher.BinderOperation p0) {}
        public final void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public final void onServiceDisconnected(android.content.ComponentName p0) {}
        public final void onBindingDied(android.content.ComponentName p0) {}
        public final void onNullBinding(android.content.ComponentName p0) {}
    }
}
