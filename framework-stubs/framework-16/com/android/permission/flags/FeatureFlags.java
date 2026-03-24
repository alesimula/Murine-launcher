package com.android.permission.flags;

public interface FeatureFlags {
    public boolean addBannersToPrivacySensitiveAppsForAaos();
    public boolean appPermissionFragmentUsesPreferences();
    public boolean archivingReadOnly();
    public boolean crossUserRoleEnabled();
    public boolean crossUserRoleUxBugfixEnabled();
    public boolean declutteredPermissionManagerEnabled();
    public boolean defaultAppsRecommendationEnabled();
    public boolean enableCoarseFineLocationPromptForAaos();
    public boolean enhancedConfirmationBackportEnabled();
    public boolean expressiveDesignEnabled();
    public boolean fixSafetyCenterTouchTarget();
    public boolean odadNotificationsSupported();
    public boolean permissionTimelineAttributionLabelFix();
    public boolean privateProfileSupported();
    public boolean privateProfileTitleApi();
    public boolean safetyCenterEnabledNoDeviceConfig();
    public boolean safetyCenterIssueOnlyAffectsGroupStatus();
    public boolean systemFinancedDeviceController();
    public boolean wearComposeMaterial3();
    public boolean wearPrivacyDashboardEnabledReadOnly();
}
