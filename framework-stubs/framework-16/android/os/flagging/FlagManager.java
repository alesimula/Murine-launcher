package android.os.flagging;

@android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
public final class FlagManager {
    FlagManager() {}
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public void clearBooleanLocalOverridesImmediately(java.util.Set<java.lang.String> p0) {}
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public void clearBooleanLocalOverridesOnReboot(java.util.Set<java.lang.String> p0) {}
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public void setBooleanLocalOverridesImmediately(java.util.Map<java.lang.String, java.lang.Boolean> p0) {}
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public void setBooleanLocalOverridesOnReboot(java.util.Map<java.lang.String, java.lang.Boolean> p0) {}
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public void setBooleanOverridesOnReboot(java.util.Map<java.lang.String, java.lang.Boolean> p0) {}
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public void setBooleanOverridesOnSystemBuildFingerprint(java.lang.String p0, java.util.Map<java.lang.String, java.lang.Boolean> p1) {}
}
