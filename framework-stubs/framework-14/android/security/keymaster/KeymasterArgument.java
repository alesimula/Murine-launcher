package android.security.keymaster;

abstract class KeymasterArgument implements android.os.Parcelable {
    public final int tag = 0;
    public static final android.os.Parcelable.Creator<android.security.keymaster.KeymasterArgument> CREATOR = null;
    protected KeymasterArgument(int p0) {}
    public abstract void writeValue(android.os.Parcel p0);
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
