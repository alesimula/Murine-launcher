package android.net.wifi.rtt;

public final class ResponderLocation implements android.os.Parcelable {
    public static final int ALTITUDE_FLOORS = 2;
    public static final int ALTITUDE_METERS = 1;
    public static final int ALTITUDE_UNDEFINED = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.ResponderLocation> CREATOR = null;
    public static final int DATUM_NAD83_MLLW = 3;
    public static final int DATUM_NAD83_NAV88 = 2;
    public static final int DATUM_UNDEFINED = 0;
    public static final int DATUM_WGS84 = 1;
    public static final int LCI_VERSION_1 = 1;
    public static final int LOCATION_FIXED = 0;
    public static final int LOCATION_MOVEMENT_UNKNOWN = 2;
    public static final int LOCATION_RESERVED = 3;
    public static final int LOCATION_VARIABLE = 1;
    ResponderLocation() {}
    public int describeContents() { return 0; }
    public double getAltitude() { return 0.0; }
    public int getAltitudeType() { return 0; }
    public double getAltitudeUncertainty() { return 0.0; }
    public java.util.List<android.net.MacAddress> getColocatedBssids() { return null; }
    public int getDatum() { return 0; }
    public int getExpectedToMove() { return 0; }
    public double getFloorNumber() { return 0.0; }
    public double getHeightAboveFloorMeters() { return 0.0; }
    public double getHeightAboveFloorUncertaintyMeters() { return 0.0; }
    public double getLatitude() { return 0.0; }
    public double getLatitudeUncertainty() { return 0.0; }
    public int getLciVersion() { return 0; }
    public double getLongitude() { return 0.0; }
    public double getLongitudeUncertainty() { return 0.0; }
    @android.annotation.Nullable
    public java.lang.String getMapImageMimeType() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getMapImageUri() { return null; }
    public boolean getRegisteredLocationAgreementIndication() { return false; }
    public boolean isLciSubelementValid() { return false; }
    public boolean isZaxisSubelementValid() { return false; }
    @android.annotation.Nullable
    public android.location.Address toCivicLocationAddress() { return null; }
    @android.annotation.Nullable
    public android.util.SparseArray<java.lang.String> toCivicLocationSparseArray() { return null; }
    @android.annotation.NonNull
    public android.location.Location toLocation() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean getExtraInfoOnAssociationIndication() { return false; }
}
