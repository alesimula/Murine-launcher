package com.android.internal.hidden_from_bootclasspath.android.security.keystore2;

public final class FeatureFlagsImpl implements com.android.internal.hidden_from_bootclasspath.android.security.keystore2.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean attestModules() { return false; }
    public boolean countKeysPerUid() { return false; }
    public boolean disableLegacyKeystoreGet() { return false; }
    public boolean disableLegacyKeystorePutV2() { return false; }
    public boolean importPreviouslyEmulatedKeys() { return false; }
    public boolean removeReboundKeyblobsFix() { return false; }
    public boolean walDbJournalmodeV3() { return false; }
}
