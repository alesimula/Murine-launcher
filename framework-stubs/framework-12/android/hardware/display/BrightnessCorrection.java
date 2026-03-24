package android.hardware.display;

@android.annotation.SystemApi
public final class BrightnessCorrection implements android.os.Parcelable {
    private static final int SCALE_AND_TRANSLATE_LOG = 1;
    private static final java.lang.String TAG_SCALE_AND_TRANSLATE_LOG = "scale-and-translate-log";
    private android.hardware.display.BrightnessCorrection.BrightnessCorrectionImplementation mImplementation;
    public static final android.os.Parcelable.Creator<android.hardware.display.BrightnessCorrection> CREATOR = null;
    private BrightnessCorrection(android.hardware.display.BrightnessCorrection.BrightnessCorrectionImplementation p0) {}
    public static android.hardware.display.BrightnessCorrection createScaleAndTranslateLog(float p0, float p1) { return null; }
    public float apply(float p0) { return 0.0f; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public void saveToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    public static android.hardware.display.BrightnessCorrection loadFromXml(android.util.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static float loadFloatFromXml(android.util.TypedXmlPullParser p0, java.lang.String p1) { return 0.0f; }

    private static interface BrightnessCorrectionImplementation {
        public float apply(float p0);
        public java.lang.String toString();
        public void writeToParcel(android.os.Parcel p0);
        public void saveToXml(android.util.TypedXmlSerializer p0) throws java.io.IOException;
    }

    private static class ScaleAndTranslateLog implements android.hardware.display.BrightnessCorrection.BrightnessCorrectionImplementation {
        private static final float MIN_SCALE = 0.5f;
        private static final float MAX_SCALE = 2.0f;
        private static final float MIN_TRANSLATE = -0.6000000238418579f;
        private static final float MAX_TRANSLATE = 0.699999988079071f;
        private static final java.lang.String ATTR_SCALE = "scale";
        private static final java.lang.String ATTR_TRANSLATE = "translate";
        private final float mScale = 0.0f;
        private final float mTranslate = 0.0f;
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
