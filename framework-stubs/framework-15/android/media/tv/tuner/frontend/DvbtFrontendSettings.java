package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class DvbtFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int TRANSMISSION_MODE_UNDEFINED = 0;
    public static final int TRANSMISSION_MODE_AUTO = 1;
    public static final int TRANSMISSION_MODE_2K = 2;
    public static final int TRANSMISSION_MODE_8K = 4;
    public static final int TRANSMISSION_MODE_4K = 8;
    public static final int TRANSMISSION_MODE_1K = 16;
    public static final int TRANSMISSION_MODE_16K = 32;
    public static final int TRANSMISSION_MODE_32K = 64;
    public static final int TRANSMISSION_MODE_EXTENDED_8K = 128;
    public static final int TRANSMISSION_MODE_EXTENDED_16K = 256;
    public static final int TRANSMISSION_MODE_EXTENDED_32K = 512;
    public static final int BANDWIDTH_UNDEFINED = 0;
    public static final int BANDWIDTH_AUTO = 1;
    public static final int BANDWIDTH_8MHZ = 2;
    public static final int BANDWIDTH_7MHZ = 4;
    public static final int BANDWIDTH_6MHZ = 8;
    public static final int BANDWIDTH_5MHZ = 16;
    public static final int BANDWIDTH_1_7MHZ = 32;
    public static final int BANDWIDTH_10MHZ = 64;
    public static final int CONSTELLATION_UNDEFINED = 0;
    public static final int CONSTELLATION_AUTO = 1;
    public static final int CONSTELLATION_QPSK = 2;
    public static final int CONSTELLATION_16QAM = 4;
    public static final int CONSTELLATION_64QAM = 8;
    public static final int CONSTELLATION_256QAM = 16;
    public static final int CONSTELLATION_QPSK_R = 32;
    public static final int CONSTELLATION_16QAM_R = 64;
    public static final int CONSTELLATION_64QAM_R = 128;
    public static final int CONSTELLATION_256QAM_R = 256;
    public static final int HIERARCHY_UNDEFINED = 0;
    public static final int HIERARCHY_AUTO = 1;
    public static final int HIERARCHY_NON_NATIVE = 2;
    public static final int HIERARCHY_1_NATIVE = 4;
    public static final int HIERARCHY_2_NATIVE = 8;
    public static final int HIERARCHY_4_NATIVE = 16;
    public static final int HIERARCHY_NON_INDEPTH = 32;
    public static final int HIERARCHY_1_INDEPTH = 64;
    public static final int HIERARCHY_2_INDEPTH = 128;
    public static final int HIERARCHY_4_INDEPTH = 256;
    public static final int CODERATE_UNDEFINED = 0;
    public static final int CODERATE_AUTO = 1;
    public static final int CODERATE_1_2 = 2;
    public static final int CODERATE_2_3 = 4;
    public static final int CODERATE_3_4 = 8;
    public static final int CODERATE_5_6 = 16;
    public static final int CODERATE_7_8 = 32;
    public static final int CODERATE_3_5 = 64;
    public static final int CODERATE_4_5 = 128;
    public static final int CODERATE_6_7 = 256;
    public static final int CODERATE_8_9 = 512;
    public static final int GUARD_INTERVAL_UNDEFINED = 0;
    public static final int GUARD_INTERVAL_AUTO = 1;
    public static final int GUARD_INTERVAL_1_32 = 2;
    public static final int GUARD_INTERVAL_1_16 = 4;
    public static final int GUARD_INTERVAL_1_8 = 8;
    public static final int GUARD_INTERVAL_1_4 = 16;
    public static final int GUARD_INTERVAL_1_128 = 32;
    public static final int GUARD_INTERVAL_19_128 = 64;
    public static final int GUARD_INTERVAL_19_256 = 128;
    public static final int STANDARD_AUTO = 1;
    public static final int STANDARD_T = 2;
    public static final int STANDARD_T2 = 4;
    public static final int PLP_MODE_UNDEFINED = 0;
    public static final int PLP_MODE_AUTO = 1;
    public static final int PLP_MODE_MANUAL = 2;
    DvbtFrontendSettings() { super(0L); }
    public int getTransmissionMode() { return 0; }
    public int getBandwidth() { return 0; }
    public int getConstellation() { return 0; }
    public int getHierarchy() { return 0; }
    public int getHighPriorityCodeRate() { return 0; }
    public int getLowPriorityCodeRate() { return 0; }
    public int getGuardInterval() { return 0; }
    public boolean isHighPriority() { return false; }
    public int getStandard() { return 0; }
    public boolean isMiso() { return false; }
    public int getPlpMode() { return 0; }
    public int getPlpId() { return 0; }
    public int getPlpGroupId() { return 0; }
    @android.annotation.NonNull
    public static android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder builder() { return null; }
    public int getType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Bandwidth {
    }

    public static class Builder {
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setFrequency(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setFrequencyLong(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setTransmissionMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setBandwidth(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setConstellation(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setHierarchy(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setHighPriorityCodeRate(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setLowPriorityCodeRate(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setGuardInterval(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setHighPriority(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setStandard(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setMiso(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setPlpMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setPlpId(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings.Builder setPlpGroupId(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.DvbtFrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CodeRate {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Constellation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GuardInterval {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Hierarchy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlpMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Standard {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransmissionMode {
    }
}
