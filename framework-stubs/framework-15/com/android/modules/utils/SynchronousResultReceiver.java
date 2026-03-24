package com.android.modules.utils;

public final class SynchronousResultReceiver<T extends java.lang.Object> implements android.os.Parcelable {
    com.android.modules.utils.ISynchronousResultReceiver mReceiver;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.android.modules.utils.SynchronousResultReceiver<?>> CREATOR = null;
    public static <T extends java.lang.Object> com.android.modules.utils.SynchronousResultReceiver<T> get() { return null; }
    public void send(T p0) {}
    public void propagateException(java.lang.RuntimeException p0) {}
    @android.annotation.NonNull
    public com.android.modules.utils.SynchronousResultReceiver.Result<T> awaitResultNoInterrupt(java.time.Duration p0) throws java.util.concurrent.TimeoutException { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private final class MyResultReceiver extends com.android.modules.utils.ISynchronousResultReceiver.Stub {
        public void send(com.android.modules.utils.SynchronousResultReceiver.Result p0) {}
    }

    public static class Result<T extends java.lang.Object> implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<com.android.modules.utils.SynchronousResultReceiver.Result<?>> CREATOR = null;
        public Result(java.lang.RuntimeException p0) {}
        public Result(T p0) {}
        public T getValue(T p0) { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
