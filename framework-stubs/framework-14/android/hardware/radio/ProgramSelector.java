package android.hardware.radio;

@android.annotation.SystemApi
public final class ProgramSelector implements android.os.Parcelable {
    @java.lang.Deprecated
    public static final int PROGRAM_TYPE_INVALID = 0;
    @java.lang.Deprecated
    public static final int PROGRAM_TYPE_AM = 1;
    @java.lang.Deprecated
    public static final int PROGRAM_TYPE_FM = 2;
    @java.lang.Deprecated
    public static final int PROGRAM_TYPE_AM_HD = 3;
    @java.lang.Deprecated
    public static final int PROGRAM_TYPE_FM_HD = 4;
    @java.lang.Deprecated
    public static final int PROGRAM_TYPE_DAB = 5;
    @java.lang.Deprecated
    public static final int PROGRAM_TYPE_DRMO = 6;
    @java.lang.Deprecated
    public static final int PROGRAM_TYPE_SXM = 7;
    @java.lang.Deprecated
    public static final int PROGRAM_TYPE_VENDOR_START = 1000;
    @java.lang.Deprecated
    public static final int PROGRAM_TYPE_VENDOR_END = 1999;
    public static final int IDENTIFIER_TYPE_INVALID = 0;
    public static final int IDENTIFIER_TYPE_AMFM_FREQUENCY = 1;
    public static final int IDENTIFIER_TYPE_RDS_PI = 2;
    public static final int IDENTIFIER_TYPE_HD_STATION_ID_EXT = 3;
    @java.lang.Deprecated
    public static final int IDENTIFIER_TYPE_HD_SUBCHANNEL = 4;
    public static final int IDENTIFIER_TYPE_HD_STATION_NAME = 10004;
    @java.lang.Deprecated
    public static final int IDENTIFIER_TYPE_DAB_SIDECC = 5;
    @java.lang.Deprecated
    public static final int IDENTIFIER_TYPE_DAB_SID_EXT = 5;
    public static final int IDENTIFIER_TYPE_DAB_ENSEMBLE = 6;
    public static final int IDENTIFIER_TYPE_DAB_SCID = 7;
    public static final int IDENTIFIER_TYPE_DAB_FREQUENCY = 8;
    public static final int IDENTIFIER_TYPE_DRMO_SERVICE_ID = 9;
    public static final int IDENTIFIER_TYPE_DRMO_FREQUENCY = 10;
    @java.lang.Deprecated
    public static final int IDENTIFIER_TYPE_DRMO_MODULATION = 11;
    public static final int IDENTIFIER_TYPE_SXM_SERVICE_ID = 12;
    public static final int IDENTIFIER_TYPE_SXM_CHANNEL = 13;
    public static final int IDENTIFIER_TYPE_DAB_DMB_SID_EXT = 14;
    public static final int IDENTIFIER_TYPE_VENDOR_START = 1000;
    public static final int IDENTIFIER_TYPE_VENDOR_END = 1999;
    @java.lang.Deprecated
    public static final int IDENTIFIER_TYPE_VENDOR_PRIMARY_START = 1000;
    @java.lang.Deprecated
    public static final int IDENTIFIER_TYPE_VENDOR_PRIMARY_END = 1999;
    public static final android.os.Parcelable.Creator<android.hardware.radio.ProgramSelector> CREATOR = null;
    public ProgramSelector(int p0, android.hardware.radio.ProgramSelector.Identifier p1, android.hardware.radio.ProgramSelector.Identifier[] p2, long[] p3) {}
    @java.lang.Deprecated
    public int getProgramType() { return 0; }
    public android.hardware.radio.ProgramSelector.Identifier getPrimaryId() { return null; }
    public android.hardware.radio.ProgramSelector.Identifier[] getSecondaryIds() { return null; }
    public long getFirstId(int p0) { return 0L; }
    public android.hardware.radio.ProgramSelector.Identifier[] getAllIds(int p0) { return null; }
    @java.lang.Deprecated
    public long[] getVendorIds() { return null; }
    public android.hardware.radio.ProgramSelector withSecondaryPreferred(android.hardware.radio.ProgramSelector.Identifier p0) { return null; }
    public static android.hardware.radio.ProgramSelector createAmFmSelector(int p0, int p1) { return null; }
    public static android.hardware.radio.ProgramSelector createAmFmSelector(int p0, int p1, int p2) { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean strictEquals(java.lang.Object p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Identifier implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.ProgramSelector.Identifier> CREATOR = null;
        public Identifier(int p0, long p1) {}
        public int getType() { return 0; }
        public boolean isCategoryType() { return false; }
        public long getValue() { return 0L; }
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IdentifierType {
    }

    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProgramType {
    }
}
