package android.hardware.radio.data;

public class DataProfileInfo implements android.os.Parcelable {
    public int profileId;
    public java.lang.String apn;
    public int protocol;
    public int roamingProtocol;
    public int authType;
    public java.lang.String user;
    public java.lang.String password;
    public int type;
    public int maxConnsTime;
    public int maxConns;
    public int waitTime;
    public boolean enabled;
    public int supportedApnTypesBitmap;
    public int bearerBitmap;
    public int mtuV4;
    public int mtuV6;
    public boolean preferred;
    public boolean persistent;
    public boolean alwaysOn;
    public android.hardware.radio.data.TrafficDescriptor trafficDescriptor;
    public int infrastructureBitmap;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.DataProfileInfo> CREATOR = null;
    public static final int ID_DEFAULT = 0;
    public static final int ID_TETHERED = 1;
    public static final int ID_IMS = 2;
    public static final int ID_FOTA = 3;
    public static final int ID_CBS = 4;
    public static final int ID_OEM_BASE = 1000;
    public static final int ID_INVALID = -1;
    public static final int TYPE_COMMON = 0;
    public static final int TYPE_3GPP = 1;
    public static final int TYPE_3GPP2 = 2;
    public static final int INFRASTRUCTURE_UNKNOWN = 0;
    public static final int INFRASTRUCTURE_CELLULAR = 1;
    public static final int INFRASTRUCTURE_SATELLITE = 2;
    public DataProfileInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
