package android.hardware.radio.V1_4;

public final class DataProfileInfo {
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
    public int mtu;
    public boolean preferred;
    public boolean persistent;
    public DataProfileInfo() {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final java.lang.String toString() { return null; }
    public final void readFromParcel(android.os.HwParcel p0) {}
    public static final java.util.ArrayList<android.hardware.radio.V1_4.DataProfileInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_4.DataProfileInfo> p1) {}
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
}
