package android.media.audiofx;

public final class DynamicsProcessing extends android.media.audiofx.AudioEffect {
    private static final java.lang.String TAG = "DynamicsProcessing";
    private static final int PARAM_GET_CHANNEL_COUNT = 16;
    private static final int PARAM_INPUT_GAIN = 32;
    private static final int PARAM_ENGINE_ARCHITECTURE = 48;
    private static final int PARAM_PRE_EQ = 64;
    private static final int PARAM_PRE_EQ_BAND = 69;
    private static final int PARAM_MBC = 80;
    private static final int PARAM_MBC_BAND = 85;
    private static final int PARAM_POST_EQ = 96;
    private static final int PARAM_POST_EQ_BAND = 101;
    private static final int PARAM_LIMITER = 112;
    public static final int VARIANT_FAVOR_FREQUENCY_RESOLUTION = 0;
    public static final int VARIANT_FAVOR_TIME_RESOLUTION = 1;
    private static final int CHANNEL_COUNT_MAX = 32;
    private int mChannelCount;
    private android.media.audiofx.DynamicsProcessing.OnParameterChangeListener mParamListener;
    private android.media.audiofx.DynamicsProcessing.BaseParameterListener mBaseParamListener;
    private final java.lang.Object mParamListenerLock = null;
    private static final int CONFIG_DEFAULT_VARIANT = 0;
    private static final boolean CONFIG_DEFAULT_USE_PREEQ = true;
    private static final int CONFIG_DEFAULT_PREEQ_BANDS = 6;
    private static final boolean CONFIG_DEFAULT_USE_MBC = true;
    private static final int CONFIG_DEFAULT_MBC_BANDS = 6;
    private static final boolean CONFIG_DEFAULT_USE_POSTEQ = true;
    private static final int CONFIG_DEFAULT_POSTEQ_BANDS = 6;
    private static final boolean CONFIG_DEFAULT_USE_LIMITER = true;
    private static final float CHANNEL_DEFAULT_INPUT_GAIN = 0.0f;
    private static final float CONFIG_PREFERRED_FRAME_DURATION_MS = 10.0f;
    private static final float EQ_DEFAULT_GAIN = 0.0f;
    private static final boolean PREEQ_DEFAULT_ENABLED = true;
    private static final boolean POSTEQ_DEFAULT_ENABLED = true;
    private static final boolean MBC_DEFAULT_ENABLED = true;
    private static final float MBC_DEFAULT_ATTACK_TIME = 3.0f;
    private static final float MBC_DEFAULT_RELEASE_TIME = 80.0f;
    private static final float MBC_DEFAULT_RATIO = 1.0f;
    private static final float MBC_DEFAULT_THRESHOLD = -45.0f;
    private static final float MBC_DEFAULT_KNEE_WIDTH = 0.0f;
    private static final float MBC_DEFAULT_NOISE_GATE_THRESHOLD = -90.0f;
    private static final float MBC_DEFAULT_EXPANDER_RATIO = 1.0f;
    private static final float MBC_DEFAULT_PRE_GAIN = 0.0f;
    private static final float MBC_DEFAULT_POST_GAIN = 0.0f;
    private static final boolean LIMITER_DEFAULT_ENABLED = true;
    private static final int LIMITER_DEFAULT_LINK_GROUP = 0;
    private static final float LIMITER_DEFAULT_ATTACK_TIME = 1.0f;
    private static final float LIMITER_DEFAULT_RELEASE_TIME = 60.0f;
    private static final float LIMITER_DEFAULT_RATIO = 10.0f;
    private static final float LIMITER_DEFAULT_THRESHOLD = -2.0f;
    private static final float LIMITER_DEFAULT_POST_GAIN = 0.0f;
    private static final float DEFAULT_MIN_FREQUENCY = 220.0f;
    private static final float DEFAULT_MAX_FREQUENCY = 20000.0f;
    private static final float mMinFreqLog = Float.valueOf(0.0f);
    private static final float mMaxFreqLog = Float.valueOf(0.0f);
    public DynamicsProcessing(int p0) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super(null, null, 0, 0); }
    public DynamicsProcessing(int p0, int p1) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super(null, null, 0, 0); }
    public DynamicsProcessing(int p0, int p1, android.media.audiofx.DynamicsProcessing.Config p2) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException { super(null, null, 0, 0); }
    public android.media.audiofx.DynamicsProcessing.Config getConfig() { return null; }
    public android.media.audiofx.DynamicsProcessing.Channel getChannelByChannelIndex(int p0) { return null; }
    public void setChannelTo(int p0, android.media.audiofx.DynamicsProcessing.Channel p1) {}
    public void setAllChannelsTo(android.media.audiofx.DynamicsProcessing.Channel p0) {}
    public float getInputGainByChannelIndex(int p0) { return 0.0f; }
    public void setInputGainbyChannel(int p0, float p1) {}
    public void setInputGainAllChannelsTo(float p0) {}
    public android.media.audiofx.DynamicsProcessing.Eq getPreEqByChannelIndex(int p0) { return null; }
    public void setPreEqByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Eq p1) {}
    public void setPreEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq p0) {}
    public android.media.audiofx.DynamicsProcessing.EqBand getPreEqBandByChannelIndex(int p0, int p1) { return null; }
    public void setPreEqBandByChannelIndex(int p0, int p1, android.media.audiofx.DynamicsProcessing.EqBand p2) {}
    public void setPreEqBandAllChannelsTo(int p0, android.media.audiofx.DynamicsProcessing.EqBand p1) {}
    public android.media.audiofx.DynamicsProcessing.Mbc getMbcByChannelIndex(int p0) { return null; }
    public void setMbcByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Mbc p1) {}
    public void setMbcAllChannelsTo(android.media.audiofx.DynamicsProcessing.Mbc p0) {}
    public android.media.audiofx.DynamicsProcessing.MbcBand getMbcBandByChannelIndex(int p0, int p1) { return null; }
    public void setMbcBandByChannelIndex(int p0, int p1, android.media.audiofx.DynamicsProcessing.MbcBand p2) {}
    public void setMbcBandAllChannelsTo(int p0, android.media.audiofx.DynamicsProcessing.MbcBand p1) {}
    public android.media.audiofx.DynamicsProcessing.Eq getPostEqByChannelIndex(int p0) { return null; }
    public void setPostEqByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Eq p1) {}
    public void setPostEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq p0) {}
    public android.media.audiofx.DynamicsProcessing.EqBand getPostEqBandByChannelIndex(int p0, int p1) { return null; }
    public void setPostEqBandByChannelIndex(int p0, int p1, android.media.audiofx.DynamicsProcessing.EqBand p2) {}
    public void setPostEqBandAllChannelsTo(int p0, android.media.audiofx.DynamicsProcessing.EqBand p1) {}
    public android.media.audiofx.DynamicsProcessing.Limiter getLimiterByChannelIndex(int p0) { return null; }
    public void setLimiterByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Limiter p1) {}
    public void setLimiterAllChannelsTo(android.media.audiofx.DynamicsProcessing.Limiter p0) {}
    public int getChannelCount() { return 0; }
    private void setEngineArchitecture(int p0, float p1, boolean p2, int p3, boolean p4, int p5, boolean p6, int p7, boolean p8) {}
    private void updateEngineEqBandByChannelIndex(int p0, int p1, int p2, android.media.audiofx.DynamicsProcessing.EqBand p3) {}
    private android.media.audiofx.DynamicsProcessing.Eq queryEngineEqByChannelIndex(int p0, int p1) { return null; }
    private android.media.audiofx.DynamicsProcessing.EqBand queryEngineEqBandByChannelIndex(int p0, int p1, int p2) { return null; }
    private void updateEngineEqByChannelIndex(int p0, int p1, android.media.audiofx.DynamicsProcessing.Eq p2) {}
    private android.media.audiofx.DynamicsProcessing.Mbc queryEngineMbcByChannelIndex(int p0) { return null; }
    private android.media.audiofx.DynamicsProcessing.MbcBand queryEngineMbcBandByChannelIndex(int p0, int p1) { return null; }
    private void updateEngineMbcBandByChannelIndex(int p0, int p1, android.media.audiofx.DynamicsProcessing.MbcBand p2) {}
    private void updateEngineMbcByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Mbc p1) {}
    private void updateEngineLimiterByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Limiter p1) {}
    private android.media.audiofx.DynamicsProcessing.Limiter queryEngineLimiterByChannelIndex(int p0) { return null; }
    private android.media.audiofx.DynamicsProcessing.Channel queryEngineByChannelIndex(int p0) { return null; }
    private void updateEngineChannelByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Channel p1) {}
    private int getOneInt(int p0) { return 0; }
    private void setTwoFloat(int p0, int p1, float p2) {}
    private byte[] numberArrayToByteArray(java.lang.Number[] p0) { return null; }
    private void byteArrayToNumberArray(byte[] p0, java.lang.Number[] p1) {}
    private void setNumberArray(java.lang.Number[] p0, java.lang.Number[] p1) {}
    private float getTwoFloat(int p0, int p1) { return 0.0f; }
    private void updateEffectArchitecture() {}
    public void setParameterListener(android.media.audiofx.DynamicsProcessing.OnParameterChangeListener p0) {}
    public android.media.audiofx.DynamicsProcessing.Settings getProperties() { return null; }
    public void setProperties(android.media.audiofx.DynamicsProcessing.Settings p0) {}

    public static class Stage {
        private boolean mInUse;
        private boolean mEnabled;
        public Stage(boolean p0, boolean p1) {}
        public boolean isEnabled() { return false; }
        public void setEnabled(boolean p0) {}
        public boolean isInUse() { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class Settings {
        public int channelCount;
        public float[] inputGain;
        public Settings() {}
        public Settings(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
    }

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.DynamicsProcessing p0, int p1, int p2);
    }

    public static final class MbcBand extends android.media.audiofx.DynamicsProcessing.BandBase {
        private float mAttackTime;
        private float mReleaseTime;
        private float mRatio;
        private float mThreshold;
        private float mKneeWidth;
        private float mNoiseGateThreshold;
        private float mExpanderRatio;
        private float mPreGain;
        private float mPostGain;
        public MbcBand(boolean p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) { super(false, 0.0f); }
        public MbcBand(android.media.audiofx.DynamicsProcessing.MbcBand p0) { super(false, 0.0f); }
        public java.lang.String toString() { return null; }
        public float getAttackTime() { return 0.0f; }
        public void setAttackTime(float p0) {}
        public float getReleaseTime() { return 0.0f; }
        public void setReleaseTime(float p0) {}
        public float getRatio() { return 0.0f; }
        public void setRatio(float p0) {}
        public float getThreshold() { return 0.0f; }
        public void setThreshold(float p0) {}
        public float getKneeWidth() { return 0.0f; }
        public void setKneeWidth(float p0) {}
        public float getNoiseGateThreshold() { return 0.0f; }
        public void setNoiseGateThreshold(float p0) {}
        public float getExpanderRatio() { return 0.0f; }
        public void setExpanderRatio(float p0) {}
        public float getPreGain() { return 0.0f; }
        public void setPreGain(float p0) {}
        public float getPostGain() { return 0.0f; }
        public void setPostGain(float p0) {}
    }

    public static final class Mbc extends android.media.audiofx.DynamicsProcessing.BandStage {
        private final android.media.audiofx.DynamicsProcessing.MbcBand[] mBands = null;
        public Mbc(boolean p0, boolean p1, int p2) { super(false, false, 0); }
        public Mbc(android.media.audiofx.DynamicsProcessing.Mbc p0) { super(false, false, 0); }
        public java.lang.String toString() { return null; }
        private void checkBand(int p0) {}
        public void setBand(int p0, android.media.audiofx.DynamicsProcessing.MbcBand p1) {}
        public android.media.audiofx.DynamicsProcessing.MbcBand getBand(int p0) { return null; }
    }

    public static final class Limiter extends android.media.audiofx.DynamicsProcessing.Stage {
        private int mLinkGroup;
        private float mAttackTime;
        private float mReleaseTime;
        private float mRatio;
        private float mThreshold;
        private float mPostGain;
        public Limiter(boolean p0, boolean p1, int p2, float p3, float p4, float p5, float p6, float p7) { super(false, false); }
        public Limiter(android.media.audiofx.DynamicsProcessing.Limiter p0) { super(false, false); }
        public java.lang.String toString() { return null; }
        public int getLinkGroup() { return 0; }
        public void setLinkGroup(int p0) {}
        public float getAttackTime() { return 0.0f; }
        public void setAttackTime(float p0) {}
        public float getReleaseTime() { return 0.0f; }
        public void setReleaseTime(float p0) {}
        public float getRatio() { return 0.0f; }
        public void setRatio(float p0) {}
        public float getThreshold() { return 0.0f; }
        public void setThreshold(float p0) {}
        public float getPostGain() { return 0.0f; }
        public void setPostGain(float p0) {}
    }

    public static final class EqBand extends android.media.audiofx.DynamicsProcessing.BandBase {
        private float mGain;
        public EqBand(boolean p0, float p1, float p2) { super(false, 0.0f); }
        public EqBand(android.media.audiofx.DynamicsProcessing.EqBand p0) { super(false, 0.0f); }
        public java.lang.String toString() { return null; }
        public float getGain() { return 0.0f; }
        public void setGain(float p0) {}
    }

    public static final class Eq extends android.media.audiofx.DynamicsProcessing.BandStage {
        private final android.media.audiofx.DynamicsProcessing.EqBand[] mBands = null;
        public Eq(boolean p0, boolean p1, int p2) { super(false, false, 0); }
        public Eq(android.media.audiofx.DynamicsProcessing.Eq p0) { super(false, false, 0); }
        public java.lang.String toString() { return null; }
        private void checkBand(int p0) {}
        public void setBand(int p0, android.media.audiofx.DynamicsProcessing.EqBand p1) {}
        public android.media.audiofx.DynamicsProcessing.EqBand getBand(int p0) { return null; }
    }

    public static final class Config {
        private final int mVariant = 0;
        private final int mChannelCount = 0;
        private final boolean mPreEqInUse = false;
        private final int mPreEqBandCount = 0;
        private final boolean mMbcInUse = false;
        private final int mMbcBandCount = 0;
        private final boolean mPostEqInUse = false;
        private final int mPostEqBandCount = 0;
        private final boolean mLimiterInUse = false;
        private final float mPreferredFrameDuration = 0.0f;
        private final android.media.audiofx.DynamicsProcessing.Channel[] mChannel = null;
        public Config(int p0, float p1, int p2, boolean p3, int p4, boolean p5, int p6, boolean p7, int p8, boolean p9, android.media.audiofx.DynamicsProcessing.Channel[] p10) {}
        public Config(int p0, android.media.audiofx.DynamicsProcessing.Config p1) {}
        public Config(android.media.audiofx.DynamicsProcessing.Config p0) {}
        public java.lang.String toString() { return null; }
        private void checkChannel(int p0) {}
        public int getVariant() { return 0; }
        public float getPreferredFrameDuration() { return 0.0f; }
        public boolean isPreEqInUse() { return false; }
        public int getPreEqBandCount() { return 0; }
        public boolean isMbcInUse() { return false; }
        public int getMbcBandCount() { return 0; }
        public boolean isPostEqInUse() { return false; }
        public int getPostEqBandCount() { return 0; }
        public boolean isLimiterInUse() { return false; }
        public android.media.audiofx.DynamicsProcessing.Channel getChannelByChannelIndex(int p0) { return null; }
        public void setChannelTo(int p0, android.media.audiofx.DynamicsProcessing.Channel p1) {}
        public void setAllChannelsTo(android.media.audiofx.DynamicsProcessing.Channel p0) {}
        public float getInputGainByChannelIndex(int p0) { return 0.0f; }
        public void setInputGainByChannelIndex(int p0, float p1) {}
        public void setInputGainAllChannelsTo(float p0) {}
        public android.media.audiofx.DynamicsProcessing.Eq getPreEqByChannelIndex(int p0) { return null; }
        public void setPreEqByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Eq p1) {}
        public void setPreEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq p0) {}
        public android.media.audiofx.DynamicsProcessing.EqBand getPreEqBandByChannelIndex(int p0, int p1) { return null; }
        public void setPreEqBandByChannelIndex(int p0, int p1, android.media.audiofx.DynamicsProcessing.EqBand p2) {}
        public void setPreEqBandAllChannelsTo(int p0, android.media.audiofx.DynamicsProcessing.EqBand p1) {}
        public android.media.audiofx.DynamicsProcessing.Mbc getMbcByChannelIndex(int p0) { return null; }
        public void setMbcByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Mbc p1) {}
        public void setMbcAllChannelsTo(android.media.audiofx.DynamicsProcessing.Mbc p0) {}
        public android.media.audiofx.DynamicsProcessing.MbcBand getMbcBandByChannelIndex(int p0, int p1) { return null; }
        public void setMbcBandByChannelIndex(int p0, int p1, android.media.audiofx.DynamicsProcessing.MbcBand p2) {}
        public void setMbcBandAllChannelsTo(int p0, android.media.audiofx.DynamicsProcessing.MbcBand p1) {}
        public android.media.audiofx.DynamicsProcessing.Eq getPostEqByChannelIndex(int p0) { return null; }
        public void setPostEqByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Eq p1) {}
        public void setPostEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq p0) {}
        public android.media.audiofx.DynamicsProcessing.EqBand getPostEqBandByChannelIndex(int p0, int p1) { return null; }
        public void setPostEqBandByChannelIndex(int p0, int p1, android.media.audiofx.DynamicsProcessing.EqBand p2) {}
        public void setPostEqBandAllChannelsTo(int p0, android.media.audiofx.DynamicsProcessing.EqBand p1) {}
        public android.media.audiofx.DynamicsProcessing.Limiter getLimiterByChannelIndex(int p0) { return null; }
        public void setLimiterByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Limiter p1) {}
        public void setLimiterAllChannelsTo(android.media.audiofx.DynamicsProcessing.Limiter p0) {}

        public static final class Builder {
            private int mVariant;
            private int mChannelCount;
            private boolean mPreEqInUse;
            private int mPreEqBandCount;
            private boolean mMbcInUse;
            private int mMbcBandCount;
            private boolean mPostEqInUse;
            private int mPostEqBandCount;
            private boolean mLimiterInUse;
            private float mPreferredFrameDuration;
            private android.media.audiofx.DynamicsProcessing.Channel[] mChannel;
            public Builder(int p0, int p1, boolean p2, int p3, boolean p4, int p5, boolean p6, int p7, boolean p8) {}
            private void checkChannel(int p0) {}
            public android.media.audiofx.DynamicsProcessing.Config.Builder setPreferredFrameDuration(float p0) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setInputGainByChannelIndex(int p0, float p1) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setInputGainAllChannelsTo(float p0) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setChannelTo(int p0, android.media.audiofx.DynamicsProcessing.Channel p1) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setAllChannelsTo(android.media.audiofx.DynamicsProcessing.Channel p0) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setPreEqByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Eq p1) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setPreEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq p0) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setMbcByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Mbc p1) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setMbcAllChannelsTo(android.media.audiofx.DynamicsProcessing.Mbc p0) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setPostEqByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Eq p1) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setPostEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq p0) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setLimiterByChannelIndex(int p0, android.media.audiofx.DynamicsProcessing.Limiter p1) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config.Builder setLimiterAllChannelsTo(android.media.audiofx.DynamicsProcessing.Limiter p0) { return null; }
            public android.media.audiofx.DynamicsProcessing.Config build() { return null; }
        }
    }

    public static final class Channel {
        private float mInputGain;
        private android.media.audiofx.DynamicsProcessing.Eq mPreEq;
        private android.media.audiofx.DynamicsProcessing.Mbc mMbc;
        private android.media.audiofx.DynamicsProcessing.Eq mPostEq;
        private android.media.audiofx.DynamicsProcessing.Limiter mLimiter;
        public Channel(float p0, boolean p1, int p2, boolean p3, int p4, boolean p5, int p6, boolean p7) {}
        public Channel(android.media.audiofx.DynamicsProcessing.Channel p0) {}
        public java.lang.String toString() { return null; }
        public float getInputGain() { return 0.0f; }
        public void setInputGain(float p0) {}
        public android.media.audiofx.DynamicsProcessing.Eq getPreEq() { return null; }
        public void setPreEq(android.media.audiofx.DynamicsProcessing.Eq p0) {}
        public android.media.audiofx.DynamicsProcessing.EqBand getPreEqBand(int p0) { return null; }
        public void setPreEqBand(int p0, android.media.audiofx.DynamicsProcessing.EqBand p1) {}
        public android.media.audiofx.DynamicsProcessing.Mbc getMbc() { return null; }
        public void setMbc(android.media.audiofx.DynamicsProcessing.Mbc p0) {}
        public android.media.audiofx.DynamicsProcessing.MbcBand getMbcBand(int p0) { return null; }
        public void setMbcBand(int p0, android.media.audiofx.DynamicsProcessing.MbcBand p1) {}
        public android.media.audiofx.DynamicsProcessing.Eq getPostEq() { return null; }
        public void setPostEq(android.media.audiofx.DynamicsProcessing.Eq p0) {}
        public android.media.audiofx.DynamicsProcessing.EqBand getPostEqBand(int p0) { return null; }
        public void setPostEqBand(int p0, android.media.audiofx.DynamicsProcessing.EqBand p1) {}
        public android.media.audiofx.DynamicsProcessing.Limiter getLimiter() { return null; }
        public void setLimiter(android.media.audiofx.DynamicsProcessing.Limiter p0) {}
    }

    private class BaseParameterListener implements android.media.audiofx.AudioEffect.OnParameterChangeListener {
        private BaseParameterListener(android.media.audiofx.DynamicsProcessing p0) {}
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3) {}
    }

    public static class BandStage extends android.media.audiofx.DynamicsProcessing.Stage {
        private int mBandCount;
        public BandStage(boolean p0, boolean p1, int p2) { super(false, false); }
        public int getBandCount() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class BandBase {
        private boolean mEnabled;
        private float mCutoffFrequency;
        public BandBase(boolean p0, float p1) {}
        public java.lang.String toString() { return null; }
        public boolean isEnabled() { return false; }
        public void setEnabled(boolean p0) {}
        public float getCutoffFrequency() { return 0.0f; }
        public void setCutoffFrequency(float p0) {}
    }
}
