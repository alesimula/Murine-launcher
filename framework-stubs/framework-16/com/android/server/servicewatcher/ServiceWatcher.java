package com.android.server.servicewatcher;

public interface ServiceWatcher {
    public static <TBoundServiceInfo extends com.android.server.servicewatcher.ServiceWatcher.BoundServiceInfo> com.android.server.servicewatcher.ServiceWatcher create(android.content.Context p0, java.lang.String p1, com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<TBoundServiceInfo> p2, com.android.server.servicewatcher.ServiceWatcher.ServiceListener<? super TBoundServiceInfo> p3) { return null; }
    public static <TBoundServiceInfo extends com.android.server.servicewatcher.ServiceWatcher.BoundServiceInfo> com.android.server.servicewatcher.ServiceWatcher create(android.content.Context p0, java.lang.String p1, boolean p2, com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<TBoundServiceInfo> p3, com.android.server.servicewatcher.ServiceWatcher.ServiceListener<? super TBoundServiceInfo> p4) { return null; }
    public static <TBoundServiceInfo extends com.android.server.servicewatcher.ServiceWatcher.BoundServiceInfo> com.android.server.servicewatcher.ServiceWatcher create(android.content.Context p0, android.os.Handler p1, java.lang.String p2, com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<TBoundServiceInfo> p3, com.android.server.servicewatcher.ServiceWatcher.ServiceListener<? super TBoundServiceInfo> p4) { return null; }
    public static <TBoundServiceInfo extends com.android.server.servicewatcher.ServiceWatcher.BoundServiceInfo> com.android.server.servicewatcher.ServiceWatcher create(android.content.Context p0, android.os.Handler p1, java.lang.String p2, boolean p3, com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<TBoundServiceInfo> p4, com.android.server.servicewatcher.ServiceWatcher.ServiceListener<? super TBoundServiceInfo> p5) { return null; }
    public boolean checkServiceResolves();
    public void register();
    public void unregister();
    public void runOnBinder(com.android.server.servicewatcher.ServiceWatcher.BinderOperation p0);
    public void dump(java.io.PrintWriter p0);

    public static interface BinderOperation {
        public void run(android.os.IBinder p0) throws android.os.RemoteException;
        default public void onError(java.lang.Throwable p0) {}
    }

    public static class BoundServiceInfo {
        @android.annotation.Nullable
        protected final java.lang.String mAction = null;
        protected final int mUid = 0;
        protected final android.content.ComponentName mComponentName = null;
        protected BoundServiceInfo(java.lang.String p0, android.content.pm.ResolveInfo p1) {}
        protected BoundServiceInfo(java.lang.String p0, int p1, android.content.ComponentName p2) {}
        protected BoundServiceInfo(java.lang.String p0, int p1, android.content.ComponentName p2, int p3) {}
        @android.annotation.Nullable
        public java.lang.String getAction() { return null; }
        public android.content.ComponentName getComponentName() { return null; }
        public int getUserId() { return 0; }
        public int getFlags() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static interface ServiceChangedListener {
        public void onServiceChanged();
    }

    public static interface ServiceListener<TBoundServiceInfo extends com.android.server.servicewatcher.ServiceWatcher.BoundServiceInfo> {
        public void onBind(android.os.IBinder p0, TBoundServiceInfo p1) throws android.os.RemoteException;
        public void onUnbind();
    }

    public static interface ServiceSupplier<TBoundServiceInfo extends com.android.server.servicewatcher.ServiceWatcher.BoundServiceInfo> {
        public boolean hasMatchingService();
        public void register(com.android.server.servicewatcher.ServiceWatcher.ServiceChangedListener p0);
        public void unregister();
        @android.annotation.Nullable
        public TBoundServiceInfo getServiceInfo();
        public void alertUnstableService(java.lang.String p0);
    }
}
