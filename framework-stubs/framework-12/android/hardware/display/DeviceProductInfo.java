package android.hardware.display;

public final class DeviceProductInfo implements android.os.Parcelable {
    public static final int CONNECTION_TO_SINK_UNKNOWN = 0;
    public static final int CONNECTION_TO_SINK_BUILT_IN = 1;
    public static final int CONNECTION_TO_SINK_DIRECT = 2;
    public static final int CONNECTION_TO_SINK_TRANSITIVE = 3;
    private final java.lang.String mName = null;
    private final java.lang.String mManufacturerPnpId = null;
    private final java.lang.String mProductId = null;
    private final java.lang.Integer mModelYear = null;
    private final android.hardware.display.DeviceProductInfo.ManufactureDate mManufactureDate = null;
    private final int mConnectionToSinkType = 0;
    public static final android.os.Parcelable.Creator<android.hardware.display.DeviceProductInfo> CREATOR = null;
    public DeviceProductInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.Integer p3, android.hardware.display.DeviceProductInfo.ManufactureDate p4, int p5) {}
    public DeviceProductInfo(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) {}
    private DeviceProductInfo(android.os.Parcel p0) {}
    public java.lang.String getName() { return null; }
    public java.lang.String getManufacturerPnpId() { return null; }
    public java.lang.String getProductId() { return null; }
    public int getModelYear() { return 0; }
    public int getManufactureYear() { return 0; }
    public int getManufactureWeek() { return 0; }
    public android.hardware.display.DeviceProductInfo.ManufactureDate getManufactureDate() { return null; }
    public int getConnectionToSinkType() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionToSinkType {
    }

    public static class ManufactureDate implements android.os.Parcelable {
        private final java.lang.Integer mWeek = null;
        private final java.lang.Integer mYear = null;
        public static final android.os.Parcelable.Creator<android.hardware.display.DeviceProductInfo.ManufactureDate> CREATOR = null;
        public ManufactureDate(java.lang.Integer p0, java.lang.Integer p1) {}
        protected ManufactureDate(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.lang.Integer getYear() { return null; }
        public java.lang.Integer getWeek() { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
