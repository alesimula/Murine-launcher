package com.android.internal.util.function.pooled;

abstract class OmniFunction<A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object, F extends java.lang.Object, G extends java.lang.Object, H extends java.lang.Object, I extends java.lang.Object, J extends java.lang.Object, K extends java.lang.Object, R extends java.lang.Object> implements com.android.internal.util.function.pooled.PooledFunction<A, R>, java.util.function.BiFunction<A, B, R>, com.android.internal.util.function.TriFunction<A, B, C, R>, com.android.internal.util.function.QuadFunction<A, B, C, D, R>, com.android.internal.util.function.QuintFunction<A, B, C, D, E, R>, com.android.internal.util.function.HexFunction<A, B, C, D, E, F, R>, com.android.internal.util.function.HeptFunction<A, B, C, D, E, F, G, R>, com.android.internal.util.function.OctFunction<A, B, C, D, E, F, G, H, R>, com.android.internal.util.function.NonaFunction<A, B, C, D, E, F, G, H, I, R>, com.android.internal.util.function.DecFunction<A, B, C, D, E, F, G, H, I, J, R>, com.android.internal.util.function.UndecFunction<A, B, C, D, E, F, G, H, I, J, K, R>, com.android.internal.util.function.pooled.PooledConsumer<A>, java.util.function.BiConsumer<A, B>, com.android.internal.util.function.TriConsumer<A, B, C>, com.android.internal.util.function.QuadConsumer<A, B, C, D>, com.android.internal.util.function.QuintConsumer<A, B, C, D, E>, com.android.internal.util.function.HexConsumer<A, B, C, D, E, F>, com.android.internal.util.function.HeptConsumer<A, B, C, D, E, F, G>, com.android.internal.util.function.OctConsumer<A, B, C, D, E, F, G, H>, com.android.internal.util.function.NonaConsumer<A, B, C, D, E, F, G, H, I>, com.android.internal.util.function.DecConsumer<A, B, C, D, E, F, G, H, I, J>, com.android.internal.util.function.UndecConsumer<A, B, C, D, E, F, G, H, I, J, K>, com.android.internal.util.function.pooled.PooledPredicate<A>, java.util.function.BiPredicate<A, B>, com.android.internal.util.function.TriPredicate<A, B, C>, com.android.internal.util.function.QuadPredicate<A, B, C, D>, com.android.internal.util.function.QuintPredicate<A, B, C, D, E>, com.android.internal.util.function.pooled.PooledSupplier<R>, com.android.internal.util.function.pooled.PooledRunnable, com.android.internal.util.FunctionalUtils.ThrowingRunnable, com.android.internal.util.FunctionalUtils.ThrowingSupplier<R>, com.android.internal.util.function.pooled.PooledSupplier.OfInt, com.android.internal.util.function.pooled.PooledSupplier.OfLong, com.android.internal.util.function.pooled.PooledSupplier.OfDouble {
    OmniFunction() {}
    abstract R invoke(A p0, B p1, C p2, D p3, E p4, F p5, G p6, H p7, I p8, J p9, K p10);
    public R apply(A p0, B p1) { return null; }
    public R apply(A p0) { return null; }
    public abstract <V extends java.lang.Object> com.android.internal.util.function.pooled.OmniFunction<A, B, C, D, E, F, G, H, I, J, K, V> andThen(java.util.function.Function<? super R, ? extends V> p0);
    public abstract com.android.internal.util.function.pooled.OmniFunction<A, B, C, D, E, F, G, H, I, J, K, R> negate();
    public void accept(A p0, B p1) {}
    public void accept(A p0) {}
    public void run() {}
    public R get() { return null; }
    public boolean test(A p0, B p1, C p2, D p3, E p4) { return false; }
    public boolean test(A p0, B p1, C p2, D p3) { return false; }
    public boolean test(A p0, B p1, C p2) { return false; }
    public boolean test(A p0, B p1) { return false; }
    public boolean test(A p0) { return false; }
    public com.android.internal.util.function.pooled.PooledRunnable asRunnable() { return null; }
    public com.android.internal.util.function.pooled.PooledConsumer<A> asConsumer() { return null; }
    public R apply(A p0, B p1, C p2) { return null; }
    public void accept(A p0, B p1, C p2) {}
    public R apply(A p0, B p1, C p2, D p3) { return null; }
    public R apply(A p0, B p1, C p2, D p3, E p4) { return null; }
    public R apply(A p0, B p1, C p2, D p3, E p4, F p5) { return null; }
    public R apply(A p0, B p1, C p2, D p3, E p4, F p5, G p6) { return null; }
    public R apply(A p0, B p1, C p2, D p3, E p4, F p5, G p6, H p7) { return null; }
    public R apply(A p0, B p1, C p2, D p3, E p4, F p5, G p6, H p7, I p8) { return null; }
    public R apply(A p0, B p1, C p2, D p3, E p4, F p5, G p6, H p7, I p8, J p9) { return null; }
    public R apply(A p0, B p1, C p2, D p3, E p4, F p5, G p6, H p7, I p8, J p9, K p10) { return null; }
    public void accept(A p0, B p1, C p2, D p3) {}
    public void accept(A p0, B p1, C p2, D p3, E p4) {}
    public void accept(A p0, B p1, C p2, D p3, E p4, F p5) {}
    public void accept(A p0, B p1, C p2, D p3, E p4, F p5, G p6) {}
    public void accept(A p0, B p1, C p2, D p3, E p4, F p5, G p6, H p7) {}
    public void accept(A p0, B p1, C p2, D p3, E p4, F p5, G p6, H p7, I p8) {}
    public void accept(A p0, B p1, C p2, D p3, E p4, F p5, G p6, H p7, I p8, J p9) {}
    public void accept(A p0, B p1, C p2, D p3, E p4, F p5, G p6, H p7, I p8, J p9, K p10) {}
    public void runOrThrow() throws java.lang.Exception {}
    public R getOrThrow() throws java.lang.Exception { return null; }
    public abstract com.android.internal.util.function.pooled.OmniFunction<A, B, C, D, E, F, G, H, I, J, K, R> recycleOnUse();
}
