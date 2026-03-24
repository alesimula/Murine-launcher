package android.content.pm;

public class IncrementalStatesInfo implements android.os.Parcelable {
    private boolean mIsLoading;
    private float mProgress;
    public static final android.os.Parcelable.Creator<android.content.pm.IncrementalStatesInfo> CREATOR = null;
    public IncrementalStatesInfo(boolean p0, float p1) {}
    private IncrementalStatesInfo(android.os.Parcel p0) {}
    public boolean isLoading() { return false; }
    public float getProgress() { return 0.0f; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
