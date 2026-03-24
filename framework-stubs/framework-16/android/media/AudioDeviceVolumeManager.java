package android.media;

@android.annotation.SystemApi
public class AudioDeviceVolumeManager {
    public static final int DEVICE_VOLUME_BEHAVIOR_UNSET = -1;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public static final int DEVICE_VOLUME_BEHAVIOR_VARIABLE = 0;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public static final int DEVICE_VOLUME_BEHAVIOR_FULL = 1;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public static final int DEVICE_VOLUME_BEHAVIOR_FIXED = 2;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE = 3;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE_MULTI_MODE = 4;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE_ADJUST_ONLY = 5;
    public static final int ADJUST_MODE_NORMAL = 0;
    public static final int ADJUST_MODE_START = 1;
    public static final int ADJUST_MODE_END = 2;
    public static void enforceValidVolumeBehavior(int p0) {}
    public AudioDeviceVolumeManager(android.content.Context p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    public boolean isFullVolumeDevice() { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.BLUETOOTH_STACK"})
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public void setDeviceAbsoluteVolumeBehavior(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, java.util.concurrent.Executor p2, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void setDeviceAbsoluteVolumeBehavior(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, boolean p2, java.util.concurrent.Executor p3, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p4) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.BLUETOOTH_STACK"})
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public void setDeviceAbsoluteMultiVolumeBehavior(android.media.AudioDeviceAttributes p0, java.util.List<android.media.VolumeInfo> p1, java.util.concurrent.Executor p2, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void setDeviceAbsoluteMultiVolumeBehavior(android.media.AudioDeviceAttributes p0, java.util.List<android.media.VolumeInfo> p1, boolean p2, java.util.concurrent.Executor p3, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void setDeviceAbsoluteVolumeAdjustOnlyBehavior(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, boolean p2, java.util.concurrent.Executor p3, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void setDeviceAbsoluteMultiVolumeAdjustOnlyBehavior(android.media.AudioDeviceAttributes p0, java.util.List<android.media.VolumeInfo> p1, boolean p2, java.util.concurrent.Executor p3, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED", "android.permission.BLUETOOTH_PRIVILEGED", "android.permission.BLUETOOTH_STACK"})
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public void resetDeviceAbsoluteVolumeBehavior(android.media.AudioDeviceAttributes p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE"})
    public void addOnDeviceVolumeBehaviorChangedListener(java.util.concurrent.Executor p0, android.media.AudioDeviceVolumeManager.OnDeviceVolumeBehaviorChangedListener p1) throws java.lang.SecurityException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE"})
    public void removeOnDeviceVolumeBehaviorChangedListener(android.media.AudioDeviceVolumeManager.OnDeviceVolumeBehaviorChangedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    public void setDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    @android.annotation.FlaggedApi("android.media.audio.device_volume_apis")
    public void setVolumeForDevice(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    @android.annotation.FlaggedApi("android.media.audio.device_volume_apis")
    public void adjustVolumeForDevice(android.media.VolumeInfo p0, int p1, android.media.AudioDeviceAttributes p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED", "android.permission.BLUETOOTH_PRIVILEGED"})
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public void notifyAbsoluteVolumeChanged(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    @android.annotation.NonNull
    public android.media.VolumeInfo getDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1) { return null; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_audio_input_device_routing_and_volume_control")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public void setInputGainIndex(android.media.AudioDeviceAttributes p0, int p1) {}
    @android.annotation.FlaggedApi("com.android.media.flags.enable_audio_input_device_routing_and_volume_control")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int getInputGainIndex(android.media.AudioDeviceAttributes p0) { return 0; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_audio_input_device_routing_and_volume_control")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int getMaxInputGainIndex() { return 0; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_audio_input_device_routing_and_volume_control")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public int getMinInputGainIndex() { return 0; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_audio_input_device_routing_and_volume_control")
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED")
    public boolean isInputGainFixed(android.media.AudioDeviceAttributes p0) { return false; }
    public static java.lang.String volumeBehaviorName(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AbsoluteDeviceVolumeBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceVolumeBehavior {
    }

    private final class DeviceVolumeBehaviorDispatcherStub extends android.media.IDeviceVolumeBehaviorDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        public void register(boolean p0) {}
        public void dispatchDeviceVolumeBehaviorChanged(android.media.AudioDeviceAttributes p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceVolumeBehaviorState {
    }

    final class DeviceVolumeDispatcherStub extends android.media.IAudioDeviceVolumeDispatcher.Stub {
        DeviceVolumeDispatcherStub(android.media.AudioDeviceVolumeManager p0) { super(); }
        @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.BLUETOOTH_PRIVILEGED"})
        public void register(boolean p0, android.media.AudioDeviceAttributes p1, java.util.List<android.media.VolumeInfo> p2, boolean p3, int p4) {}
        public void dispatchDeviceVolumeChanged(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1) {}
        public void dispatchDeviceVolumeAdjusted(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, int p2, int p3) {}
    }

    static class ListenerInfo {
        @android.annotation.NonNull
        final android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener mListener = null;
        @android.annotation.NonNull
        final java.util.concurrent.Executor mExecutor = null;
        @android.annotation.NonNull
        final android.media.AudioDeviceAttributes mDevice = null;
        @android.annotation.NonNull
        final boolean mHandlesVolumeAdjustment = false;
        ListenerInfo(android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p0, java.util.concurrent.Executor p1, android.media.AudioDeviceAttributes p2, boolean p3) {}
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.media.audio.unify_absolute_volume_management")
    public static interface OnAudioDeviceVolumeChangedListener {
        public void onAudioDeviceVolumeChanged(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1);
        public void onAudioDeviceVolumeAdjusted(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, int p2, int p3);
    }

    public static interface OnDeviceVolumeBehaviorChangedListener {
        public void onDeviceVolumeBehaviorChanged(android.media.AudioDeviceAttributes p0, int p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VolumeAdjustmentMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VolumeAdjustmentNoMute {
    }
}
