package android.hardware.display;

@android.annotation.SystemApi
public final class BrightnessConfiguration implements android.os.Parcelable {
    public static final long SHORT_TERM_TIMEOUT_UNSET = -1L;
    public static final android.os.Parcelable.Creator<android.hardware.display.BrightnessConfiguration> CREATOR = null;
    public android.util.Pair<float[], float[]> getCurve() { return null; }
    public android.hardware.display.BrightnessCorrection getCorrectionByPackageName(java.lang.String p0) { return null; }
    public android.hardware.display.BrightnessCorrection getCorrectionByCategory(int p0) { return null; }
    public java.lang.String getDescription() { return null; }
    public boolean shouldCollectColorSamples() { return false; }
    public long getShortTermModelTimeoutMillis() { return 0L; }
    public float getShortTermModelUpperLuxMultiplier() { return 0.0f; }
    public float getShortTermModelLowerLuxMultiplier() { return 0.0f; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void saveToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    public static android.hardware.display.BrightnessConfiguration loadFromXml(android.util.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }

    public static class Builder {
        public Builder(float[] p0, float[] p1) {}
        public int getMaxCorrectionsByPackageName() { return 0; }
        public int getMaxCorrectionsByCategory() { return 0; }
        public android.hardware.display.BrightnessConfiguration.Builder addCorrectionByPackageName(java.lang.String p0, android.hardware.display.BrightnessCorrection p1) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder addCorrectionByCategory(int p0, android.hardware.display.BrightnessCorrection p1) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder setDescription(java.lang.String p0) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder setShouldCollectColorSamples(boolean p0) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder setShortTermModelTimeoutMillis(long p0) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder setShortTermModelUpperLuxMultiplier(float p0) { return null; }
        public android.hardware.display.BrightnessConfiguration.Builder setShortTermModelLowerLuxMultiplier(float p0) { return null; }
        public android.hardware.display.BrightnessConfiguration build() { return null; }
    }
}
