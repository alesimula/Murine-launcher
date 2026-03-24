package com.android.server;

public final class FgThread extends com.android.server.ServiceThread {
    FgThread() { super(null, 0, false); }
    public static com.android.server.FgThread get() { return null; }
    public static android.os.Handler getHandler() { return null; }
    public static java.util.concurrent.Executor getExecutor() { return null; }

    private static final class NoPreloadHolder {
    }
}
