package com.android.internal.util.function.pooled;

public interface PooledPredicate<T extends java.lang.Object> extends com.android.internal.util.function.pooled.PooledLambda, java.util.function.Predicate<T> {
    public com.android.internal.util.function.pooled.PooledPredicate<T> recycleOnUse();
}
