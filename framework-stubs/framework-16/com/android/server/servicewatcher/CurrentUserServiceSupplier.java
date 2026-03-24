package com.android.server.servicewatcher;

public final class CurrentUserServiceSupplier extends android.content.BroadcastReceiver implements com.android.server.servicewatcher.ServiceWatcher.ServiceSupplier<com.android.server.servicewatcher.CurrentUserServiceSupplier.BoundServiceInfo> {
    public static com.android.server.servicewatcher.CurrentUserServiceSupplier createFromConfig(android.content.Context p0, java.lang.String p1, int p2, int p3) { return null; }
    public static com.android.server.servicewatcher.CurrentUserServiceSupplier create(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return null; }
    public static com.android.server.servicewatcher.CurrentUserServiceSupplier createUnsafeForTestsOnly(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return null; }
    public boolean hasMatchingService() { return false; }
    public void register(com.android.server.servicewatcher.ServiceWatcher.ServiceChangedListener p0) {}
    public void unregister() {}
    public com.android.server.servicewatcher.CurrentUserServiceSupplier.BoundServiceInfo getServiceInfo() { return null; }
    public void alertUnstableService(java.lang.String p0) {}
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}

    public static class BoundServiceInfo extends com.android.server.servicewatcher.ServiceWatcher.BoundServiceInfo {
        protected BoundServiceInfo(java.lang.String p0, android.content.pm.ResolveInfo p1) { super((java.lang.String)null, (android.content.pm.ResolveInfo)null); }
        protected BoundServiceInfo(java.lang.String p0, int p1, android.content.ComponentName p2, int p3, android.os.Bundle p4) { super((java.lang.String)null, (android.content.pm.ResolveInfo)null); }
        public int getVersion() { return 0; }
        @android.annotation.Nullable
        public android.os.Bundle getMetadata() { return null; }
        public java.lang.String toString() { return null; }
    }
}
