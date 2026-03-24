package com.android.internal.util.function.pooled;

public interface PooledConsumer<T extends java.lang.Object> extends com.android.internal.util.function.pooled.PooledLambda, java.util.function.Consumer<T> {
    public com.android.internal.util.function.pooled.PooledConsumer<T> recycleOnUse();
}
