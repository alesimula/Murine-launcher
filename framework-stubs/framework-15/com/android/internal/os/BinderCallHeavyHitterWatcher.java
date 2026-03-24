package com.android.internal.os;

public final class BinderCallHeavyHitterWatcher {
    public BinderCallHeavyHitterWatcher() {}
    public static com.android.internal.os.BinderCallHeavyHitterWatcher getInstance() { return null; }
    public void setConfig(boolean p0, int p1, float p2, com.android.internal.os.BinderCallHeavyHitterWatcher.BinderCallHeavyHitterListener p3) {}
    public void onTransaction(int p0, java.lang.Class p1, int p2) {}

    public static interface BinderCallHeavyHitterListener {
        public void onHeavyHit(java.util.List<com.android.internal.os.BinderCallHeavyHitterWatcher.HeavyHitterContainer> p0, int p1, float p2, long p3);
    }

    public static final class HeavyHitterContainer {
        public int mUid;
        public java.lang.Class mClass;
        public int mCode;
        public float mFrequency;
        public HeavyHitterContainer() {}
        public HeavyHitterContainer(com.android.internal.os.BinderCallHeavyHitterWatcher.HeavyHitterContainer p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        static int hashCode(int p0, java.lang.Class p1, int p2) { return 0; }
    }
}
