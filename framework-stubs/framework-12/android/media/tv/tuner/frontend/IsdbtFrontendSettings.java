package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class IsdbtFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int MODULATION_UNDEFINED = 0;
    public static final int MODULATION_AUTO = 1;
    public static final int MODULATION_MOD_DQPSK = 2;
    public static final int MODULATION_MOD_QPSK = 4;
    public static final int MODULATION_MOD_16QAM = 8;
    public static final int MODULATION_MOD_64QAM = 16;
    public static final int MODE_UNDEFINED = 0;
    public static final int MODE_AUTO = 1;
    public static final int MODE_1 = 2;
    public static final int MODE_2 = 4;
    public static final int MODE_3 = 8;
    public static final int BANDWIDTH_UNDEFINED = 0;
    public static final int BANDWIDTH_AUTO = 1;
    public static final int BANDWIDTH_8MHZ = 2;
    public static final int BANDWIDTH_7MHZ = 4;
    public static final int BANDWIDTH_6MHZ = 8;
    private final int mModulation = 0;
    private final int mBandwidth = 0;
    private final int mMode = 0;
    private final int mCodeRate = 0;
    private final int mGuardInterval = 0;
    private final int mServiceAreaId = 0;
    private IsdbtFrontendSettings(int p0, int p1, int p2, int p3, int p4, int p5, int p6) { super(0); }
    public int getModulation() { return 0; }
    public int getBandwidth() { return 0; }
    public int getMode() { return 0; }
    public int getCodeRate() { return 0; }
    public int getGuardInterval() { return 0; }
    public int getServiceAreaId() { return 0; }
    public static android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder builder() { return null; }
    public int getType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Bandwidth {
    }

    public static class Builder {
        private int mFrequency;
        private int mModulation;
        private int mBandwidth;
        private int mMode;
        private int mCodeRate;
        private int mGuardInterval;
        private int mServiceAreaId;
        private Builder() {}
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setFrequency(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setModulation(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setBandwidth(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setMode(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setCodeRate(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setGuardInterval(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings.Builder setServiceAreaId(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbtFrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Mode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modulation {
    }
}
