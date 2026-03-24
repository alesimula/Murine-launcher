package android.hardware.lights;

public final class Light implements android.os.Parcelable {
    public static final int LIGHT_TYPE_MICROPHONE = 8;
    public static final int LIGHT_TYPE_CAMERA = 9;
    public static final int LIGHT_TYPE_INPUT = 10001;
    public static final int LIGHT_TYPE_PLAYER_ID = 10002;
    public static final int LIGHT_TYPE_KEYBOARD_BACKLIGHT = 10003;
    public static final int LIGHT_CAPABILITY_BRIGHTNESS = 1;
    public static final int LIGHT_CAPABILITY_COLOR_RGB = 2;
    @java.lang.Deprecated
    public static final int LIGHT_CAPABILITY_RGB = 0;
    public static final android.os.Parcelable.Creator<android.hardware.lights.Light> CREATOR = null;
    public Light(int p0, int p1, int p2) {}
    public Light(int p0, java.lang.String p1, int p2, int p3, int p4) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int getId() { return 0; }
    public java.lang.String getName() { return null; }
    public int getOrdinal() { return 0; }
    public int getType() { return 0; }
    public int getCapabilities() { return 0; }
    public boolean hasBrightnessControl() { return false; }
    public boolean hasRgbControl() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LightCapability {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LightType {
    }
}
