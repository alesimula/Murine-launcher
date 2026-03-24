package android.print;

public final class PrinterCapabilitiesInfo implements android.os.Parcelable {
    public static final int DEFAULT_UNDEFINED = -1;
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
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(android.print.PrinterId p0) {}
        public android.print.PrinterCapabilitiesInfo.Builder addMediaSize(android.print.PrintAttributes.MediaSize p0, boolean p1) { return null; }
        public android.print.PrinterCapabilitiesInfo.Builder addResolution(android.print.PrintAttributes.Resolution p0, boolean p1) { return null; }
        public android.print.PrinterCapabilitiesInfo.Builder setMinMargins(android.print.PrintAttributes.Margins p0) { return null; }
        public android.print.PrinterCapabilitiesInfo.Builder setColorModes(int p0, int p1) { return null; }
        public android.print.PrinterCapabilitiesInfo.Builder setDuplexModes(int p0, int p1) { return null; }
        public android.print.PrinterCapabilitiesInfo build() { return null; }
    }
}
