package android.app;

public class NotificationManager {
    public static final java.lang.String ACTION_APP_BLOCK_STATE_CHANGED = "android.app.action.APP_BLOCK_STATE_CHANGED";
    public static final java.lang.String ACTION_NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED = "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR_SERVICE")
    public static final java.lang.String ACTION_TOGGLE_NOTIFICATION_HANDLER_PANEL = "android.app.action.TOGGLE_NOTIFICATION_HANDLER_PANEL";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR_SERVICE")
    public static final java.lang.String ACTION_OPEN_NOTIFICATION_HANDLER_PANEL = "android.app.action.OPEN_NOTIFICATION_HANDLER_PANEL";
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR_SERVICE")
    public static final java.lang.String ACTION_CLOSE_NOTIFICATION_HANDLER_PANEL = "android.app.action.CLOSE_NOTIFICATION_HANDLER_PANEL";
    public static final java.lang.String EXTRA_NOTIFICATION_CHANNEL_ID = "android.app.extra.NOTIFICATION_CHANNEL_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_CHANNEL_GROUP_ID = "android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID";
    public static final java.lang.String EXTRA_BLOCKED_STATE = "android.app.extra.BLOCKED_STATE";
    public static final java.lang.String ACTION_NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED = "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED";
    public static final java.lang.String ACTION_AUTOMATIC_ZEN_RULE_STATUS_CHANGED = "android.app.action.AUTOMATIC_ZEN_RULE_STATUS_CHANGED";
    public static final java.lang.String EXTRA_AUTOMATIC_ZEN_RULE_STATUS = "android.app.extra.AUTOMATIC_ZEN_RULE_STATUS";
    public static final java.lang.String EXTRA_AUTOMATIC_ZEN_RULE_ID = "android.app.extra.AUTOMATIC_ZEN_RULE_ID";
    public static final int AUTOMATIC_RULE_STATUS_UNKNOWN = -1;
    public static final int AUTOMATIC_RULE_STATUS_ENABLED = 1;
    public static final int AUTOMATIC_RULE_STATUS_DISABLED = 2;
    public static final int AUTOMATIC_RULE_STATUS_REMOVED = 3;
    public static final java.lang.String ACTION_EFFECTS_SUPPRESSOR_CHANGED = "android.os.action.ACTION_EFFECTS_SUPPRESSOR_CHANGED";
    public static final java.lang.String ACTION_NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED = "android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED";
    public static final java.lang.String ACTION_NOTIFICATION_POLICY_CHANGED = "android.app.action.NOTIFICATION_POLICY_CHANGED";
    public static final java.lang.String ACTION_INTERRUPTION_FILTER_CHANGED = "android.app.action.INTERRUPTION_FILTER_CHANGED";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String ACTION_NOTIFICATION_LISTENER_ENABLED_CHANGED = "android.app.action.NOTIFICATION_LISTENER_ENABLED_CHANGED";
    public static final java.lang.String ACTION_INTERRUPTION_FILTER_CHANGED_INTERNAL = "android.app.action.INTERRUPTION_FILTER_CHANGED_INTERNAL";
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    public static final java.lang.String ACTION_AUTOMATIC_ZEN_RULE = "android.app.action.AUTOMATIC_ZEN_RULE";
    public static final java.lang.String EXTRA_AUTOMATIC_RULE_ID = "android.app.extra.AUTOMATIC_RULE_ID";
    public static final java.lang.String META_DATA_AUTOMATIC_RULE_TYPE = "android.service.zen.automatic.ruleType";
    public static final java.lang.String META_DATA_RULE_INSTANCE_LIMIT = "android.service.zen.automatic.ruleInstanceLimit";
    public static final int VISIBILITY_NO_OVERRIDE = -1000;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_MAX = 5;
    public static final int BUBBLE_PREFERENCE_NONE = 0;
    public static final int BUBBLE_PREFERENCE_ALL = 1;
    public static final int BUBBLE_PREFERENCE_SELECTED = 2;
    public static int MAX_SERVICE_COMPONENT_NAME_LENGTH;
    public static android.app.INotificationManager getService() { return null; }
    NotificationManager(android.content.Context p0, android.os.Handler p1) {}
    public static android.app.NotificationManager from(android.content.Context p0) { return null; }
    public void notify(int p0, android.app.Notification p1) {}
    public void notify(java.lang.String p0, int p1, android.app.Notification p2) {}
    public void notifyAsPackage(java.lang.String p0, java.lang.String p1, int p2, android.app.Notification p3) {}
    public void notifyAsUser(java.lang.String p0, int p1, android.app.Notification p2, android.os.UserHandle p3) {}
    public void cancel(int p0) {}
    public void cancel(java.lang.String p0, int p1) {}
    public void cancelAsPackage(java.lang.String p0, java.lang.String p1, int p2) {}
    public void cancelAsUser(java.lang.String p0, int p1, android.os.UserHandle p2) {}
    public void cancelAll() {}
    public void setNotificationDelegate(java.lang.String p0) {}
    public java.lang.String getNotificationDelegate() { return null; }
    public boolean canNotifyAsPackage(java.lang.String p0) { return false; }
    public boolean canUseFullScreenIntent() { return false; }
    public void createNotificationChannelGroup(android.app.NotificationChannelGroup p0) {}
    public void createNotificationChannelGroups(java.util.List<android.app.NotificationChannelGroup> p0) {}
    public void createNotificationChannel(android.app.NotificationChannel p0) {}
    public void createNotificationChannels(java.util.List<android.app.NotificationChannel> p0) {}
    public android.app.NotificationChannel getNotificationChannel(java.lang.String p0) { return null; }
    public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, java.lang.String p1) { return null; }
    public java.util.List<android.app.NotificationChannel> getNotificationChannels() { return null; }
    public void deleteNotificationChannel(java.lang.String p0) {}
    public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0) { return null; }
    public java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups() { return null; }
    public void deleteNotificationChannelGroup(java.lang.String p0) {}
    public void updateNotificationChannel(java.lang.String p0, int p1, android.app.NotificationChannel p2) {}
    public android.content.ComponentName getEffectsSuppressor() { return null; }
    public boolean matchesCallFilter(android.os.Bundle p0) { return false; }
    public void cleanUpCallersAfter(long p0) {}
    public boolean isSystemConditionProviderEnabled(java.lang.String p0) { return false; }
    public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2) {}
    public int getZenMode() { return 0; }
    public android.service.notification.ZenModeConfig getZenModeConfig() { return null; }
    public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() { return null; }
    public int getRuleInstanceCount(android.content.ComponentName p0) { return 0; }
    public java.util.Map<java.lang.String, android.app.AutomaticZenRule> getAutomaticZenRules() { return null; }
    public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) { return null; }
    public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0) { return null; }
    public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1) { return false; }
    public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) {}
    public boolean removeAutomaticZenRule(java.lang.String p0) { return false; }
    public boolean removeAutomaticZenRules(java.lang.String p0) { return false; }
    public int getImportance() { return 0; }
    public boolean areNotificationsEnabled() { return false; }
    @java.lang.Deprecated
    public boolean areBubblesAllowed() { return false; }
    public boolean areBubblesEnabled() { return false; }
    public int getBubblePreference() { return 0; }
    public void silenceNotificationSound() {}
    public boolean areNotificationsPaused() { return false; }
    public boolean isNotificationPolicyAccessGranted() { return false; }
    public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) { return false; }
    @android.annotation.SystemApi
    public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) { return false; }
    public boolean shouldHideSilentStatusBarIcons() { return false; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getAllowedAssistantAdjustments() { return null; }
    public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) { return false; }
    public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() { return null; }
    public android.app.NotificationManager.Policy getNotificationPolicy() { return null; }
    public void setNotificationPolicy(android.app.NotificationManager.Policy p0) {}
    public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) {}
    public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_NOTIFICATION_LISTENERS")
    public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1, boolean p2) {}
    public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) {}
    @android.annotation.SystemApi
    public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_NOTIFICATION_LISTENERS")
    public java.util.List<android.content.ComponentName> getEnabledNotificationListeners() { return null; }
    public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) { return null; }
    @android.annotation.SystemApi
    public android.content.ComponentName getAllowedNotificationAssistant() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.SuppressLint("UserHandle")
    public boolean hasEnabledNotificationListener(java.lang.String p0, android.os.UserHandle p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_TOAST_RATE_LIMITING")
    public void setToastRateLimitingEnabled(boolean p0) {}
    public android.service.notification.StatusBarNotification[] getActiveNotifications() { return null; }
    public final int getCurrentInterruptionFilter() { return 0; }
    public final void setInterruptionFilter(int p0) {}
    public boolean matchesCallFilter(android.net.Uri p0) { return false; }
    public static int zenModeToInterruptionFilter(int p0) { return 0; }
    public static int zenModeFromInterruptionFilter(int p0, int p1) { return 0; }

    public static class Policy implements android.os.Parcelable {
        public static final int PRIORITY_CATEGORY_REMINDERS = 1;
        public static final int PRIORITY_CATEGORY_EVENTS = 2;
        public static final int PRIORITY_CATEGORY_MESSAGES = 4;
        public static final int PRIORITY_CATEGORY_CALLS = 8;
        public static final int PRIORITY_CATEGORY_REPEAT_CALLERS = 16;
        public static final int PRIORITY_CATEGORY_ALARMS = 32;
        public static final int PRIORITY_CATEGORY_MEDIA = 64;
        public static final int PRIORITY_CATEGORY_SYSTEM = 128;
        public static final int PRIORITY_CATEGORY_CONVERSATIONS = 256;
        public static final int[] ALL_PRIORITY_CATEGORIES = null;
        public static final int PRIORITY_SENDERS_ANY = 0;
        public static final int PRIORITY_SENDERS_CONTACTS = 1;
        public static final int PRIORITY_SENDERS_STARRED = 2;
        public static final int CONVERSATION_SENDERS_ANYONE = 1;
        public static final int CONVERSATION_SENDERS_IMPORTANT = 2;
        public static final int CONVERSATION_SENDERS_NONE = 3;
        public final int priorityCategories = 0;
        public final int priorityCallSenders = 0;
        public final int priorityMessageSenders = 0;
        public final int priorityConversationSenders = 0;
        public static final int CONVERSATION_SENDERS_UNSET = -1;
        public static final int SUPPRESSED_EFFECTS_UNSET = -1;
        @java.lang.Deprecated
        public static final int SUPPRESSED_EFFECT_SCREEN_OFF = 1;
        @java.lang.Deprecated
        public static final int SUPPRESSED_EFFECT_SCREEN_ON = 2;
        public static final int SUPPRESSED_EFFECT_FULL_SCREEN_INTENT = 4;
        public static final int SUPPRESSED_EFFECT_LIGHTS = 8;
        public static final int SUPPRESSED_EFFECT_PEEK = 16;
        public static final int SUPPRESSED_EFFECT_STATUS_BAR = 32;
        public static final int SUPPRESSED_EFFECT_BADGE = 64;
        public static final int SUPPRESSED_EFFECT_AMBIENT = 128;
        public static final int SUPPRESSED_EFFECT_NOTIFICATION_LIST = 256;
        public final int suppressedVisualEffects = 0;
        public static final int STATE_CHANNELS_BYPASSING_DND = 1;
        public static final int STATE_UNSET = -1;
        public final int state = 0;
        public static final android.os.Parcelable.Creator<android.app.NotificationManager.Policy> CREATOR = null;
        public Policy(int p0, int p1, int p2) {}
        public Policy(int p0, int p1, int p2, int p3) {}
        public Policy(int p0, int p1, int p2, int p3, int p4) {}
        public Policy(int p0, int p1, int p2, int p3, int p4, int p5) {}
        public Policy(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public static int getAllSuppressedVisualEffects() { return 0; }
        public static boolean areAllVisualEffectsSuppressed(int p0) { return false; }
        public static java.lang.String suppressedEffectsToString(int p0) { return null; }
        public static java.lang.String priorityCategoriesToString(int p0) { return null; }
        public static java.lang.String prioritySendersToString(int p0) { return null; }
        public static java.lang.String conversationSendersToString(int p0) { return null; }
        public boolean allowAlarms() { return false; }
        public boolean allowMedia() { return false; }
        public boolean allowSystem() { return false; }
        public boolean allowRepeatCallers() { return false; }
        public boolean allowCalls() { return false; }
        public boolean allowConversations() { return false; }
        public boolean allowMessages() { return false; }
        public boolean allowEvents() { return false; }
        public boolean allowReminders() { return false; }
        public int allowCallsFrom() { return 0; }
        public int allowMessagesFrom() { return 0; }
        public int allowConversationsFrom() { return 0; }
        public boolean showFullScreenIntents() { return false; }
        public boolean showLights() { return false; }
        public boolean showPeeking() { return false; }
        public boolean showStatusBarIcons() { return false; }
        public boolean showAmbient() { return false; }
        public boolean showBadges() { return false; }
        public boolean showInNotificationList() { return false; }
        public android.app.NotificationManager.Policy copy() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ConversationSenders {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PrioritySenders {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutomaticZenRuleStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BubblePreference {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Importance {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InterruptionFilter {
    }
}
