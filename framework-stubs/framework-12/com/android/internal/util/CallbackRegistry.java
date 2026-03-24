package com.android.internal.util;

public class CallbackRegistry<C extends java.lang.Object, T extends java.lang.Object, A extends java.lang.Object> implements java.lang.Cloneable {
    private static final java.lang.String TAG = "CallbackRegistry";
    private java.util.List<C> mCallbacks;
    private long mFirst64Removed;
    private long[] mRemainderRemoved;
    private int mNotificationLevel;
    private final com.android.internal.util.CallbackRegistry.NotifierCallback<C, T, A> mNotifier = null;
    public CallbackRegistry(com.android.internal.util.CallbackRegistry.NotifierCallback<C, T, A> p0) {}
    public synchronized void notifyCallbacks(T p0, int p1, A p2) {}
    private void notifyFirst64Locked(T p0, int p1, A p2) {}
    private void notifyRecurseLocked(T p0, int p1, A p2) {}
    private void notifyRemainderLocked(T p0, int p1, A p2, int p3) {}
    private void notifyCallbacksLocked(T p0, int p1, A p2, int p3, int p4, long p5) {}
    public synchronized void add(C p0) {}
    private boolean isRemovedLocked(int p0) { return false; }
    private void removeRemovedCallbacks(int p0, long p1) {}
    public synchronized void remove(C p0) {}
    private void setRemovalBitLocked(int p0) {}
    public synchronized java.util.ArrayList<C> copyListeners() { return null; }
    public synchronized boolean isEmpty() { return false; }
    public synchronized void clear() {}
    public synchronized com.android.internal.util.CallbackRegistry<C, T, A> clone() { return null; }

    public static abstract class NotifierCallback<C extends java.lang.Object, T extends java.lang.Object, A extends java.lang.Object> {
        public NotifierCallback() {}
        public abstract void onNotifyCallback(C p0, T p1, int p2, A p3);
    }
}
