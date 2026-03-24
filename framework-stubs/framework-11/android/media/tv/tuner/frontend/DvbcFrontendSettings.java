package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class DvbcFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int MODULATION_UNDEFINED = 0;
    public static final int MODULATION_AUTO = 1;
    public static final int MODULATION_MOD_16QAM = 2;
    public static final int MODULATION_MOD_32QAM = 4;
    public static final int MODULATION_MOD_64QAM = 8;
    public static final int MODULATION_MOD_128QAM = 16;
    public static final int MODULATION_MOD_256QAM = 32;
    public static final int OUTER_FEC_UNDEFINED = 0;
    public static final int OUTER_FEC_OUTER_FEC_NONE = 1;
    public static final int OUTER_FEC_OUTER_FEC_RS = 2;
    public static final int ANNEX_UNDEFINED = 0;
    public static final int ANNEX_A = 1;
    public static final int ANNEX_B = 2;
    public static final int ANNEX_C = 4;
    public static final int SPECTRAL_INVERSION_UNDEFINED = 0;
    public static final int SPECTRAL_INVERSION_NORMAL = 1;
    public static final int SPECTRAL_INVERSION_INVERTED = 2;
    private final int mModulation = 0;
    private final long mInnerFec = 0L;
    private final int mSymbolRate = 0;
    private final int mOuterFec = 0;
    private final int mAnnex = 0;
    private final int mSpectralInversion = 0;
    private DvbcFrontendSettings(int p0, int p1, long p2, int p3, int p4, int p5, int p6) { super(0); }
    public int getModulation() { return 0; }
    public long getInnerFec() { return 0L; }
    public int getSymbolRate() { return 0; }
    public int getOuterFec() { return 0; }
    public int getAnnex() { return 0; }
    public int getSpectralInversion() { return 0; }
    public static android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder builder() { return null; }
    public int getType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Annex {
    }

    public static class Builder {
        private int mFrequency;
        private int mModulation;
        private long mInnerFec;
        private int mSymbolRate;
        private int mOuterFec;
        private int mAnnex;
        private int mSpectralInversion;
        private Builder() {}
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setFrequency(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setModulation(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setInnerFec(long p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setSymbolRate(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setOuterFec(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setAnnex(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setSpectralInversion(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modulation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OuterFec {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SpectralInversion {
    }
}
