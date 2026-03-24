package com.android.internal.inputmethod;

public final class CompletableFutureUtil {
    @android.annotation.Nullable
    public static <T extends java.lang.Object> T getResult(java.util.concurrent.CompletableFuture<T> p0) { return null; }
    public static boolean getBooleanResult(java.util.concurrent.CompletableFuture<java.lang.Boolean> p0) { return false; }
    public static int getIntegerResult(java.util.concurrent.CompletableFuture<java.lang.Integer> p0) { return 0; }
    public static boolean getResultOrFalse(java.util.concurrent.CompletableFuture<java.lang.Boolean> p0, java.lang.String p1, java.lang.String p2, com.android.internal.inputmethod.CancellationGroup p3, long p4) { return false; }
    public static int getResultOrZero(java.util.concurrent.CompletableFuture<java.lang.Integer> p0, java.lang.String p1, java.lang.String p2, com.android.internal.inputmethod.CancellationGroup p3, long p4) { return 0; }
    @android.annotation.Nullable
    public static <T extends java.lang.Object> T getResultOrNull(java.util.concurrent.CompletableFuture<T> p0, java.lang.String p1, java.lang.String p2, com.android.internal.inputmethod.CancellationGroup p3, long p4) { return null; }
}
