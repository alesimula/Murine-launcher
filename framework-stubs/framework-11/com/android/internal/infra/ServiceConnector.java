package com.android.internal.infra;

public interface ServiceConnector<I extends android.os.IInterface> {
    public boolean run(com.android.internal.infra.ServiceConnector.VoidJob<I> p0);
    public com.android.internal.infra.AndroidFuture<java.lang.Void> post(com.android.internal.infra.ServiceConnector.VoidJob<I> p0);
    public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postForResult(com.android.internal.infra.ServiceConnector.Job<I, R> p0);
    public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postAsync(com.android.internal.infra.ServiceConnector.Job<I, java.util.concurrent.CompletableFuture<R>> p0);
    public com.android.internal.infra.AndroidFuture<I> connect();
    public void unbind();

    public static class Impl<I extends android.os.IInterface> extends java.util.ArrayDeque<com.android.internal.infra.ServiceConnector.Job<I, ?>> implements com.android.internal.infra.ServiceConnector<I>, android.content.ServiceConnection, android.os.IBinder.DeathRecipient, java.lang.Runnable {
        static final boolean DEBUG = false;
        static final java.lang.String LOG_TAG = "ServiceConnector.Impl";
        private static final long DEFAULT_DISCONNECT_TIMEOUT_MS = 15000L;
        private static final long DEFAULT_REQUEST_TIMEOUT_MS = 30000L;
        private final java.util.Queue<com.android.internal.infra.ServiceConnector.Job<I, ?>> mQueue = null;
        private final java.util.List<com.android.internal.infra.ServiceConnector.Impl<I>.CompletionAwareJob<I, ?>> mUnfinishedJobs = null;
        private final android.content.ServiceConnection mServiceConnection = null;
        private final java.lang.Runnable mTimeoutDisconnect = null;
        protected final android.content.Context mContext = null;
        private final android.content.Intent mIntent = null;
        private final int mBindingFlags = 0;
        private final int mUserId = 0;
        private final java.util.function.Function<android.os.IBinder, I> mBinderAsInterface = null;
        private volatile I mService;
        private boolean mBinding;
        private boolean mUnbinding;
        private com.android.internal.infra.ServiceConnector.Impl<I>.CompletionAwareJob<I, I> mServiceConnectionFutureCache;
        public Impl(android.content.Context p0, android.content.Intent p1, int p2, int p3, java.util.function.Function<android.os.IBinder, I> p4) { super(); }
        protected android.os.Handler getJobHandler() { return null; }
        protected long getAutoDisconnectTimeoutMs() { return 0L; }
        protected long getRequestTimeoutMs() { return 0L; }
        protected boolean bindService(android.content.ServiceConnection p0, android.os.Handler p1) { return false; }
        protected I binderAsInterface(android.os.IBinder p0) { return null; }
        protected void onServiceUnbound() {}
        protected void onServiceConnectionStatusChanged(I p0, boolean p1) {}
        public boolean run(com.android.internal.infra.ServiceConnector.VoidJob<I> p0) { return false; }
        public com.android.internal.infra.AndroidFuture<java.lang.Void> post(com.android.internal.infra.ServiceConnector.VoidJob<I> p0) { return null; }
        public <R extends java.lang.Object> com.android.internal.infra.ServiceConnector.Impl<I>.CompletionAwareJob<I, R> postForResult(com.android.internal.infra.ServiceConnector.Job<I, R> p0) { return null; }
        public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postAsync(com.android.internal.infra.ServiceConnector.Job<I, java.util.concurrent.CompletableFuture<R>> p0) { return null; }
        public synchronized com.android.internal.infra.AndroidFuture<I> connect() { return null; }
        private void enqueue(com.android.internal.infra.ServiceConnector.Impl<I>.CompletionAwareJob<I, ?> p0) {}
        private boolean enqueue(com.android.internal.infra.ServiceConnector.Job<I, ?> p0) { return false; }
        void enqueueJobThread(com.android.internal.infra.ServiceConnector.Job<I, ?> p0) {}
        private void cancelTimeout() {}
        void completeExceptionally(com.android.internal.infra.ServiceConnector.Job<?, ?> p0, java.lang.Throwable p1) {}
        static <BASE extends java.lang.Object, T extends BASE> T castOrNull(BASE p0, java.lang.Class<T> p1) { return null; }
        private void processQueue() {}
        private void maybeScheduleUnbindTimeout() {}
        private void scheduleUnbindTimeout() {}
        private boolean isBound() { return false; }
        public void unbind() {}
        void unbindJobThread() {}
        protected void cancelPendingJobs() {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void onBindingDied(android.content.ComponentName p0) {}
        public void binderDied() {}
        public void run() {}
        private void onTimeout() {}
        public java.lang.String toString() { return null; }
        public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
        private java.lang.String stateToString() { return null; }
        private void logTrace() {}

        class CompletionAwareJob<II extends java.lang.Object, R extends java.lang.Object> extends com.android.internal.infra.AndroidFuture<R> implements com.android.internal.infra.ServiceConnector.Job<II, R>, java.util.function.BiConsumer<R, java.lang.Throwable> {
            com.android.internal.infra.ServiceConnector.Job<II, R> mDelegate;
            boolean mAsync;
            private java.lang.String mDebugName;
            CompletionAwareJob(com.android.internal.infra.ServiceConnector.Impl p0) { super(); }
            public R run(II p0) throws java.lang.Exception { return null; }
            public boolean cancel(boolean p0) { return false; }
            public java.lang.String toString() { return null; }
            public void accept(R p0, java.lang.Throwable p1) {}
            protected void onCompleted(R p0, java.lang.Throwable p1) {}
        }
    }

    @java.lang.FunctionalInterface
    public static interface Job<II extends java.lang.Object, R extends java.lang.Object> {
        public R run(II p0) throws java.lang.Exception;
    }

    @java.lang.FunctionalInterface
    public static interface VoidJob<II extends java.lang.Object> extends com.android.internal.infra.ServiceConnector.Job<II, java.lang.Void> {
        public void runNoResult(II p0) throws java.lang.Exception;
        default public java.lang.Void run(II p0) throws java.lang.Exception { return null; }
    }
}
