package com.android.internal.os;

public final class SomeArgs {
    private static final int MAX_POOL_SIZE = 10;
    private static com.android.internal.os.SomeArgs sPool;
    private static int sPoolSize;
    private static java.lang.Object sPoolLock;
    private com.android.internal.os.SomeArgs mNext;
    private boolean mInPool;
    static final int WAIT_NONE = 0;
    static final int WAIT_WAITING = 1;
    static final int WAIT_FINISHED = 2;
    int mWaitState;
    public java.lang.Object arg1;
    public java.lang.Object arg2;
    public java.lang.Object arg3;
    public java.lang.Object arg4;
    public java.lang.Object arg5;
    public java.lang.Object arg6;
    public java.lang.Object arg7;
    public java.lang.Object arg8;
    public java.lang.Object arg9;
    public int argi1;
    public int argi2;
    public int argi3;
    public int argi4;
    public int argi5;
    public int argi6;
    private SomeArgs() {}
    public static com.android.internal.os.SomeArgs obtain() { return null; }
    public void complete() {}
    public void recycle() {}
    private void clear() {}
}
