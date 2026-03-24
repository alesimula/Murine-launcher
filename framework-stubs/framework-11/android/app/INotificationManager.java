package android.app;

public interface INotificationManager extends android.os.IInterface {
    public void cancelAllNotifications(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void clearData(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void enqueueTextToast(java.lang.String p0, android.os.IBinder p1, java.lang.CharSequence p2, int p3, int p4, android.app.ITransientNotificationCallback p5) throws android.os.RemoteException;
    public void enqueueToast(java.lang.String p0, android.os.IBinder p1, android.app.ITransientNotification p2, int p3, int p4) throws android.os.RemoteException;
    public void cancelToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void finishToken(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void enqueueNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.app.Notification p4, int p5) throws android.os.RemoteException;
    public void cancelNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public void setShowBadge(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean canShowBadge(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasSentValidMsg(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isInInvalidMsgState(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasUserDemotedInvalidMsgApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setInvalidMsgAppDemoted(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationsEnabledForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationsEnabledWithImportanceLockForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean areNotificationsEnabledForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean areNotificationsEnabled(java.lang.String p0) throws android.os.RemoteException;
    public int getPackageImportance(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllowedAssistantAdjustments(java.lang.String p0) throws android.os.RemoteException;
    public void allowAssistantAdjustment(java.lang.String p0) throws android.os.RemoteException;
    public void disallowAssistantAdjustment(java.lang.String p0) throws android.os.RemoteException;
    public boolean shouldHideSilentStatusIcons(java.lang.String p0) throws android.os.RemoteException;
    public void setHideSilentStatusIcons(boolean p0) throws android.os.RemoteException;
    public void setBubblesAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean areBubblesAllowed(java.lang.String p0) throws android.os.RemoteException;
    public int getBubblePreferenceForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void createNotificationChannelGroups(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException;
    public void createNotificationChannels(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException;
    public void createNotificationChannelsForPackage(java.lang.String p0, int p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getConversations(boolean p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getConversationsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.app.NotificationChannelGroup getPopulatedNotificationChannelGroupForPackage(java.lang.String p0, int p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void updateNotificationChannelGroupForPackage(java.lang.String p0, int p1, android.app.NotificationChannelGroup p2) throws android.os.RemoteException;
    public void updateNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2) throws android.os.RemoteException;
    public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public android.app.NotificationChannel getConversationNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5) throws android.os.RemoteException;
    public void createConversationNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, android.app.NotificationChannel p3, java.lang.String p4) throws android.os.RemoteException;
    public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException;
    public void deleteNotificationChannel(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void deleteConversationNotificationChannels(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getNumNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getDeletedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getBlockedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void deleteNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String p0) throws android.os.RemoteException;
    public boolean onlyHasDefaultChannel(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getBlockedAppCount(int p0) throws android.os.RemoteException;
    public boolean areChannelsBypassingDnd() throws android.os.RemoteException;
    public int getAppsBypassingDndCount(int p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelsBypassingDnd(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isPackagePaused(java.lang.String p0) throws android.os.RemoteException;
    public void deleteNotificationHistoryItem(java.lang.String p0, int p1, long p2) throws android.os.RemoteException;
    public void silenceNotificationSound() throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String p0) throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getActiveNotificationsWithAttribution(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getHistoricalNotificationsWithAttribution(java.lang.String p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public android.app.NotificationHistory getNotificationHistory(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerListener(android.service.notification.INotificationListener p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException;
    public void unregisterListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void cancelNotificationFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void cancelNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void snoozeNotificationUntilContextFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void snoozeNotificationUntilFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public void requestBindListener(android.content.ComponentName p0) throws android.os.RemoteException;
    public void requestUnbindListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException;
    public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException;
    public void setNotificationsShownFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void clearRequestedListenerHints(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public void requestHintsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public int getHintsFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public int getInterruptionFilterFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void setInterruptionFilter(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void updateNotificationChannelGroupFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, android.app.NotificationChannelGroup p3) throws android.os.RemoteException;
    public void updateNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, android.app.NotificationChannel p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelGroupsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void applyEnqueuedAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException;
    public void applyAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException;
    public void applyAdjustmentsFromAssistant(android.service.notification.INotificationListener p0, java.util.List<android.service.notification.Adjustment> p1) throws android.os.RemoteException;
    public void unsnoozeNotificationFromAssistant(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException;
    public void unsnoozeNotificationFromSystemListener(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.ComponentName getEffectsSuppressor() throws android.os.RemoteException;
    public boolean matchesCallFilter(android.os.Bundle p0) throws android.os.RemoteException;
    public boolean isSystemConditionProviderEnabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) throws android.os.RemoteException;
    public android.content.ComponentName getAllowedNotificationAssistantForUser(int p0) throws android.os.RemoteException;
    public android.content.ComponentName getAllowedNotificationAssistant() throws android.os.RemoteException;
    public int getZenMode() throws android.os.RemoteException;
    public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException;
    public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException;
    public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException;
    public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException;
    public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException;
    public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException;
    public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1) throws android.os.RemoteException;
    public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException;
    public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.service.notification.ZenModeConfig.ZenRule> getZenRules() throws android.os.RemoteException;
    public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0) throws android.os.RemoteException;
    public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1) throws android.os.RemoteException;
    public boolean removeAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException;
    public boolean removeAutomaticZenRules(java.lang.String p0) throws android.os.RemoteException;
    public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException;
    public byte[] getBackupPayload(int p0) throws android.os.RemoteException;
    public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setNotificationDelegate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getNotificationDelegate(java.lang.String p0) throws android.os.RemoteException;
    public boolean canNotifyAsPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setPrivateNotificationsAllowed(boolean p0) throws android.os.RemoteException;
    public boolean getPrivateNotificationsAllowed() throws android.os.RemoteException;
    public long pullStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException;

    public static class Default implements android.app.INotificationManager {
        public Default() {}
        public void cancelAllNotifications(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void clearData(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void enqueueTextToast(java.lang.String p0, android.os.IBinder p1, java.lang.CharSequence p2, int p3, int p4, android.app.ITransientNotificationCallback p5) throws android.os.RemoteException {}
        public void enqueueToast(java.lang.String p0, android.os.IBinder p1, android.app.ITransientNotification p2, int p3, int p4) throws android.os.RemoteException {}
        public void cancelToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void finishToken(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void enqueueNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.app.Notification p4, int p5) throws android.os.RemoteException {}
        public void cancelNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
        public void setShowBadge(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean canShowBadge(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasSentValidMsg(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isInInvalidMsgState(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasUserDemotedInvalidMsgApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setInvalidMsgAppDemoted(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationsEnabledForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationsEnabledWithImportanceLockForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean areNotificationsEnabledForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean areNotificationsEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getPackageImportance(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getAllowedAssistantAdjustments(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void allowAssistantAdjustment(java.lang.String p0) throws android.os.RemoteException {}
        public void disallowAssistantAdjustment(java.lang.String p0) throws android.os.RemoteException {}
        public boolean shouldHideSilentStatusIcons(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setHideSilentStatusIcons(boolean p0) throws android.os.RemoteException {}
        public void setBubblesAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public boolean areBubblesAllowed(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getBubblePreferenceForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void createNotificationChannelGroups(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void createNotificationChannels(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void createNotificationChannelsForPackage(java.lang.String p0, int p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getConversations(boolean p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getConversationsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannelGroup getPopulatedNotificationChannelGroupForPackage(java.lang.String p0, int p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
        public void updateNotificationChannelGroupForPackage(java.lang.String p0, int p1, android.app.NotificationChannelGroup p2) throws android.os.RemoteException {}
        public void updateNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2) throws android.os.RemoteException {}
        public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannel getConversationNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5) throws android.os.RemoteException { return null; }
        public void createConversationNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, android.app.NotificationChannel p3, java.lang.String p4) throws android.os.RemoteException {}
        public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return null; }
        public void deleteNotificationChannel(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void deleteConversationNotificationChannels(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
        public int getNumNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getDeletedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int getBlockedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void deleteNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean onlyHasDefaultChannel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public int getBlockedAppCount(int p0) throws android.os.RemoteException { return 0; }
        public boolean areChannelsBypassingDnd() throws android.os.RemoteException { return false; }
        public int getAppsBypassingDndCount(int p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.ParceledListSlice getNotificationChannelsBypassingDnd(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean isPackagePaused(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void deleteNotificationHistoryItem(java.lang.String p0, int p1, long p2) throws android.os.RemoteException {}
        public void silenceNotificationSound() throws android.os.RemoteException {}
        public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.service.notification.StatusBarNotification[] getActiveNotificationsWithAttribution(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.service.notification.StatusBarNotification[] getHistoricalNotificationsWithAttribution(java.lang.String p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
        public android.app.NotificationHistory getNotificationHistory(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void registerListener(android.service.notification.INotificationListener p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
        public void unregisterListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public void cancelNotificationFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void cancelNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void snoozeNotificationUntilContextFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void snoozeNotificationUntilFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
        public void requestBindListener(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void requestUnbindListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException {}
        public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException {}
        public void setNotificationsShownFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException { return null; }
        public void clearRequestedListenerHints(android.service.notification.INotificationListener p0) throws android.os.RemoteException {}
        public void requestHintsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public int getHintsFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
        public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public int getInterruptionFilterFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
        public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public void setInterruptionFilter(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void updateNotificationChannelGroupFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, android.app.NotificationChannelGroup p3) throws android.os.RemoteException {}
        public void updateNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, android.app.NotificationChannel p3) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getNotificationChannelsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelGroupsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
        public void applyEnqueuedAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException {}
        public void applyAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException {}
        public void applyAdjustmentsFromAssistant(android.service.notification.INotificationListener p0, java.util.List<android.service.notification.Adjustment> p1) throws android.os.RemoteException {}
        public void unsnoozeNotificationFromAssistant(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unsnoozeNotificationFromSystemListener(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.content.ComponentName getEffectsSuppressor() throws android.os.RemoteException { return null; }
        public boolean matchesCallFilter(android.os.Bundle p0) throws android.os.RemoteException { return false; }
        public boolean isSystemConditionProviderEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException { return null; }
        public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getAllowedNotificationAssistantForUser(int p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getAllowedNotificationAssistant() throws android.os.RemoteException { return null; }
        public int getZenMode() throws android.os.RemoteException { return 0; }
        public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException { return null; }
        public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException { return null; }
        public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException {}
        public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException {}
        public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1) throws android.os.RemoteException {}
        public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.service.notification.ZenModeConfig.ZenRule> getZenRules() throws android.os.RemoteException { return null; }
        public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0) throws android.os.RemoteException { return null; }
        public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1) throws android.os.RemoteException { return false; }
        public boolean removeAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean removeAutomaticZenRules(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException {}
        public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
        public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setNotificationDelegate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String getNotificationDelegate(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean canNotifyAsPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public void setPrivateNotificationsAllowed(boolean p0) throws android.os.RemoteException {}
        public boolean getPrivateNotificationsAllowed() throws android.os.RemoteException { return false; }
        public long pullStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.INotificationManager {
        private static final java.lang.String DESCRIPTOR = "android.app.INotificationManager";
        static final int TRANSACTION_cancelAllNotifications = 1;
        static final int TRANSACTION_clearData = 2;
        static final int TRANSACTION_enqueueTextToast = 3;
        static final int TRANSACTION_enqueueToast = 4;
        static final int TRANSACTION_cancelToast = 5;
        static final int TRANSACTION_finishToken = 6;
        static final int TRANSACTION_enqueueNotificationWithTag = 7;
        static final int TRANSACTION_cancelNotificationWithTag = 8;
        static final int TRANSACTION_setShowBadge = 9;
        static final int TRANSACTION_canShowBadge = 10;
        static final int TRANSACTION_hasSentValidMsg = 11;
        static final int TRANSACTION_isInInvalidMsgState = 12;
        static final int TRANSACTION_hasUserDemotedInvalidMsgApp = 13;
        static final int TRANSACTION_setInvalidMsgAppDemoted = 14;
        static final int TRANSACTION_setNotificationsEnabledForPackage = 15;
        static final int TRANSACTION_setNotificationsEnabledWithImportanceLockForPackage = 16;
        static final int TRANSACTION_areNotificationsEnabledForPackage = 17;
        static final int TRANSACTION_areNotificationsEnabled = 18;
        static final int TRANSACTION_getPackageImportance = 19;
        static final int TRANSACTION_getAllowedAssistantAdjustments = 20;
        static final int TRANSACTION_allowAssistantAdjustment = 21;
        static final int TRANSACTION_disallowAssistantAdjustment = 22;
        static final int TRANSACTION_shouldHideSilentStatusIcons = 23;
        static final int TRANSACTION_setHideSilentStatusIcons = 24;
        static final int TRANSACTION_setBubblesAllowed = 25;
        static final int TRANSACTION_areBubblesAllowed = 26;
        static final int TRANSACTION_getBubblePreferenceForPackage = 27;
        static final int TRANSACTION_createNotificationChannelGroups = 28;
        static final int TRANSACTION_createNotificationChannels = 29;
        static final int TRANSACTION_createNotificationChannelsForPackage = 30;
        static final int TRANSACTION_getConversations = 31;
        static final int TRANSACTION_getConversationsForPackage = 32;
        static final int TRANSACTION_getNotificationChannelGroupsForPackage = 33;
        static final int TRANSACTION_getNotificationChannelGroupForPackage = 34;
        static final int TRANSACTION_getPopulatedNotificationChannelGroupForPackage = 35;
        static final int TRANSACTION_updateNotificationChannelGroupForPackage = 36;
        static final int TRANSACTION_updateNotificationChannelForPackage = 37;
        static final int TRANSACTION_getNotificationChannel = 38;
        static final int TRANSACTION_getConversationNotificationChannel = 39;
        static final int TRANSACTION_createConversationNotificationChannelForPackage = 40;
        static final int TRANSACTION_getNotificationChannelForPackage = 41;
        static final int TRANSACTION_deleteNotificationChannel = 42;
        static final int TRANSACTION_deleteConversationNotificationChannels = 43;
        static final int TRANSACTION_getNotificationChannels = 44;
        static final int TRANSACTION_getNotificationChannelsForPackage = 45;
        static final int TRANSACTION_getNumNotificationChannelsForPackage = 46;
        static final int TRANSACTION_getDeletedChannelCount = 47;
        static final int TRANSACTION_getBlockedChannelCount = 48;
        static final int TRANSACTION_deleteNotificationChannelGroup = 49;
        static final int TRANSACTION_getNotificationChannelGroup = 50;
        static final int TRANSACTION_getNotificationChannelGroups = 51;
        static final int TRANSACTION_onlyHasDefaultChannel = 52;
        static final int TRANSACTION_getBlockedAppCount = 53;
        static final int TRANSACTION_areChannelsBypassingDnd = 54;
        static final int TRANSACTION_getAppsBypassingDndCount = 55;
        static final int TRANSACTION_getNotificationChannelsBypassingDnd = 56;
        static final int TRANSACTION_isPackagePaused = 57;
        static final int TRANSACTION_deleteNotificationHistoryItem = 58;
        static final int TRANSACTION_silenceNotificationSound = 59;
        static final int TRANSACTION_getActiveNotifications = 60;
        static final int TRANSACTION_getActiveNotificationsWithAttribution = 61;
        static final int TRANSACTION_getHistoricalNotifications = 62;
        static final int TRANSACTION_getHistoricalNotificationsWithAttribution = 63;
        static final int TRANSACTION_getNotificationHistory = 64;
        static final int TRANSACTION_registerListener = 65;
        static final int TRANSACTION_unregisterListener = 66;
        static final int TRANSACTION_cancelNotificationFromListener = 67;
        static final int TRANSACTION_cancelNotificationsFromListener = 68;
        static final int TRANSACTION_snoozeNotificationUntilContextFromListener = 69;
        static final int TRANSACTION_snoozeNotificationUntilFromListener = 70;
        static final int TRANSACTION_requestBindListener = 71;
        static final int TRANSACTION_requestUnbindListener = 72;
        static final int TRANSACTION_requestBindProvider = 73;
        static final int TRANSACTION_requestUnbindProvider = 74;
        static final int TRANSACTION_setNotificationsShownFromListener = 75;
        static final int TRANSACTION_getActiveNotificationsFromListener = 76;
        static final int TRANSACTION_getSnoozedNotificationsFromListener = 77;
        static final int TRANSACTION_clearRequestedListenerHints = 78;
        static final int TRANSACTION_requestHintsFromListener = 79;
        static final int TRANSACTION_getHintsFromListener = 80;
        static final int TRANSACTION_requestInterruptionFilterFromListener = 81;
        static final int TRANSACTION_getInterruptionFilterFromListener = 82;
        static final int TRANSACTION_setOnNotificationPostedTrimFromListener = 83;
        static final int TRANSACTION_setInterruptionFilter = 84;
        static final int TRANSACTION_updateNotificationChannelGroupFromPrivilegedListener = 85;
        static final int TRANSACTION_updateNotificationChannelFromPrivilegedListener = 86;
        static final int TRANSACTION_getNotificationChannelsFromPrivilegedListener = 87;
        static final int TRANSACTION_getNotificationChannelGroupsFromPrivilegedListener = 88;
        static final int TRANSACTION_applyEnqueuedAdjustmentFromAssistant = 89;
        static final int TRANSACTION_applyAdjustmentFromAssistant = 90;
        static final int TRANSACTION_applyAdjustmentsFromAssistant = 91;
        static final int TRANSACTION_unsnoozeNotificationFromAssistant = 92;
        static final int TRANSACTION_unsnoozeNotificationFromSystemListener = 93;
        static final int TRANSACTION_getEffectsSuppressor = 94;
        static final int TRANSACTION_matchesCallFilter = 95;
        static final int TRANSACTION_isSystemConditionProviderEnabled = 96;
        static final int TRANSACTION_isNotificationListenerAccessGranted = 97;
        static final int TRANSACTION_isNotificationListenerAccessGrantedForUser = 98;
        static final int TRANSACTION_isNotificationAssistantAccessGranted = 99;
        static final int TRANSACTION_setNotificationListenerAccessGranted = 100;
        static final int TRANSACTION_setNotificationAssistantAccessGranted = 101;
        static final int TRANSACTION_setNotificationListenerAccessGrantedForUser = 102;
        static final int TRANSACTION_setNotificationAssistantAccessGrantedForUser = 103;
        static final int TRANSACTION_getEnabledNotificationListenerPackages = 104;
        static final int TRANSACTION_getEnabledNotificationListeners = 105;
        static final int TRANSACTION_getAllowedNotificationAssistantForUser = 106;
        static final int TRANSACTION_getAllowedNotificationAssistant = 107;
        static final int TRANSACTION_getZenMode = 108;
        static final int TRANSACTION_getZenModeConfig = 109;
        static final int TRANSACTION_getConsolidatedNotificationPolicy = 110;
        static final int TRANSACTION_setZenMode = 111;
        static final int TRANSACTION_notifyConditions = 112;
        static final int TRANSACTION_isNotificationPolicyAccessGranted = 113;
        static final int TRANSACTION_getNotificationPolicy = 114;
        static final int TRANSACTION_setNotificationPolicy = 115;
        static final int TRANSACTION_isNotificationPolicyAccessGrantedForPackage = 116;
        static final int TRANSACTION_setNotificationPolicyAccessGranted = 117;
        static final int TRANSACTION_setNotificationPolicyAccessGrantedForUser = 118;
        static final int TRANSACTION_getAutomaticZenRule = 119;
        static final int TRANSACTION_getZenRules = 120;
        static final int TRANSACTION_addAutomaticZenRule = 121;
        static final int TRANSACTION_updateAutomaticZenRule = 122;
        static final int TRANSACTION_removeAutomaticZenRule = 123;
        static final int TRANSACTION_removeAutomaticZenRules = 124;
        static final int TRANSACTION_getRuleInstanceCount = 125;
        static final int TRANSACTION_setAutomaticZenRuleState = 126;
        static final int TRANSACTION_getBackupPayload = 127;
        static final int TRANSACTION_applyRestore = 128;
        static final int TRANSACTION_getAppActiveNotifications = 129;
        static final int TRANSACTION_setNotificationDelegate = 130;
        static final int TRANSACTION_getNotificationDelegate = 131;
        static final int TRANSACTION_canNotifyAsPackage = 132;
        static final int TRANSACTION_setPrivateNotificationsAllowed = 133;
        static final int TRANSACTION_getPrivateNotificationsAllowed = 134;
        static final int TRANSACTION_pullStats = 135;
        public Stub() { super(); }
        public static android.app.INotificationManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.INotificationManager p0) { return false; }
        public static android.app.INotificationManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.INotificationManager {
            private android.os.IBinder mRemote;
            public static android.app.INotificationManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void cancelAllNotifications(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void clearData(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void enqueueTextToast(java.lang.String p0, android.os.IBinder p1, java.lang.CharSequence p2, int p3, int p4, android.app.ITransientNotificationCallback p5) throws android.os.RemoteException {}
            public void enqueueToast(java.lang.String p0, android.os.IBinder p1, android.app.ITransientNotification p2, int p3, int p4) throws android.os.RemoteException {}
            public void cancelToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void finishToken(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void enqueueNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.app.Notification p4, int p5) throws android.os.RemoteException {}
            public void cancelNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
            public void setShowBadge(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean canShowBadge(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasSentValidMsg(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isInInvalidMsgState(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasUserDemotedInvalidMsgApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setInvalidMsgAppDemoted(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationsEnabledForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationsEnabledWithImportanceLockForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean areNotificationsEnabledForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean areNotificationsEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getPackageImportance(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getAllowedAssistantAdjustments(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void allowAssistantAdjustment(java.lang.String p0) throws android.os.RemoteException {}
            public void disallowAssistantAdjustment(java.lang.String p0) throws android.os.RemoteException {}
            public boolean shouldHideSilentStatusIcons(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setHideSilentStatusIcons(boolean p0) throws android.os.RemoteException {}
            public void setBubblesAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public boolean areBubblesAllowed(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getBubblePreferenceForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void createNotificationChannelGroups(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
            public void createNotificationChannels(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
            public void createNotificationChannelsForPackage(java.lang.String p0, int p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getConversations(boolean p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getConversationsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannelGroup getPopulatedNotificationChannelGroupForPackage(java.lang.String p0, int p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
            public void updateNotificationChannelGroupForPackage(java.lang.String p0, int p1, android.app.NotificationChannelGroup p2) throws android.os.RemoteException {}
            public void updateNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2) throws android.os.RemoteException {}
            public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannel getConversationNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5) throws android.os.RemoteException { return null; }
            public void createConversationNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, android.app.NotificationChannel p3, java.lang.String p4) throws android.os.RemoteException {}
            public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return null; }
            public void deleteNotificationChannel(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void deleteConversationNotificationChannels(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
            public int getNumNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getDeletedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int getBlockedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void deleteNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean onlyHasDefaultChannel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public int getBlockedAppCount(int p0) throws android.os.RemoteException { return 0; }
            public boolean areChannelsBypassingDnd() throws android.os.RemoteException { return false; }
            public int getAppsBypassingDndCount(int p0) throws android.os.RemoteException { return 0; }
            public android.content.pm.ParceledListSlice getNotificationChannelsBypassingDnd(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean isPackagePaused(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void deleteNotificationHistoryItem(java.lang.String p0, int p1, long p2) throws android.os.RemoteException {}
            public void silenceNotificationSound() throws android.os.RemoteException {}
            public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.service.notification.StatusBarNotification[] getActiveNotificationsWithAttribution(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.service.notification.StatusBarNotification[] getHistoricalNotificationsWithAttribution(java.lang.String p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
            public android.app.NotificationHistory getNotificationHistory(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void registerListener(android.service.notification.INotificationListener p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
            public void unregisterListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public void cancelNotificationFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void cancelNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void snoozeNotificationUntilContextFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void snoozeNotificationUntilFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, long p2) throws android.os.RemoteException {}
            public void requestBindListener(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void requestUnbindListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException {}
            public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException {}
            public void setNotificationsShownFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException { return null; }
            public void clearRequestedListenerHints(android.service.notification.INotificationListener p0) throws android.os.RemoteException {}
            public void requestHintsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public int getHintsFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
            public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public int getInterruptionFilterFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
            public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public void setInterruptionFilter(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void updateNotificationChannelGroupFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, android.app.NotificationChannelGroup p3) throws android.os.RemoteException {}
            public void updateNotificationChannelFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, android.app.NotificationChannel p3) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getNotificationChannelsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelGroupsFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2) throws android.os.RemoteException { return null; }
            public void applyEnqueuedAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException {}
            public void applyAdjustmentFromAssistant(android.service.notification.INotificationListener p0, android.service.notification.Adjustment p1) throws android.os.RemoteException {}
            public void applyAdjustmentsFromAssistant(android.service.notification.INotificationListener p0, java.util.List<android.service.notification.Adjustment> p1) throws android.os.RemoteException {}
            public void unsnoozeNotificationFromAssistant(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unsnoozeNotificationFromSystemListener(android.service.notification.INotificationListener p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.content.ComponentName getEffectsSuppressor() throws android.os.RemoteException { return null; }
            public boolean matchesCallFilter(android.os.Bundle p0) throws android.os.RemoteException { return false; }
            public boolean isSystemConditionProviderEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException { return null; }
            public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getAllowedNotificationAssistantForUser(int p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getAllowedNotificationAssistant() throws android.os.RemoteException { return null; }
            public int getZenMode() throws android.os.RemoteException { return 0; }
            public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException { return null; }
            public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException { return null; }
            public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2) throws android.os.RemoteException {}
            public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException {}
            public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1) throws android.os.RemoteException {}
            public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.service.notification.ZenModeConfig.ZenRule> getZenRules() throws android.os.RemoteException { return null; }
            public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0) throws android.os.RemoteException { return null; }
            public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1) throws android.os.RemoteException { return false; }
            public boolean removeAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean removeAutomaticZenRules(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException {}
            public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
            public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setNotificationDelegate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String getNotificationDelegate(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean canNotifyAsPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public void setPrivateNotificationsAllowed(boolean p0) throws android.os.RemoteException {}
            public boolean getPrivateNotificationsAllowed() throws android.os.RemoteException { return false; }
            public long pullStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException { return 0L; }
        }
    }
}
