package com.android.internal.os;

public final class BackgroundThread extends android.os.HandlerThread {
    private static final long SLOW_DISPATCH_THRESHOLD_MS = 10000L;
    private static final long SLOW_DELIVERY_THRESHOLD_MS = 30000L;
    private static com.android.internal.os.BackgroundThread sInstance;
    private static android.os.Handler sHandler;
    private static android.os.HandlerExecutor sHandlerExecutor;
    private BackgroundThread() { super((java.lang.String)null); }
    private static void ensureThreadLocked() {}
    public static com.android.internal.os.BackgroundThread get() { return null; }
    public static android.os.Handler getHandler() { return null; }
    public static java.util.concurrent.Executor getExecutor() { return null; }
}
