package android.apex;

public class ApexInfo implements android.os.Parcelable {
    public java.lang.String packageName;
    public java.lang.String packagePath;
    public long versionCode;
    public java.lang.String versionName;
    public boolean isFactory;
    public boolean isActive;
    public static final android.os.Parcelable.Creator<android.apex.ApexInfo> CREATOR = null;
    public ApexInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
