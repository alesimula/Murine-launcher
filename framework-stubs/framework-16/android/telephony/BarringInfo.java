package android.telephony;

public final class BarringInfo implements android.os.Parcelable {
    public static final int BARRING_SERVICE_TYPE_CS_SERVICE = 0;
    public static final int BARRING_SERVICE_TYPE_PS_SERVICE = 1;
    public static final int BARRING_SERVICE_TYPE_CS_VOICE = 2;
    public static final int BARRING_SERVICE_TYPE_MO_SIGNALLING = 3;
    public static final int BARRING_SERVICE_TYPE_MO_DATA = 4;
    public static final int BARRING_SERVICE_TYPE_CS_FALLBACK = 5;
    public static final int BARRING_SERVICE_TYPE_MMTEL_VOICE = 6;
    public static final int BARRING_SERVICE_TYPE_MMTEL_VIDEO = 7;
    public static final int BARRING_SERVICE_TYPE_EMERGENCY = 8;
    public static final int BARRING_SERVICE_TYPE_SMS = 9;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.BarringInfo> CREATOR = null;
    @android.annotation.SystemApi
    public BarringInfo() {}
    public BarringInfo(android.telephony.CellIdentity p0, android.util.SparseArray<android.telephony.BarringInfo.BarringServiceInfo> p1) {}
    @android.annotation.NonNull
    public android.telephony.BarringInfo.BarringServiceInfo getBarringServiceInfo(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.telephony.BarringInfo createLocationInfoSanitizedCopy() { return null; }
    public BarringInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static final class BarringServiceInfo implements android.os.Parcelable {
        public static final int BARRING_TYPE_NONE = 0;
        public static final int BARRING_TYPE_UNCONDITIONAL = 2;
        public static final int BARRING_TYPE_CONDITIONAL = 1;
        public static final int BARRING_TYPE_UNKNOWN = -1;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.telephony.BarringInfo.BarringServiceInfo> CREATOR = null;
        public BarringServiceInfo(int p0) {}
        public BarringServiceInfo(int p0, boolean p1, int p2, int p3) {}
        public int getBarringType() { return 0; }
        public boolean isConditionallyBarred() { return false; }
        public int getConditionalBarringFactor() { return 0; }
        @android.annotation.SuppressLint("MethodNameUnits")
        public int getConditionalBarringTimeSeconds() { return 0; }
        public boolean isBarred() { return false; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public BarringServiceInfo(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface BarringType {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BarringServiceType {
    }
}
