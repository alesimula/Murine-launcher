package android.service.notification;

public final class ZenDeviceEffects implements android.os.Parcelable {
    public static final int FIELD_GRAYSCALE = 1;
    public static final int FIELD_SUPPRESS_AMBIENT_DISPLAY = 2;
    public static final int FIELD_DIM_WALLPAPER = 4;
    public static final int FIELD_NIGHT_MODE = 8;
    public static final int FIELD_DISABLE_AUTO_BRIGHTNESS = 16;
    public static final int FIELD_DISABLE_TAP_TO_WAKE = 32;
    public static final int FIELD_DISABLE_TILT_TO_WAKE = 64;
    public static final int FIELD_DISABLE_TOUCH = 128;
    public static final int FIELD_MINIMIZE_RADIO_USAGE = 256;
    public static final int FIELD_MAXIMIZE_DOZE = 512;
    public static final int FIELD_EXTRA_EFFECTS = 1024;
    public static final int FIELD_NIGHT_LIGHT = 2048;
    public static final int FIELD_BRIGHTNESS_CAP = 4096;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.notification.ZenDeviceEffects> CREATOR = null;
    public void validate() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.lang.String fieldsToString(int p0) { return null; }
    public boolean shouldDisplayGrayscale() { return false; }
    public boolean shouldSuppressAmbientDisplay() { return false; }
    public boolean shouldDimWallpaper() { return false; }
    public boolean shouldUseNightMode() { return false; }
    public boolean shouldDisableAutoBrightness() { return false; }
    public boolean shouldDisableTapToWake() { return false; }
    public boolean shouldDisableTiltToWake() { return false; }
    public boolean shouldDisableTouch() { return false; }
    public boolean shouldMinimizeRadioUsage() { return false; }
    public boolean shouldMaximizeDoze() { return false; }
    public boolean shouldUseNightLight() { return false; }
    @android.annotation.Nullable
    public java.lang.Float getBrightnessPercentageCap() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getExtraEffects() { return null; }
    public boolean hasEffects() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.service.notification.ZenDeviceEffects p0) {}
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldDisplayGrayscale(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldSuppressAmbientDisplay(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldDimWallpaper(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldUseNightMode(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldDisableAutoBrightness(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldDisableTapToWake(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldDisableTiltToWake(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldDisableTouch(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldMinimizeRadioUsage(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldMaximizeDoze(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setShouldUseNightLight(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setBrightnessPercentageCap(java.lang.Float p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder setExtraEffects(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder addExtraEffects(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder addExtraEffect(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects.Builder add(android.service.notification.ZenDeviceEffects p0) { return null; }
        @android.annotation.NonNull
        public android.service.notification.ZenDeviceEffects build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModifiableField {
    }
}
