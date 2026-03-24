package android.ranging.ble.cs;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_cs_enabled")
public final class BleCsRangingParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.ble.cs.BleCsRangingParams> CREATOR = null;
    public static final int LOCATION_TYPE_INDOOR = 1;
    public static final int LOCATION_TYPE_OUTDOOR = 2;
    public static final int LOCATION_TYPE_UNKNOWN = 0;
    public static final int SIGHT_TYPE_LINE_OF_SIGHT = 1;
    public static final int SIGHT_TYPE_NON_LINE_OF_SIGHT = 2;
    public static final int SIGHT_TYPE_UNKNOWN = 0;
    BleCsRangingParams() {}
    public int describeContents() { return 0; }
    public int getLocationType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getPeerBluetoothAddress() { return null; }
    public int getRangingUpdateRate() { return 0; }
    public int getSecurityLevel() { return 0; }
    public int getSightType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.ranging.ble.cs.BleCsRangingParams build() { return null; }
        @android.annotation.NonNull
        public android.ranging.ble.cs.BleCsRangingParams.Builder setLocationType(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.ble.cs.BleCsRangingParams.Builder setRangingUpdateRate(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.ble.cs.BleCsRangingParams.Builder setSecurityLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.ble.cs.BleCsRangingParams.Builder setSightType(int p0) { return null; }
    }
}
