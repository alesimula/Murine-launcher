package android.media.tv.flags;

public class CustomFeatureFlags implements android.media.tv.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.media.tv.flags.FeatureFlags>> p0) {}
    public boolean applyPictureProfiles() { return false; }
    public boolean broadcastVisibilityTypes() { return false; }
    public boolean enableAdServiceFw() { return false; }
    public boolean enableLeAudioBroadcastUi() { return false; }
    public boolean enableLeAudioUnicastUi() { return false; }
    public boolean enableTvWatchdogEmmcProtection() { return false; }
    public boolean hdmiControlCollectPhysicalAddress() { return false; }
    public boolean hdmiControlEnhancedBehavior() { return false; }
    public boolean kidsModeTvdbSharing() { return false; }
    public boolean mediaQualityFw() { return false; }
    public boolean mediaQualityFwBugfix() { return false; }
    public boolean mediacasUpdateClientProfilePriority() { return false; }
    public boolean setResourceHolderRetain() { return false; }
    public boolean tiafVApis() { return false; }
    public boolean tifExtensionStandardization() { return false; }
    public boolean tifUnbindInactiveTis() { return false; }
    public boolean tunerWApis() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.media.tv.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
