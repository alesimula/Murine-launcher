package com.android.internal.util;

public class PersistentServiceConnection<T extends java.lang.Object> extends com.android.internal.util.ObservableServiceConnection<T> {
    public PersistentServiceConnection(android.content.Context p0, java.util.concurrent.Executor p1, android.os.Handler p2, com.android.internal.util.ObservableServiceConnection.ServiceTransformer<T> p3, android.content.Intent p4, int p5, int p6, int p7, int p8) { super(null, null, null, null, 0); }
    public PersistentServiceConnection(android.content.Context p0, java.util.concurrent.Executor p1, android.os.Handler p2, com.android.internal.util.ObservableServiceConnection.ServiceTransformer<T> p3, android.content.Intent p4, int p5, int p6, int p7, int p8, com.android.internal.util.PersistentServiceConnection.Injector p9) { super(null, null, null, null, 0); }
    public boolean bind() { return false; }
    public void unbind() {}

    public static class Injector {
        public Injector() {}
        public long uptimeMillis() { return 0L; }
    }
}
