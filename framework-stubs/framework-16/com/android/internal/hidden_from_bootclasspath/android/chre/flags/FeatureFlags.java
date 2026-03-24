package com.android.internal.hidden_from_bootclasspath.android.chre.flags;

public interface FeatureFlags {
    public boolean abortIfNoContextHubFound();
    public boolean bugFixRemoveExitCallInHal();
    public boolean efwXportInContextHub();
    public boolean gnssHalUseEndpointMessaging();
    public boolean halHandleNanoappQueryTestMode();
    public boolean offloadApi();
    public boolean offloadImplementation();
    public boolean reliableMessage();
    public boolean reliableMessageTestModeBehavior();
    public boolean removeOldContextHubApis();
}
