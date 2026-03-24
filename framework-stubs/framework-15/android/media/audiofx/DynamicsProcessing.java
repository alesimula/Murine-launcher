package android.media.audiofx;

public final class DynamicsProcessing extends android.media.audiofx.AudioEffect {
    public static final int VARIANT_FAVOR_FREQUENCY_RESOLUTION = 0;
    public static final int VARIANT_FAVOR_TIME_RESOLUTION = 1;
    public DynamicsProcessing(int p0) { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public DynamicsProcessing(int p0, int p1) { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
    public DynamicsProcessing(int p0, int p1, android.media.audiofx.DynamicsProcessing.Config p2) { super((java.util.UUID)null, (android.media.AudioDeviceAttributes)null); }
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
    public void setParameterListener(android.media.audiofx.DynamicsProcessing.OnParameterChangeListener p0) {}
    public android.media.audiofx.DynamicsProcessing.Settings getProperties() { return null; }
    public void setProperties(android.media.audiofx.DynamicsProcessing.Settings p0) {}

    public static class BandBase {
        public BandBase(boolean p0, float p1) {}
        public java.lang.String toString() { return null; }
        public boolean isEnabled() { return false; }
        public void setEnabled(boolean p0) {}
        public float getCutoffFrequency() { return 0.0f; }
        public void setCutoffFrequency(float p0) {}
    }

    public static class BandStage extends android.media.audiofx.DynamicsProcessing.Stage {
        public BandStage(boolean p0, boolean p1, int p2) { super(false, false); }
        public int getBandCount() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private class BaseParameterListener implements android.media.audiofx.AudioEffect.OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.AudioEffect p0, int p1, byte[] p2, byte[] p3) {}
    }

    public static final class Channel {
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

    public static final class Config {
        public Config(int p0, float p1, int p2, boolean p3, int p4, boolean p5, int p6, boolean p7, int p8, boolean p9, android.media.audiofx.DynamicsProcessing.Channel[] p10) {}
        public Config(int p0, android.media.audiofx.DynamicsProcessing.Config p1) {}
        public Config(android.media.audiofx.DynamicsProcessing.Config p0) {}
        public java.lang.String toString() { return null; }
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
            public Builder(int p0, int p1, boolean p2, int p3, boolean p4, int p5, boolean p6, int p7, boolean p8) {}
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

    public static final class Eq extends android.media.audiofx.DynamicsProcessing.BandStage {
        public Eq(boolean p0, boolean p1, int p2) { super(false, false, 0); }
        public Eq(android.media.audiofx.DynamicsProcessing.Eq p0) { super(false, false, 0); }
        public java.lang.String toString() { return null; }
        public void setBand(int p0, android.media.audiofx.DynamicsProcessing.EqBand p1) {}
        public android.media.audiofx.DynamicsProcessing.EqBand getBand(int p0) { return null; }
    }

    public static final class EqBand extends android.media.audiofx.DynamicsProcessing.BandBase {
        public EqBand(boolean p0, float p1, float p2) { super(false, 0.0f); }
        public EqBand(android.media.audiofx.DynamicsProcessing.EqBand p0) { super(false, 0.0f); }
        public java.lang.String toString() { return null; }
        public float getGain() { return 0.0f; }
        public void setGain(float p0) {}
    }

    public static final class Limiter extends android.media.audiofx.DynamicsProcessing.Stage {
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

    public static final class Mbc extends android.media.audiofx.DynamicsProcessing.BandStage {
        public Mbc(boolean p0, boolean p1, int p2) { super(false, false, 0); }
        public Mbc(android.media.audiofx.DynamicsProcessing.Mbc p0) { super(false, false, 0); }
        public java.lang.String toString() { return null; }
        public void setBand(int p0, android.media.audiofx.DynamicsProcessing.MbcBand p1) {}
        public android.media.audiofx.DynamicsProcessing.MbcBand getBand(int p0) { return null; }
    }

    public static final class MbcBand extends android.media.audiofx.DynamicsProcessing.BandBase {
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

    public static interface OnParameterChangeListener {
        public void onParameterChange(android.media.audiofx.DynamicsProcessing p0, int p1, int p2);
    }

    public static class Settings {
        public int channelCount;
        public float[] inputGain;
        public Settings() {}
        public Settings(java.lang.String p0) {}
        public java.lang.String toString() { return null; }
    }

    public static class Stage {
        public Stage(boolean p0, boolean p1) {}
        public boolean isEnabled() { return false; }
        public void setEnabled(boolean p0) {}
        public boolean isInUse() { return false; }
        public java.lang.String toString() { return null; }
    }
}
