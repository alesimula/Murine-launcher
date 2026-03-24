package com.android.server;

abstract class ResettableTimeout {
    @android.annotation.UnsupportedAppUsage
    private android.os.ConditionVariable mLock;
    @android.annotation.UnsupportedAppUsage
    private volatile long mOffAt;
    private volatile boolean mOffCalled;
    private java.lang.Thread mThread;
    ResettableTimeout() {}
    public abstract void on(boolean p0);
    public abstract void off();
    public void go(long p0) {}
    public void cancel() {}

    private class T extends java.lang.Thread {
        private T(com.android.server.ResettableTimeout p0) { super(); }
        public void run() {}
    }
}
