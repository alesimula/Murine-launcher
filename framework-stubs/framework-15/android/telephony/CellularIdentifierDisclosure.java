package android.telephony;

public final class CellularIdentifierDisclosure implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.CellularIdentifierDisclosure> CREATOR = null;
    public static final int NAS_PROTOCOL_MESSAGE_UNKNOWN = 0;
    public static final int NAS_PROTOCOL_MESSAGE_ATTACH_REQUEST = 1;
    public static final int NAS_PROTOCOL_MESSAGE_IDENTITY_RESPONSE = 2;
    public static final int NAS_PROTOCOL_MESSAGE_DETACH_REQUEST = 3;
    public static final int NAS_PROTOCOL_MESSAGE_TRACKING_AREA_UPDATE_REQUEST = 4;
    public static final int NAS_PROTOCOL_MESSAGE_LOCATION_UPDATE_REQUEST = 5;
    public static final int NAS_PROTOCOL_MESSAGE_AUTHENTICATION_AND_CIPHERING_RESPONSE = 6;
    public static final int NAS_PROTOCOL_MESSAGE_REGISTRATION_REQUEST = 7;
    public static final int NAS_PROTOCOL_MESSAGE_DEREGISTRATION_REQUEST = 8;
    public static final int NAS_PROTOCOL_MESSAGE_CM_REESTABLISHMENT_REQUEST = 9;
    public static final int NAS_PROTOCOL_MESSAGE_CM_SERVICE_REQUEST = 10;
    public static final int NAS_PROTOCOL_MESSAGE_IMSI_DETACH_INDICATION = 11;
    public static final int CELLULAR_IDENTIFIER_UNKNOWN = 0;
    public static final int CELLULAR_IDENTIFIER_IMSI = 1;
    public static final int CELLULAR_IDENTIFIER_IMEI = 2;
    public static final int CELLULAR_IDENTIFIER_SUCI = 3;
    public CellularIdentifierDisclosure(int p0, int p1, java.lang.String p2, boolean p3) {}
    public int getNasProtocolMessage() { return 0; }
    public int getCellularIdentifier() { return 0; }
    public java.lang.String getPlmn() { return null; }
    public boolean isEmergency() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CellularIdentifier {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NasProtocolMessage {
    }
}
