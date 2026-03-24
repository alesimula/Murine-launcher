package com.android.internal.util;

public class ConcurrentUtils {
    public static final java.util.concurrent.Executor DIRECT_EXECUTOR = null;
    private ConcurrentUtils() {}
    public static java.util.concurrent.ExecutorService newFixedThreadPool(int p0, java.lang.String p1, int p2) { return null; }
    public static <T extends java.lang.Object> T waitForFutureNoInterrupt(java.util.concurrent.Future<T> p0, java.lang.String p1) { return null; }
    public static void waitForCountDownNoInterrupt(java.util.concurrent.CountDownLatch p0, long p1, java.lang.String p2) {}
    public static void wtfIfLockHeld(java.lang.String p0, java.lang.Object p1) {}
    public static void wtfIfLockNotHeld(java.lang.String p0, java.lang.Object p1) {}

    private static class DirectExecutor implements java.util.concurrent.Executor {
        private DirectExecutor() {}
        public void execute(java.lang.Runnable p0) {}
        public java.lang.String toString() { return null; }
    }
}
