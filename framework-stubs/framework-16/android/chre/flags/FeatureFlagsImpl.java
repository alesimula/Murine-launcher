package android.chre.flags;

public final class FeatureFlagsImpl implements android.chre.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
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
}
