package android.view;

public final class InputChannel implements android.os.Parcelable {
    private static final java.lang.String TAG = "InputChannel";
    private static final boolean DEBUG = false;
    public static final android.os.Parcelable.Creator<android.view.InputChannel> CREATOR = null;
    private long mPtr;
    private static native long[] nativeOpenInputChannelPair(java.lang.String p0);
    private static native long nativeGetFinalizer();
    private native void nativeDispose(long p0);
    private native long nativeReadFromParcel(android.os.Parcel p0);
    private native void nativeWriteToParcel(android.os.Parcel p0, long p1);
    private native long nativeDup(long p0);
    private native android.os.IBinder nativeGetToken(long p0);
    private native java.lang.String nativeGetName(long p0);
    public InputChannel() {}
    private void setNativeInputChannel(long p0) {}
    public static android.view.InputChannel[] openInputChannelPair(java.lang.String p0) { return null; }
    public java.lang.String getName() { return null; }
    public void dispose() {}
    public void release() {}
    public void copyTo(android.view.InputChannel p0) {}
    public android.view.InputChannel dup() { return null; }
    public int describeContents() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public android.os.IBinder getToken() { return null; }
}
