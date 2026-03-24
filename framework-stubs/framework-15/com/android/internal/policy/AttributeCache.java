package com.android.internal.policy;

public final class AttributeCache {
    public static void init(android.content.Context p0) {}
    void monitorPackageRemove(android.os.Handler p0) {}
    public static com.android.internal.policy.AttributeCache instance() { return null; }
    public AttributeCache(android.content.Context p0) {}
    public void removePackage(java.lang.String p0) {}
    public void updateConfiguration(android.content.res.Configuration p0) {}
    public com.android.internal.policy.AttributeCache.Entry get(java.lang.String p0, int p1, int[] p2) { return null; }
    public com.android.internal.policy.AttributeCache.Entry get(java.lang.String p0, int p1, int[] p2, int p3) { return null; }

    public static final class Entry {
        public final android.content.Context context = null;
        public final android.content.res.TypedArray array = null;
        public Entry(android.content.Context p0, android.content.res.TypedArray p1) {}
        void recycle() {}
    }

    public static final class Package {
        public final android.content.Context context = null;
        public Package(android.content.Context p0) {}
    }

    static class PackageMonitor extends android.content.BroadcastReceiver {
        @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
        PackageMonitor(android.content.Context p0, android.os.Handler p1) { super(); }
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }
}
