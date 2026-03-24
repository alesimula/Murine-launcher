package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class Isdbs3FrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int MODULATION_UNDEFINED = 0;
    public static final int MODULATION_AUTO = 1;
    public static final int MODULATION_MOD_BPSK = 2;
    public static final int MODULATION_MOD_QPSK = 4;
    public static final int MODULATION_MOD_8PSK = 8;
    public static final int MODULATION_MOD_16APSK = 16;
    public static final int MODULATION_MOD_32APSK = 32;
    public static final int CODERATE_UNDEFINED = 0;
    public static final int CODERATE_AUTO = 1;
    public static final int CODERATE_1_3 = 2;
    public static final int CODERATE_2_5 = 4;
    public static final int CODERATE_1_2 = 8;
    public static final int CODERATE_3_5 = 16;
    public static final int CODERATE_2_3 = 32;
    public static final int CODERATE_3_4 = 64;
    public static final int CODERATE_7_9 = 128;
    public static final int CODERATE_4_5 = 256;
    public static final int CODERATE_5_6 = 512;
    public static final int CODERATE_7_8 = 1024;
    public static final int CODERATE_9_10 = 2048;
    public static final int ROLLOFF_UNDEFINED = 0;
    public static final int ROLLOFF_0_03 = 1;
    Isdbs3FrontendSettings() { super(0L); }
    public int getStreamId() { return 0; }
    public int getStreamIdType() { return 0; }
    public int getModulation() { return 0; }
    public int getCodeRate() { return 0; }
    public int getSymbolRate() { return 0; }
    public int getRolloff() { return 0; }
    public static android.media.tv.tuner.frontend.Isdbs3FrontendSettings.Builder builder() { return null; }
    public int getType() { return 0; }

    public static class Builder {
        @java.lang.Deprecated
        public android.media.tv.tuner.frontend.Isdbs3FrontendSettings.Builder setFrequency(int p0) { return null; }
        public android.media.tv.tuner.frontend.Isdbs3FrontendSettings.Builder setFrequencyLong(long p0) { return null; }
        public android.media.tv.tuner.frontend.Isdbs3FrontendSettings.Builder setStreamId(int p0) { return null; }
        public android.media.tv.tuner.frontend.Isdbs3FrontendSettings.Builder setStreamIdType(int p0) { return null; }
        public android.media.tv.tuner.frontend.Isdbs3FrontendSettings.Builder setModulation(int p0) { return null; }
        public android.media.tv.tuner.frontend.Isdbs3FrontendSettings.Builder setCodeRate(int p0) { return null; }
        public android.media.tv.tuner.frontend.Isdbs3FrontendSettings.Builder setSymbolRate(int p0) { return null; }
        public android.media.tv.tuner.frontend.Isdbs3FrontendSettings.Builder setRolloff(int p0) { return null; }
        public android.media.tv.tuner.frontend.Isdbs3FrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CodeRate {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modulation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Rolloff {
    }
}
