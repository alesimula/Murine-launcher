package android.print;

public final class PrinterCapabilitiesInfo implements android.os.Parcelable {
    public static final int DEFAULT_UNDEFINED = -1;
    private static final int PROPERTY_MEDIA_SIZE = 0;
    private static final int PROPERTY_RESOLUTION = 1;
    private static final int PROPERTY_COLOR_MODE = 2;
    private static final int PROPERTY_DUPLEX_MODE = 3;
    private static final int PROPERTY_COUNT = 4;
    private static final android.print.PrintAttributes.Margins DEFAULT_MARGINS = null;
    private android.print.PrintAttributes.Margins mMinMargins;
    private java.util.List<android.print.PrintAttributes.MediaSize> mMediaSizes;
    private java.util.List<android.print.PrintAttributes.Resolution> mResolutions;
    private int mColorModes;
    private int mDuplexModes;
    private final int[] mDefaults = null;
    public static final android.os.Parcelable.Creator<android.print.PrinterCapabilitiesInfo> CREATOR = null;
    public PrinterCapabilitiesInfo() {}
    public PrinterCapabilitiesInfo(android.print.PrinterCapabilitiesInfo p0) {}
    public void copyFrom(android.print.PrinterCapabilitiesInfo p0) {}
    public java.util.List<android.print.PrintAttributes.MediaSize> getMediaSizes() { return null; }
    public java.util.List<android.print.PrintAttributes.Resolution> getResolutions() { return null; }
    public android.print.PrintAttributes.Margins getMinMargins() { return null; }
    public int getColorModes() { return 0; }
    public int getDuplexModes() { return 0; }
    public android.print.PrintAttributes getDefaults() { return null; }
    private static void enforceValidMask(int p0, java.util.function.IntConsumer p1) {}
    private PrinterCapabilitiesInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    private java.lang.String colorModesToString() { return null; }
    private java.lang.String duplexModesToString() { return null; }
    private void writeMediaSizes(android.os.Parcel p0) {}
    private void readMediaSizes(android.os.Parcel p0) {}
    private void writeResolutions(android.os.Parcel p0) {}
    private void readResolutions(android.os.Parcel p0) {}
    private void writeMargins(android.print.PrintAttributes.Margins p0, android.os.Parcel p1) {}
    private android.print.PrintAttributes.Margins readMargins(android.os.Parcel p0) { return null; }
    private void readDefaults(android.os.Parcel p0) {}
    private void writeDefaults(android.os.Parcel p0) {}

    public static final class Builder {
        private final android.print.PrinterCapabilitiesInfo mPrototype = null;
        public Builder(android.print.PrinterId p0) {}
        public android.print.PrinterCapabilitiesInfo.Builder addMediaSize(android.print.PrintAttributes.MediaSize p0, boolean p1) { return null; }
        public android.print.PrinterCapabilitiesInfo.Builder addResolution(android.print.PrintAttributes.Resolution p0, boolean p1) { return null; }
        public android.print.PrinterCapabilitiesInfo.Builder setMinMargins(android.print.PrintAttributes.Margins p0) { return null; }
        public android.print.PrinterCapabilitiesInfo.Builder setColorModes(int p0, int p1) { return null; }
        public android.print.PrinterCapabilitiesInfo.Builder setDuplexModes(int p0, int p1) { return null; }
        public android.print.PrinterCapabilitiesInfo build() { return null; }
        private void throwIfDefaultAlreadySpecified(int p0) {}
    }
}
