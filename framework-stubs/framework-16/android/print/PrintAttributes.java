package android.print;

public final class PrintAttributes implements android.os.Parcelable {
    public static final int COLOR_MODE_MONOCHROME = 1;
    public static final int COLOR_MODE_COLOR = 2;
    public static final int DUPLEX_MODE_NONE = 1;
    public static final int DUPLEX_MODE_LONG_EDGE = 2;
    public static final int DUPLEX_MODE_SHORT_EDGE = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.print.PrintAttributes> CREATOR = null;
    PrintAttributes() {}
    @android.annotation.Nullable
    public android.print.PrintAttributes.MediaSize getMediaSize() { return null; }
    public void setMediaSize(android.print.PrintAttributes.MediaSize p0) {}
    @android.annotation.Nullable
    public android.print.PrintAttributes.Resolution getResolution() { return null; }
    public void setResolution(android.print.PrintAttributes.Resolution p0) {}
    @android.annotation.Nullable
    public android.print.PrintAttributes.Margins getMinMargins() { return null; }
    public void setMinMargins(android.print.PrintAttributes.Margins p0) {}
    public int getColorMode() { return 0; }
    public void setColorMode(int p0) {}
    public boolean isPortrait() { return false; }
    public int getDuplexMode() { return 0; }
    public void setDuplexMode(int p0) {}
    public android.print.PrintAttributes asPortrait() { return null; }
    public android.print.PrintAttributes asLandscape() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void clear() {}
    public void copyFrom(android.print.PrintAttributes p0) {}
    static java.lang.String colorModeToString(int p0) { return null; }
    static java.lang.String duplexModeToString(int p0) { return null; }
    static void enforceValidColorMode(int p0) {}
    static void enforceValidDuplexMode(int p0) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.print.PrintAttributes.Builder setMediaSize(android.print.PrintAttributes.MediaSize p0) { return null; }
        @android.annotation.NonNull
        public android.print.PrintAttributes.Builder setResolution(android.print.PrintAttributes.Resolution p0) { return null; }
        @android.annotation.NonNull
        public android.print.PrintAttributes.Builder setMinMargins(android.print.PrintAttributes.Margins p0) { return null; }
        @android.annotation.NonNull
        public android.print.PrintAttributes.Builder setColorMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.print.PrintAttributes.Builder setDuplexMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.print.PrintAttributes build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ColorMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface DuplexMode {
    }

