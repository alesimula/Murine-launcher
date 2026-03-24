package android.chre.flags;

public interface FeatureFlags {
    public boolean abortIfNoContextHubFound();
    public boolean bugFixReduceLockHoldingPeriod();
    public boolean contextHubCallbackUuidEnabled();
    public boolean flagLogNanoappLoadMetrics();
    public boolean metricsReporterInTheDaemon();
    public boolean reconnectHostEndpointsAfterHalRestart();
    public boolean reduceLockHoldingPeriod();
    public boolean reliableMessage();
    public boolean reliableMessageDuplicateDetectionService();
    public boolean reliableMessageImplementation();
    public boolean reliableMessageRetrySupportService();
    public boolean reliableMessageTestModeBehavior();
    public boolean removeApWakeupMetricReportLimit();
    public boolean waitForPreloadedNanoappStart();
}
