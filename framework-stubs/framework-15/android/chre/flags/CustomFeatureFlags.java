package android.chre.flags;

public class CustomFeatureFlags implements android.chre.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.chre.flags.FeatureFlags>> p0) {}
    public boolean abortIfNoContextHubFound() { return false; }
    public boolean bugFixReduceLockHoldingPeriod() { return false; }
    public boolean contextHubCallbackUuidEnabled() { return false; }
    public boolean flagLogNanoappLoadMetrics() { return false; }
    public boolean metricsReporterInTheDaemon() { return false; }
    public boolean reconnectHostEndpointsAfterHalRestart() { return false; }
    public boolean reduceLockHoldingPeriod() { return false; }
    public boolean reliableMessage() { return false; }
    public boolean reliableMessageDuplicateDetectionService() { return false; }
    public boolean reliableMessageImplementation() { return false; }
    public boolean reliableMessageRetrySupportService() { return false; }
    public boolean reliableMessageTestModeBehavior() { return false; }
    public boolean removeApWakeupMetricReportLimit() { return false; }
    public boolean waitForPreloadedNanoappStart() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.chre.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
