package android.os;

@android.annotation.FlaggedApi("android.os.security_state_service")
public class SecurityStateManager {
    public static final java.lang.String KEY_SYSTEM_SPL = "system_spl";
    public static final java.lang.String KEY_VENDOR_SPL = "vendor_spl";
    public static final java.lang.String KEY_KERNEL_VERSION = "kernel_version";
    public SecurityStateManager(android.os.ISecurityStateManager p0) {}
    @android.annotation.FlaggedApi("android.os.security_state_service")
    @android.annotation.NonNull
    public android.os.Bundle getGlobalSecurityState() { return null; }
}
