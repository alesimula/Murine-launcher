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
    @java.lang.Deprecated
    public static final int SPECTRAL_INVERSION_UNDEFINED = 0;
    @java.lang.Deprecated
    public static final int SPECTRAL_INVERSION_NORMAL = 1;
    @java.lang.Deprecated
    public static final int SPECTRAL_INVERSION_INVERTED = 2;
    public static final int TIME_INTERLEAVE_MODE_UNDEFINED = 0;
    public static final int TIME_INTERLEAVE_MODE_AUTO = 1;
    public static final int TIME_INTERLEAVE_MODE_128_1_0 = 2;
    public static final int TIME_INTERLEAVE_MODE_128_1_1 = 4;
    public static final int TIME_INTERLEAVE_MODE_64_2 = 8;
    public static final int TIME_INTERLEAVE_MODE_32_4 = 16;
    public static final int TIME_INTERLEAVE_MODE_16_8 = 32;
    public static final int TIME_INTERLEAVE_MODE_8_16 = 64;
    public static final int TIME_INTERLEAVE_MODE_128_2 = 128;
    public static final int TIME_INTERLEAVE_MODE_128_3 = 256;
    public static final int TIME_INTERLEAVE_MODE_128_4 = 512;
    public static final int BANDWIDTH_UNDEFINED = 0;
    public static final int BANDWIDTH_5MHZ = 1;
    public static final int BANDWIDTH_6MHZ = 2;
    public static final int BANDWIDTH_7MHZ = 4;
    public static final int BANDWIDTH_8MHZ = 8;
    DvbcFrontendSettings() { super(0L); }
    public int getModulation() { return 0; }
    public long getInnerFec() { return 0L; }
    public int getSymbolRate() { return 0; }
    public int getOuterFec() { return 0; }
    public int getAnnex() { return 0; }
    public int getSpectralInversion() { return 0; }
    public int getTimeInterleaveMode() { return 0; }
    public int getBandwidth() { return 0; }
    public static android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder builder() { return null; }
    public int getType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Annex {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Bandwidth {
    }

    public static class Builder {
        @java.lang.Deprecated
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setFrequency(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setFrequencyLong(long p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setModulation(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setInnerFec(long p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setSymbolRate(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setOuterFec(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setAnnex(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setSpectralInversion(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setTimeInterleaveMode(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings.Builder setBandwidth(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbcFrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modulation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OuterFec {
    }

    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SpectralInversion {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimeInterleaveMode {
    }
}
