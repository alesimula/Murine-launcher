package android.media;

@android.annotation.SystemApi
public class AudioDeviceVolumeManager {
    public static final int ADJUST_MODE_NORMAL = 0;
    public static final int ADJUST_MODE_START = 1;
    public static final int ADJUST_MODE_END = 2;
    public AudioDeviceVolumeManager(android.content.Context p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void setDeviceAbsoluteVolumeBehavior(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, java.util.concurrent.Executor p2, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p3, boolean p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void setDeviceAbsoluteMultiVolumeBehavior(android.media.AudioDeviceAttributes p0, java.util.List<android.media.VolumeInfo> p1, java.util.concurrent.Executor p2, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p3, boolean p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void setDeviceAbsoluteVolumeAdjustOnlyBehavior(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, java.util.concurrent.Executor p2, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p3, boolean p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.BLUETOOTH_PRIVILEGED"})
    public void setDeviceAbsoluteMultiVolumeAdjustOnlyBehavior(android.media.AudioDeviceAttributes p0, java.util.List<android.media.VolumeInfo> p1, java.util.concurrent.Executor p2, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p3, boolean p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE"})
    public void addOnDeviceVolumeBehaviorChangedListener(java.util.concurrent.Executor p0, android.media.AudioDeviceVolumeManager.OnDeviceVolumeBehaviorChangedListener p1) throws java.lang.SecurityException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.QUERY_AUDIO_STATE"})
    public void removeOnDeviceVolumeBehaviorChangedListener(android.media.AudioDeviceVolumeManager.OnDeviceVolumeBehaviorChangedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    public void setDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MODIFY_AUDIO_ROUTING", "android.permission.MODIFY_AUDIO_SETTINGS_PRIVILEGED"})
    @android.annotation.NonNull
    public android.media.VolumeInfo getDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1) { return null; }
    public static java.lang.String volumeBehaviorName(int p0) { return null; }

    private final class DeviceVolumeBehaviorDispatcherStub extends android.media.IDeviceVolumeBehaviorDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        public void register(boolean p0) {}
        public void dispatchDeviceVolumeBehaviorChanged(android.media.AudioDeviceAttributes p0, int p1) {}
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
}
