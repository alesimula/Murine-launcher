package com.android.internal.hidden_from_bootclasspath.android.webkit;

public interface FeatureFlags {
    public boolean deprecateStartSafeBrowsing();
    public boolean fileSystemAccess();
    public boolean mainlineApis();
    public boolean updateServiceIpcWrapper();
    public boolean updateServiceV2();
    public boolean useBEntryPoint();
    public boolean userAgentReduction();
}
