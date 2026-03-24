package android.telephony.cdma;

public class CdmaCellLocation extends android.telephony.CellLocation {
    private int mBaseStationId;
    public static final int INVALID_LAT_LONG = 2147483647;
    private int mBaseStationLatitude;
    private int mBaseStationLongitude;
    private int mSystemId;
    private int mNetworkId;
    public CdmaCellLocation() { super(); }
    public CdmaCellLocation(android.os.Bundle p0) { super(); }
    public int getBaseStationId() { return 0; }
    public int getBaseStationLatitude() { return 0; }
    public int getBaseStationLongitude() { return 0; }
    public int getSystemId() { return 0; }
    public int getNetworkId() { return 0; }
    public void setStateInvalid() {}
    public void setCellLocationData(int p0, int p1, int p2) {}
    public void setCellLocationData(int p0, int p1, int p2, int p3, int p4) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    private static boolean equalsHandlesNulls(java.lang.Object p0, java.lang.Object p1) { return false; }
    public void fillInNotifierBundle(android.os.Bundle p0) {}
    public boolean isEmpty() { return false; }
    public static double convertQuartSecToDecDegrees(int p0) { return 0.0; }
}
