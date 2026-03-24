package android.hardware.devicestate;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.hardware.devicestate.feature.flags.device_state_property_api")
public final class DeviceState {
    public static final int PROPERTY_FOLDABLE_HARDWARE_CONFIGURATION_FOLD_IN_CLOSED = 1;
    public static final int PROPERTY_FOLDABLE_HARDWARE_CONFIGURATION_FOLD_IN_HALF_OPEN = 2;
    public static final int PROPERTY_FOLDABLE_HARDWARE_CONFIGURATION_FOLD_IN_OPEN = 3;
    public static final int PROPERTY_POLICY_CANCEL_OVERRIDE_REQUESTS = 4;
    public static final int PROPERTY_POLICY_CANCEL_WHEN_REQUESTER_NOT_ON_TOP = 5;
    public static final int PROPERTY_POLICY_UNSUPPORTED_WHEN_THERMAL_STATUS_CRITICAL = 6;
    public static final int PROPERTY_POLICY_UNSUPPORTED_WHEN_POWER_SAVE_MODE = 7;
    public static final int PROPERTY_POLICY_AVAILABLE_FOR_APP_REQUEST = 8;
    public static final int PROPERTY_APP_INACCESSIBLE = 9;
    public static final int PROPERTY_EMULATED_ONLY = 10;
    public static final int PROPERTY_FOLDABLE_DISPLAY_CONFIGURATION_OUTER_PRIMARY = 11;
    public static final int PROPERTY_FOLDABLE_DISPLAY_CONFIGURATION_INNER_PRIMARY = 12;
    public static final int PROPERTY_POWER_CONFIGURATION_TRIGGER_SLEEP = 13;
    public static final int PROPERTY_POWER_CONFIGURATION_TRIGGER_WAKE = 14;
    public static final int PROPERTY_EXTENDED_DEVICE_STATE_EXTERNAL_DISPLAY = 15;
    public static final int PROPERTY_FEATURE_REAR_DISPLAY = 16;
    public static final int PROPERTY_FEATURE_DUAL_DISPLAY_INTERNAL_DEFAULT = 17;
    public DeviceState(android.hardware.devicestate.DeviceState.Configuration p0) {}
    public int getIdentifier() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean hasProperty(int p0) { return false; }
    public boolean hasProperties(int... p0) { return false; }
    public android.hardware.devicestate.DeviceState.Configuration getConfiguration() { return null; }

    public static final class Configuration implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.hardware.devicestate.DeviceState.Configuration> CREATOR = null;
        public int getIdentifier() { return 0; }
        @android.annotation.NonNull
        public java.lang.String getName() { return null; }
        @android.annotation.NonNull
        public java.util.Set<java.lang.Integer> getSystemProperties() { return null; }
        @android.annotation.NonNull
        public java.util.Set<java.lang.Integer> getPhysicalProperties() { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(int p0, java.lang.String p1) {}
            @android.annotation.NonNull
            public android.hardware.devicestate.DeviceState.Configuration.Builder setSystemProperties(java.util.Set<java.lang.Integer> p0) { return null; }
            @android.annotation.NonNull
            public android.hardware.devicestate.DeviceState.Configuration.Builder setPhysicalProperties(java.util.Set<java.lang.Integer> p0) { return null; }
            @android.annotation.NonNull
            public android.hardware.devicestate.DeviceState.Configuration build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface DeviceStateProperties {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface PhysicalDeviceStateProperties {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface SystemDeviceStateProperties {
    }
}
