package com.android.internal.hidden_from_bootclasspath.android.security.keystore2;

public interface FeatureFlags {
    public boolean attestModules();
    public boolean countKeysPerUid();
    public boolean disableLegacyKeystoreGet();
    public boolean disableLegacyKeystorePutV2();
    public boolean importPreviouslyEmulatedKeys();
    public boolean removeReboundKeyblobsFix();
    public boolean walDbJournalmodeV3();
}
