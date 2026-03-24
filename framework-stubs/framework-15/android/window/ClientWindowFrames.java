package android.window;

public class ClientWindowFrames implements android.os.Parcelable {
    @android.annotation.NonNull
    public final android.graphics.Rect frame = null;
    @android.annotation.NonNull
    public final android.graphics.Rect displayFrame = null;
    @android.annotation.NonNull
    public final android.graphics.Rect parentFrame = null;
    @android.annotation.Nullable
    public android.graphics.Rect attachedFrame;
    public boolean isParentFrameClippedByDisplayCutout;
    public float compatScale;
    public static final android.os.Parcelable.Creator<android.window.ClientWindowFrames> CREATOR = null;
    public ClientWindowFrames() {}
    public ClientWindowFrames(android.window.ClientWindowFrames p0) {}
    public void setTo(android.window.ClientWindowFrames p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
