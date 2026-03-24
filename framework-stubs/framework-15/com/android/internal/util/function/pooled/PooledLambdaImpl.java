package com.android.internal.util.function.pooled;

final class PooledLambdaImpl<R extends java.lang.Object> extends com.android.internal.util.function.pooled.OmniFunction<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, R> {
    static final com.android.internal.util.function.pooled.PooledLambdaImpl.Pool sPool = null;
    static final com.android.internal.util.function.pooled.PooledLambdaImpl.Pool sMessageCallbacksPool = null;
    java.lang.Object mFunc;
    long mConstValue;
    @android.annotation.Nullable
    java.lang.Object[] mArgs;
    static final int MASK_EXPOSED_AS = 2080768;
    static final int MASK_FUNC_TYPE = 266338304;
    int mFlags;
    public void recycle() {}
    R invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10) { return null; }
    public java.lang.String toString() { return null; }
    static <E extends com.android.internal.util.function.pooled.PooledLambda> E acquire(com.android.internal.util.function.pooled.PooledLambdaImpl.Pool p0, java.lang.Object p1, int p2, int p3, int p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16) { return null; }
    static com.android.internal.util.function.pooled.PooledLambdaImpl acquireConstSupplier(int p0) { return null; }
    static com.android.internal.util.function.pooled.PooledLambdaImpl acquire(com.android.internal.util.function.pooled.PooledLambdaImpl.Pool p0) { return null; }
    public com.android.internal.util.function.pooled.OmniFunction<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, R> negate() { return null; }
    public <V extends java.lang.Object> com.android.internal.util.function.pooled.OmniFunction<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, V> andThen(java.util.function.Function<? super R, ? extends V> p0) { return null; }
    public double getAsDouble() { return 0.0; }
    public int getAsInt() { return 0; }
    public long getAsLong() { return 0L; }
    public com.android.internal.util.function.pooled.OmniFunction<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, R> recycleOnUse() { return null; }
    public java.lang.String getTraceName() { return null; }
    int getFlags(int p0) { return 0; }
    void setFlags(int p0, int p1) {}

    static class LambdaType {
        public static final int MASK_ARG_COUNT = 15;
        public static final int MASK_RETURN_TYPE = 112;
        public static final int MASK = 127;
        public static final int MASK_BIT_COUNT = 7;
        LambdaType() {}
        static int encode(int p0, int p1) { return 0; }
        static int decodeArgCount(int p0) { return 0; }
        static int decodeReturnType(int p0) { return 0; }
        static java.lang.String toString(int p0) { return null; }

        static class ReturnType {
            public static final int VOID = 1;
            public static final int BOOLEAN = 2;
            public static final int OBJECT = 3;
            public static final int INT = 4;
            public static final int LONG = 5;
            public static final int DOUBLE = 6;
            ReturnType() {}
            static java.lang.String toString(int p0) { return null; }
            static java.lang.String lambdaSuffix(int p0) { return null; }
        }
    }

    static class Pool extends android.util.Pools.SynchronizedPool<com.android.internal.util.function.pooled.PooledLambdaImpl> {
        public Pool(java.lang.Object p0) { super(0); }
    }
}
