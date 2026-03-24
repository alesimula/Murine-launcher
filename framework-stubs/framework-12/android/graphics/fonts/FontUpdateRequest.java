package android.graphics.fonts;

public final class FontUpdateRequest implements android.os.Parcelable {
    public static final int TYPE_UPDATE_FONT_FILE = 0;
    public static final int TYPE_UPDATE_FONT_FAMILY = 1;
    public static final android.os.Parcelable.Creator<android.graphics.fonts.FontUpdateRequest> CREATOR = null;
    private final int mType = 0;
    private final android.os.ParcelFileDescriptor mFd = null;
    private final byte[] mSignature = null;
    private final android.graphics.fonts.FontUpdateRequest.Family mFontFamily = null;
    public FontUpdateRequest(android.os.ParcelFileDescriptor p0, byte[] p1) {}
    public FontUpdateRequest(android.graphics.fonts.FontUpdateRequest.Family p0) {}
    public FontUpdateRequest(java.lang.String p0, java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> p1) {}
    private static android.graphics.fonts.FontUpdateRequest.Family createFontFamily(java.lang.String p0, java.util.List<android.graphics.fonts.FontFamilyUpdateRequest.Font> p1) { return null; }
    protected FontUpdateRequest(android.os.Parcel p0) {}
    public int getType() { return 0; }
    public android.os.ParcelFileDescriptor getFd() { return null; }
    public byte[] getSignature() { return null; }
    public android.graphics.fonts.FontUpdateRequest.Family getFontFamily() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static int getAttributeValueInt(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, int p2) { return 0; }

    public static final class Family implements android.os.Parcelable {
        private static final java.lang.String TAG_FAMILY = "family";
        private static final java.lang.String ATTR_NAME = "name";
        private static final java.lang.String TAG_FONT = "font";
        private final java.lang.String mName = null;
        private final java.util.List<android.graphics.fonts.FontUpdateRequest.Font> mFonts = null;
        public static final android.os.Parcelable.Creator<android.graphics.fonts.FontUpdateRequest.Family> CREATOR = null;
        public Family(java.lang.String p0, java.util.List<android.graphics.fonts.FontUpdateRequest.Font> p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public static void writeFamilyToXml(android.util.TypedXmlSerializer p0, android.graphics.fonts.FontUpdateRequest.Family p1) throws java.io.IOException {}
        public static android.graphics.fonts.FontUpdateRequest.Family readFromXml(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
        public java.lang.String getName() { return null; }
        public java.util.List<android.graphics.fonts.FontUpdateRequest.Font> getFonts() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class Font implements android.os.Parcelable {
        private static final java.lang.String ATTR_INDEX = "index";
        private static final java.lang.String ATTR_WEIGHT = "weight";
        private static final java.lang.String ATTR_SLANT = "slant";
        private static final java.lang.String ATTR_AXIS = "axis";
        private static final java.lang.String ATTR_POSTSCRIPT_NAME = "name";
        private final java.lang.String mPostScriptName = null;
        private final android.graphics.fonts.FontStyle mFontStyle = null;
        private final int mIndex = 0;
        private final java.lang.String mFontVariationSettings = null;
        public static final android.os.Parcelable.Creator<android.graphics.fonts.FontUpdateRequest.Font> CREATOR = null;
        public Font(java.lang.String p0, android.graphics.fonts.FontStyle p1, int p2, java.lang.String p3) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public static void writeToXml(android.util.TypedXmlSerializer p0, android.graphics.fonts.FontUpdateRequest.Font p1) throws java.io.IOException {}
        public static android.graphics.fonts.FontUpdateRequest.Font readFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException { return null; }
        public java.lang.String getPostScriptName() { return null; }
        public android.graphics.fonts.FontStyle getFontStyle() { return null; }
        public int getIndex() { return 0; }
        public java.lang.String getFontVariationSettings() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
