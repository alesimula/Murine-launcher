package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public final class DtmbFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int BANDWIDTH_UNDEFINED = 0;
    public static final int BANDWIDTH_AUTO = 1;
    public static final int BANDWIDTH_6MHZ = 4;
    public static final int BANDWIDTH_8MHZ = 2;
    public static final int TIME_INTERLEAVE_MODE_UNDEFINED = 0;
    public static final int TIME_INTERLEAVE_MODE_AUTO = 1;
    public static final int TIME_INTERLEAVE_MODE_TIMER_INT_240 = 2;
    public static final int TIME_INTERLEAVE_MODE_TIMER_INT_720 = 4;
    public static final int GUARD_INTERVAL_UNDEFINED = 0;
    public static final int GUARD_INTERVAL_AUTO = 1;
    public static final int GUARD_INTERVAL_PN_420_VARIOUS = 2;
    public static final int GUARD_INTERVAL_PN_595_CONST = 4;
    public static final int GUARD_INTERVAL_PN_945_VARIOUS = 8;
    public static final int GUARD_INTERVAL_PN_420_CONST = 16;
    public static final int GUARD_INTERVAL_PN_945_CONST = 32;
    public static final int GUARD_INTERVAL_PN_RESERVED = 64;
    public static final int MODULATION_CONSTELLATION_UNDEFINED = 0;
    public static final int MODULATION_CONSTELLATION_AUTO = 1;
    public static final int MODULATION_CONSTELLATION_4QAM = 2;
    public static final int MODULATION_CONSTELLATION_4QAM_NR = 4;
    public static final int MODULATION_CONSTELLATION_16QAM = 8;
    public static final int MODULATION_CONSTELLATION_32QAM = 16;
    public static final int MODULATION_CONSTELLATION_64QAM = 32;
    public static final int CODERATE_UNDEFINED = 0;
    public static final int CODERATE_AUTO = 1;
    public static final int CODERATE_2_5 = 2;
    public static final int CODERATE_3_5 = 4;
    public static final int CODERATE_4_5 = 8;
    public static final int TRANSMISSION_MODE_UNDEFINED = 0;
    public static final int TRANSMISSION_MODE_AUTO = 1;
    public static final int TRANSMISSION_MODE_C1 = 2;
    public static final int TRANSMISSION_MODE_C3780 = 4;
    DtmbFrontendSettings() { super(0L); }
    public int getModulation() { return 0; }
    public int getCodeRate() { return 0; }
    public int getTransmissionMode() { return 0; }
    public int getBandwidth() { return 0; }
    public int getTimeInterleaveMode() { return 0; }
    public int getGuardInterval() { return 0; }
    public static android.media.tv.tuner.frontend.DtmbFrontendSettings.Builder builder() { return null; }
    public int getType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Bandwidth {
    }

    public static final class Builder {
        @java.lang.Deprecated
        public android.media.tv.tuner.frontend.DtmbFrontendSettings.Builder setFrequency(int p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.media.tv.tuner.frontend.DtmbFrontendSettings.Builder setFrequencyLong(long p0) { return null; }
        public android.media.tv.tuner.frontend.DtmbFrontendSettings.Builder setModulation(int p0) { return null; }
        public android.media.tv.tuner.frontend.DtmbFrontendSettings.Builder setCodeRate(int p0) { return null; }
        public android.media.tv.tuner.frontend.DtmbFrontendSettings.Builder setBandwidth(int p0) { return null; }
        public android.media.tv.tuner.frontend.DtmbFrontendSettings.Builder setTimeInterleaveMode(int p0) { return null; }
        public android.media.tv.tuner.frontend.DtmbFrontendSettings.Builder setGuardInterval(int p0) { return null; }
        public android.media.tv.tuner.frontend.DtmbFrontendSettings.Builder setTransmissionMode(int p0) { return null; }
        public android.media.tv.tuner.frontend.DtmbFrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CodeRate {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GuardInterval {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modulation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimeInterleaveMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransmissionMode {
    }
}
