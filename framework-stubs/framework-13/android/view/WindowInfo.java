package android.view;

public class WindowInfo implements android.os.Parcelable {
    public int type;
    public int layer;
    public android.os.IBinder token;
    public android.os.IBinder parentToken;
    public android.os.IBinder activityToken;
    public boolean focused;
    public android.graphics.Region regionInScreen;
    public java.util.List<android.os.IBinder> childTokens;
    public java.lang.CharSequence title;
    public long accessibilityIdOfAnchor;
    public boolean inPictureInPicture;
    public boolean hasFlagWatchOutsideTouch;
    public int displayId;
    public int taskId;
    public float[] mTransformMatrix;
    public android.view.MagnificationSpec mMagnificationSpec;
    public static final android.os.Parcelable.Creator<android.view.WindowInfo> CREATOR = null;
    public static android.view.WindowInfo obtain() { return null; }
    public static android.view.WindowInfo obtain(android.view.WindowInfo p0) { return null; }
    public void recycle() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
