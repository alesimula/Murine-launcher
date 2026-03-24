package com.android.internal.hidden_from_bootclasspath.android.service.voice.flags;

public interface FeatureFlags {
    public boolean allowForegroundActivitiesInOnShow();
    public boolean allowHotwordBumpEgress();
    public boolean allowTrainingDataEgressFromHds();
    public boolean setInvocationEffectEnabledApi();
}
