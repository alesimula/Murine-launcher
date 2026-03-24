package android.media.tv;

@android.annotation.SystemApi
public class TvStreamConfig implements android.os.Parcelable {
    static final java.lang.String TAG = null;
    public static final int STREAM_TYPE_INDEPENDENT_VIDEO_SOURCE = 1;
    public static final int STREAM_TYPE_BUFFER_PRODUCER = 2;
    private int mStreamId;
    private int mType;
    private int mMaxWidth;
    private int mMaxHeight;
    private int mGeneration;
    public static final android.os.Parcelable.Creator<android.media.tv.TvStreamConfig> CREATOR = null;
    private TvStreamConfig() {}
    public int getStreamId() { return 0; }
    public int getType() { return 0; }
    public int getMaxWidth() { return 0; }
    public int getMaxHeight() { return 0; }
    public int getGeneration() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        private java.lang.Integer mStreamId;
        private java.lang.Integer mType;
        private java.lang.Integer mMaxWidth;
        private java.lang.Integer mMaxHeight;
        private java.lang.Integer mGeneration;
        public Builder() {}
        public android.media.tv.TvStreamConfig.Builder streamId(int p0) { return null; }
        public android.media.tv.TvStreamConfig.Builder type(int p0) { return null; }
        public android.media.tv.TvStreamConfig.Builder maxWidth(int p0) { return null; }
        public android.media.tv.TvStreamConfig.Builder maxHeight(int p0) { return null; }
        public android.media.tv.TvStreamConfig.Builder generation(int p0) { return null; }
        public android.media.tv.TvStreamConfig build() { return null; }
    }
}
