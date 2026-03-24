package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class IsdbsFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int STREAM_ID_TYPE_ID = 0;
    public static final int STREAM_ID_TYPE_RELATIVE_NUMBER = 1;
    public static final int MODULATION_UNDEFINED = 0;
    public static final int MODULATION_AUTO = 1;
    public static final int MODULATION_MOD_BPSK = 2;
    public static final int MODULATION_MOD_QPSK = 4;
    public static final int MODULATION_MOD_TC8PSK = 8;
    public static final int CODERATE_UNDEFINED = 0;
    public static final int CODERATE_AUTO = 1;
    public static final int CODERATE_1_2 = 2;
    public static final int CODERATE_2_3 = 4;
    public static final int CODERATE_3_4 = 8;
    public static final int CODERATE_5_6 = 16;
    public static final int CODERATE_7_8 = 32;
    public static final int ROLLOFF_UNDEFINED = 0;
    public static final int ROLLOFF_0_35 = 1;
    private final int mStreamId = 0;
    private final int mStreamIdType = 0;
    private final int mModulation = 0;
    private final int mCodeRate = 0;
    private final int mSymbolRate = 0;
    private final int mRolloff = 0;
    private IsdbsFrontendSettings(int p0, int p1, int p2, int p3, int p4, int p5, int p6) { super(0); }
    public int getStreamId() { return 0; }
    public int getStreamIdType() { return 0; }
    public int getModulation() { return 0; }
    public int getCodeRate() { return 0; }
    public int getSymbolRate() { return 0; }
    public int getRolloff() { return 0; }
    public static android.media.tv.tuner.frontend.IsdbsFrontendSettings.Builder builder() { return null; }
    public int getType() { return 0; }

    public static class Builder {
        private int mFrequency;
        private int mStreamId;
        private int mStreamIdType;
        private int mModulation;
        private int mCodeRate;
        private int mSymbolRate;
        private int mRolloff;
        private Builder() {}
        public android.media.tv.tuner.frontend.IsdbsFrontendSettings.Builder setFrequency(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbsFrontendSettings.Builder setStreamId(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbsFrontendSettings.Builder setStreamIdType(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbsFrontendSettings.Builder setModulation(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbsFrontendSettings.Builder setCodeRate(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbsFrontendSettings.Builder setSymbolRate(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbsFrontendSettings.Builder setRolloff(int p0) { return null; }
        public android.media.tv.tuner.frontend.IsdbsFrontendSettings build() { return null; }
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

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StreamIdType {
    }
}
