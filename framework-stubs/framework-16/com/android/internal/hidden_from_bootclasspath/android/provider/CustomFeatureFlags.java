package com.android.internal.hidden_from_bootclasspath.android.provider;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.provider.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.provider.FeatureFlags>> p0) {}
    public boolean allowConfigMaximumCallLogEntriesPerSim() { return false; }
    public boolean enableDocumentsTrashApi() { return false; }
    public boolean launcherDataAccess() { return false; }
    public boolean newDefaultAccountApiEnabled() { return false; }
    public boolean reduceBinderTransactionSizeForGetAllProperties() { return false; }
    public boolean systemRegionalPreferencesApiEnabled() { return false; }
    public boolean systemSettingsDefault() { return false; }
    public boolean userKeys() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.provider.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
