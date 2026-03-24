package com.android.sdksandbox.flags;

public final class FeatureFlagsImpl implements com.android.sdksandbox.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean firstAndLastSdkSandboxUidPublic() { return false; }
    public boolean getEffectiveTargetSdkVersionApi() { return false; }
    public boolean sandboxActivitySdkBasedContext() { return false; }
    public boolean sandboxClientImportanceListener() { return false; }
    public boolean sdkSandboxDexVerifier() { return false; }
    public boolean sdkSandboxInstrumentationInfo() { return false; }
    public boolean sdkSandboxUidToAppUidApi() { return false; }
    public boolean selinuxInputSelector() { return false; }
    public boolean selinuxSdkSandboxAudit() { return false; }
}
