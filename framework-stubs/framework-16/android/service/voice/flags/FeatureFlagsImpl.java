package android.service.voice.flags;

public final class FeatureFlagsImpl implements android.service.voice.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean allowForegroundActivitiesInOnShow() { return false; }
    public boolean allowHotwordBumpEgress() { return false; }
    public boolean allowTrainingDataEgressFromHds() { return false; }
    public boolean setInvocationEffectEnabledApi() { return false; }
}
