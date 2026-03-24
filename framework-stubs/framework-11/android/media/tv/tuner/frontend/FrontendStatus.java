package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class FrontendStatus {
    public static final int FRONTEND_STATUS_TYPE_DEMOD_LOCK = 0;
    public static final int FRONTEND_STATUS_TYPE_SNR = 1;
    public static final int FRONTEND_STATUS_TYPE_BER = 2;
    public static final int FRONTEND_STATUS_TYPE_PER = 3;
    public static final int FRONTEND_STATUS_TYPE_PRE_BER = 4;
    public static final int FRONTEND_STATUS_TYPE_SIGNAL_QUALITY = 5;
    public static final int FRONTEND_STATUS_TYPE_SIGNAL_STRENGTH = 6;
    public static final int FRONTEND_STATUS_TYPE_SYMBOL_RATE = 7;
    public static final int FRONTEND_STATUS_TYPE_FEC = 8;
    public static final int FRONTEND_STATUS_TYPE_MODULATION = 9;
    public static final int FRONTEND_STATUS_TYPE_SPECTRAL = 10;
    public static final int FRONTEND_STATUS_TYPE_LNB_VOLTAGE = 11;
    public static final int FRONTEND_STATUS_TYPE_PLP_ID = 12;
    public static final int FRONTEND_STATUS_TYPE_EWBS = 13;
    public static final int FRONTEND_STATUS_TYPE_AGC = 14;
    public static final int FRONTEND_STATUS_TYPE_LNA = 15;
    public static final int FRONTEND_STATUS_TYPE_LAYER_ERROR = 16;
    public static final int FRONTEND_STATUS_TYPE_MER = 17;
    public static final int FRONTEND_STATUS_TYPE_FREQ_OFFSET = 18;
    public static final int FRONTEND_STATUS_TYPE_HIERARCHY = 19;
    public static final int FRONTEND_STATUS_TYPE_RF_LOCK = 20;
    public static final int FRONTEND_STATUS_TYPE_ATSC3_PLP_INFO = 21;
    private java.lang.Boolean mIsDemodLocked;
    private java.lang.Integer mSnr;
    private java.lang.Integer mBer;
    private java.lang.Integer mPer;
    private java.lang.Integer mPerBer;
    private java.lang.Integer mSignalQuality;
    private java.lang.Integer mSignalStrength;
    private java.lang.Integer mSymbolRate;
    private java.lang.Long mInnerFec;
    private java.lang.Integer mModulation;
    private java.lang.Integer mInversion;
    private java.lang.Integer mLnbVoltage;
    private java.lang.Integer mPlpId;
    private java.lang.Boolean mIsEwbs;
    private java.lang.Integer mAgc;
    private java.lang.Boolean mIsLnaOn;
    private boolean[] mIsLayerErrors;
    private java.lang.Integer mMer;
    private java.lang.Integer mFreqOffset;
    private java.lang.Integer mHierarchy;
    private java.lang.Boolean mIsRfLocked;
    private android.media.tv.tuner.frontend.FrontendStatus.Atsc3PlpTuningInfo[] mPlpInfo;
    private FrontendStatus() {}
    public boolean isDemodLocked() { return false; }
    public int getSnr() { return 0; }
    public int getBer() { return 0; }
    public int getPer() { return 0; }
    public int getPerBer() { return 0; }
    public int getSignalQuality() { return 0; }
    public int getSignalStrength() { return 0; }
    public int getSymbolRate() { return 0; }
    public long getInnerFec() { return 0L; }
    public int getModulation() { return 0; }
    public int getSpectralInversion() { return 0; }
    public int getLnbVoltage() { return 0; }
    public int getPlpId() { return 0; }
    public boolean isEwbs() { return false; }
    public int getAgc() { return 0; }
    public boolean isLnaOn() { return false; }
    public boolean[] getLayerErrors() { return null; }
    public int getMer() { return 0; }
    public int getFreqOffset() { return 0; }
    public int getHierarchy() { return 0; }
    public boolean isRfLocked() { return false; }
    public android.media.tv.tuner.frontend.FrontendStatus.Atsc3PlpTuningInfo[] getAtsc3PlpTuningInfo() { return null; }

    public static class Atsc3PlpTuningInfo {
        private final int mPlpId = 0;
        private final boolean mIsLocked = false;
        private final int mUec = 0;
        private Atsc3PlpTuningInfo(int p0, boolean p1, int p2) {}
        public int getPlpId() { return 0; }
        public boolean isLocked() { return false; }
        public int getUec() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendModulation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrontendStatusType {
    }
}
