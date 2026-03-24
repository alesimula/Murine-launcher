package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class DvbsFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int SCAN_TYPE_UNDEFINED = 0;
    public static final int SCAN_TYPE_DIRECT = 1;
    public static final int SCAN_TYPE_DISEQC = 2;
    public static final int SCAN_TYPE_UNICABLE = 3;
    public static final int SCAN_TYPE_JESS = 4;
    public static final int MODULATION_UNDEFINED = 0;
    public static final int MODULATION_AUTO = 1;
    public static final int MODULATION_MOD_QPSK = 2;
    public static final int MODULATION_MOD_8PSK = 4;
    public static final int MODULATION_MOD_16QAM = 8;
    public static final int MODULATION_MOD_16PSK = 16;
    public static final int MODULATION_MOD_32PSK = 32;
    public static final int MODULATION_MOD_ACM = 64;
    public static final int MODULATION_MOD_8APSK = 128;
    public static final int MODULATION_MOD_16APSK = 256;
    public static final int MODULATION_MOD_32APSK = 512;
    public static final int MODULATION_MOD_64APSK = 1024;
    public static final int MODULATION_MOD_128APSK = 2048;
    public static final int MODULATION_MOD_256APSK = 4096;
    public static final int MODULATION_MOD_RESERVED = 8192;
    public static final int ROLLOFF_UNDEFINED = 0;
    public static final int ROLLOFF_0_35 = 1;
    public static final int ROLLOFF_0_25 = 2;
    public static final int ROLLOFF_0_20 = 3;
    public static final int ROLLOFF_0_15 = 4;
    public static final int ROLLOFF_0_10 = 5;
    public static final int ROLLOFF_0_5 = 6;
    public static final int PILOT_UNDEFINED = 0;
    public static final int PILOT_ON = 1;
    public static final int PILOT_OFF = 2;
    public static final int PILOT_AUTO = 3;
    public static final int STANDARD_AUTO = 1;
    public static final int STANDARD_S = 2;
    public static final int STANDARD_S2 = 4;
    public static final int STANDARD_S2X = 8;
    public static final int VCM_MODE_UNDEFINED = 0;
    public static final int VCM_MODE_AUTO = 1;
    public static final int VCM_MODE_MANUAL = 2;
    private final int mModulation = 0;
    private final android.media.tv.tuner.frontend.DvbsCodeRate mCodeRate = null;
    private final int mSymbolRate = 0;
    private final int mRolloff = 0;
    private final int mPilot = 0;
    private final int mInputStreamId = 0;
    private final int mStandard = 0;
    private final int mVcmMode = 0;
    private final int mScanType = 0;
    private final boolean mIsDiseqcRxMessage = false;
    private DvbsFrontendSettings(int p0, int p1, android.media.tv.tuner.frontend.DvbsCodeRate p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, boolean p10) { super(0); }
    public int getModulation() { return 0; }
    public android.media.tv.tuner.frontend.DvbsCodeRate getCodeRate() { return null; }
    public int getSymbolRate() { return 0; }
    public int getRolloff() { return 0; }
    public int getPilot() { return 0; }
    public int getInputStreamId() { return 0; }
    public int getStandard() { return 0; }
    public int getVcmMode() { return 0; }
    public int getScanType() { return 0; }
    public boolean canHandleDiseqcRxMessage() { return false; }
    public static android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder builder() { return null; }
    public int getType() { return 0; }

    public static class Builder {
        private int mFrequency;
        private int mModulation;
        private android.media.tv.tuner.frontend.DvbsCodeRate mCodeRate;
        private int mSymbolRate;
        private int mRolloff;
        private int mPilot;
        private int mInputStreamId;
        private int mStandard;
        private int mVcmMode;
        private int mScanType;
        private boolean mIsDiseqcRxMessage;
        private Builder() {}
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setFrequency(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setScanType(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setCanHandleDiseqcRxMessage(boolean p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setModulation(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setCodeRate(android.media.tv.tuner.frontend.DvbsCodeRate p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setSymbolRate(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setRolloff(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setPilot(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setInputStreamId(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setStandard(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings.Builder setVcmMode(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsFrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modulation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Pilot {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Rolloff {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScanType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Standard {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VcmMode {
    }
}
