package com.android.internal.telephony.util;

public final class WorkerThread extends android.os.HandlerThread {
    WorkerThread() { super((java.lang.String)null); }
    protected void onLooperPrepared() {}
    @android.annotation.NonNull
    public static android.os.HandlerThread get() { return null; }
    @android.annotation.NonNull
    public static android.os.Handler getHandler() { return null; }
    @android.annotation.NonNull
    public static java.util.concurrent.Executor getExecutor() { return null; }
    public static void reset() {}
}
