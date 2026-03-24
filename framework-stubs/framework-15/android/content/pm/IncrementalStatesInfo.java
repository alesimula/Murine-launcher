package android.content.pm;

public class IncrementalStatesInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.IncrementalStatesInfo> CREATOR = null;
    public IncrementalStatesInfo(boolean p0, float p1, long p2) {}
    public boolean isLoading() { return false; }
    public float getProgress() { return 0.0f; }
    public long getLoadingCompletedTime() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
