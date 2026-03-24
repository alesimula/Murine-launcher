package com.android.internal.infra;

public interface ServiceConnector<I extends android.os.IInterface> {
    public boolean run(com.android.internal.infra.ServiceConnector.VoidJob<I> p0);
    public com.android.internal.infra.AndroidFuture<java.lang.Void> post(com.android.internal.infra.ServiceConnector.VoidJob<I> p0);
    public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postForResult(com.android.internal.infra.ServiceConnector.Job<I, R> p0);
    public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postAsync(com.android.internal.infra.ServiceConnector.Job<I, java.util.concurrent.CompletableFuture<R>> p0);
    public com.android.internal.infra.AndroidFuture<I> connect();
    public void unbind();
    public void setServiceLifecycleCallbacks(com.android.internal.infra.ServiceConnector.ServiceLifecycleCallbacks<I> p0);

    public static abstract class Impl<I extends android.os.IInterface> extends java.util.ArrayDeque<com.android.internal.infra.ServiceConnector.Job<I, ?>> implements com.android.internal.infra.ServiceConnector<I>, android.content.ServiceConnection, android.os.IBinder.DeathRecipient, java.lang.Runnable {
        static final boolean DEBUG = false;
        static final java.lang.String LOG_TAG = "ServiceConnector.Impl";
        protected final android.content.Context mContext = null;
        protected final java.util.concurrent.Executor mExecutor = null;
        public Impl(android.content.Context p0, android.content.Intent p1, int p2, int p3, java.util.function.Function<android.os.IBinder, I> p4) { super(); }
        protected android.os.Handler getJobHandler() { return null; }
        protected long getAutoDisconnectTimeoutMs() { return 0L; }
        protected long getRequestTimeoutMs() { return 0L; }
        protected boolean bindService(android.content.ServiceConnection p0) { return false; }
        protected I binderAsInterface(android.os.IBinder p0) { return null; }
        protected void onServiceUnbound() {}
        protected void onServiceConnectionStatusChanged(I p0, boolean p1) {}
        public boolean run(com.android.internal.infra.ServiceConnector.VoidJob<I> p0) { return false; }
        public com.android.internal.infra.AndroidFuture<java.lang.Void> post(com.android.internal.infra.ServiceConnector.VoidJob<I> p0) { return null; }
        public <R extends java.lang.Object> com.android.internal.infra.ServiceConnector.Impl<I>.CompletionAwareJob<I, R> postForResult(com.android.internal.infra.ServiceConnector.Job<I, R> p0) { return null; }
        public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postAsync(com.android.internal.infra.ServiceConnector.Job<I, java.util.concurrent.CompletableFuture<R>> p0) { return null; }
        public synchronized com.android.internal.infra.AndroidFuture<I> connect() { return null; }
        void enqueueJobThread(com.android.internal.infra.ServiceConnector.Job<I, ?> p0) {}
        void completeExceptionally(com.android.internal.infra.ServiceConnector.Job<?, ?> p0, java.lang.Throwable p1) {}
        static <BASE extends java.lang.Object, T extends BASE> T castOrNull(BASE p0, java.lang.Class<T> p1) { return null; }
        public void unbind() {}
        public void setServiceLifecycleCallbacks(com.android.internal.infra.ServiceConnector.ServiceLifecycleCallbacks<I> p0) {}
        void unbindJobThread() {}
        protected void cancelPendingJobs() {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void onBindingDied(android.content.ComponentName p0) {}
        public void binderDied() {}
        public void run() {}
        public java.lang.String toString() { return null; }
        public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

        class CompletionAwareJob<II extends java.lang.Object, R extends java.lang.Object> extends com.android.internal.infra.AndroidFuture<R> implements com.android.internal.infra.ServiceConnector.Job<II, R>, java.util.function.BiConsumer<R, java.lang.Throwable> {
            com.android.internal.infra.ServiceConnector.Job<II, R> mDelegate;
            boolean mAsync;
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

    public static class NoOp<T extends android.os.IInterface> extends com.android.internal.infra.AndroidFuture<java.lang.Object> implements com.android.internal.infra.ServiceConnector<T> {
        public NoOp() { super(); }
        public boolean run(com.android.internal.infra.ServiceConnector.VoidJob<T> p0) { return false; }
        public com.android.internal.infra.AndroidFuture<java.lang.Void> post(com.android.internal.infra.ServiceConnector.VoidJob<T> p0) { return null; }
        public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postForResult(com.android.internal.infra.ServiceConnector.Job<T, R> p0) { return null; }
        public <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> postAsync(com.android.internal.infra.ServiceConnector.Job<T, java.util.concurrent.CompletableFuture<R>> p0) { return null; }
        public com.android.internal.infra.AndroidFuture<T> connect() { return null; }
        public void unbind() {}
        public void setServiceLifecycleCallbacks(com.android.internal.infra.ServiceConnector.ServiceLifecycleCallbacks<T> p0) {}
    }

    public static interface ServiceLifecycleCallbacks<II extends android.os.IInterface> {
        default public void onConnected(II p0) {}
        default public void onDisconnected(II p0) {}
        default public void onBinderDied() {}
    }

    @java.lang.FunctionalInterface
    public static interface VoidJob<II extends java.lang.Object> extends com.android.internal.infra.ServiceConnector.Job<II, java.lang.Void> {
        public void runNoResult(II p0) throws java.lang.Exception;
        default public java.lang.Void run(II p0) throws java.lang.Exception { return null; }
    }
}
