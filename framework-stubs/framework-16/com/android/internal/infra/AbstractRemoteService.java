package com.android.internal.infra;

@java.lang.Deprecated
public abstract class AbstractRemoteService<S extends com.android.internal.infra.AbstractRemoteService<S, I>, I extends android.os.IInterface> implements android.os.IBinder.DeathRecipient {
    public static final long PERMANENT_BOUND_TIMEOUT_MS = 0L;
    protected static final int LAST_PRIVATE_MSG = 2;
    public final boolean mVerbose = false;
    protected final java.lang.String mTag = null;
    protected final android.os.Handler mHandler = null;
    protected final android.content.ComponentName mComponentName = null;
    protected I mService;
    protected final java.util.ArrayList<com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I>> mUnfinishedRequests = null;
    AbstractRemoteService(android.content.Context p0, java.lang.String p1, android.content.ComponentName p2, int p3, com.android.internal.infra.AbstractRemoteService.VultureCallback<S> p4, android.os.Handler p5, int p6, boolean p7) {}
    public final void destroy() {}
    public final boolean isDestroyed() { return false; }
    @android.annotation.NonNull
    public final android.content.ComponentName getComponentName() { return null; }
    abstract void handlePendingRequests();
    protected void handleOnConnectedStateChanged(boolean p0) {}
    @android.annotation.NonNull
    protected abstract I getServiceInterface(android.os.IBinder p0);
    protected abstract long getTimeoutIdleBindMillis();
    protected long getRemoteRequestMillis() { return 0L; }
    @android.annotation.Nullable
    public final I getServiceInterface() { return null; }
    protected abstract void handleOnDestroy();
    public void binderDied() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    protected void scheduleRequest(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0) {}
    void finishRequest(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0) {}
    protected void scheduleAsyncRequest(com.android.internal.infra.AbstractRemoteService.AsyncRequest<I> p0) {}
    protected void executeAsyncRequest(com.android.internal.infra.AbstractRemoteService.AsyncRequest<I> p0) {}
    protected void scheduleBind() {}
    protected void scheduleUnbind() {}
    protected final void handlePendingRequest(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0) {}
    abstract void handlePendingRequestWhileUnBound(com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> p0);
    abstract void handleBindFailure();
    public java.lang.String toString() { return null; }

    public static interface AsyncRequest<I extends android.os.IInterface> {
        public void run(I p0) throws android.os.RemoteException;
    }

    public static abstract class BasePendingRequest<S extends com.android.internal.infra.AbstractRemoteService<S, I>, I extends android.os.IInterface> implements java.lang.Runnable {
        protected final java.lang.String mTag = null;
        protected final java.lang.Object mLock = null;
        final java.lang.ref.WeakReference<S> mWeakService = null;
        boolean mCancelled;
        boolean mCompleted;
        BasePendingRequest(S p0) {}
        protected final S getService() { return null; }
        protected final boolean finish() { return false; }
        void onFinished() {}
        protected void onFailed() {}
        protected final boolean isCancelledLocked() { return false; }
        public boolean cancel() { return false; }
        void onCancel() {}
        protected boolean isFinal() { return false; }
        protected boolean isRequestCompleted() { return false; }
    }

    private static final class MyAsyncPendingRequest<S extends com.android.internal.infra.AbstractRemoteService<S, I>, I extends android.os.IInterface> extends com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> {
        protected MyAsyncPendingRequest(S p0, com.android.internal.infra.AbstractRemoteService.AsyncRequest<I> p1) { super(null); }
        public void run() {}
    }

    public static abstract class PendingRequest<S extends com.android.internal.infra.AbstractRemoteService<S, I>, I extends android.os.IInterface> extends com.android.internal.infra.AbstractRemoteService.BasePendingRequest<S, I> {
        protected PendingRequest(S p0) { super(null); }
        final void onFinished() {}
        final void onCancel() {}
        protected abstract void onTimeout(S p0);
    }

    private class RemoteServiceConnection implements android.content.ServiceConnection {
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void onBindingDied(android.content.ComponentName p0) {}
    }

    public static interface VultureCallback<T extends java.lang.Object> {
        public void onServiceDied(T p0);
    }
}
