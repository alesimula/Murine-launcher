package android.window;

public class BackAnimationAdaptor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.BackAnimationAdaptor> CREATOR = null;
    public BackAnimationAdaptor(android.window.IBackAnimationRunner p0, int p1) {}
    public BackAnimationAdaptor(android.os.Parcel p0) {}
    public android.window.IBackAnimationRunner getRunner() { return null; }
    @android.window.BackNavigationInfo.BackTargetType
    public int getSupportType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
