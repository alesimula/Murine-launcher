package com.android.internal.util.function.pooled;

public interface PooledFunction<A extends java.lang.Object, R extends java.lang.Object> extends com.android.internal.util.function.pooled.PooledLambda, java.util.function.Function<A, R> {
    public com.android.internal.util.function.pooled.PooledConsumer<A> asConsumer();
    public com.android.internal.util.function.pooled.PooledFunction<A, R> recycleOnUse();
}
