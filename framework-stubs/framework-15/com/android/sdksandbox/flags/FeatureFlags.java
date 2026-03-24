package com.android.sdksandbox.flags;

public interface FeatureFlags {
    public boolean firstAndLastSdkSandboxUidPublic();
    public boolean getEffectiveTargetSdkVersionApi();
    public boolean sandboxActivitySdkBasedContext();
    public boolean sandboxClientImportanceListener();
    public boolean sdkSandboxDexVerifier();
    public boolean sdkSandboxInstrumentationInfo();
    public boolean sdkSandboxUidToAppUidApi();
    public boolean selinuxInputSelector();
    public boolean selinuxSdkSandboxAudit();
}
