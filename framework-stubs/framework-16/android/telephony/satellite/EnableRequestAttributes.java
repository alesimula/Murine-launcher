package android.telephony.satellite;

@android.annotation.SystemApi
public class EnableRequestAttributes {
    public boolean isEnabled() { return false; }
    public boolean isDemoMode() { return false; }
    public boolean isEmergencyMode() { return false; }

    public static final class Builder {
        public Builder(boolean p0) {}
        @android.annotation.NonNull
        public android.telephony.satellite.EnableRequestAttributes.Builder setDemoMode(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.EnableRequestAttributes.Builder setEmergencyMode(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.EnableRequestAttributes build() { return null; }
    }
}
