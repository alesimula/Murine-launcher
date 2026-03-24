package android.hardware.radio.modem;

public class ImeiInfo implements android.os.Parcelable {
    public int type;
    public java.lang.String imei;
    public java.lang.String svn;
    public static final android.os.Parcelable.Creator<android.hardware.radio.modem.ImeiInfo> CREATOR = null;
    public ImeiInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static @interface ImeiType {
        public static final int INVALID = 0;
        public static final int PRIMARY = 1;
        public static final int SECONDARY = 2;
    }
}
