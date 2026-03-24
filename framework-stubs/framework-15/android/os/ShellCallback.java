package android.os;

public class ShellCallback implements android.os.Parcelable {
    static final java.lang.String TAG = "ShellCallback";
    static final boolean DEBUG = false;
    final boolean mLocal = false;
    com.android.internal.os.IShellCallback mShellCallback;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.ShellCallback> CREATOR = null;
    public ShellCallback() {}
    public android.os.ParcelFileDescriptor openFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public android.os.ParcelFileDescriptor onOpenFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static void writeToParcel(android.os.ShellCallback p0, android.os.Parcel p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.os.IBinder getShellCallbackBinder() { return null; }
    ShellCallback(android.os.Parcel p0) {}

    class MyShellCallback extends com.android.internal.os.IShellCallback.Stub {
        MyShellCallback(android.os.ShellCallback p0) { super(); }
        public android.os.ParcelFileDescriptor openFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    }
}
