package android.app;

public interface INotificationManager extends android.os.IInterface {
    public void cancelAllNotifications(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void clearData(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean enqueueTextToast(java.lang.String p0, android.os.IBinder p1, java.lang.CharSequence p2, int p3, boolean p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException;
    public boolean enqueueToast(java.lang.String p0, android.os.IBinder p1, android.app.ITransientNotification p2, int p3, boolean p4, int p5) throws android.os.RemoteException;
    public void cancelToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void finishToken(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void enqueueNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.app.Notification p4, int p5) throws android.os.RemoteException;
    public void cancelNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public boolean isInCall(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setShowBadge(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean canShowBadge(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasSentValidMsg(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isInInvalidMsgState(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasUserDemotedInvalidMsgApp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setInvalidMsgAppDemoted(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean hasSentValidBubble(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setNotificationsEnabledForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationsEnabledWithImportanceLockForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean areNotificationsEnabledForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean areNotificationsEnabled(java.lang.String p0) throws android.os.RemoteException;
    public int getPackageImportance(java.lang.String p0) throws android.os.RemoteException;
    public boolean isImportanceLocked(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllowedAssistantAdjustments(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllowedAssistantAdjustmentsForUser(int p0) throws android.os.RemoteException;
    public void allowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void disallowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean shouldHideSilentStatusIcons(java.lang.String p0) throws android.os.RemoteException;
    public void setHideSilentStatusIcons(boolean p0) throws android.os.RemoteException;
    public void setBubblesAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean areBubblesAllowed(java.lang.String p0) throws android.os.RemoteException;
    public boolean areBubblesEnabled(android.os.UserHandle p0) throws android.os.RemoteException;
    public int getBubblePreferenceForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void createNotificationChannelGroups(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException;
    public void createNotificationChannels(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException;
    public void createNotificationChannelsForPackage(java.lang.String p0, int p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getConversations(boolean p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getConversationsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.app.NotificationChannelGroup getPopulatedNotificationChannelGroupForPackage(java.lang.String p0, int p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getRecentBlockedNotificationChannelGroupsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void updateNotificationChannelGroupForPackage(java.lang.String p0, int p1, android.app.NotificationChannelGroup p2) throws android.os.RemoteException;
    public void updateNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2) throws android.os.RemoteException;
    public void unlockNotificationChannel(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void unlockAllNotificationChannels() throws android.os.RemoteException;
    public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public android.app.NotificationChannel getConversationNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5) throws android.os.RemoteException;
    public void createConversationNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2, java.lang.String p3) throws android.os.RemoteException;
    public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException;
    public void deleteNotificationChannel(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getNumNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getDeletedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getBlockedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void deleteNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelGroupsWithoutChannels(java.lang.String p0) throws android.os.RemoteException;
    public boolean onlyHasDefaultChannel(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean areChannelsBypassingDnd() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getNotificationChannelsBypassingDnd(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getPackagesBypassingDnd(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPackagesWithAnyChannels(int p0) throws android.os.RemoteException;
    public boolean isPackagePaused(java.lang.String p0) throws android.os.RemoteException;
    public void deleteNotificationHistoryItem(java.lang.String p0, int p1, long p2) throws android.os.RemoteException;
    public boolean isPermissionFixed(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void silenceNotificationSound() throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_NOTIFICATIONS")
    public android.service.notification.StatusBarNotification[] getActiveNotificationsWithAttribution(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_NOTIFICATIONS")
    public android.service.notification.StatusBarNotification[] getHistoricalNotificationsWithAttribution(java.lang.String p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_NOTIFICATIONS")
    public android.app.NotificationHistory getNotificationHistory(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerListener(android.service.notification.INotificationListener p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException;
    public void unregisterListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void cancelNotificationFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void cancelNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void snoozeNotificationUntilContextFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void snoozeNotificationUntilFromListener(android.service.notification.INotificationListener p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public void requestBindListener(android.content.ComponentName p0) throws android.os.RemoteException;
    public void requestUnbindListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public void requestUnbindListenerComponent(android.content.ComponentName p0) throws android.os.RemoteException;
    public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException;
    public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException;
    public void setNotificationsShownFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void clearRequestedListenerHints(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public void requestHintsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public int getHintsFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public int getHintsFromListenerNoToken() throws android.os.RemoteException;
    public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public int getInterruptionFilterFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException;
    public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException;
    public void setInterruptionFilter(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.app.NotificationChannel createConversationNotificationChannelForPackageFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
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
    public void cleanUpCallersAfter(long p0) throws android.os.RemoteException;
    public boolean isSystemConditionProviderEnabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) throws android.os.RemoteException;
    public android.content.ComponentName getAllowedNotificationAssistantForUser(int p0) throws android.os.RemoteException;
    public android.content.ComponentName getAllowedNotificationAssistant() throws android.os.RemoteException;
    public android.content.ComponentName getDefaultNotificationAssistant() throws android.os.RemoteException;
    public void setNASMigrationDoneAndResetDefault(int p0, boolean p1) throws android.os.RemoteException;
    public boolean hasEnabledNotificationListener(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getZenMode() throws android.os.RemoteException;
    public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException;
    public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException;
    public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException;
    public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException;
    public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException;
    public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1, boolean p2) throws android.os.RemoteException;
    public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException;
    public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.service.notification.ZenPolicy getDefaultZenPolicy() throws android.os.RemoteException;
    public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAutomaticZenRules() throws android.os.RemoteException;
    public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1, boolean p2) throws android.os.RemoteException;
    public boolean removeAutomaticZenRule(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean removeAutomaticZenRules(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getAutomaticZenRuleState(java.lang.String p0) throws android.os.RemoteException;
    public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException;
    public void setManualZenRuleDeviceEffects(android.service.notification.ZenDeviceEffects p0) throws android.os.RemoteException;
    public byte[] getBackupPayload(int p0) throws android.os.RemoteException;
    public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setNotificationDelegate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getNotificationDelegate(java.lang.String p0) throws android.os.RemoteException;
    public boolean canNotifyAsPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean canUseFullScreenIntent(android.content.AttributionSource p0) throws android.os.RemoteException;
    public void setPrivateNotificationsAllowed(boolean p0) throws android.os.RemoteException;
    public boolean getPrivateNotificationsAllowed() throws android.os.RemoteException;
    public long pullStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException;
    public android.service.notification.NotificationListenerFilter getListenerFilter(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setListenerFilter(android.content.ComponentName p0, int p1, android.service.notification.NotificationListenerFilter p2) throws android.os.RemoteException;
    public void migrateNotificationFilter(android.service.notification.INotificationListener p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_TOAST_RATE_LIMITING")
    public void setToastRateLimitingEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.ACCESS_NOTIFICATIONS"})
    public void registerCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.ACCESS_NOTIFICATIONS"})
    public void unregisterCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException;
    public void setCanBePromoted(java.lang.String p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public boolean appCanBePromoted(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean canBePromoted(java.lang.String p0) throws android.os.RemoteException;
    public void setAdjustmentTypeSupportedState(android.service.notification.INotificationListener p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getUnsupportedAdjustmentTypes() throws android.os.RemoteException;
    public int[] getAllowedClassificationTypes() throws android.os.RemoteException;
    public void setAssistantClassificationTypeState(int p0, boolean p1) throws android.os.RemoteException;
    public java.lang.String[] getAdjustmentDeniedPackages(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void incrementCounter(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.app.INotificationManager {
        public Default() {}
        public void cancelAllNotifications(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void clearData(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean enqueueTextToast(java.lang.String p0, android.os.IBinder p1, java.lang.CharSequence p2, int p3, boolean p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException { return false; }
        public boolean enqueueToast(java.lang.String p0, android.os.IBinder p1, android.app.ITransientNotification p2, int p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
        public void cancelToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void finishToken(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void enqueueNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.app.Notification p4, int p5) throws android.os.RemoteException {}
        public void cancelNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
        public boolean isInCall(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setShowBadge(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean canShowBadge(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasSentValidMsg(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isInInvalidMsgState(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasUserDemotedInvalidMsgApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setInvalidMsgAppDemoted(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean hasSentValidBubble(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setNotificationsEnabledForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationsEnabledWithImportanceLockForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean areNotificationsEnabledForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean areNotificationsEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getPackageImportance(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public boolean isImportanceLocked(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getAllowedAssistantAdjustments(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAllowedAssistantAdjustmentsForUser(int p0) throws android.os.RemoteException { return null; }
        public void allowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void disallowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean shouldHideSilentStatusIcons(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setHideSilentStatusIcons(boolean p0) throws android.os.RemoteException {}
        public void setBubblesAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public boolean areBubblesAllowed(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean areBubblesEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
        public int getBubblePreferenceForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void createNotificationChannelGroups(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void createNotificationChannels(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
        public void createNotificationChannelsForPackage(java.lang.String p0, int p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getConversations(boolean p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getConversationsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannelGroup getPopulatedNotificationChannelGroupForPackage(java.lang.String p0, int p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getRecentBlockedNotificationChannelGroupsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void updateNotificationChannelGroupForPackage(java.lang.String p0, int p1, android.app.NotificationChannelGroup p2) throws android.os.RemoteException {}
        public void updateNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2) throws android.os.RemoteException {}
        public void unlockNotificationChannel(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void unlockAllNotificationChannels() throws android.os.RemoteException {}
        public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.app.NotificationChannel getConversationNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5) throws android.os.RemoteException { return null; }
        public void createConversationNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2, java.lang.String p3) throws android.os.RemoteException {}
        public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return null; }
        public void deleteNotificationChannel(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
        public int getNumNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getDeletedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int getBlockedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void deleteNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getNotificationChannelGroupsWithoutChannels(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean onlyHasDefaultChannel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean areChannelsBypassingDnd() throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice getNotificationChannelsBypassingDnd(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getPackagesBypassingDnd(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPackagesWithAnyChannels(int p0) throws android.os.RemoteException { return null; }
        public boolean isPackagePaused(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void deleteNotificationHistoryItem(java.lang.String p0, int p1, long p2) throws android.os.RemoteException {}
        public boolean isPermissionFixed(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
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
        public void requestUnbindListenerComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException {}
        public void setNotificationsShownFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException { return null; }
        public void clearRequestedListenerHints(android.service.notification.INotificationListener p0) throws android.os.RemoteException {}
        public void requestHintsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public int getHintsFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
        public int getHintsFromListenerNoToken() throws android.os.RemoteException { return 0; }
        public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public int getInterruptionFilterFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
        public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
        public void setInterruptionFilter(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public android.app.NotificationChannel createConversationNotificationChannelForPackageFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
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
        public void cleanUpCallersAfter(long p0) throws android.os.RemoteException {}
        public boolean isSystemConditionProviderEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException { return null; }
        public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getAllowedNotificationAssistantForUser(int p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getAllowedNotificationAssistant() throws android.os.RemoteException { return null; }
        public android.content.ComponentName getDefaultNotificationAssistant() throws android.os.RemoteException { return null; }
        public void setNASMigrationDoneAndResetDefault(int p0, boolean p1) throws android.os.RemoteException {}
        public boolean hasEnabledNotificationListener(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public int getZenMode() throws android.os.RemoteException { return 0; }
        public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException { return null; }
        public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException { return null; }
        public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException {}
        public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1, boolean p2) throws android.os.RemoteException {}
        public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public android.service.notification.ZenPolicy getDefaultZenPolicy() throws android.os.RemoteException { return null; }
        public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getAutomaticZenRules() throws android.os.RemoteException { return null; }
        public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
        public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean removeAutomaticZenRule(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean removeAutomaticZenRules(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
        public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public int getAutomaticZenRuleState(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException {}
        public void setManualZenRuleDeviceEffects(android.service.notification.ZenDeviceEffects p0) throws android.os.RemoteException {}
        public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
        public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setNotificationDelegate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String getNotificationDelegate(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean canNotifyAsPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean canUseFullScreenIntent(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public void setPrivateNotificationsAllowed(boolean p0) throws android.os.RemoteException {}
        public boolean getPrivateNotificationsAllowed() throws android.os.RemoteException { return false; }
        public long pullStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException { return 0L; }
        public android.service.notification.NotificationListenerFilter getListenerFilter(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public void setListenerFilter(android.content.ComponentName p0, int p1, android.service.notification.NotificationListenerFilter p2) throws android.os.RemoteException {}
        public void migrateNotificationFilter(android.service.notification.INotificationListener p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public void setToastRateLimitingEnabled(boolean p0) throws android.os.RemoteException {}
        public void registerCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException {}
        public void unregisterCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException {}
        public void setCanBePromoted(java.lang.String p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public boolean appCanBePromoted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean canBePromoted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setAdjustmentTypeSupportedState(android.service.notification.INotificationListener p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getUnsupportedAdjustmentTypes() throws android.os.RemoteException { return null; }
        public int[] getAllowedClassificationTypes() throws android.os.RemoteException { return null; }
        public void setAssistantClassificationTypeState(int p0, boolean p1) throws android.os.RemoteException {}
        public java.lang.String[] getAdjustmentDeniedPackages(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void incrementCounter(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.INotificationManager {
        public static final java.lang.String DESCRIPTOR = "android.app.INotificationManager";
        static final int TRANSACTION_cancelAllNotifications = 1;
        static final int TRANSACTION_clearData = 2;
        static final int TRANSACTION_enqueueTextToast = 3;
        static final int TRANSACTION_enqueueToast = 4;
        static final int TRANSACTION_cancelToast = 5;
        static final int TRANSACTION_finishToken = 6;
        static final int TRANSACTION_enqueueNotificationWithTag = 7;
        static final int TRANSACTION_cancelNotificationWithTag = 8;
        static final int TRANSACTION_isInCall = 9;
        static final int TRANSACTION_setShowBadge = 10;
        static final int TRANSACTION_canShowBadge = 11;
        static final int TRANSACTION_hasSentValidMsg = 12;
        static final int TRANSACTION_isInInvalidMsgState = 13;
        static final int TRANSACTION_hasUserDemotedInvalidMsgApp = 14;
        static final int TRANSACTION_setInvalidMsgAppDemoted = 15;
        static final int TRANSACTION_hasSentValidBubble = 16;
        static final int TRANSACTION_setNotificationsEnabledForPackage = 17;
        static final int TRANSACTION_setNotificationsEnabledWithImportanceLockForPackage = 18;
        static final int TRANSACTION_areNotificationsEnabledForPackage = 19;
        static final int TRANSACTION_areNotificationsEnabled = 20;
        static final int TRANSACTION_getPackageImportance = 21;
        static final int TRANSACTION_isImportanceLocked = 22;
        static final int TRANSACTION_getAllowedAssistantAdjustments = 23;
        static final int TRANSACTION_getAllowedAssistantAdjustmentsForUser = 24;
        static final int TRANSACTION_allowAssistantAdjustment = 25;
        static final int TRANSACTION_disallowAssistantAdjustment = 26;
        static final int TRANSACTION_shouldHideSilentStatusIcons = 27;
        static final int TRANSACTION_setHideSilentStatusIcons = 28;
        static final int TRANSACTION_setBubblesAllowed = 29;
        static final int TRANSACTION_areBubblesAllowed = 30;
        static final int TRANSACTION_areBubblesEnabled = 31;
        static final int TRANSACTION_getBubblePreferenceForPackage = 32;
        static final int TRANSACTION_createNotificationChannelGroups = 33;
        static final int TRANSACTION_createNotificationChannels = 34;
        static final int TRANSACTION_createNotificationChannelsForPackage = 35;
        static final int TRANSACTION_getConversations = 36;
        static final int TRANSACTION_getConversationsForPackage = 37;
        static final int TRANSACTION_getNotificationChannelGroupsForPackage = 38;
        static final int TRANSACTION_getNotificationChannelGroupForPackage = 39;
        static final int TRANSACTION_getPopulatedNotificationChannelGroupForPackage = 40;
        static final int TRANSACTION_getRecentBlockedNotificationChannelGroupsForPackage = 41;
        static final int TRANSACTION_updateNotificationChannelGroupForPackage = 42;
        static final int TRANSACTION_updateNotificationChannelForPackage = 43;
        static final int TRANSACTION_unlockNotificationChannel = 44;
        static final int TRANSACTION_unlockAllNotificationChannels = 45;
        static final int TRANSACTION_getNotificationChannel = 46;
        static final int TRANSACTION_getConversationNotificationChannel = 47;
        static final int TRANSACTION_createConversationNotificationChannelForPackage = 48;
        static final int TRANSACTION_getNotificationChannelForPackage = 49;
        static final int TRANSACTION_deleteNotificationChannel = 50;
        static final int TRANSACTION_getNotificationChannels = 51;
        static final int TRANSACTION_getNotificationChannelsForPackage = 52;
        static final int TRANSACTION_getNumNotificationChannelsForPackage = 53;
        static final int TRANSACTION_getDeletedChannelCount = 54;
        static final int TRANSACTION_getBlockedChannelCount = 55;
        static final int TRANSACTION_deleteNotificationChannelGroup = 56;
        static final int TRANSACTION_getNotificationChannelGroup = 57;
        static final int TRANSACTION_getNotificationChannelGroups = 58;
        static final int TRANSACTION_getNotificationChannelGroupsWithoutChannels = 59;
        static final int TRANSACTION_onlyHasDefaultChannel = 60;
        static final int TRANSACTION_areChannelsBypassingDnd = 61;
        static final int TRANSACTION_getNotificationChannelsBypassingDnd = 62;
        static final int TRANSACTION_getPackagesBypassingDnd = 63;
        static final int TRANSACTION_getPackagesWithAnyChannels = 64;
        static final int TRANSACTION_isPackagePaused = 65;
        static final int TRANSACTION_deleteNotificationHistoryItem = 66;
        static final int TRANSACTION_isPermissionFixed = 67;
        static final int TRANSACTION_silenceNotificationSound = 68;
        static final int TRANSACTION_getActiveNotifications = 69;
        static final int TRANSACTION_getActiveNotificationsWithAttribution = 70;
        static final int TRANSACTION_getHistoricalNotifications = 71;
        static final int TRANSACTION_getHistoricalNotificationsWithAttribution = 72;
        static final int TRANSACTION_getNotificationHistory = 73;
        static final int TRANSACTION_registerListener = 74;
        static final int TRANSACTION_unregisterListener = 75;
        static final int TRANSACTION_cancelNotificationFromListener = 76;
        static final int TRANSACTION_cancelNotificationsFromListener = 77;
        static final int TRANSACTION_snoozeNotificationUntilContextFromListener = 78;
        static final int TRANSACTION_snoozeNotificationUntilFromListener = 79;
        static final int TRANSACTION_requestBindListener = 80;
        static final int TRANSACTION_requestUnbindListener = 81;
        static final int TRANSACTION_requestUnbindListenerComponent = 82;
        static final int TRANSACTION_requestBindProvider = 83;
        static final int TRANSACTION_requestUnbindProvider = 84;
        static final int TRANSACTION_setNotificationsShownFromListener = 85;
        static final int TRANSACTION_getActiveNotificationsFromListener = 86;
        static final int TRANSACTION_getSnoozedNotificationsFromListener = 87;
        static final int TRANSACTION_clearRequestedListenerHints = 88;
        static final int TRANSACTION_requestHintsFromListener = 89;
        static final int TRANSACTION_getHintsFromListener = 90;
        static final int TRANSACTION_getHintsFromListenerNoToken = 91;
        static final int TRANSACTION_requestInterruptionFilterFromListener = 92;
        static final int TRANSACTION_getInterruptionFilterFromListener = 93;
        static final int TRANSACTION_setOnNotificationPostedTrimFromListener = 94;
        static final int TRANSACTION_setInterruptionFilter = 95;
        static final int TRANSACTION_createConversationNotificationChannelForPackageFromPrivilegedListener = 96;
        static final int TRANSACTION_updateNotificationChannelGroupFromPrivilegedListener = 97;
        static final int TRANSACTION_updateNotificationChannelFromPrivilegedListener = 98;
        static final int TRANSACTION_getNotificationChannelsFromPrivilegedListener = 99;
        static final int TRANSACTION_getNotificationChannelGroupsFromPrivilegedListener = 100;
        static final int TRANSACTION_applyEnqueuedAdjustmentFromAssistant = 101;
        static final int TRANSACTION_applyAdjustmentFromAssistant = 102;
        static final int TRANSACTION_applyAdjustmentsFromAssistant = 103;
        static final int TRANSACTION_unsnoozeNotificationFromAssistant = 104;
        static final int TRANSACTION_unsnoozeNotificationFromSystemListener = 105;
        static final int TRANSACTION_getEffectsSuppressor = 106;
        static final int TRANSACTION_matchesCallFilter = 107;
        static final int TRANSACTION_cleanUpCallersAfter = 108;
        static final int TRANSACTION_isSystemConditionProviderEnabled = 109;
        static final int TRANSACTION_isNotificationListenerAccessGranted = 110;
        static final int TRANSACTION_isNotificationListenerAccessGrantedForUser = 111;
        static final int TRANSACTION_isNotificationAssistantAccessGranted = 112;
        static final int TRANSACTION_setNotificationListenerAccessGranted = 113;
        static final int TRANSACTION_setNotificationAssistantAccessGranted = 114;
        static final int TRANSACTION_setNotificationListenerAccessGrantedForUser = 115;
        static final int TRANSACTION_setNotificationAssistantAccessGrantedForUser = 116;
        static final int TRANSACTION_getEnabledNotificationListenerPackages = 117;
        static final int TRANSACTION_getEnabledNotificationListeners = 118;
        static final int TRANSACTION_getAllowedNotificationAssistantForUser = 119;
        static final int TRANSACTION_getAllowedNotificationAssistant = 120;
        static final int TRANSACTION_getDefaultNotificationAssistant = 121;
        static final int TRANSACTION_setNASMigrationDoneAndResetDefault = 122;
        static final int TRANSACTION_hasEnabledNotificationListener = 123;
        static final int TRANSACTION_getZenMode = 124;
        static final int TRANSACTION_getZenModeConfig = 125;
        static final int TRANSACTION_getConsolidatedNotificationPolicy = 126;
        static final int TRANSACTION_setZenMode = 127;
        static final int TRANSACTION_notifyConditions = 128;
        static final int TRANSACTION_isNotificationPolicyAccessGranted = 129;
        static final int TRANSACTION_getNotificationPolicy = 130;
        static final int TRANSACTION_setNotificationPolicy = 131;
        static final int TRANSACTION_isNotificationPolicyAccessGrantedForPackage = 132;
        static final int TRANSACTION_setNotificationPolicyAccessGranted = 133;
        static final int TRANSACTION_setNotificationPolicyAccessGrantedForUser = 134;
        static final int TRANSACTION_getDefaultZenPolicy = 135;
        static final int TRANSACTION_getAutomaticZenRule = 136;
        static final int TRANSACTION_getAutomaticZenRules = 137;
        static final int TRANSACTION_addAutomaticZenRule = 138;
        static final int TRANSACTION_updateAutomaticZenRule = 139;
        static final int TRANSACTION_removeAutomaticZenRule = 140;
        static final int TRANSACTION_removeAutomaticZenRules = 141;
        static final int TRANSACTION_getRuleInstanceCount = 142;
        static final int TRANSACTION_getAutomaticZenRuleState = 143;
        static final int TRANSACTION_setAutomaticZenRuleState = 144;
        static final int TRANSACTION_setManualZenRuleDeviceEffects = 145;
        static final int TRANSACTION_getBackupPayload = 146;
        static final int TRANSACTION_applyRestore = 147;
        static final int TRANSACTION_getAppActiveNotifications = 148;
        static final int TRANSACTION_setNotificationDelegate = 149;
        static final int TRANSACTION_getNotificationDelegate = 150;
        static final int TRANSACTION_canNotifyAsPackage = 151;
        static final int TRANSACTION_canUseFullScreenIntent = 152;
        static final int TRANSACTION_setPrivateNotificationsAllowed = 153;
        static final int TRANSACTION_getPrivateNotificationsAllowed = 154;
        static final int TRANSACTION_pullStats = 155;
        static final int TRANSACTION_getListenerFilter = 156;
        static final int TRANSACTION_setListenerFilter = 157;
        static final int TRANSACTION_migrateNotificationFilter = 158;
        static final int TRANSACTION_setToastRateLimitingEnabled = 159;
        static final int TRANSACTION_registerCallNotificationEventListener = 160;
        static final java.lang.String[] PERMISSIONS_registerCallNotificationEventListener = null;
        static final int TRANSACTION_unregisterCallNotificationEventListener = 161;
        static final java.lang.String[] PERMISSIONS_unregisterCallNotificationEventListener = null;
        static final int TRANSACTION_setCanBePromoted = 162;
        static final int TRANSACTION_appCanBePromoted = 163;
        static final int TRANSACTION_canBePromoted = 164;
        static final int TRANSACTION_setAdjustmentTypeSupportedState = 165;
        static final int TRANSACTION_getUnsupportedAdjustmentTypes = 166;
        static final int TRANSACTION_getAllowedClassificationTypes = 167;
        static final int TRANSACTION_setAssistantClassificationTypeState = 168;
        static final int TRANSACTION_getAdjustmentDeniedPackages = 169;
        static final int TRANSACTION_isAdjustmentSupportedForPackage = 170;
        static final int TRANSACTION_setAdjustmentSupportedForPackage = 171;
        static final int TRANSACTION_incrementCounter = 172;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.app.INotificationManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void getActiveNotificationsWithAttribution_enforcePermission() throws java.lang.SecurityException {}
        protected void getHistoricalNotificationsWithAttribution_enforcePermission() throws java.lang.SecurityException {}
        protected void getNotificationHistory_enforcePermission() throws java.lang.SecurityException {}
        protected void setToastRateLimitingEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void registerCallNotificationEventListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterCallNotificationEventListener_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.INotificationManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void cancelAllNotifications(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void clearData(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean enqueueTextToast(java.lang.String p0, android.os.IBinder p1, java.lang.CharSequence p2, int p3, boolean p4, int p5, android.app.ITransientNotificationCallback p6) throws android.os.RemoteException { return false; }
            public boolean enqueueToast(java.lang.String p0, android.os.IBinder p1, android.app.ITransientNotification p2, int p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
            public void cancelToast(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void finishToken(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void enqueueNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.app.Notification p4, int p5) throws android.os.RemoteException {}
            public void cancelNotificationWithTag(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
            public boolean isInCall(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setShowBadge(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean canShowBadge(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasSentValidMsg(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isInInvalidMsgState(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasUserDemotedInvalidMsgApp(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setInvalidMsgAppDemoted(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean hasSentValidBubble(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setNotificationsEnabledForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationsEnabledWithImportanceLockForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean areNotificationsEnabledForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean areNotificationsEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getPackageImportance(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public boolean isImportanceLocked(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getAllowedAssistantAdjustments(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAllowedAssistantAdjustmentsForUser(int p0) throws android.os.RemoteException { return null; }
            public void allowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void disallowAssistantAdjustment(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean shouldHideSilentStatusIcons(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setHideSilentStatusIcons(boolean p0) throws android.os.RemoteException {}
            public void setBubblesAllowed(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public boolean areBubblesAllowed(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean areBubblesEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
            public int getBubblePreferenceForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void createNotificationChannelGroups(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
            public void createNotificationChannels(java.lang.String p0, android.content.pm.ParceledListSlice p1) throws android.os.RemoteException {}
            public void createNotificationChannelsForPackage(java.lang.String p0, int p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getConversations(boolean p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getConversationsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelGroupsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannelGroup getNotificationChannelGroupForPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannelGroup getPopulatedNotificationChannelGroupForPackage(java.lang.String p0, int p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getRecentBlockedNotificationChannelGroupsForPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void updateNotificationChannelGroupForPackage(java.lang.String p0, int p1, android.app.NotificationChannelGroup p2) throws android.os.RemoteException {}
            public void updateNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2) throws android.os.RemoteException {}
            public void unlockNotificationChannel(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void unlockAllNotificationChannels() throws android.os.RemoteException {}
            public android.app.NotificationChannel getNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.app.NotificationChannel getConversationNotificationChannel(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5) throws android.os.RemoteException { return null; }
            public void createConversationNotificationChannelForPackage(java.lang.String p0, int p1, android.app.NotificationChannel p2, java.lang.String p3) throws android.os.RemoteException {}
            public android.app.NotificationChannel getNotificationChannelForPackage(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return null; }
            public void deleteNotificationChannel(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getNotificationChannels(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return null; }
            public int getNumNotificationChannelsForPackage(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getDeletedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int getBlockedChannelCount(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void deleteNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelGroups(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getNotificationChannelGroupsWithoutChannels(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean onlyHasDefaultChannel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean areChannelsBypassingDnd() throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice getNotificationChannelsBypassingDnd(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getPackagesBypassingDnd(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPackagesWithAnyChannels(int p0) throws android.os.RemoteException { return null; }
            public boolean isPackagePaused(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void deleteNotificationHistoryItem(java.lang.String p0, int p1, long p2) throws android.os.RemoteException {}
            public boolean isPermissionFixed(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
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
            public void requestUnbindListenerComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void requestBindProvider(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void requestUnbindProvider(android.service.notification.IConditionProvider p0) throws android.os.RemoteException {}
            public void setNotificationsShownFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener p0, java.lang.String[] p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getSnoozedNotificationsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException { return null; }
            public void clearRequestedListenerHints(android.service.notification.INotificationListener p0) throws android.os.RemoteException {}
            public void requestHintsFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public int getHintsFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
            public int getHintsFromListenerNoToken() throws android.os.RemoteException { return 0; }
            public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public int getInterruptionFilterFromListener(android.service.notification.INotificationListener p0) throws android.os.RemoteException { return 0; }
            public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener p0, int p1) throws android.os.RemoteException {}
            public void setInterruptionFilter(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public android.app.NotificationChannel createConversationNotificationChannelForPackageFromPrivilegedListener(android.service.notification.INotificationListener p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
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
            public void cleanUpCallersAfter(long p0) throws android.os.RemoteException {}
            public boolean isSystemConditionProviderEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isNotificationListenerAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isNotificationAssistantAccessGranted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void setNotificationListenerAccessGranted(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public void setNotificationAssistantAccessGranted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public void setNotificationListenerAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public void setNotificationAssistantAccessGrantedForUser(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getEnabledNotificationListenerPackages() throws android.os.RemoteException { return null; }
            public java.util.List<android.content.ComponentName> getEnabledNotificationListeners(int p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getAllowedNotificationAssistantForUser(int p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getAllowedNotificationAssistant() throws android.os.RemoteException { return null; }
            public android.content.ComponentName getDefaultNotificationAssistant() throws android.os.RemoteException { return null; }
            public void setNASMigrationDoneAndResetDefault(int p0, boolean p1) throws android.os.RemoteException {}
            public boolean hasEnabledNotificationListener(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public int getZenMode() throws android.os.RemoteException { return 0; }
            public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException { return null; }
            public android.app.NotificationManager.Policy getConsolidatedNotificationPolicy() throws android.os.RemoteException { return null; }
            public void setZenMode(int p0, android.net.Uri p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void notifyConditions(java.lang.String p0, android.service.notification.IConditionProvider p1, android.service.notification.Condition[] p2) throws android.os.RemoteException {}
            public boolean isNotificationPolicyAccessGranted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setNotificationPolicy(java.lang.String p0, android.app.NotificationManager.Policy p1, boolean p2) throws android.os.RemoteException {}
            public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setNotificationPolicyAccessGranted(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setNotificationPolicyAccessGrantedForUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public android.service.notification.ZenPolicy getDefaultZenPolicy() throws android.os.RemoteException { return null; }
            public android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getAutomaticZenRules() throws android.os.RemoteException { return null; }
            public java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
            public boolean updateAutomaticZenRule(java.lang.String p0, android.app.AutomaticZenRule p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean removeAutomaticZenRule(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean removeAutomaticZenRules(java.lang.String p0, boolean p1) throws android.os.RemoteException { return false; }
            public int getRuleInstanceCount(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public int getAutomaticZenRuleState(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void setAutomaticZenRuleState(java.lang.String p0, android.service.notification.Condition p1) throws android.os.RemoteException {}
            public void setManualZenRuleDeviceEffects(android.service.notification.ZenDeviceEffects p0) throws android.os.RemoteException {}
            public byte[] getBackupPayload(int p0) throws android.os.RemoteException { return null; }
            public void applyRestore(byte[] p0, int p1) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setNotificationDelegate(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String getNotificationDelegate(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean canNotifyAsPackage(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean canUseFullScreenIntent(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public void setPrivateNotificationsAllowed(boolean p0) throws android.os.RemoteException {}
            public boolean getPrivateNotificationsAllowed() throws android.os.RemoteException { return false; }
            public long pullStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException { return 0L; }
            public android.service.notification.NotificationListenerFilter getListenerFilter(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public void setListenerFilter(android.content.ComponentName p0, int p1, android.service.notification.NotificationListenerFilter p2) throws android.os.RemoteException {}
            public void migrateNotificationFilter(android.service.notification.INotificationListener p0, int p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public void setToastRateLimitingEnabled(boolean p0) throws android.os.RemoteException {}
            public void registerCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException {}
            public void unregisterCallNotificationEventListener(java.lang.String p0, android.os.UserHandle p1, android.app.ICallNotificationEventCallback p2) throws android.os.RemoteException {}
            public void setCanBePromoted(java.lang.String p0, int p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public boolean appCanBePromoted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean canBePromoted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setAdjustmentTypeSupportedState(android.service.notification.INotificationListener p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getUnsupportedAdjustmentTypes() throws android.os.RemoteException { return null; }
            public int[] getAllowedClassificationTypes() throws android.os.RemoteException { return null; }
            public void setAssistantClassificationTypeState(int p0, boolean p1) throws android.os.RemoteException {}
            public java.lang.String[] getAdjustmentDeniedPackages(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setAdjustmentSupportedForPackage(int p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void incrementCounter(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
