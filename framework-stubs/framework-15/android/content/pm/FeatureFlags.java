package android.content.pm;

public interface FeatureFlags {
    public boolean allowSdkSandboxQueryIntentActivities();
    public boolean archiving();
    public boolean aslInApkAppMetadataSource();
    public boolean componentStateChangedMetrics();
    public boolean disallowSdkLibsToBeApps();
    public boolean emergencyInstallPermission();
    public boolean encodeAppIntent();
    public boolean fixDuplicatedFlags();
    public boolean fixSystemAppsFirstInstallTime();
    public boolean forceMultiArchNativeLibsMatch();
    public boolean getPackageInfo();
    public boolean getPackageInfoWithFd();
    public boolean getPackageStorageStats();
    public boolean getResolvedApkPath();
    public boolean improveHomeAppBehavior();
    public boolean improveInstallDontKill();
    public boolean improveInstallFreeze();
    public boolean introduceMediaProcessingType();
    public boolean lightweightInvisibleLabelDetection();
    public boolean minTargetSdk24();
    public boolean nullableDataDir();
    public boolean packageRestartQueryDisabledByDefault();
    public boolean provideInfoOfApkInApex();
    public boolean quarantinedEnabled();
    public boolean readInstallInfo();
    public boolean recoverabilityDetection();
    public boolean relativeReferenceIntentFilters();
    public boolean restrictNonpreloadsSystemShareduids();
    public boolean rollbackLifetime();
    public boolean sdkLibIndependence();
    public boolean setPreVerifiedDomains();
    public boolean stayStopped();
    public boolean useArtServiceV2();
    public boolean usePiaV2();
    public boolean waitApplicationKilled();
}
