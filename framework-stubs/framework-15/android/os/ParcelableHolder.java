package android.os;

@android.annotation.SystemApi
public final class ParcelableHolder implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.ParcelableHolder> CREATOR = null;
    public ParcelableHolder(int p0) {}
    public int getStability() { return 0; }
    public void setParcelable(android.os.Parcelable p0) {}
    @android.annotation.Nullable
    public <T extends android.os.Parcelable> T getParcelable(java.lang.Class<T> p0) { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
