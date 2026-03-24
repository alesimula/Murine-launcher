package android.net.wifi.rtt;

public final class CivicLocation implements android.os.Parcelable {
    private static final int ADDRESS_LINE_0_ROOM_DESK_FLOOR = 0;
    private static final int ADDRESS_LINE_1_NUMBER_ROAD_SUFFIX_APT = 1;
    private static final int ADDRESS_LINE_2_CITY = 2;
    private static final int ADDRESS_LINE_3_STATE_POSTAL_CODE = 3;
    private static final int ADDRESS_LINE_4_COUNTRY = 4;
    private static final int MIN_CIVIC_BUFFER_SIZE = 3;
    private static final int MAX_CIVIC_BUFFER_SIZE = 256;
    private static final int COUNTRY_CODE_LENGTH = 2;
    private static final int BYTE_MASK = 255;
    private static final int TLV_TYPE_INDEX = 0;
    private static final int TLV_LENGTH_INDEX = 1;
    private static final int TLV_VALUE_INDEX = 2;
    private final boolean mIsValid = false;
    private final java.lang.String mCountryCode = null;
    private android.util.SparseArray<java.lang.String> mCivicAddressElements;
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.CivicLocation> CREATOR = null;
    public CivicLocation(byte[] p0, java.lang.String p1) {}
    private CivicLocation(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private boolean parseCivicTLVs(byte[] p0) { return false; }
    public java.lang.String getCivicElementValue(int p0) { return null; }
    public android.util.SparseArray<java.lang.String> toSparseArray() { return null; }
    public java.lang.String toString() { return null; }
    public android.location.Address toAddress() { return null; }
    private java.lang.String formatAddressElement(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    private boolean isSparseArrayStringEqual(android.util.SparseArray<java.lang.String> p0, android.util.SparseArray<java.lang.String> p1) { return false; }
    private int[] getSparseArrayKeys(android.util.SparseArray<java.lang.String> p0) { return null; }
    private java.lang.String[] getSparseArrayValues(android.util.SparseArray<java.lang.String> p0) { return null; }
}
