package com.android.internal.util.function.pooled;

final class PooledLambdaImpl<R extends java.lang.Object> extends com.android.internal.util.function.pooled.OmniFunction<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, R> {
    private static final boolean DEBUG = false;
    private static final java.lang.String LOG_TAG = "PooledLambdaImpl";
    private static final int MAX_ARGS = 11;
    private static final int MAX_POOL_SIZE = 50;
    static final com.android.internal.util.function.pooled.PooledLambdaImpl.Pool sPool = null;
    static final com.android.internal.util.function.pooled.PooledLambdaImpl.Pool sMessageCallbacksPool = null;
    java.lang.Object mFunc;
    long mConstValue;
    java.lang.Object[] mArgs;
    private static final int FLAG_RECYCLED = 2048;
    private static final int FLAG_RECYCLE_ON_USE = 4096;
    private static final int FLAG_ACQUIRED_FROM_MESSAGE_CALLBACKS_POOL = 8192;
    static final int MASK_EXPOSED_AS = 2080768;
    static final int MASK_FUNC_TYPE = 266338304;
    int mFlags;
    private PooledLambdaImpl() { super(); }
    public void recycle() {}
    private void doRecycle() {}
    R invoke(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10) { return null; }
    private boolean fillInArg(java.lang.Object p0) { return false; }
    private void checkNotRecycled() {}
    private R doInvoke() { return null; }
    private boolean isConstSupplier() { return false; }
    private java.lang.Object popArg(int p0) { return null; }
    public java.lang.String toString() { return null; }
    private java.lang.String commaSeparateFirstN(java.lang.Object[] p0, int p1) { return null; }
    private static java.lang.String hashCodeHex(java.lang.Object p0) { return null; }
    private java.lang.String getFuncTypeAsString() { return null; }
    static <E extends com.android.internal.util.function.pooled.PooledLambda> E acquire(com.android.internal.util.function.pooled.PooledLambdaImpl.Pool p0, java.lang.Object p1, int p2, int p3, int p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12, java.lang.Object p13, java.lang.Object p14, java.lang.Object p15, java.lang.Object p16) { return null; }
    static com.android.internal.util.function.pooled.PooledLambdaImpl acquireConstSupplier(int p0) { return null; }
    static com.android.internal.util.function.pooled.PooledLambdaImpl acquire(com.android.internal.util.function.pooled.PooledLambdaImpl.Pool p0) { return null; }
    private static void setIfInBounds(java.lang.Object[] p0, int p1, java.lang.Object p2) {}
    public com.android.internal.util.function.pooled.OmniFunction<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, R> negate() { return null; }
    public <V extends java.lang.Object> com.android.internal.util.function.pooled.OmniFunction<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, V> andThen(java.util.function.Function<? super R, ? extends V> p0) { return null; }
    public double getAsDouble() { return 0.0; }
    public int getAsInt() { return 0; }
    public long getAsLong() { return 0L; }
    public com.android.internal.util.function.pooled.OmniFunction<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, R> recycleOnUse() { return null; }
    public java.lang.String getTraceName() { return null; }
    private boolean isRecycled() { return false; }
    private boolean isRecycleOnUse() { return false; }
    private boolean isInvocationArgAtIndex(int p0) { return false; }
    int getFlags(int p0) { return 0; }
    void setFlags(int p0, int p1) {}
    private static int mask(int p0, int p1) { return 0; }
    private static int unmask(int p0, int p1) { return 0; }

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
        private static java.lang.String argCountPrefix(int p0) { return null; }

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
            private static java.lang.String prefix(int p0) { return null; }
            private static java.lang.String suffix(int p0) { return null; }
        }
    }

    static class Pool extends android.util.Pools.SynchronizedPool<com.android.internal.util.function.pooled.PooledLambdaImpl> {
        public Pool(java.lang.Object p0) { super(0); }
    }
}
