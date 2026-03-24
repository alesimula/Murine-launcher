package android.view.inputmethod;

public final class InputBinding implements android.os.Parcelable {
    static final java.lang.String TAG = "InputBinding";
    final android.view.inputmethod.InputConnection mConnection = null;
    final android.os.IBinder mConnectionToken = null;
    final int mUid = 0;
    final int mPid = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InputBinding> CREATOR = null;
    public InputBinding(android.view.inputmethod.InputConnection p0, android.os.IBinder p1, int p2, int p3) {}
    public InputBinding(android.view.inputmethod.InputConnection p0, android.view.inputmethod.InputBinding p1) {}
    InputBinding(android.os.Parcel p0) {}
    public android.view.inputmethod.InputConnection getConnection() { return null; }
    public android.os.IBinder getConnectionToken() { return null; }
    public int getUid() { return 0; }
    public int getPid() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
