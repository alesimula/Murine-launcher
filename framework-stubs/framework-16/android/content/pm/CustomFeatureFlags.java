package android.content.pm;

public class CustomFeatureFlags implements android.content.pm.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.content.pm.FeatureFlags>> p0) {}
    public boolean alwaysLoadPastCertsV4() { return false; }
    public boolean appCompatOption16kb() { return false; }
    public boolean archiving() { return false; }
    public boolean aslInApkAppMetadataSource() { return false; }
    public boolean audioPlaybackCaptureAllowance() { return false; }
    public boolean cacheSdkSystemFeatures() { return false; }
    public boolean changeLauncherBadging() { return false; }
    public boolean cloudCompilationPm() { return false; }
    public boolean cloudCompilationVerification() { return false; }
    public boolean disallowSdkLibsToBeApps() { return false; }
    public boolean emergencyInstallPermission() { return false; }
    public boolean fixDuplicatedFlags() { return false; }
    public boolean getPackageInfo() { return false; }
    public boolean getPackageInfoWithFd() { return false; }
    public boolean getPackageStorageStats() { return false; }
    public boolean getResolvedApkPath() { return false; }
    public boolean improveInstallFreeze() { return false; }
    public boolean includeFeatureFlagsInPackageCacher() { return false; }
    public boolean introduceMediaProcessingType() { return false; }
    public boolean mergePackageChangedBroadcast() { return false; }
    public boolean minTargetSdk24() { return false; }
    public boolean optimizeParsingInRegisteredServicesCache() { return false; }
    public boolean parallelPackageParsingAcrossSystemDirs() { return false; }
    public boolean protectSupervisionPackages() { return false; }
    public boolean provideInfoOfApkInApex() { return false; }
    public boolean quarantinedEnabled() { return false; }
    public boolean readInstallInfo() { return false; }
    public boolean recoverabilityDetection() { return false; }
    public boolean reduceBroadcastsForComponentStateChanges() { return false; }
    public boolean relativeReferenceIntentFilters() { return false; }
    public boolean removeHiddenModuleUsage() { return false; }
    public boolean restrictNonpreloadsSystemShareduids() { return false; }
    public boolean rollbackLifetime() { return false; }
    public boolean sdkDependencyInstaller() { return false; }
    public boolean sdkLibIndependence() { return false; }
    public boolean setPreVerifiedDomains() { return false; }
    public boolean stayStopped() { return false; }
    public boolean uidBasedProviderLookup() { return false; }
    public boolean useArtServiceV2() { return false; }
    public boolean usePiaV2() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.content.pm.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
