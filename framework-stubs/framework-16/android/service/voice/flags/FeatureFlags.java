package android.service.voice.flags;

public interface FeatureFlags {
    public boolean allowForegroundActivitiesInOnShow();
    public boolean allowHotwordBumpEgress();
    public boolean allowTrainingDataEgressFromHds();
    public boolean setInvocationEffectEnabledApi();
}
