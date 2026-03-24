package android.hardware.display;

@android.annotation.SystemApi
public final class BrightnessChangeEvent implements android.os.Parcelable {
    public final float brightness = 0.0f;
    public final long timeStamp = 0L;
    public final java.lang.String packageName = null;
    public final int userId = 0;
    @android.annotation.NonNull
    public final java.lang.String uniqueDisplayId = null;
    public final float[] luxValues = null;
    public final long[] luxTimestamps = null;
    public final float batteryLevel = 0.0f;
    public final float powerBrightnessFactor = 0.0f;
    public final boolean nightMode = false;
    public final int colorTemperature = 0;
    public final boolean reduceBrightColors = false;
    public final int reduceBrightColorsStrength = 0;
    public final float reduceBrightColorsOffset = 0.0f;
    public final float lastBrightness = 0.0f;
    public final boolean isDefaultBrightnessConfig = false;
    public final boolean isUserSetBrightness = false;
    @android.annotation.Nullable
    public final long[] colorValueBuckets = null;
    public final long colorSampleDuration = 0L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.display.BrightnessChangeEvent> CREATOR = null;
    public BrightnessChangeEvent(android.hardware.display.BrightnessChangeEvent p0, boolean p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static class Builder {
        public Builder() {}
        public android.hardware.display.BrightnessChangeEvent.Builder setBrightness(float p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setTimeStamp(long p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setPackageName(java.lang.String p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setUserId(int p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setUniqueDisplayId(java.lang.String p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setLuxValues(float[] p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setLuxTimestamps(long[] p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setBatteryLevel(float p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setPowerBrightnessFactor(float p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setNightMode(boolean p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setColorTemperature(int p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setReduceBrightColors(boolean p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setReduceBrightColorsStrength(int p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setReduceBrightColorsOffset(float p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setLastBrightness(float p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setIsDefaultBrightnessConfig(boolean p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setUserBrightnessPoint(boolean p0) { return null; }
        public android.hardware.display.BrightnessChangeEvent.Builder setColorValues(long[] p0, long p1) { return null; }
        public android.hardware.display.BrightnessChangeEvent build() { return null; }
    }
}
