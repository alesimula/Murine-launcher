package android.media.audiopolicy;

@android.annotation.SystemApi
public final class AudioProductStrategy implements android.os.Parcelable {
    public static final int DEFAULT_GROUP = -1;
    private static final java.lang.String TAG = "AudioProductStrategy";
    private final android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup[] mAudioAttributesGroups = null;
    private final java.lang.String mName = null;
    private int mId;
    private static final java.lang.Object sLock = null;
    private static java.util.List<android.media.audiopolicy.AudioProductStrategy> sAudioProductStrategies;
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioProductStrategy> CREATOR = null;
    public static final android.media.AudioAttributes sDefaultAttributes = null;
    public static java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() { return null; }
    public static android.media.AudioAttributes getAudioAttributesForStrategyWithLegacyStreamType(int p0) { return null; }
    public static int getLegacyStreamTypeForStrategyWithAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    private static java.util.List<android.media.audiopolicy.AudioProductStrategy> initializeAudioProductStrategies() { return null; }
    private static native int native_list_audio_product_strategies(java.util.ArrayList<android.media.audiopolicy.AudioProductStrategy> p0);
    public boolean equals(java.lang.Object p0) { return false; }
    private AudioProductStrategy(java.lang.String p0, int p1, android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup[] p2) {}
    @android.annotation.SystemApi
    public int getId() { return 0; }
    @android.annotation.SystemApi
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public android.media.AudioAttributes getAudioAttributesForLegacyStreamType(int p0) { return null; }
    public int getLegacyStreamTypeForAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    public boolean supportsAudioAttributes(android.media.AudioAttributes p0) { return false; }
    public int getVolumeGroupIdForLegacyStreamType(int p0) { return 0; }
    public int getVolumeGroupIdForAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    private static boolean attributesMatches(android.media.AudioAttributes p0, android.media.AudioAttributes p1) { return false; }

    private static final class AudioAttributesGroup implements android.os.Parcelable {
        private int mVolumeGroupId;
        private int mLegacyStreamType;
        private final android.media.AudioAttributes[] mAudioAttributes = null;
        public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup> CREATOR = null;
        AudioAttributesGroup(int p0, int p1, android.media.AudioAttributes[] p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int getStreamType() { return 0; }
        public int getVolumeGroupId() { return 0; }
        public android.media.AudioAttributes getAudioAttributes() { return null; }
        public boolean supportsAttributes(android.media.AudioAttributes p0) { return false; }
        public boolean supportsStreamType(int p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
