package android.hardware.display;

public final class BrightnessInfo implements android.os.Parcelable {
    public static final int HIGH_BRIGHTNESS_MODE_OFF = 0;
    public static final int HIGH_BRIGHTNESS_MODE_SUNLIGHT = 1;
    public static final int HIGH_BRIGHTNESS_MODE_HDR = 2;
    public final float brightness = 0.0f;
    public final float brightnessMinimum = 0.0f;
    public final float brightnessMaximum = 0.0f;
    public final int highBrightnessMode = 0;
    public static final android.os.Parcelable.Creator<android.hardware.display.BrightnessInfo> CREATOR = null;
    public BrightnessInfo(float p0, float p1, float p2, int p3) {}
    public static java.lang.String hbmToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private BrightnessInfo(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HighBrightnessMode {
    }
}
