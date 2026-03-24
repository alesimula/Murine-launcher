package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class AnalogFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int SIGNAL_TYPE_UNDEFINED = 0;
    public static final int SIGNAL_TYPE_AUTO = 1;
    public static final int SIGNAL_TYPE_PAL = 2;
    public static final int SIGNAL_TYPE_PAL_M = 4;
    public static final int SIGNAL_TYPE_PAL_N = 8;
    public static final int SIGNAL_TYPE_PAL_60 = 16;
    public static final int SIGNAL_TYPE_NTSC = 32;
    public static final int SIGNAL_TYPE_NTSC_443 = 64;
    public static final int SIGNAL_TYPE_SECAM = 128;
    public static final int SIF_UNDEFINED = 0;
    public static final int SIF_AUTO = 1;
    public static final int SIF_BG = 2;
    public static final int SIF_BG_A2 = 4;
    public static final int SIF_BG_NICAM = 8;
    public static final int SIF_I = 16;
    public static final int SIF_DK = 32;
    public static final int SIF_DK1_A2 = 64;
    public static final int SIF_DK2_A2 = 128;
    public static final int SIF_DK3_A2 = 256;
    public static final int SIF_DK_NICAM = 512;
    public static final int SIF_L = 1024;
    public static final int SIF_M = 2048;
    public static final int SIF_M_BTSC = 4096;
    public static final int SIF_M_A2 = 8192;
    public static final int SIF_M_EIAJ = 16384;
    public static final int SIF_I_NICAM = 32768;
    public static final int SIF_L_NICAM = 65536;
    public static final int SIF_L_PRIME = 131072;
    public static final int AFT_FLAG_UNDEFINED = 0;
    public static final int AFT_FLAG_TRUE = 1;
    public static final int AFT_FLAG_FALSE = 2;
    AnalogFrontendSettings() { super(0L); }
    public int getType() { return 0; }
    public int getSignalType() { return 0; }
    public int getSifStandard() { return 0; }
    public int getAftFlag() { return 0; }
    public static android.media.tv.tuner.frontend.AnalogFrontendSettings.Builder builder() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AftFlag {
    }

    public static class Builder {
        @java.lang.Deprecated
        public android.media.tv.tuner.frontend.AnalogFrontendSettings.Builder setFrequency(int p0) { return null; }
        public android.media.tv.tuner.frontend.AnalogFrontendSettings.Builder setFrequencyLong(long p0) { return null; }
        public android.media.tv.tuner.frontend.AnalogFrontendSettings.Builder setAftFlag(int p0) { return null; }
        public android.media.tv.tuner.frontend.AnalogFrontendSettings.Builder setSignalType(int p0) { return null; }
        public android.media.tv.tuner.frontend.AnalogFrontendSettings.Builder setSifStandard(int p0) { return null; }
        public android.media.tv.tuner.frontend.AnalogFrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SifStandard {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SignalType {
    }
}
