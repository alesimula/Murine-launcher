package com.android.internal.util;

public class CallbackRegistry<C extends java.lang.Object, T extends java.lang.Object, A extends java.lang.Object> implements java.lang.Cloneable {
    public CallbackRegistry(com.android.internal.util.CallbackRegistry.NotifierCallback<C, T, A> p0) {}
    public synchronized void notifyCallbacks(T p0, int p1, A p2) {}
    public synchronized void add(C p0) {}
    public synchronized void remove(C p0) {}
    public synchronized java.util.ArrayList<C> copyListeners() { return null; }
    public synchronized boolean isEmpty() { return false; }
    public synchronized void clear() {}
    public synchronized com.android.internal.util.CallbackRegistry<C, T, A> clone() { return null; }

    public static abstract class NotifierCallback<C extends java.lang.Object, T extends java.lang.Object, A extends java.lang.Object> {
        public NotifierCallback() {}
        public abstract void onNotifyCallback(C p0, T p1, int p2, A p3);
    }
}
