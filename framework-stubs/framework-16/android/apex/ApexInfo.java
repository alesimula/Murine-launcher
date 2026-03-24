package android.apex;

public class ApexInfo implements android.os.Parcelable {
    public java.lang.String moduleName;
    public java.lang.String modulePath;
    public java.lang.String preinstalledModulePath;
    public long versionCode;
    public java.lang.String versionName;
    public boolean isFactory;
    public boolean isActive;
    public boolean hasClassPathJars;
    public boolean activeApexChanged;
    public byte partition;
    public static final android.os.Parcelable.Creator<android.apex.ApexInfo> CREATOR = null;
    public ApexInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Partition {
        public static final byte SYSTEM = 0;
        public static final byte SYSTEM_EXT = 1;
        public static final byte PRODUCT = 2;
        public static final byte VENDOR = 3;
        public static final byte ODM = 4;
    }
}
