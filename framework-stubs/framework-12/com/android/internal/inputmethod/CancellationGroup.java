package com.android.internal.inputmethod;

public final class CancellationGroup {
    private final java.lang.Object mLock = null;
    private java.util.ArrayList<java.util.concurrent.CountDownLatch> mLatchList;
    private boolean mCanceled;
    public CancellationGroup() {}
    boolean registerLatch(java.util.concurrent.CountDownLatch p0) { return false; }
    void unregisterLatch(java.util.concurrent.CountDownLatch p0) {}
    public void cancelAll() {}
    public boolean isCanceled() { return false; }
}
