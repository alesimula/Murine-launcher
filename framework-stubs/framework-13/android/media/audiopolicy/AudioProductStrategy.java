package android.media.audiopolicy;

@android.annotation.SystemApi
public final class AudioProductStrategy implements android.os.Parcelable {
    public static final int DEFAULT_GROUP = -1;
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioProductStrategy> CREATOR = null;
    public static java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() { return null; }
    public static android.media.audiopolicy.AudioProductStrategy getAudioProductStrategyWithId(int p0) { return null; }
    @android.annotation.SystemApi
    public static android.media.audiopolicy.AudioProductStrategy createInvalidAudioProductStrategy(int p0) { return null; }
    public static android.media.AudioAttributes getAudioAttributesForStrategyWithLegacyStreamType(int p0) { return null; }
    public static int getLegacyStreamTypeForStrategyWithAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    public static int getVolumeGroupIdForAudioAttributes(android.media.AudioAttributes p0, boolean p1) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.SystemApi
    public int getId() { return 0; }
    public java.lang.String getName() { return null; }
    @android.annotation.SystemApi
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public android.media.AudioAttributes getAudioAttributesForLegacyStreamType(int p0) { return null; }
    public int getLegacyStreamTypeForAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.SystemApi
    public boolean supportsAudioAttributes(android.media.AudioAttributes p0) { return false; }
    public int getVolumeGroupIdForLegacyStreamType(int p0) { return 0; }
    public int getVolumeGroupIdForAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public static android.media.AudioAttributes getDefaultAttributes() { return null; }

    private static final class AudioAttributesGroup implements android.os.Parcelable {
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
