package android.chre.flags;

public class CustomFeatureFlags implements android.chre.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.chre.flags.FeatureFlags>> p0) {}
    public boolean abortIfNoContextHubFound() { return false; }
    public boolean bugFixRemoveExitCallInHal() { return false; }
    public boolean efwXportInContextHub() { return false; }
    public boolean gnssHalUseEndpointMessaging() { return false; }
    public boolean halHandleNanoappQueryTestMode() { return false; }
    public boolean offloadApi() { return false; }
    public boolean offloadImplementation() { return false; }
    public boolean reliableMessage() { return false; }
    public boolean reliableMessageTestModeBehavior() { return false; }
    public boolean removeOldContextHubApis() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.chre.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
