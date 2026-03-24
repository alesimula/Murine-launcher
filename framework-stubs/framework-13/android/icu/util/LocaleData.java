package android.icu.util;

public final class LocaleData {
    public static final int ALT_QUOTATION_END = 3;
    public static final int ALT_QUOTATION_START = 2;
    public static final int QUOTATION_END = 1;
    public static final int QUOTATION_START = 0;
    private LocaleData() {}
    public static android.icu.util.LocaleData getInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.util.LocaleData getInstance() { return null; }
    public void setNoSubstitute(boolean p0) {}
    public boolean getNoSubstitute() { return false; }
    public java.lang.String getDelimiter(int p0) { return null; }
    public static android.icu.util.LocaleData.MeasurementSystem getMeasurementSystem(android.icu.util.ULocale p0) { return null; }
    public static android.icu.util.LocaleData.PaperSize getPaperSize(android.icu.util.ULocale p0) { return null; }
    public static android.icu.util.VersionInfo getCLDRVersion() { return null; }

    public static final class MeasurementSystem {
        public static final android.icu.util.LocaleData.MeasurementSystem SI = null;
        public static final android.icu.util.LocaleData.MeasurementSystem UK = null;
        public static final android.icu.util.LocaleData.MeasurementSystem US = null;
        private MeasurementSystem() {}
    }

    public static final class PaperSize {
        private PaperSize() {}
        public int getHeight() { return 0; }
        public int getWidth() { return 0; }
    }
}
