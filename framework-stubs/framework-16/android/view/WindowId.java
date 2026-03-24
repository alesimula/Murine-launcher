package android.view;

public class WindowId implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.WindowId> CREATOR = null;
    public boolean isFocused() { return false; }
    public void registerFocusObserver(android.view.WindowId.FocusObserver p0) {}
    public void unregisterFocusObserver(android.view.WindowId.FocusObserver p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public android.view.IWindowId getTarget() { return null; }
    public WindowId(android.view.IWindowId p0) {}
    public WindowId(android.os.IBinder p0) {}

    public static abstract class FocusObserver {
        final android.view.IWindowFocusObserver.Stub mIObserver = null;
        final java.util.HashMap<android.os.IBinder, android.view.WindowId> mRegistrations = null;
        final android.os.Handler mHandler = null;
        public FocusObserver() {}
        public abstract void onFocusGained(android.view.WindowId p0);
        public abstract void onFocusLost(android.view.WindowId p0);

        class H extends android.os.Handler {
            H(android.view.WindowId.FocusObserver p0) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }
    }
}
