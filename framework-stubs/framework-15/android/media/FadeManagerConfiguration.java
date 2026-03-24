package android.media;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.media.audiopolicy.enable_fade_manager_configuration")
public final class FadeManagerConfiguration implements android.os.Parcelable {
    public static final java.lang.String TAG = "FadeManagerConfiguration";
    public static final int FADE_STATE_DISABLED = 0;
    public static final int FADE_STATE_ENABLED_DEFAULT = 1;
    public static final int VOLUME_SHAPER_SYSTEM_FADE_ID = 2;
    public static final long DURATION_NOT_SET = 0L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.FadeManagerConfiguration> CREATOR = null;
    public int getFadeState() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getFadeableUsages() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getUnfadeablePlayerTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getUnfadeableContentTypes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getUnfadeableUids() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.media.AudioAttributes> getUnfadeableAudioAttributes() { return null; }
    public long getFadeOutDurationForUsage(int p0) { return 0L; }
    public long getFadeInDurationForUsage(int p0) { return 0L; }
    @android.annotation.Nullable
    public android.media.VolumeShaper.Configuration getFadeOutVolumeShaperConfigForUsage(int p0) { return null; }
    @android.annotation.Nullable
    public android.media.VolumeShaper.Configuration getFadeInVolumeShaperConfigForUsage(int p0) { return null; }
    public long getFadeOutDurationForAudioAttributes(android.media.AudioAttributes p0) { return 0L; }
    public long getFadeInDurationForAudioAttributes(android.media.AudioAttributes p0) { return 0L; }
    @android.annotation.Nullable
    public android.media.VolumeShaper.Configuration getFadeOutVolumeShaperConfigForAudioAttributes(android.media.AudioAttributes p0) { return null; }
    @android.annotation.Nullable
    public android.media.VolumeShaper.Configuration getFadeInVolumeShaperConfigForAudioAttributes(android.media.AudioAttributes p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.media.AudioAttributes> getAudioAttributesWithVolumeShaperConfigs() { return null; }
    public long getFadeInDelayForOffenders() { return 0L; }
    public boolean isFadeEnabled() { return false; }
    public boolean isUsageFadeable(int p0) { return false; }
    public boolean isContentTypeUnfadeable(int p0) { return false; }
    public boolean isPlayerTypeUnfadeable(int p0) { return false; }
    public boolean isAudioAttributesUnfadeable(android.media.AudioAttributes p0) { return false; }
    public boolean isUidUnfadeable(int p0) { return false; }
    public static long getDefaultFadeOutDurationMillis() { return 0L; }
    public static long getDefaultFadeInDurationMillis() { return 0L; }
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String fadeStateToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    FadeManagerConfiguration(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder() {}
        public Builder(long p0, long p1) {}
        public Builder(android.media.FadeManagerConfiguration p0) {}
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeState(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeOutVolumeShaperConfigForUsage(int p0, android.media.VolumeShaper.Configuration p1) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeInVolumeShaperConfigForUsage(int p0, android.media.VolumeShaper.Configuration p1) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeOutDurationForUsage(int p0, long p1) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeInDurationForUsage(int p0, long p1) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeOutVolumeShaperConfigForAudioAttributes(android.media.AudioAttributes p0, android.media.VolumeShaper.Configuration p1) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeInVolumeShaperConfigForAudioAttributes(android.media.AudioAttributes p0, android.media.VolumeShaper.Configuration p1) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeOutDurationForAudioAttributes(android.media.AudioAttributes p0, long p1) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeInDurationForAudioAttributes(android.media.AudioAttributes p0, long p1) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeableUsages(java.util.List<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder addFadeableUsage(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder clearFadeableUsages() { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setUnfadeableContentTypes(java.util.List<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder addUnfadeableContentType(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder clearUnfadeableContentTypes() { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setUnfadeableUids(java.util.List<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder addUnfadeableUid(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder clearUnfadeableUids() { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setUnfadeableAudioAttributes(java.util.List<android.media.AudioAttributes> p0) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder addUnfadeableAudioAttributes(android.media.AudioAttributes p0) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder clearUnfadeableAudioAttributes() { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration.Builder setFadeInDelayForOffenders(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.FadeManagerConfiguration build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FadeStateEnum {
    }

    private static final class FadeVolumeShaperConfigsWrapper implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper> CREATOR = null;
        FadeVolumeShaperConfigsWrapper() {}
        FadeVolumeShaperConfigsWrapper(android.media.FadeManagerConfiguration.FadeVolumeShaperConfigsWrapper p0) {}
        public void setFadeOutVolShaperConfig(android.media.VolumeShaper.Configuration p0) {}
        public void setFadeInVolShaperConfig(android.media.VolumeShaper.Configuration p0) {}
        @android.annotation.Nullable
        public android.media.VolumeShaper.Configuration getFadeOutVolShaperConfig() { return null; }
        @android.annotation.Nullable
        public android.media.VolumeShaper.Configuration getFadeInVolShaperConfig() { return null; }
        public boolean isInactive() { return false; }
        boolean isFadeOutConfigActive() { return false; }
        boolean isFadeInConfigActive() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        FadeVolumeShaperConfigsWrapper(android.os.Parcel p0) {}
    }
}
