package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class Atsc3FrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int BANDWIDTH_UNDEFINED = 0;
    public static final int BANDWIDTH_AUTO = 1;
    public static final int BANDWIDTH_BANDWIDTH_6MHZ = 2;
    public static final int BANDWIDTH_BANDWIDTH_7MHZ = 4;
    public static final int BANDWIDTH_BANDWIDTH_8MHZ = 8;
    public static final int MODULATION_UNDEFINED = 0;
    public static final int MODULATION_AUTO = 1;
    public static final int MODULATION_MOD_QPSK = 2;
    public static final int MODULATION_MOD_16QAM = 4;
    public static final int MODULATION_MOD_64QAM = 8;
    public static final int MODULATION_MOD_256QAM = 16;
    public static final int MODULATION_MOD_1024QAM = 32;
    public static final int MODULATION_MOD_4096QAM = 64;
    public static final int TIME_INTERLEAVE_MODE_UNDEFINED = 0;
    public static final int TIME_INTERLEAVE_MODE_AUTO = 1;
    public static final int TIME_INTERLEAVE_MODE_CTI = 2;
    public static final int TIME_INTERLEAVE_MODE_HTI = 4;
    public static final int CODERATE_UNDEFINED = 0;
    public static final int CODERATE_AUTO = 1;
    public static final int CODERATE_2_15 = 2;
    public static final int CODERATE_3_15 = 4;
    public static final int CODERATE_4_15 = 8;
    public static final int CODERATE_5_15 = 16;
    public static final int CODERATE_6_15 = 32;
    public static final int CODERATE_7_15 = 64;
    public static final int CODERATE_8_15 = 128;
    public static final int CODERATE_9_15 = 256;
    public static final int CODERATE_10_15 = 512;
    public static final int CODERATE_11_15 = 1024;
    public static final int CODERATE_12_15 = 2048;
    public static final int CODERATE_13_15 = 4096;
    public static final int FEC_UNDEFINED = 0;
    public static final int FEC_AUTO = 1;
    public static final int FEC_BCH_LDPC_16K = 2;
    public static final int FEC_BCH_LDPC_64K = 4;
    public static final int FEC_CRC_LDPC_16K = 8;
    public static final int FEC_CRC_LDPC_64K = 16;
    public static final int FEC_LDPC_16K = 32;
    public static final int FEC_LDPC_64K = 64;
    public static final int DEMOD_OUTPUT_FORMAT_UNDEFINED = 0;
    public static final int DEMOD_OUTPUT_FORMAT_ATSC3_LINKLAYER_PACKET = 1;
    public static final int DEMOD_OUTPUT_FORMAT_BASEBAND_PACKET = 2;
    Atsc3FrontendSettings() { super(0L); }
    public int getBandwidth() { return 0; }
    public int getDemodOutputFormat() { return 0; }
    public android.media.tv.tuner.frontend.Atsc3PlpSettings[] getPlpSettings() { return null; }
    public static android.media.tv.tuner.frontend.Atsc3FrontendSettings.Builder builder() { return null; }
    public int getType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Bandwidth {
    }

    public static class Builder {
        @java.lang.Deprecated
        public android.media.tv.tuner.frontend.Atsc3FrontendSettings.Builder setFrequency(int p0) { return null; }
        public android.media.tv.tuner.frontend.Atsc3FrontendSettings.Builder setFrequencyLong(long p0) { return null; }
        public android.media.tv.tuner.frontend.Atsc3FrontendSettings.Builder setBandwidth(int p0) { return null; }
        public android.media.tv.tuner.frontend.Atsc3FrontendSettings.Builder setDemodOutputFormat(int p0) { return null; }
        public android.media.tv.tuner.frontend.Atsc3FrontendSettings.Builder setPlpSettings(android.media.tv.tuner.frontend.Atsc3PlpSettings[] p0) { return null; }
        public android.media.tv.tuner.frontend.Atsc3FrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CodeRate {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DemodOutputFormat {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Fec {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modulation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimeInterleaveMode {
    }
}
