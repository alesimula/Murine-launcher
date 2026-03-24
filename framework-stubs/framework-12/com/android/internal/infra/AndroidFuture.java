package com.android.internal.infra;

public class AndroidFuture<T extends java.lang.Object> extends java.util.concurrent.CompletableFuture<T> implements android.os.Parcelable {
    private static final boolean DEBUG = false;
    private static final java.lang.String LOG_TAG = null;
    private static final java.util.concurrent.Executor DIRECT_EXECUTOR = null;
    private static final java.lang.StackTraceElement[] EMPTY_STACK_TRACE = null;
    private static android.os.Handler sMainHandler;
    private final java.lang.Object mLock = null;
    private java.util.function.BiConsumer<? super T, ? super java.lang.Throwable> mListener;
    private java.util.concurrent.Executor mListenerExecutor;
    private android.os.Handler mTimeoutHandler;
    private final com.android.internal.infra.IAndroidFuture mRemoteOrigin = null;
    public static final android.os.Parcelable.Creator<com.android.internal.infra.AndroidFuture> CREATOR = null;
    public AndroidFuture() { super(); }
    AndroidFuture(android.os.Parcel p0) { super(); }
    private static android.os.Handler getMainHandler() { return null; }
    public static <U extends java.lang.Object> com.android.internal.infra.AndroidFuture<U> completedFuture(U p0) { return null; }
    public boolean complete(T p0) { return false; }
    public boolean completeExceptionally(java.lang.Throwable p0) { return false; }
    public boolean cancel(boolean p0) { return false; }
    protected void onCompleted(T p0, java.lang.Throwable p1) {}
    public com.android.internal.infra.AndroidFuture<T> whenComplete(java.util.function.BiConsumer<? super T, ? super java.lang.Throwable> p0) { return null; }
    public com.android.internal.infra.AndroidFuture<T> whenCompleteAsync(java.util.function.BiConsumer<? super T, ? super java.lang.Throwable> p0, java.util.concurrent.Executor p1) { return null; }
    private void callListenerAsync(java.util.function.BiConsumer<? super T, ? super java.lang.Throwable> p0, T p1, java.lang.Throwable p2) {}
    static <TT extends java.lang.Object> void callListener(java.util.function.BiConsumer<? super TT, ? super java.lang.Throwable> p0, TT p1, java.lang.Throwable p2) {}
    public com.android.internal.infra.AndroidFuture<T> orTimeout(long p0, java.util.concurrent.TimeUnit p1) { return null; }
    void triggerTimeout() {}
    public com.android.internal.infra.AndroidFuture<T> cancelTimeout() { return null; }
    public com.android.internal.infra.AndroidFuture<T> setTimeoutHandler(android.os.Handler p0) { return null; }
    public <U extends java.lang.Object> com.android.internal.infra.AndroidFuture<U> thenCompose(java.util.function.Function<? super T, ? extends java.util.concurrent.CompletionStage<U>> p0) { return null; }
    public <U extends java.lang.Object> com.android.internal.infra.AndroidFuture<U> thenComposeAsync(java.util.function.Function<? super T, ? extends java.util.concurrent.CompletionStage<U>> p0, java.util.concurrent.Executor p1) { return null; }
    public <U extends java.lang.Object> com.android.internal.infra.AndroidFuture<U> thenApply(java.util.function.Function<? super T, ? extends U> p0) { return null; }
    public <U extends java.lang.Object> com.android.internal.infra.AndroidFuture<U> thenApplyAsync(java.util.function.Function<? super T, ? extends U> p0, java.util.concurrent.Executor p1) { return null; }
    public <U extends java.lang.Object, V extends java.lang.Object> com.android.internal.infra.AndroidFuture<V> thenCombine(java.util.concurrent.CompletionStage<? extends U> p0, java.util.function.BiFunction<? super T, ? super U, ? extends V> p1) { return null; }
    public com.android.internal.infra.AndroidFuture<T> thenCombine(java.util.concurrent.CompletionStage<java.lang.Void> p0) { return null; }
    public static <T extends java.lang.Object> com.android.internal.infra.AndroidFuture<T> supply(java.util.function.Supplier<T> p0) { return null; }
    public static <T extends java.lang.Object> com.android.internal.infra.AndroidFuture<T> supplyAsync(java.util.function.Supplier<T> p0, java.util.concurrent.Executor p1) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    java.lang.Throwable unwrapExecutionException(java.lang.Throwable p0) { return null; }
    private static void writeThrowable(android.os.Parcel p0, java.lang.Throwable p1) {}
    private static java.lang.Throwable readThrowable(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }

    private static class SupplyAsync<T extends java.lang.Object> extends com.android.internal.infra.AndroidFuture<T> implements java.lang.Runnable {
        private final java.util.function.Supplier<T> mSupplier = null;
        SupplyAsync(java.util.function.Supplier<T> p0, java.util.concurrent.Executor p1) { super(); }
        public void run() {}
    }

    private static class ThenApplyAsync<T extends java.lang.Object, U extends java.lang.Object> extends com.android.internal.infra.AndroidFuture<U> implements java.util.function.BiConsumer<T, java.lang.Throwable>, java.lang.Runnable {
        private volatile T mSourceResult;
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Function<? super T, ? extends U> mFn = null;
        ThenApplyAsync(com.android.internal.infra.AndroidFuture<T> p0, java.util.function.Function<? super T, ? extends U> p1, java.util.concurrent.Executor p2) { super(); }
        public void accept(T p0, java.lang.Throwable p1) {}
        public void run() {}
    }

    private static class ThenCombine<T extends java.lang.Object, U extends java.lang.Object, V extends java.lang.Object> extends com.android.internal.infra.AndroidFuture<V> implements java.util.function.BiConsumer<java.lang.Object, java.lang.Throwable> {
        private volatile T mResultT;
        private volatile java.util.concurrent.CompletionStage<? extends U> mSourceU;
        private final java.util.function.BiFunction<? super T, ? super U, ? extends V> mCombineResults = null;
        ThenCombine(java.util.concurrent.CompletableFuture<T> p0, java.util.concurrent.CompletionStage<? extends U> p1, java.util.function.BiFunction<? super T, ? super U, ? extends V> p2) { super(); }
        public void accept(java.lang.Object p0, java.lang.Throwable p1) {}
    }

    private static class ThenComposeAsync<T extends java.lang.Object, U extends java.lang.Object> extends com.android.internal.infra.AndroidFuture<U> implements java.util.function.BiConsumer<java.lang.Object, java.lang.Throwable>, java.lang.Runnable {
        private volatile T mSourceResult;
        private final java.util.concurrent.Executor mExecutor = null;
        private volatile java.util.function.Function<? super T, ? extends java.util.concurrent.CompletionStage<U>> mFn;
        ThenComposeAsync(com.android.internal.infra.AndroidFuture<T> p0, java.util.function.Function<? super T, ? extends java.util.concurrent.CompletionStage<U>> p1, java.util.concurrent.Executor p2) { super(); }
        public void accept(java.lang.Object p0, java.lang.Throwable p1) {}
        public void run() {}
    }
}
