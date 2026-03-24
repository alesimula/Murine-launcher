package com.android.internal.os;

public final class BinderCallHeavyHitterWatcher {
    private static final java.lang.String TAG = "BinderCallHeavyHitterWatcher";
    private boolean mEnabled;
    private com.android.internal.os.BinderCallHeavyHitterWatcher.BinderCallHeavyHitterListener mListener;
    private com.android.internal.util.HeavyHitterSketch<java.lang.Integer> mHeavyHitterSketch;
    private final android.util.SparseArray<com.android.internal.os.BinderCallHeavyHitterWatcher.HeavyHitterContainer> mHeavyHitterCandiates = null;
    private final java.util.ArrayList<java.lang.Integer> mCachedCandidateList = null;
    private final java.util.ArrayList<java.lang.Float> mCachedCandidateFrequencies = null;
    private android.util.ArraySet<java.lang.Integer> mCachedCandidateSet;
    private com.android.internal.os.BinderCallHeavyHitterWatcher.HeavyHitterContainer[] mCachedCandidateContainers;
    private int mCachedCandidateContainersIndex;
    private int mInputSize;
    private int mTotalInputSize;
    private int mCurrentInputSize;
    private float mThreshold;
    private long mBatchStartTimeStamp;
    private final java.lang.Object mLock = null;
    private static final float EPSILON = 9.999999747378752e-06f;
    private static final java.lang.Object sLock = null;
    private static com.android.internal.os.BinderCallHeavyHitterWatcher sInstance;
    public BinderCallHeavyHitterWatcher() {}
    public static com.android.internal.os.BinderCallHeavyHitterWatcher getInstance() { return null; }
    public void setConfig(boolean p0, int p1, float p2, com.android.internal.os.BinderCallHeavyHitterWatcher.BinderCallHeavyHitterListener p3) {}
    private void resetInternalLocked(com.android.internal.os.BinderCallHeavyHitterWatcher.BinderCallHeavyHitterListener p0, com.android.internal.util.HeavyHitterSketch<java.lang.Integer> p1, int p2, int p3, float p4, int p5) {}
    private void initCachedCandidateContainersLocked(int p0) {}
    private com.android.internal.os.BinderCallHeavyHitterWatcher.HeavyHitterContainer acquireHeavyHitterContainerLocked() { return null; }
    private void releaseHeavyHitterContainerLocked(com.android.internal.os.BinderCallHeavyHitterWatcher.HeavyHitterContainer p0) {}
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
