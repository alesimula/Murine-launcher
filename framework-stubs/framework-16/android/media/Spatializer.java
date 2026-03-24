package android.media;

public class Spatializer {
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_OTHER = -1;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_NONE = 0;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_MULTICHANNEL = 1;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_MCHAN_BED_PLUS_OBJECTS = 2;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public static final int HEAD_TRACKING_MODE_UNSUPPORTED = -2;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public static final int HEAD_TRACKING_MODE_DISABLED = -1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public static final int HEAD_TRACKING_MODE_OTHER = 0;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public static final int HEAD_TRACKING_MODE_RELATIVE_WORLD = 1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public static final int HEAD_TRACKING_MODE_RELATIVE_DEVICE = 2;
    protected Spatializer(android.media.AudioManager p0) {}
    public boolean isEnabled() { return false; }
    public boolean isAvailable() { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public boolean isAvailableForDevice(android.media.AudioDeviceAttributes p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public boolean hasHeadTracker(android.media.AudioDeviceAttributes p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setHeadTrackerEnabled(boolean p0, android.media.AudioDeviceAttributes p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public boolean isHeadTrackerEnabled(android.media.AudioDeviceAttributes p0) { return false; }
    public boolean isHeadTrackerAvailable() { return false; }
    public void addOnHeadTrackerAvailableListener(java.util.concurrent.Executor p0, android.media.Spatializer.OnHeadTrackerAvailableListener p1) {}
    public void removeOnHeadTrackerAvailableListener(android.media.Spatializer.OnHeadTrackerAvailableListener p0) {}
    public static final java.lang.String headtrackingModeToString(int p0) { return null; }
    public int getImmersiveAudioLevel() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setEnabled(boolean p0) {}
    public boolean canBeSpatialized(android.media.AudioAttributes p0, android.media.AudioFormat p1) { return false; }
    @android.annotation.FlaggedApi("android.media.audio.spatializer_capabilities")
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getSpatializedChannelMasks() { return null; }
    public void addOnSpatializerStateChangedListener(java.util.concurrent.Executor p0, android.media.Spatializer.OnSpatializerStateChangedListener p1) {}
    public void removeOnSpatializerStateChangedListener(android.media.Spatializer.OnSpatializerStateChangedListener p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    @android.annotation.NonNull
    public java.util.List<android.media.AudioDeviceAttributes> getCompatibleAudioDevices() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void addCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void removeCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public int getHeadTrackingMode() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public int getDesiredHeadTrackingMode() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getSupportedHeadTrackingModes() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setDesiredHeadTrackingMode(int p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void recenterHeadTracker() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void addOnHeadTrackingModeChangedListener(java.util.concurrent.Executor p0, android.media.Spatializer.OnHeadTrackingModeChangedListener p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void removeOnHeadTrackingModeChangedListener(android.media.Spatializer.OnHeadTrackingModeChangedListener p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setOnHeadToSoundstagePoseUpdatedListener(java.util.concurrent.Executor p0, android.media.Spatializer.OnHeadToSoundstagePoseUpdatedListener p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void clearOnHeadToSoundstagePoseUpdatedListener() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setGlobalTransform(float[] p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setEffectParameter(int p0, byte[] p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void getEffectParameter(int p0, byte[] p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public int getOutput() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void setOnSpatializerOutputChangedListener(java.util.concurrent.Executor p0, android.media.Spatializer.OnSpatializerOutputChangedListener p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    @android.annotation.RequiresPermission("android.permission.MODIFY_DEFAULT_AUDIO_EFFECTS")
    public void clearOnSpatializerOutputChangedListener() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HeadTrackingMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HeadTrackingModeSet {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HeadTrackingModeSupported {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImmersiveAudioLevel {
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static interface OnHeadToSoundstagePoseUpdatedListener {
        public void onHeadToSoundstagePoseUpdated(android.media.Spatializer p0, float[] p1);
    }

    public static interface OnHeadTrackerAvailableListener {
        public void onHeadTrackerAvailableChanged(android.media.Spatializer p0, boolean p1);
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static interface OnHeadTrackingModeChangedListener {
        public void onHeadTrackingModeChanged(android.media.Spatializer p0, int p1);
        public void onDesiredHeadTrackingModeChanged(android.media.Spatializer p0, int p1);
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static interface OnSpatializerOutputChangedListener {
        public void onSpatializerOutputChanged(android.media.Spatializer p0, int p1);
    }

    public static interface OnSpatializerStateChangedListener {
        public void onSpatializerEnabledChanged(android.media.Spatializer p0, boolean p1);
        public void onSpatializerAvailableChanged(android.media.Spatializer p0, boolean p1);
    }

    private final class SpatializerHeadTrackerAvailableDispatcherStub extends android.media.ISpatializerHeadTrackerAvailableCallback.Stub implements android.media.CallbackUtil.DispatcherStub {
        public void register(boolean p0) {}
        @android.annotation.SuppressLint("GuardedBy")
        public void dispatchSpatializerHeadTrackerAvailable(boolean p0) {}
    }

    private final class SpatializerHeadTrackingDispatcherStub extends android.media.ISpatializerHeadTrackingModeCallback.Stub implements android.media.CallbackUtil.DispatcherStub {
        public void register(boolean p0) {}
        @android.annotation.SuppressLint("GuardedBy")
        public void dispatchSpatializerActualHeadTrackingModeChanged(int p0) {}
        @android.annotation.SuppressLint("GuardedBy")
        public void dispatchSpatializerDesiredHeadTrackingModeChanged(int p0) {}
    }

    private final class SpatializerInfoDispatcherStub extends android.media.ISpatializerCallback.Stub implements android.media.CallbackUtil.DispatcherStub {
        public void register(boolean p0) {}
        @android.annotation.SuppressLint("GuardedBy")
        public void dispatchSpatializerEnabledChanged(boolean p0) {}
        @android.annotation.SuppressLint("GuardedBy")
        public void dispatchSpatializerAvailableChanged(boolean p0) {}
    }

    private final class SpatializerOutputDispatcherStub extends android.media.ISpatializerOutputCallback.Stub {
        public void dispatchSpatializerOutputChanged(int p0) {}
    }

    private final class SpatializerPoseDispatcherStub extends android.media.ISpatializerHeadToSoundStagePoseCallback.Stub {
        public void dispatchPoseChanged(float[] p0) {}
    }
}
