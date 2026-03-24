package com.android.sdksandbox.flags;

public class CustomFeatureFlags implements com.android.sdksandbox.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.sdksandbox.flags.FeatureFlags>> p0) {}
    public boolean firstAndLastSdkSandboxUidPublic() { return false; }
    public boolean getEffectiveTargetSdkVersionApi() { return false; }
    public boolean sandboxActivitySdkBasedContext() { return false; }
    public boolean sandboxClientImportanceListener() { return false; }
    public boolean sdkSandboxDexVerifier() { return false; }
    public boolean sdkSandboxInstrumentationInfo() { return false; }
    public boolean sdkSandboxUidToAppUidApi() { return false; }
    public boolean selinuxInputSelector() { return false; }
    public boolean selinuxSdkSandboxAudit() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.sdksandbox.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
