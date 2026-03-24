package android.media.audiopolicy;

@android.annotation.SystemApi
public final class AudioProductStrategy implements android.os.Parcelable {
    public static final int DEFAULT_GROUP = -1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioProductStrategy> CREATOR = null;
    @android.annotation.NonNull
    public static java.util.List<android.media.audiopolicy.AudioProductStrategy> getAudioProductStrategies() { return null; }
    @android.annotation.Nullable
    public static android.media.audiopolicy.AudioProductStrategy getAudioProductStrategyForAudioAttributes(android.media.AudioAttributes p0, boolean p1) { return null; }
    @android.annotation.Nullable
    public static android.media.audiopolicy.AudioProductStrategy getAudioProductStrategyWithId(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public static android.media.audiopolicy.AudioProductStrategy createInvalidAudioProductStrategy(int p0) { return null; }
    @android.annotation.NonNull
    public static android.media.AudioAttributes getAudioAttributesForStrategyWithLegacyStreamType(int p0) { return null; }
    public static int getLegacyStreamTypeForStrategyWithAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    public static int getVolumeGroupIdForAudioAttributes(android.media.AudioAttributes p0, boolean p1) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.SystemApi
    public int getId() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    @android.annotation.Nullable
    public android.media.AudioAttributes getAudioAttributesForLegacyStreamType(int p0) { return null; }
    public int getLegacyStreamTypeForAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    @android.annotation.SystemApi
    public boolean supportsAudioAttributes(android.media.AudioAttributes p0) { return false; }
    public int getVolumeGroupIdForLegacyStreamType(int p0) { return 0; }
    public int getVolumeGroupIdForAudioAttributes(android.media.AudioAttributes p0) { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    java.lang.String toString(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static android.media.AudioAttributes getDefaultAttributes() { return null; }
    static boolean isInternalAttributesForStrategy(android.media.AudioAttributes p0) { return false; }
    public static void dump(java.io.PrintWriter p0) {}

    private static final class AudioAttributesGroup implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup> CREATOR = null;
        AudioAttributesGroup(int p0, int p1, int p2, android.media.AudioAttributes[] p3) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int getStreamType() { return 0; }
        public int getVolumeGroupId() { return 0; }
        @android.annotation.NonNull
        public android.media.AudioAttributes getAudioAttributes() { return null; }
        int getStrategyId() { return 0; }
        public int getAttributesMatchingScore(android.media.AudioAttributes p0) { return 0; }
        public boolean supportsStreamType(int p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
        java.lang.String toString(java.lang.String p0) { return null; }
    }

    private static final class ScoredAudioAttributesGroup {
        ScoredAudioAttributesGroup(int p0, android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup p1) {}
        public int getScore() { return 0; }
        public android.media.audiopolicy.AudioProductStrategy.AudioAttributesGroup getAudioAttributesGroup() { return null; }
    }
}
