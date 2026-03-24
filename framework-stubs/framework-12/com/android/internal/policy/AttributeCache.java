package com.android.internal.policy;

public final class AttributeCache {
    private static final int CACHE_SIZE = 4;
    private static com.android.internal.policy.AttributeCache sInstance;
    private final android.content.Context mContext = null;
    private final android.util.LruCache<java.lang.String, com.android.internal.policy.AttributeCache.Package> mPackages = null;
    private final android.content.res.Configuration mConfiguration = null;
    public static void init(android.content.Context p0) {}
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
        private final android.util.SparseArray<android.util.ArrayMap<int[], com.android.internal.policy.AttributeCache.Entry>> mMap = null;
        public Package(android.content.Context p0) {}
    }
}
