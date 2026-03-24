package com.android.internal.hidden_from_bootclasspath.android.security.keystore2;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.security.keystore2.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.security.keystore2.FeatureFlags>> p0) {}
    public boolean attestModules() { return false; }
    public boolean countKeysPerUid() { return false; }
    public boolean disableLegacyKeystoreGet() { return false; }
    public boolean disableLegacyKeystorePutV2() { return false; }
    public boolean importPreviouslyEmulatedKeys() { return false; }
    public boolean removeReboundKeyblobsFix() { return false; }
    public boolean walDbJournalmodeV3() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.security.keystore2.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
