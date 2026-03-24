package android.app;

public class CustomFeatureFlags implements android.app.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.app.FeatureFlags>> p0) {}
    public boolean apiRichOngoing() { return false; }
    public boolean apiTvextender() { return false; }
    public boolean appRestrictionsApi() { return false; }
    public boolean appStartInfo() { return false; }
    public boolean appStartInfoTimestamps() { return false; }
    public boolean bicClient() { return false; }
    public boolean categoryVoicemail() { return false; }
    public boolean checkAutogroupBeforePost() { return false; }
    public boolean cleanUpSpansAndNewLines() { return false; }
    public boolean clearDnsCacheOnNetworkRulesUpdate() { return false; }
    public boolean compactHeadsUpNotification() { return false; }
    public boolean compactHeadsUpNotificationReply() { return false; }
    public boolean enableFgsTimeoutCrashBehavior() { return false; }
    public boolean enableNightModeBinderCache() { return false; }
    public boolean enablePipUiStateCallbackOnEntering() { return false; }
    public boolean evenlyDividedCallStyleActionLayout() { return false; }
    public boolean gateFgsTimeoutAnrBehavior() { return false; }
    public boolean getBindingUidImportance() { return false; }
    public boolean introduceNewServiceOntimeoutCallback() { return false; }
    public boolean keyguardPrivateNotifications() { return false; }
    public boolean lifetimeExtensionRefactor() { return false; }
    public boolean modesApi() { return false; }
    public boolean modesUi() { return false; }
    public boolean notificationChannelVibrationEffectApi() { return false; }
    public boolean notificationExpansionOptional() { return false; }
    public boolean notificationsUseAppIcon() { return false; }
    public boolean notificationsUseAppIconInRow() { return false; }
    public boolean notificationsUseMonochromeAppIcon() { return false; }
    public boolean pinnerServiceClientApi() { return false; }
    public boolean redactSensitiveContentNotificationsOnLockscreen() { return false; }
    public boolean removeRemoteViews() { return false; }
    public boolean restrictAudioAttributesAlarm() { return false; }
    public boolean restrictAudioAttributesCall() { return false; }
    public boolean restrictAudioAttributesMedia() { return false; }
    public boolean secureAllowlistToken() { return false; }
    public boolean skipBgMemTrimOnFgApp() { return false; }
    public boolean sortSectionByTime() { return false; }
    public boolean systemTermsOfAddressEnabled() { return false; }
    public boolean uidImportanceListenerForUids() { return false; }
    public boolean updateRankingTime() { return false; }
    public boolean visitPersonUri() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.app.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
