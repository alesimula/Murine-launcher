package android.service.carrier;

public class CarrierIdentifier implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.carrier.CarrierIdentifier> CREATOR = null;
    public CarrierIdentifier(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) {}
    public CarrierIdentifier(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, int p6, int p7) {}
    public CarrierIdentifier(byte[] p0, java.lang.String p1, java.lang.String p2) {}
    public CarrierIdentifier(android.os.Parcel p0) {}
    public java.lang.String getMcc() { return null; }
    public java.lang.String getMnc() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSpn() { return null; }
    @android.annotation.Nullable
    public java.lang.String getImsi() { return null; }
    @android.annotation.Nullable
    public java.lang.String getGid1() { return null; }
    @android.annotation.Nullable
    public java.lang.String getGid2() { return null; }
    public int getCarrierId() { return 0; }
    public int getSpecificCarrierId() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}

    public static interface MatchType {
        public static final int ALL = 0;
        public static final int SPN = 1;
        public static final int IMSI_PREFIX = 2;
        public static final int GID1 = 3;
        public static final int GID2 = 4;
    }
}
