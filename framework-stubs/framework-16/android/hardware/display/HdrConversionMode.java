package android.hardware.display;

public final class HdrConversionMode implements android.os.Parcelable {
    public static final int HDR_CONVERSION_UNSUPPORTED = 0;
    public static final int HDR_CONVERSION_PASSTHROUGH = 1;
    public static final int HDR_CONVERSION_SYSTEM = 2;
    public static final int HDR_CONVERSION_FORCE = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.display.HdrConversionMode> CREATOR = null;
    public HdrConversionMode(int p0, int p1) {}
    public HdrConversionMode(int p0) {}
    public int getConversionMode() { return 0; }
    public int getPreferredHdrOutputType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConversionMode {
    }
}
