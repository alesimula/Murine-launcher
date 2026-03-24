package com.android.internal.util;

public final class SyncResultReceiver extends com.android.internal.os.IResultReceiver.Stub {
    public SyncResultReceiver(int p0) { super(); }
    public int getIntResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException { return 0; }
    @android.annotation.Nullable
    public java.lang.String getStringResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getStringArrayResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException { return null; }
    @android.annotation.Nullable
    public <P extends android.os.Parcelable> P getParcelableResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException { return null; }
    @android.annotation.Nullable
    public <P extends android.os.Parcelable> java.util.ArrayList<P> getParcelableListResult() throws com.android.internal.util.SyncResultReceiver.TimeoutException { return null; }
    public int getOptionalExtraIntResult(int p0) throws com.android.internal.util.SyncResultReceiver.TimeoutException { return 0; }
    public void send(int p0, android.os.Bundle p1) {}
    @android.annotation.NonNull
    public static android.os.Bundle bundleFor(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static android.os.Bundle bundleFor(java.lang.String[] p0) { return null; }
    @android.annotation.NonNull
    public static android.os.Bundle bundleFor(android.os.Parcelable p0) { return null; }
    @android.annotation.NonNull
    public static android.os.Bundle bundleFor(java.util.ArrayList<? extends android.os.Parcelable> p0) { return null; }
    @android.annotation.NonNull
    public static android.os.Bundle bundleFor(int p0) { return null; }

    public static final class TimeoutException extends java.lang.Exception {
    }
}
