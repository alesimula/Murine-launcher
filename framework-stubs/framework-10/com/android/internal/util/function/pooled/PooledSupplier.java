package com.android.internal.util.function.pooled;

public interface PooledSupplier<T extends java.lang.Object> extends com.android.internal.util.function.pooled.PooledLambda, java.util.function.Supplier<T>, com.android.internal.util.FunctionalUtils.ThrowingSupplier<T> {
    public com.android.internal.util.function.pooled.PooledRunnable asRunnable();
    public com.android.internal.util.function.pooled.PooledSupplier<T> recycleOnUse();

    public static interface OfLong extends java.util.function.LongSupplier, com.android.internal.util.function.pooled.PooledLambda {
        public com.android.internal.util.function.pooled.PooledSupplier.OfLong recycleOnUse();
    }

    public static interface OfInt extends java.util.function.IntSupplier, com.android.internal.util.function.pooled.PooledLambda {
        public com.android.internal.util.function.pooled.PooledSupplier.OfInt recycleOnUse();
    }

    public static interface OfDouble extends java.util.function.DoubleSupplier, com.android.internal.util.function.pooled.PooledLambda {
        public com.android.internal.util.function.pooled.PooledSupplier.OfDouble recycleOnUse();
    }
}
