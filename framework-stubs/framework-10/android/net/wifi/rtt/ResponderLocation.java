package android.net.wifi.rtt;

public final class ResponderLocation implements android.os.Parcelable {
    private static final int BYTE_MASK = 255;
    private static final int LSB_IN_BYTE = 1;
    private static final int MSB_IN_BYTE = 128;
    private static final int MIN_BUFFER_SIZE = 3;
    private static final int MAX_BUFFER_SIZE = 256;
    private static final byte MEASUREMENT_TOKEN_AUTONOMOUS = 1;
    private static final byte MEASUREMENT_REPORT_MODE = 0;
    private static final byte MEASUREMENT_TYPE_LCI = 8;
    private static final byte MEASUREMENT_TYPE_LCR = 11;
    private static final byte SUBELEMENT_LCI = 0;
    private static final byte SUBELEMENT_Z = 4;
    private static final byte SUBELEMENT_USAGE = 6;
    private static final byte SUBELEMENT_BSSID_LIST = 7;
    private static final int SUBELEMENT_LCI_LENGTH = 16;
    private static final int SUBELEMENT_Z_LENGTH = 6;
    private static final int SUBELEMENT_USAGE_LENGTH1 = 1;
    private static final int SUBELEMENT_USAGE_LENGTH3 = 3;
    private static final int SUBELEMENT_BSSID_LIST_MIN_BUFFER_LENGTH = 1;
    private static final byte[] LEAD_LCI_ELEMENT_BYTES = null;
    private static final int[] SUBELEMENT_LCI_BIT_FIELD_LENGTHS = null;
    private static final int LATLNG_FRACTION_BITS = 25;
    private static final int LATLNG_UNCERTAINTY_BASE = 8;
    private static final int ALTITUDE_FRACTION_BITS = 8;
    private static final int ALTITUDE_UNCERTAINTY_BASE = 21;
    private static final double LAT_ABS_LIMIT = 90.0;
    private static final double LNG_ABS_LIMIT = 180.0;
    private static final int UNCERTAINTY_UNDEFINED = 0;
    private static final int SUBELEMENT_LCI_LAT_UNCERTAINTY_INDEX = 0;
    private static final int SUBELEMENT_LCI_LAT_INDEX = 1;
    private static final int SUBELEMENT_LCI_LNG_UNCERTAINTY_INDEX = 2;
    private static final int SUBELEMENT_LCI_LNG_INDEX = 3;
    private static final int SUBELEMENT_LCI_ALT_TYPE_INDEX = 4;
    private static final int SUBELEMENT_LCI_ALT_UNCERTAINTY_INDEX = 5;
    private static final int SUBELEMENT_LCI_ALT_INDEX = 6;
    private static final int SUBELEMENT_LCI_DATUM_INDEX = 7;
    private static final int SUBELEMENT_LCI_REGLOC_AGREEMENT_INDEX = 8;
    private static final int SUBELEMENT_LCI_REGLOC_DSE_INDEX = 9;
    private static final int SUBELEMENT_LCI_DEPENDENT_STA_INDEX = 10;
    private static final int SUBELEMENT_LCI_VERSION_INDEX = 11;
    public static final int ALTITUDE_UNDEFINED = 0;
    public static final int ALTITUDE_METERS = 1;
    public static final int ALTITUDE_FLOORS = 2;
    public static final int DATUM_UNDEFINED = 0;
    public static final int DATUM_WGS84 = 1;
    public static final int DATUM_NAD83_NAV88 = 2;
    public static final int DATUM_NAD83_MLLW = 3;
    public static final int LCI_VERSION_1 = 1;
    private static final java.lang.String LOCATION_PROVIDER = "WiFi Access Point";
    private static final int[] SUBELEMENT_Z_BIT_FIELD_LENGTHS = null;
    private static final int Z_FLOOR_NUMBER_FRACTION_BITS = 4;
    private static final int Z_FLOOR_HEIGHT_FRACTION_BITS = 12;
    private static final int Z_MAX_HEIGHT_UNCERTAINTY_FACTOR = 25;
    private static final int SUBELEMENT_Z_LAT_EXPECTED_TO_MOVE_INDEX = 0;
    private static final int SUBELEMENT_Z_FLOOR_NUMBER_INDEX = 1;
    private static final int SUBELEMENT_Z_HEIGHT_ABOVE_FLOOR_INDEX = 2;
    private static final int SUBELEMENT_Z_HEIGHT_ABOVE_FLOOR_UNCERTAINTY_INDEX = 3;
    private static final int SUBELEMENT_USAGE_MASK_RETRANSMIT = 1;
    private static final int SUBELEMENT_USAGE_MASK_RETENTION_EXPIRES = 2;
    private static final int SUBELEMENT_USAGE_MASK_STA_LOCATION_POLICY = 4;
    private static final int SUBELEMENT_USAGE_PARAMS_INDEX = 0;
    private static final int SUBELEMENT_BSSID_MAX_INDICATOR_INDEX = 0;
    private static final int SUBELEMENT_BSSID_LIST_INDEX = 1;
    private static final int BYTES_IN_A_BSSID = 6;
    public static final int LOCATION_FIXED = 0;
    public static final int LOCATION_VARIABLE = 1;
    public static final int LOCATION_MOVEMENT_UNKNOWN = 2;
    public static final int LOCATION_RESERVED = 3;
    private static final byte SUBELEMENT_LOCATION_CIVIC = 0;
    private static final byte SUBELEMENT_MAP_IMAGE = 5;
    private static final int SUBELEMENT_LOCATION_CIVIC_MIN_LENGTH = 2;
    private static final int SUBELEMENT_LOCATION_CIVIC_MAX_LENGTH = 256;
    private static final int SUBELEMENT_MAP_IMAGE_URL_MAX_LENGTH = 256;
    private static final byte[] LEAD_LCR_ELEMENT_BYTES = null;
    private static final int CIVIC_COUNTRY_CODE_INDEX = 0;
    private static final int CIVIC_TLV_LIST_INDEX = 2;
    private static final int SUBELEMENT_IMAGE_MAP_TYPE_INDEX = 0;
    private static final int MAP_TYPE_URL_DEFINED = 0;
    private static final java.lang.String[] SUPPORTED_IMAGE_FILE_EXTENSIONS = null;
    private final boolean mIsValid = false;
    private boolean mIsLciValid;
    private boolean mIsZValid;
    private boolean mIsUsageValid;
    private boolean mIsBssidListValid;
    private boolean mIsLocationCivicValid;
    private boolean mIsMapImageValid;
    private double mLatitudeUncertainty;
    private double mLatitude;
    private double mLongitudeUncertainty;
    private double mLongitude;
    private int mAltitudeType;
    private double mAltitudeUncertainty;
    private double mAltitude;
    private int mDatum;
    private boolean mLciRegisteredLocationAgreement;
    private boolean mLciRegisteredLocationDse;
    private boolean mLciDependentStation;
    private int mLciVersion;
    private int mExpectedToMove;
    private double mFloorNumber;
    private double mHeightAboveFloorMeters;
    private double mHeightAboveFloorUncertaintyMeters;
    private boolean mUsageRetransmit;
    private boolean mUsageRetentionExpires;
    private boolean mUsageExtraInfoOnAssociation;
    private java.util.ArrayList<android.net.MacAddress> mBssidList;
    private java.lang.String mCivicLocationCountryCode;
    private java.lang.String mCivicLocationString;
    private android.net.wifi.rtt.CivicLocation mCivicLocation;
    private int mMapImageType;
    private android.net.Uri mMapImageUri;
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.ResponderLocation> CREATOR = null;
    public ResponderLocation(byte[] p0, byte[] p1) {}
    private ResponderLocation(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private boolean parseInformationElementBuffer(int p0, byte[] p1, byte[] p2) { return false; }
    private boolean parseSubelementLci(byte[] p0) { return false; }
    private double decodeLciLatLng(long[] p0, int[] p1, int p2, double p3) { return 0.0; }
    private double decodeLciLatLngUncertainty(long p0) { return 0.0; }
    private double decodeLciAltUncertainty(long p0) { return 0.0; }
    private boolean parseSubelementZ(byte[] p0) { return false; }
    private double decodeZUnsignedToSignedValue(long[] p0, int[] p1, int p2, int p3) { return 0.0; }
    private boolean parseSubelementUsage(byte[] p0) { return false; }
    private boolean parseSubelementBssidList(byte[] p0) { return false; }
    private boolean parseSubelementLocationCivic(byte[] p0) { return false; }
    private boolean parseSubelementMapImage(byte[] p0) { return false; }
    private java.lang.String imageTypeToMime(int p0, java.lang.String p1) { return null; }
    private long[] getFieldData(byte[] p0, int[] p1) { return null; }
    private int getBitAtBitOffsetInByteArray(byte[] p0, int p1) { return 0; }
    private void swapEndianByteByByte(byte[] p0) {}
    private void setLciSubelementDefaults() {}
    private void setZaxisSubelementDefaults() {}
    private void setUsageSubelementDefaults() {}
    private void setBssidListSubelementDefaults() {}
    public void setCivicLocationSubelementDefaults() {}
    private void setMapImageSubelementDefaults() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    public boolean isLciSubelementValid() { return false; }
    public double getLatitudeUncertainty() { return 0.0; }
    public double getLatitude() { return 0.0; }
    public double getLongitudeUncertainty() { return 0.0; }
    public double getLongitude() { return 0.0; }
    public int getAltitudeType() { return 0; }
    public double getAltitudeUncertainty() { return 0.0; }
    public double getAltitude() { return 0.0; }
    public int getDatum() { return 0; }
    public boolean getRegisteredLocationAgreementIndication() { return false; }
    public boolean getRegisteredLocationDseIndication() { return false; }
    public boolean getDependentStationIndication() { return false; }
    public int getLciVersion() { return 0; }
    public android.location.Location toLocation() { return null; }
    public boolean isZaxisSubelementValid() { return false; }
    public int getExpectedToMove() { return 0; }
    public double getFloorNumber() { return 0.0; }
    public double getHeightAboveFloorMeters() { return 0.0; }
    public double getHeightAboveFloorUncertaintyMeters() { return 0.0; }
    public boolean getRetransmitPolicyIndication() { return false; }
    public boolean getRetentionExpiresIndication() { return false; }
    @android.annotation.SystemApi
    public boolean getExtraInfoOnAssociationIndication() { return false; }
    public java.util.List<android.net.MacAddress> getColocatedBssids() { return null; }
    public android.location.Address toCivicLocationAddress() { return null; }
    public android.util.SparseArray toCivicLocationSparseArray() { return null; }
    public java.lang.String getCivicLocationCountryCode() { return null; }
    public java.lang.String getCivicLocationElementValue(int p0) { return null; }
    public java.lang.String getMapImageMimeType() { return null; }
    public android.net.Uri getMapImageUri() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ExpectedToMoveType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DatumType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AltitudeType {
    }
}