    public static final class Margins {
        public static final android.print.PrintAttributes.Margins NO_MARGINS = null;
        public Margins(int p0, int p1, int p2, int p3) {}
        public int getLeftMils() { return 0; }
        public int getTopMils() { return 0; }
        public int getRightMils() { return 0; }
        public int getBottomMils() { return 0; }
        void writeToParcel(android.os.Parcel p0) {}
        static android.print.PrintAttributes.Margins createFromParcel(android.os.Parcel p0) { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static final class MediaSize {
        public static final android.print.PrintAttributes.MediaSize UNKNOWN_PORTRAIT = null;
        public static final android.print.PrintAttributes.MediaSize UNKNOWN_LANDSCAPE = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A0 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A1 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A2 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A3 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A4 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A5 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A6 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A7 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A8 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A9 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_A10 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B0 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B1 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B2 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B3 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B4 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B5 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B6 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B7 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B8 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B9 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_B10 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C0 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C1 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C2 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C3 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C4 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C5 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C6 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C7 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C8 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C9 = null;
        public static final android.print.PrintAttributes.MediaSize ISO_C10 = null;
        public static final android.print.PrintAttributes.MediaSize NA_LETTER = null;
        public static final android.print.PrintAttributes.MediaSize NA_GOVT_LETTER = null;
        public static final android.print.PrintAttributes.MediaSize NA_LEGAL = null;
        public static final android.print.PrintAttributes.MediaSize NA_JUNIOR_LEGAL = null;
        public static final android.print.PrintAttributes.MediaSize NA_LEDGER = null;
        public static final android.print.PrintAttributes.MediaSize NA_TABLOID = null;
        public static final android.print.PrintAttributes.MediaSize NA_INDEX_3X5 = null;
        public static final android.print.PrintAttributes.MediaSize NA_INDEX_4X6 = null;
        public static final android.print.PrintAttributes.MediaSize NA_INDEX_5X8 = null;
        public static final android.print.PrintAttributes.MediaSize NA_MONARCH = null;
        public static final android.print.PrintAttributes.MediaSize NA_QUARTO = null;
        public static final android.print.PrintAttributes.MediaSize NA_FOOLSCAP = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize ANSI_C = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize ANSI_D = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize ANSI_E = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize ANSI_F = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize NA_ARCH_A = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize NA_ARCH_B = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize NA_ARCH_C = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize NA_ARCH_D = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize NA_ARCH_E = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize NA_ARCH_E1 = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize NA_SUPER_B = null;
        public static final android.print.PrintAttributes.MediaSize ROC_8K = null;
        public static final android.print.PrintAttributes.MediaSize ROC_16K = null;
        public static final android.print.PrintAttributes.MediaSize PRC_1 = null;
        public static final android.print.PrintAttributes.MediaSize PRC_2 = null;
        public static final android.print.PrintAttributes.MediaSize PRC_3 = null;
        public static final android.print.PrintAttributes.MediaSize PRC_4 = null;
        public static final android.print.PrintAttributes.MediaSize PRC_5 = null;
        public static final android.print.PrintAttributes.MediaSize PRC_6 = null;
        public static final android.print.PrintAttributes.MediaSize PRC_7 = null;
        public static final android.print.PrintAttributes.MediaSize PRC_8 = null;
        public static final android.print.PrintAttributes.MediaSize PRC_9 = null;
        public static final android.print.PrintAttributes.MediaSize PRC_10 = null;
        public static final android.print.PrintAttributes.MediaSize PRC_16K = null;
        public static final android.print.PrintAttributes.MediaSize OM_PA_KAI = null;
        public static final android.print.PrintAttributes.MediaSize OM_DAI_PA_KAI = null;
        public static final android.print.PrintAttributes.MediaSize OM_JUURO_KU_KAI = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B10 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B9 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B8 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B7 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B6 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B5 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B4 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B3 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B2 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B1 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_B0 = null;
        public static final android.print.PrintAttributes.MediaSize JIS_EXEC = null;
        public static final android.print.PrintAttributes.MediaSize JPN_CHOU4 = null;
        public static final android.print.PrintAttributes.MediaSize JPN_CHOU3 = null;
        public static final android.print.PrintAttributes.MediaSize JPN_CHOU2 = null;
        public static final android.print.PrintAttributes.MediaSize JPN_HAGAKI = null;
        public static final android.print.PrintAttributes.MediaSize JPN_OUFUKU = null;
        public static final android.print.PrintAttributes.MediaSize JPN_KAHU = null;
        public static final android.print.PrintAttributes.MediaSize JPN_KAKU2 = null;
        public static final android.print.PrintAttributes.MediaSize JPN_YOU4 = null;
        @android.annotation.NonNull
        public static final android.print.PrintAttributes.MediaSize JPN_OE_PHOTO_L = null;
        @android.annotation.NonNull
        public final java.lang.String mLabel = null;
        @android.annotation.Nullable
        public final java.lang.String mPackageName = null;
        public final int mLabelResId = 0;
        public MediaSize(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4) {}
        public MediaSize(java.lang.String p0, java.lang.String p1, int p2, int p3) {}
        @android.annotation.NonNull
        public static android.util.ArraySet<android.print.PrintAttributes.MediaSize> getAllPredefinedSizes() { return null; }
        public MediaSize(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, int p5) {}
        @android.annotation.NonNull
        public java.lang.String getId() { return null; }
        @android.annotation.NonNull
        public java.lang.String getLabel(android.content.pm.PackageManager p0) { return null; }
        public int getWidthMils() { return 0; }
        public int getHeightMils() { return 0; }
        public boolean isPortrait() { return false; }
        @android.annotation.NonNull
        public android.print.PrintAttributes.MediaSize asPortrait() { return null; }
        @android.annotation.NonNull
        public android.print.PrintAttributes.MediaSize asLandscape() { return null; }
        void writeToParcel(android.os.Parcel p0) {}
        static android.print.PrintAttributes.MediaSize createFromParcel(android.os.Parcel p0) { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public static android.print.PrintAttributes.MediaSize getStandardMediaSizeById(java.lang.String p0) { return null; }
    }

    public static final class Resolution {
        public Resolution(java.lang.String p0, java.lang.String p1, int p2, int p3) {}
        @android.annotation.NonNull
        public java.lang.String getId() { return null; }
        @android.annotation.NonNull
        public java.lang.String getLabel() { return null; }
        public int getHorizontalDpi() { return 0; }
        public int getVerticalDpi() { return 0; }
        void writeToParcel(android.os.Parcel p0) {}
        static android.print.PrintAttributes.Resolution createFromParcel(android.os.Parcel p0) { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }
}
