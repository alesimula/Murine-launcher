package android.companion.virtual;

@android.annotation.SystemApi
public final class VirtualDeviceParams implements android.os.Parcelable {
    public static final int LOCK_STATE_DEFAULT = 0;
    public static final int LOCK_STATE_ALWAYS_UNLOCKED = 1;
    @java.lang.Deprecated
    public static final int ACTIVITY_POLICY_DEFAULT_ALLOWED = 0;
    @java.lang.Deprecated
    public static final int ACTIVITY_POLICY_DEFAULT_BLOCKED = 1;
    @java.lang.Deprecated
    public static final int NAVIGATION_POLICY_DEFAULT_ALLOWED = 0;
    @java.lang.Deprecated
    public static final int NAVIGATION_POLICY_DEFAULT_BLOCKED = 1;
    public static final int DEVICE_POLICY_DEFAULT = 0;
    public static final int DEVICE_POLICY_CUSTOM = 1;
    public static final int POLICY_TYPE_SENSORS = 0;
    public static final int POLICY_TYPE_AUDIO = 1;
    public static final int POLICY_TYPE_RECENTS = 2;
    public static final int POLICY_TYPE_ACTIVITY = 3;
    public static final int POLICY_TYPE_CLIPBOARD = 4;
    public static final int POLICY_TYPE_CAMERA = 5;
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.activity_control_api")
    public static final int POLICY_TYPE_BLOCKED_ACTIVITY = 6;
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.default_device_camera_access_policy")
    public static final int POLICY_TYPE_DEFAULT_DEVICE_CAMERA_ACCESS = 7;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.virtual.VirtualDeviceParams> CREATOR = null;
    public int getLockState() { return 0; }
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.device_aware_display_power")
    @android.annotation.NonNull
    public java.time.Duration getDimDuration() { return null; }
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.device_aware_display_power")
    @android.annotation.NonNull
    public java.time.Duration getScreenOffTimeout() { return null; }
    @android.annotation.Nullable
    public android.content.ComponentName getHomeComponent() { return null; }
    @android.annotation.Nullable
    public android.content.ComponentName getInputMethodComponent() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.os.UserHandle> getUsersWithMatchingAccounts() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.Set<android.content.ComponentName> getAllowedCrossTaskNavigations() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.Set<android.content.ComponentName> getBlockedCrossTaskNavigations() { return null; }
    @java.lang.Deprecated
    public int getDefaultNavigationPolicy() { return 0; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.Set<android.content.ComponentName> getAllowedActivities() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.Set<android.content.ComponentName> getBlockedActivities() { return null; }
    @java.lang.Deprecated
    public int getDefaultActivityPolicy() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getName() { return null; }
    public int getDevicePolicy(int p0) { return 0; }
    @android.annotation.NonNull
    public android.util.SparseIntArray getDevicePolicies() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.companion.virtual.sensor.VirtualSensorConfig> getVirtualSensorConfigs() { return null; }
    @android.annotation.Nullable
    public android.companion.virtual.sensor.IVirtualSensorCallback getVirtualSensorCallback() { return null; }
    public int getAudioPlaybackSessionId() { return 0; }
    public int getAudioRecordingSessionId() { return 0; }
    @android.annotation.Nullable
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.viewconfiguration_apis")
    public android.companion.virtual.ViewConfigurationParams getViewConfigurationParams() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface ActivityPolicy {
    }

    public static final class Builder {
        public Builder() {}
        @android.annotation.RequiresPermission(value="android.permission.ADD_ALWAYS_UNLOCKED_DISPLAY", conditional=true)
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setLockState(int p0) { return null; }
        @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.device_aware_display_power")
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setDimDuration(java.time.Duration p0) { return null; }
        @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.device_aware_display_power")
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setScreenOffTimeout(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setHomeComponent(android.content.ComponentName p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setInputMethodComponent(android.content.ComponentName p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setUsersWithMatchingAccounts(java.util.Set<android.os.UserHandle> p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setAllowedCrossTaskNavigations(java.util.Set<android.content.ComponentName> p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setBlockedCrossTaskNavigations(java.util.Set<android.content.ComponentName> p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setAllowedActivities(java.util.Set<android.content.ComponentName> p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setBlockedActivities(java.util.Set<android.content.ComponentName> p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setDevicePolicy(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder addVirtualSensorConfig(android.companion.virtual.sensor.VirtualSensorConfig p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setVirtualSensorCallback(java.util.concurrent.Executor p0, android.companion.virtual.sensor.VirtualSensorCallback p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setVirtualSensorDirectChannelCallback(java.util.concurrent.Executor p0, android.companion.virtual.sensor.VirtualSensorDirectChannelCallback p1) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setAudioPlaybackSessionId(int p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams.Builder setAudioRecordingSessionId(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.viewconfiguration_apis")
        public android.companion.virtual.VirtualDeviceParams.Builder setViewConfigurationParams(android.companion.virtual.ViewConfigurationParams p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.VirtualDeviceParams build() { return null; }

        private static class VirtualSensorCallbackDelegate extends android.companion.virtual.sensor.IVirtualSensorCallback.Stub {
            VirtualSensorCallbackDelegate(java.util.concurrent.Executor p0, android.companion.virtual.sensor.VirtualSensorCallback p1, java.util.concurrent.Executor p2, android.companion.virtual.sensor.VirtualSensorDirectChannelCallback p3) { super(); }
            public void onConfigurationChanged(android.companion.virtual.sensor.VirtualSensor p0, boolean p1, int p2, int p3) {}
            public void onDirectChannelCreated(int p0, android.os.SharedMemory p1) {}
            public void onDirectChannelDestroyed(int p0) {}
            public void onDirectChannelConfigured(int p0, android.companion.virtual.sensor.VirtualSensor p1, int p2, int p3) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface DevicePolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface DynamicDisplayPolicyType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface DynamicPolicyType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface LockState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface NavigationPolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface PolicyType {
    }
}
