package android.hardware.radio.sim;

public class Carrier implements android.os.Parcelable {
    public java.lang.String mcc;
    public java.lang.String mnc;
    public int matchType;
    public java.lang.String matchData;
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.Carrier> CREATOR = null;
    public static final int MATCH_TYPE_ALL = 0;
    public static final int MATCH_TYPE_SPN = 1;
    public static final int MATCH_TYPE_IMSI_PREFIX = 2;
    public static final int MATCH_TYPE_GID1 = 3;
    public static final int MATCH_TYPE_GID2 = 4;
    public Carrier() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
