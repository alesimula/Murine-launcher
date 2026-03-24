package com.android.internal.util.function.pooled;

public interface PooledRunnable extends com.android.internal.util.function.pooled.PooledLambda, java.lang.Runnable, com.android.internal.util.FunctionalUtils.ThrowingRunnable, android.os.TraceNameSupplier {
    public com.android.internal.util.function.pooled.PooledRunnable recycleOnUse();
}
