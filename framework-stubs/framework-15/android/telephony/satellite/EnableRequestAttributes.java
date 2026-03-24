package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
public class EnableRequestAttributes {
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public boolean isEnabled() { return false; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public boolean isDemoMode() { return false; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public boolean isEmergencyMode() { return false; }

    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final class Builder {
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
        public Builder(boolean p0) {}
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
        @android.annotation.NonNull
        public android.telephony.satellite.EnableRequestAttributes.Builder setDemoMode(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
        @android.annotation.NonNull
        public android.telephony.satellite.EnableRequestAttributes.Builder setEmergencyMode(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
        @android.annotation.NonNull
        public android.telephony.satellite.EnableRequestAttributes build() { return null; }
    }
}
