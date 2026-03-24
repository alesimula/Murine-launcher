package com.android.internal.util;

public class FunctionalUtils {
    public static <T extends java.lang.Object> java.util.function.Consumer<T> uncheckExceptions(com.android.internal.util.FunctionalUtils.ThrowingConsumer<T> p0) { return null; }
    public static <I extends java.lang.Object, O extends java.lang.Object> java.util.function.Function<I, O> uncheckExceptions(com.android.internal.util.FunctionalUtils.ThrowingFunction<I, O> p0) { return null; }
    public static java.lang.Runnable uncheckExceptions(com.android.internal.util.FunctionalUtils.ThrowingRunnable p0) { return null; }
    public static <A extends java.lang.Object, B extends java.lang.Object> java.util.function.BiConsumer<A, B> uncheckExceptions(com.android.internal.util.FunctionalUtils.ThrowingBiConsumer<A, B> p0) { return null; }
    public static <T extends java.lang.Object> java.util.function.Supplier<T> uncheckExceptions(com.android.internal.util.FunctionalUtils.ThrowingSupplier<T> p0) { return null; }
    public static <T extends java.lang.Object> java.util.function.Consumer<T> ignoreRemoteException(com.android.internal.util.FunctionalUtils.RemoteExceptionIgnoringConsumer<T> p0) { return null; }
    public static java.lang.Runnable handleExceptions(com.android.internal.util.FunctionalUtils.ThrowingRunnable p0, java.util.function.Consumer<java.lang.Throwable> p1) { return null; }
    @android.annotation.NonNull
    public static java.lang.String getLambdaName(java.lang.Object p0) { return null; }

    @java.lang.FunctionalInterface
    public static interface RemoteExceptionIgnoringConsumer<T extends java.lang.Object> extends java.util.function.Consumer<T> {
        public void acceptOrThrow(T p0) throws android.os.RemoteException;
        default public void accept(T p0) {}
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingBiConsumer<A extends java.lang.Object, B extends java.lang.Object> extends java.util.function.BiConsumer<A, B> {
        public void acceptOrThrow(A p0, B p1) throws java.lang.Exception;
        default public void accept(A p0, B p1) {}
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingBiFunction<T extends java.lang.Object, U extends java.lang.Object, R extends java.lang.Object> extends java.util.function.BiFunction<T, U, R> {
        public R applyOrThrow(T p0, U p1) throws java.lang.Exception;
        default public R apply(T p0, U p1) { return null; }
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingChecked2Consumer<Input extends java.lang.Object, ExceptionOne extends java.lang.Exception, ExceptionTwo extends java.lang.Exception> {
        public void accept(Input p0) throws ExceptionOne, ExceptionTwo;
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingCheckedConsumer<Input extends java.lang.Object, ExceptionType extends java.lang.Exception> {
        public void accept(Input p0) throws ExceptionType;
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingCheckedFunction<Input extends java.lang.Object, Output extends java.lang.Object, ExceptionType extends java.lang.Exception> {
        public Output apply(Input p0) throws ExceptionType;
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingCheckedSupplier<Output extends java.lang.Object, ExceptionType extends java.lang.Exception> {
        public Output get() throws ExceptionType;
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingConsumer<T extends java.lang.Object> extends java.util.function.Consumer<T> {
        public void acceptOrThrow(T p0) throws java.lang.Exception;
        default public void accept(T p0) {}
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingFunction<T extends java.lang.Object, R extends java.lang.Object> extends java.util.function.Function<T, R> {
        public R applyOrThrow(T p0) throws java.lang.Exception;
        default public R apply(T p0) { return null; }
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingRunnable extends java.lang.Runnable {
        public void runOrThrow() throws java.lang.Exception;
        default public void run() {}
    }

    @java.lang.FunctionalInterface
    public static interface ThrowingSupplier<T extends java.lang.Object> extends java.util.function.Supplier<T> {
        public T getOrThrow() throws java.lang.Exception;
        default public T get() { return null; }
    }
}
