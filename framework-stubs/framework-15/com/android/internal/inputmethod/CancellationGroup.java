package com.android.internal.inputmethod;

public final class CancellationGroup {
    public CancellationGroup() {}
    boolean tryRegisterFutureOrCancelImmediately(java.util.concurrent.CompletableFuture<?> p0) { return false; }
    void unregisterFuture(java.util.concurrent.CompletableFuture<?> p0) {}
    public void cancelAll() {}
    public boolean isCanceled() { return false; }
}
