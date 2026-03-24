package com.android.internal.util;

public class FunctionalUtils {
    private FunctionalUtils() {}
    public static <T extends java.lang.Object> java.util.function.Consumer<T> uncheckExceptions(com.android.internal.util.FunctionalUtils.ThrowingConsumer<T> p0) { return null; }
    public static <T extends java.lang.Object> java.util.function.Consumer<T> ignoreRemoteException(com.android.internal.util.FunctionalUtils.RemoteExceptionIgnoringConsumer<T> p0) { return null; }
    public static java.lang.Runnable handleExceptions(com.android.internal.util.FunctionalUtils.ThrowingRunnable p0, java.util.function.Consumer<java.lang.Throwable> p1) { return null; }

    @java.lang.FunctionalInterface
    public static interface ThrowingSupplier<T extends java.lang.Object> {
        public T getOrThrow() throws java.lang.Exception;
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingRunnable extends java.lang.Runnable {
        public void runOrThrow() throws java.lang.Exception;
        default public void run() {}
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingConsumer<T extends java.lang.Object> extends java.util.function.Consumer<T> {
        public void acceptOrThrow(T p0) throws java.lang.Exception;
        default public void accept(T p0) {}
    }

    @java.lang.FunctionalInterface
    public static interface RemoteExceptionIgnoringConsumer<T extends java.lang.Object> extends java.util.function.Consumer<T> {
        public void acceptOrThrow(T p0) throws android.os.RemoteException;
        default public void accept(T p0) {}
    }
}
