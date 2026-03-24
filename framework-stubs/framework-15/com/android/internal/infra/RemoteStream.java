package com.android.internal.infra;

public abstract class RemoteStream<RES extends java.lang.Object, IOSTREAM extends java.io.Closeable> extends com.android.internal.infra.AndroidFuture<RES> implements java.lang.Runnable {
    public static <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> receiveBytes(com.android.internal.util.FunctionalUtils.ThrowingConsumer<android.os.ParcelFileDescriptor> p0, com.android.internal.util.FunctionalUtils.ThrowingFunction<java.io.InputStream, R> p1) { return null; }
    public static com.android.internal.infra.AndroidFuture<byte[]> receiveBytes(com.android.internal.util.FunctionalUtils.ThrowingConsumer<android.os.ParcelFileDescriptor> p0) { return null; }
    public static byte[] readAll(java.io.InputStream p0) throws java.io.IOException { return null; }
    public static <R extends java.lang.Object> com.android.internal.infra.AndroidFuture<R> sendBytes(com.android.internal.util.FunctionalUtils.ThrowingConsumer<android.os.ParcelFileDescriptor> p0, com.android.internal.util.FunctionalUtils.ThrowingFunction<java.io.OutputStream, R> p1) { return null; }
    public static com.android.internal.infra.AndroidFuture<java.lang.Void> sendBytes(com.android.internal.util.FunctionalUtils.ThrowingConsumer<android.os.ParcelFileDescriptor> p0, com.android.internal.util.FunctionalUtils.ThrowingConsumer<java.io.OutputStream> p1) { return null; }
    public static com.android.internal.infra.AndroidFuture<java.lang.Void> sendBytes(com.android.internal.util.FunctionalUtils.ThrowingConsumer<android.os.ParcelFileDescriptor> p0, byte[] p1) { return null; }
    protected abstract IOSTREAM createStream(android.os.ParcelFileDescriptor p0);
    public void run() {}
    protected void onCompleted(RES p0, java.lang.Throwable p1) {}
}
