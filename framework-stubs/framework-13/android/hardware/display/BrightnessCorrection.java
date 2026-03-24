package android.hardware.display;

@android.annotation.SystemApi
public final class BrightnessCorrection implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.display.BrightnessCorrection> CREATOR = null;
    public static android.hardware.display.BrightnessCorrection createScaleAndTranslateLog(float p0, float p1) { return null; }
    public float apply(float p0) { return 0.0f; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public void saveToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    public static android.hardware.display.BrightnessCorrection loadFromXml(android.util.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }

    private static interface BrightnessCorrectionImplementation {
        public float apply(float p0);
        public java.lang.String toString();
        public void writeToParcel(android.os.Parcel p0);
        public void saveToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException;
    }

    private static class ScaleAndTranslateLog implements android.hardware.display.BrightnessCorrection.BrightnessCorrectionImplementation {
        ScaleAndTranslateLog(float p0, float p1) {}
        public float apply(float p0) { return 0.0f; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0) {}
        public void saveToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
        static android.hardware.display.BrightnessCorrection readFromParcel(android.os.Parcel p0) { return null; }
        static android.hardware.display.BrightnessCorrection loadFromXml(android.util.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    }
}
