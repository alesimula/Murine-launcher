package android.media.quality;

@android.annotation.FlaggedApi("android.media.tv.flags.media_quality_fw")
public final class MediaQualityManager {
    public static final java.lang.String OPTION_INCLUDE_PARAMETERS = "include_parameters";
    public static final int AMBIENT_BACKLIGHT_EVENT_ENABLED = 1;
    public static final int AMBIENT_BACKLIGHT_EVENT_DISABLED = 2;
    public static final int AMBIENT_BACKLIGHT_EVENT_METADATA = 3;
    public static final int AMBIENT_BACKLIGHT_EVENT_INTERRUPTED = 4;
    public MediaQualityManager(android.content.Context p0, android.media.quality.IMediaQualityManager p1) {}
    public void registerPictureProfileCallback(java.util.concurrent.Executor p0, android.media.quality.MediaQualityManager.PictureProfileCallback p1) {}
    public void unregisterPictureProfileCallback(android.media.quality.MediaQualityManager.PictureProfileCallback p0) {}
    @android.annotation.Nullable
    public android.media.quality.PictureProfile getPictureProfile(int p0, java.lang.String p1, android.media.quality.MediaQualityManager.ProfileQueryParams p2) { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.List<android.media.quality.PictureProfile> getPictureProfilesByPackage(java.lang.String p0, android.media.quality.MediaQualityManager.ProfileQueryParams p1) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.media.quality.PictureProfile> getAvailablePictureProfiles(android.media.quality.MediaQualityManager.ProfileQueryParams p0) { return null; }
    @android.annotation.Nullable
    public android.media.quality.PictureProfile getDefaultPictureProfile() { return null; }
    @android.annotation.SystemApi
    public boolean setDefaultPictureProfile(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getPictureProfilePackageNames() { return null; }
    public java.util.List<android.media.quality.PictureProfileHandle> getPictureProfileHandle(java.lang.String[] p0) { return null; }
    public long getPictureProfileForTvInput(java.lang.String p0) { return 0L; }
    public android.media.quality.PictureProfile getCurrentPictureProfileForTvInput(java.lang.String p0) { return null; }
    public java.util.List<android.media.quality.PictureProfile> getAllPictureProfilesForTvInput(java.lang.String p0) { return null; }
    public java.util.List<android.media.quality.SoundProfileHandle> getSoundProfileHandle(java.lang.String[] p0) { return null; }
    public void createPictureProfile(android.media.quality.PictureProfile p0) {}
    public void updatePictureProfile(java.lang.String p0, android.media.quality.PictureProfile p1) {}
    public void removePictureProfile(java.lang.String p0) {}
    public void changeStreamStatus(java.lang.String p0, java.lang.String p1) {}
    public void registerSoundProfileCallback(java.util.concurrent.Executor p0, android.media.quality.MediaQualityManager.SoundProfileCallback p1) {}
    public void unregisterSoundProfileCallback(android.media.quality.MediaQualityManager.SoundProfileCallback p0) {}
    @android.annotation.Nullable
    public android.media.quality.SoundProfile getSoundProfile(int p0, java.lang.String p1, android.media.quality.MediaQualityManager.ProfileQueryParams p2) { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.List<android.media.quality.SoundProfile> getSoundProfilesByPackage(java.lang.String p0, android.media.quality.MediaQualityManager.ProfileQueryParams p1) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.media.quality.SoundProfile> getAvailableSoundProfiles(android.media.quality.MediaQualityManager.ProfileQueryParams p0) { return null; }
    @android.annotation.SystemApi
    public boolean setDefaultSoundProfile(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSoundProfilePackageNames() { return null; }
    public void createSoundProfile(android.media.quality.SoundProfile p0) {}
    public void updateSoundProfile(java.lang.String p0, android.media.quality.SoundProfile p1) {}
    public void removeSoundProfile(java.lang.String p0) {}
    @android.annotation.NonNull
    public java.util.List<android.media.quality.ParameterCapability> getParameterCapabilities(java.util.List<java.lang.String> p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getPictureProfileAllowList() { return null; }
    @android.annotation.SystemApi
    public void setPictureProfileAllowList(java.util.List<java.lang.String> p0) {}
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSoundProfileAllowList() { return null; }
    @android.annotation.SystemApi
    public void setSoundProfileAllowList(java.util.List<java.lang.String> p0) {}
    public boolean isSupported() { return false; }
    @android.annotation.SystemApi
    public void setAutoPictureQualityEnabled(boolean p0) {}
    public boolean isAutoPictureQualityEnabled() { return false; }
    @android.annotation.SystemApi
    public void setSuperResolutionEnabled(boolean p0) {}
    public boolean isSuperResolutionEnabled() { return false; }
    @android.annotation.SystemApi
    public void setAutoSoundQualityEnabled(boolean p0) {}
    public boolean isAutoSoundQualityEnabled() { return false; }
    public void registerAmbientBacklightCallback(java.util.concurrent.Executor p0, android.media.quality.MediaQualityManager.AmbientBacklightCallback p1) {}
    public void unregisterAmbientBacklightCallback(android.media.quality.MediaQualityManager.AmbientBacklightCallback p0) {}
    public void setAmbientBacklightSettings(android.media.quality.AmbientBacklightSettings p0) {}
    public boolean isAmbientBacklightEnabled() { return false; }
    public void setAmbientBacklightEnabled(boolean p0) {}
    public void addActiveProcessingPictureListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.media.quality.ActiveProcessingPicture>> p1) {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("PairedRegistration")
    public void addGlobalActiveProcessingPictureListener(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.media.quality.ActiveProcessingPicture>> p1) {}
    public void removeActiveProcessingPictureListener(java.util.function.Consumer<java.util.List<android.media.quality.ActiveProcessingPicture>> p0) {}

    private static final class ActiveProcessingPictureListenerRecord {
        ActiveProcessingPictureListenerRecord(java.util.function.Consumer<java.util.List<android.media.quality.ActiveProcessingPicture>> p0, java.util.concurrent.Executor p1, boolean p2) {}
        public java.util.function.Consumer<java.util.List<android.media.quality.ActiveProcessingPicture>> getListener() { return null; }
        public void postActiveProcessingPicturesChanged(java.util.List<android.media.quality.ActiveProcessingPicture> p0) {}
    }

    public static interface AmbientBacklightCallback {
        public void onAmbientBacklightEvent(android.media.quality.AmbientBacklightEvent p0);
    }

    private static final class AmbientBacklightCallbackRecord {
        AmbientBacklightCallbackRecord(android.media.quality.MediaQualityManager.AmbientBacklightCallback p0, java.util.concurrent.Executor p1) {}
        public android.media.quality.MediaQualityManager.AmbientBacklightCallback getCallback() { return null; }
        public void postAmbientBacklightEvent(android.media.quality.AmbientBacklightEvent p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AmbientBacklightEventTypes {
    }

    public static abstract class PictureProfileCallback {
        public PictureProfileCallback() {}
        public void onPictureProfileAdded(java.lang.String p0, android.media.quality.PictureProfile p1) {}
        public void onPictureProfileUpdated(java.lang.String p0, android.media.quality.PictureProfile p1) {}
        public void onPictureProfileRemoved(java.lang.String p0, android.media.quality.PictureProfile p1) {}
        public void onError(java.lang.String p0, int p1) {}
        public void onParameterCapabilitiesChanged(java.lang.String p0, java.util.List<android.media.quality.ParameterCapability> p1) {}
    }

    private static final class PictureProfileCallbackRecord {
        PictureProfileCallbackRecord(android.media.quality.MediaQualityManager.PictureProfileCallback p0, java.util.concurrent.Executor p1) {}
        public android.media.quality.MediaQualityManager.PictureProfileCallback getCallback() { return null; }
        public void postPictureProfileAdded(java.lang.String p0, android.media.quality.PictureProfile p1) {}
        public void postPictureProfileUpdated(java.lang.String p0, android.media.quality.PictureProfile p1) {}
        public void postPictureProfileRemoved(java.lang.String p0, android.media.quality.PictureProfile p1) {}
        public void postParameterCapabilitiesChanged(java.lang.String p0, java.util.List<android.media.quality.ParameterCapability> p1) {}
        public void postError(java.lang.String p0, int p1) {}
    }

    public static final class ProfileQueryParams implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.media.quality.MediaQualityManager.ProfileQueryParams> CREATOR = null;
        public ProfileQueryParams(boolean p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean areParametersIncluded() { return false; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            @android.annotation.NonNull
            public android.media.quality.MediaQualityManager.ProfileQueryParams.Builder setParametersIncluded(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.media.quality.MediaQualityManager.ProfileQueryParams build() { return null; }
        }
    }

    public static abstract class SoundProfileCallback {
        public SoundProfileCallback() {}
        public void onSoundProfileAdded(java.lang.String p0, android.media.quality.SoundProfile p1) {}
        public void onSoundProfileUpdated(java.lang.String p0, android.media.quality.SoundProfile p1) {}
        public void onSoundProfileRemoved(java.lang.String p0, android.media.quality.SoundProfile p1) {}
        public void onError(java.lang.String p0, int p1) {}
        public void onParameterCapabilitiesChanged(java.lang.String p0, java.util.List<android.media.quality.ParameterCapability> p1) {}
    }

    private static final class SoundProfileCallbackRecord {
        SoundProfileCallbackRecord(android.media.quality.MediaQualityManager.SoundProfileCallback p0, java.util.concurrent.Executor p1) {}
        public android.media.quality.MediaQualityManager.SoundProfileCallback getCallback() { return null; }
        public void postSoundProfileAdded(java.lang.String p0, android.media.quality.SoundProfile p1) {}
        public void postSoundProfileUpdated(java.lang.String p0, android.media.quality.SoundProfile p1) {}
        public void postSoundProfileRemoved(java.lang.String p0, android.media.quality.SoundProfile p1) {}
        public void postParameterCapabilitiesChanged(java.lang.String p0, java.util.List<android.media.quality.ParameterCapability> p1) {}
        public void postError(java.lang.String p0, int p1) {}
    }
}
