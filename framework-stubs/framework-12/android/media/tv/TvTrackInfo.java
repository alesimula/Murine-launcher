package android.media.tv;

public final class TvTrackInfo implements android.os.Parcelable {
    public static final int TYPE_AUDIO = 0;
    public static final int TYPE_VIDEO = 1;
    public static final int TYPE_SUBTITLE = 2;
    private final int mType = 0;
    private final java.lang.String mId = null;
    private final java.lang.String mLanguage = null;
    private final java.lang.CharSequence mDescription = null;
    private final java.lang.String mEncoding = null;
    private final boolean mEncrypted = false;
    private final int mAudioChannelCount = 0;
    private final int mAudioSampleRate = 0;
    private final boolean mAudioDescription = false;
    private final boolean mHardOfHearing = false;
    private final boolean mSpokenSubtitle = false;
    private final int mVideoWidth = 0;
    private final int mVideoHeight = 0;
    private final float mVideoFrameRate = 0.0f;
    private final float mVideoPixelAspectRatio = 0.0f;
    private final byte mVideoActiveFormatDescription = 0;
    private final android.os.Bundle mExtra = null;
    public static final android.os.Parcelable.Creator<android.media.tv.TvTrackInfo> CREATOR = null;
    private TvTrackInfo(int p0, java.lang.String p1, java.lang.String p2, java.lang.CharSequence p3, java.lang.String p4, boolean p5, int p6, int p7, boolean p8, boolean p9, boolean p10, int p11, int p12, float p13, float p14, byte p15, android.os.Bundle p16) {}
    private TvTrackInfo(android.os.Parcel p0) {}
    public final int getType() { return 0; }
    public final java.lang.String getId() { return null; }
    public final java.lang.String getLanguage() { return null; }
    public final java.lang.CharSequence getDescription() { return null; }
    public java.lang.String getEncoding() { return null; }
    public boolean isEncrypted() { return false; }
    public final int getAudioChannelCount() { return 0; }
    public final int getAudioSampleRate() { return 0; }
    public boolean isAudioDescription() { return false; }
    public boolean isHardOfHearing() { return false; }
    public boolean isSpokenSubtitle() { return false; }
    public final int getVideoWidth() { return 0; }
    public final int getVideoHeight() { return 0; }
    public final float getVideoFrameRate() { return 0.0f; }
    public final float getVideoPixelAspectRatio() { return 0.0f; }
    public final byte getVideoActiveFormatDescription() { return 0; }
    public final android.os.Bundle getExtra() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        private final java.lang.String mId = null;
        private final int mType = 0;
        private java.lang.String mLanguage;
        private java.lang.CharSequence mDescription;
        private java.lang.String mEncoding;
        private boolean mEncrypted;
        private int mAudioChannelCount;
        private int mAudioSampleRate;
        private boolean mAudioDescription;
        private boolean mHardOfHearing;
        private boolean mSpokenSubtitle;
        private int mVideoWidth;
        private int mVideoHeight;
        private float mVideoFrameRate;
        private float mVideoPixelAspectRatio;
        private byte mVideoActiveFormatDescription;
        private android.os.Bundle mExtra;
        public Builder(int p0, java.lang.String p1) {}
        public android.media.tv.TvTrackInfo.Builder setLanguage(java.lang.String p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setEncoding(java.lang.String p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setEncrypted(boolean p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setAudioChannelCount(int p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setAudioSampleRate(int p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setAudioDescription(boolean p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setHardOfHearing(boolean p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setSpokenSubtitle(boolean p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setVideoWidth(int p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setVideoHeight(int p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setVideoFrameRate(float p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setVideoPixelAspectRatio(float p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setVideoActiveFormatDescription(byte p0) { return null; }
        public android.media.tv.TvTrackInfo.Builder setExtra(android.os.Bundle p0) { return null; }
        public android.media.tv.TvTrackInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
