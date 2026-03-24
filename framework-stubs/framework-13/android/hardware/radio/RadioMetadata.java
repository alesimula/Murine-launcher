package android.hardware.radio;

@android.annotation.SystemApi
public final class RadioMetadata implements android.os.Parcelable {
    public static final java.lang.String METADATA_KEY_RDS_PI = "android.hardware.radio.metadata.RDS_PI";
    public static final java.lang.String METADATA_KEY_RDS_PS = "android.hardware.radio.metadata.RDS_PS";
    public static final java.lang.String METADATA_KEY_RDS_PTY = "android.hardware.radio.metadata.RDS_PTY";
    public static final java.lang.String METADATA_KEY_RBDS_PTY = "android.hardware.radio.metadata.RBDS_PTY";
    public static final java.lang.String METADATA_KEY_RDS_RT = "android.hardware.radio.metadata.RDS_RT";
    public static final java.lang.String METADATA_KEY_TITLE = "android.hardware.radio.metadata.TITLE";
    public static final java.lang.String METADATA_KEY_ARTIST = "android.hardware.radio.metadata.ARTIST";
    public static final java.lang.String METADATA_KEY_ALBUM = "android.hardware.radio.metadata.ALBUM";
    public static final java.lang.String METADATA_KEY_GENRE = "android.hardware.radio.metadata.GENRE";
    public static final java.lang.String METADATA_KEY_ICON = "android.hardware.radio.metadata.ICON";
    public static final java.lang.String METADATA_KEY_ART = "android.hardware.radio.metadata.ART";
    public static final java.lang.String METADATA_KEY_CLOCK = "android.hardware.radio.metadata.CLOCK";
    public static final java.lang.String METADATA_KEY_PROGRAM_NAME = "android.hardware.radio.metadata.PROGRAM_NAME";
    public static final java.lang.String METADATA_KEY_DAB_ENSEMBLE_NAME = "android.hardware.radio.metadata.DAB_ENSEMBLE_NAME";
    public static final java.lang.String METADATA_KEY_DAB_ENSEMBLE_NAME_SHORT = "android.hardware.radio.metadata.DAB_ENSEMBLE_NAME_SHORT";
    public static final java.lang.String METADATA_KEY_DAB_SERVICE_NAME = "android.hardware.radio.metadata.DAB_SERVICE_NAME";
    public static final java.lang.String METADATA_KEY_DAB_SERVICE_NAME_SHORT = "android.hardware.radio.metadata.DAB_SERVICE_NAME_SHORT";
    public static final java.lang.String METADATA_KEY_DAB_COMPONENT_NAME = "android.hardware.radio.metadata.DAB_COMPONENT_NAME";
    public static final java.lang.String METADATA_KEY_DAB_COMPONENT_NAME_SHORT = "android.hardware.radio.metadata.DAB_COMPONENT_NAME_SHORT";
    public static final android.os.Parcelable.Creator<android.hardware.radio.RadioMetadata> CREATOR = null;
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    RadioMetadata() {}
    public java.lang.String toString() { return null; }
    public boolean containsKey(java.lang.String p0) { return false; }
    public java.lang.String getString(java.lang.String p0) { return null; }
    public int getInt(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public android.graphics.Bitmap getBitmap(java.lang.String p0) { return null; }
    public int getBitmapId(java.lang.String p0) { return 0; }
    public android.hardware.radio.RadioMetadata.Clock getClock(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int size() { return 0; }
    public java.util.Set<java.lang.String> keySet() { return null; }
    public static java.lang.String getKeyFromNativeKey(int p0) { return null; }
    int putIntFromNative(int p0, int p1) { return 0; }
    int putStringFromNative(int p0, java.lang.String p1) { return 0; }
    int putBitmapFromNative(int p0, byte[] p1) { return 0; }
    int putClockFromNative(int p0, long p1, int p2) { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.hardware.radio.RadioMetadata p0) {}
        public Builder(android.hardware.radio.RadioMetadata p0, int p1) {}
        public android.hardware.radio.RadioMetadata.Builder putString(java.lang.String p0, java.lang.String p1) { return null; }
        public android.hardware.radio.RadioMetadata.Builder putInt(java.lang.String p0, int p1) { return null; }
        public android.hardware.radio.RadioMetadata.Builder putBitmap(java.lang.String p0, android.graphics.Bitmap p1) { return null; }
        public android.hardware.radio.RadioMetadata.Builder putClock(java.lang.String p0, long p1, int p2) { return null; }
        public android.hardware.radio.RadioMetadata build() { return null; }
    }

    @android.annotation.SystemApi
    public static final class Clock implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioMetadata.Clock> CREATOR = null;
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public Clock(long p0, int p1) {}
        public long getUtcEpochSeconds() { return 0L; }
        public int getTimezoneOffsetMinutes() { return 0; }
    }
}
