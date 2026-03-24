package android.app.admin;

public interface IDevicePolicyManager extends android.os.IInterface {
    public void setPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.app.admin.PasswordMetrics getPasswordMinimumMetrics(int p0, boolean p1) throws android.os.RemoteException;
    public void setPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordExpirationTimeout(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException;
    public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isActivePasswordSufficient(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isActivePasswordSufficientForDeviceRequirement() throws android.os.RemoteException;
    public boolean isPasswordSufficientAfterProfileUnification(int p0, int p1) throws android.os.RemoteException;
    public int getPasswordComplexity(boolean p0) throws android.os.RemoteException;
    public void setRequiredPasswordComplexity(int p0, boolean p1) throws android.os.RemoteException;
    public int getRequiredPasswordComplexity(boolean p0) throws android.os.RemoteException;
    public int getAggregatedPasswordComplexityForUser(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isUsingUnifiedPassword(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getCurrentFailedPasswordAttempts(int p0, boolean p1) throws android.os.RemoteException;
    public int getProfileWithMinimumFailedPasswordsForWipe(int p0, boolean p1) throws android.os.RemoteException;
    public void setMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean resetPassword(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setMaximumTimeToLock(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException;
    public long getMaximumTimeToLock(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setRequiredStrongAuthTimeout(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException;
    public long getRequiredStrongAuthTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void lockNow(int p0, boolean p1) throws android.os.RemoteException;
    public void wipeDataWithReason(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, android.app.admin.FactoryResetProtectionPolicy p1) throws android.os.RemoteException;
    public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isFactoryResetProtectionPolicySupported() throws android.os.RemoteException;
    public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException;
    public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException;
    public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setCameraDisabled(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public boolean getCameraDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setScreenCaptureDisabled(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException;
    public int getNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException;
    public void setNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException;
    public int getNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException;
    public void setKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean isAdminActive(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> getActiveAdmins(int p0) throws android.os.RemoteException;
    public boolean packageHasActiveAdmins(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1, int p2) throws android.os.RemoteException;
    public void removeActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    public void reportPasswordChanged(int p0) throws android.os.RemoteException;
    public void reportFailedPasswordAttempt(int p0) throws android.os.RemoteException;
    public void reportSuccessfulPasswordAttempt(int p0) throws android.os.RemoteException;
    public void reportFailedBiometricAttempt(int p0) throws android.os.RemoteException;
    public void reportSuccessfulBiometricAttempt(int p0) throws android.os.RemoteException;
    public void reportKeyguardDismissed(int p0) throws android.os.RemoteException;
    public void reportKeyguardSecured(int p0) throws android.os.RemoteException;
    public boolean setDeviceOwner(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.ComponentName getDeviceOwnerComponent(boolean p0) throws android.os.RemoteException;
    public boolean hasDeviceOwner() throws android.os.RemoteException;
    public java.lang.String getDeviceOwnerName() throws android.os.RemoteException;
    public void clearDeviceOwner(java.lang.String p0) throws android.os.RemoteException;
    public int getDeviceOwnerUserId() throws android.os.RemoteException;
    public boolean setProfileOwner(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.ComponentName getProfileOwnerAsUser(int p0) throws android.os.RemoteException;
    public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) throws android.os.RemoteException;
    public java.lang.String getProfileOwnerName(int p0) throws android.os.RemoteException;
    public void setProfileEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setProfileName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearProfileOwner(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean hasUserSetupCompleted() throws android.os.RemoteException;
    public boolean isOrganizationOwnedDeviceWithManagedProfile() throws android.os.RemoteException;
    public boolean checkDeviceIdentifierAccess(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void setDeviceOwnerLockScreenInfo(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException;
    public java.lang.String[] setPackagesSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2, boolean p3) throws android.os.RemoteException;
    public boolean isPackageSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> listPolicyExemptApps() throws android.os.RemoteException;
    public boolean installCaCert(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException;
    public void uninstallCaCerts(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void enforceCanManageCaCerts(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean approveCaCert(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isCaCertApproved(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean installKeyPair(android.content.ComponentName p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, java.lang.String p5, boolean p6, boolean p7) throws android.os.RemoteException;
    public boolean removeKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean hasKeyPair(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean generateKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.security.keystore.ParcelableKeyGenParameterSpec p3, int p4, android.security.keymaster.KeymasterCertificateChain p5) throws android.os.RemoteException;
    public boolean setKeyPairCertificate(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, boolean p5) throws android.os.RemoteException;
    public void choosePrivateKeyAlias(int p0, android.net.Uri p1, java.lang.String p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void setDelegatedScopes(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getDelegatedScopes(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getDelegatePackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setCertInstallerPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getCertInstallerPackage(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean setAlwaysOnVpnPackage(android.content.ComponentName p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException;
    public java.lang.String getAlwaysOnVpnPackage(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.String getAlwaysOnVpnPackageForUser(int p0) throws android.os.RemoteException;
    public boolean isAlwaysOnVpnLockdownEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isAlwaysOnVpnLockdownEnabledForUser(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAlwaysOnVpnLockdownAllowlist(android.content.ComponentName p0) throws android.os.RemoteException;
    public void addPersistentPreferredActivity(android.content.ComponentName p0, android.content.IntentFilter p1, android.content.ComponentName p2) throws android.os.RemoteException;
    public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException;
    public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException;
    public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public android.os.Bundle getUserRestrictions(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public void addCrossProfileIntentFilter(android.content.ComponentName p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException;
    public void clearCrossProfileIntentFilters(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List p1) throws android.os.RemoteException;
    public java.util.List getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException;
    public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean setPermittedInputMethods(android.content.ComponentName p0, java.util.List p1, boolean p2) throws android.os.RemoteException;
    public java.util.List getPermittedInputMethods(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public java.util.List getPermittedInputMethodsForCurrentUser() throws android.os.RemoteException;
    public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException;
    public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException;
    public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException;
    public void resetNewUserDisclaimer() throws android.os.RemoteException;
    public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException;
    public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public java.lang.String[] getAccountTypesWithManagementDisabled() throws android.os.RemoteException;
    public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0, boolean p1) throws android.os.RemoteException;
    public void setSecondaryLockscreenEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean isSecondaryLockscreenEnabled(android.os.UserHandle p0) throws android.os.RemoteException;
    public void setPreferentialNetworkServiceEnabled(boolean p0) throws android.os.RemoteException;
    public boolean isPreferentialNetworkServiceEnabled(int p0) throws android.os.RemoteException;
    public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String[] p1) throws android.os.RemoteException;
    public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException;
    public void setLockTaskFeatures(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public int getLockTaskFeatures(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setConfiguredNetworksLockdownState(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean hasLockdownAdminConfiguredNetworks(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setLocationEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean setTime(android.content.ComponentName p0, long p1) throws android.os.RemoteException;
    public boolean setTimeZone(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setMasterVolumeMuted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean isMasterVolumeMuted(android.content.ComponentName p0) throws android.os.RemoteException;
    public void notifyLockTaskModeChanged(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setUninstallBlocked(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public boolean isUninstallBlocked(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setCrossProfileCallerIdDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getCrossProfileCallerIdDisabledForUser(int p0) throws android.os.RemoteException;
    public void setCrossProfileContactsSearchDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getCrossProfileContactsSearchDisabledForUser(int p0) throws android.os.RemoteException;
    public void startManagedQuickContact(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) throws android.os.RemoteException;
    public void setBluetoothContactSharingDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getBluetoothContactSharingDisabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getBluetoothContactSharingDisabledForUser(int p0) throws android.os.RemoteException;
    public void setTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2, boolean p3) throws android.os.RemoteException;
    public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException;
    public boolean addCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean removeCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setAutoTimeRequired(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getAutoTimeRequired() throws android.os.RemoteException;
    public void setAutoTimeEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getAutoTimeEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setAutoTimeZoneEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getAutoTimeZoneEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setForceEphemeralUsers(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getForceEphemeralUsers(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setUserIcon(android.content.ComponentName p0, android.graphics.Bitmap p1) throws android.os.RemoteException;
    public void setSystemUpdatePolicy(android.content.ComponentName p0, android.app.admin.SystemUpdatePolicy p1) throws android.os.RemoteException;
    public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException;
    public void clearSystemUpdatePolicyFreezePeriodRecord() throws android.os.RemoteException;
    public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean setStatusBarDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException;
    public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo p0) throws android.os.RemoteException;
    public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setPermissionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int getPermissionPolicy(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.RemoteCallback p5) throws android.os.RemoteException;
    public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean isProvisioningAllowed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int checkProvisioningPreCondition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isManagedProfile(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.String getWifiMacAddress(android.content.ComponentName p0) throws android.os.RemoteException;
    public void reboot(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setShortSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setLongSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public boolean isSeparateProfileChallengeAllowed(int p0) throws android.os.RemoteException;
    public void setOrganizationColor(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setOrganizationColorForUser(int p0, int p1) throws android.os.RemoteException;
    public int getOrganizationColor(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getOrganizationColorForUser(int p0) throws android.os.RemoteException;
    public void setOrganizationName(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException;
    public java.lang.CharSequence getOrganizationNameForUser(int p0) throws android.os.RemoteException;
    public int getUserProvisioningState() throws android.os.RemoteException;
    public void setUserProvisioningState(int p0, int p1) throws android.os.RemoteException;
    public void setAffiliationIds(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAffiliationIds(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isCallingUserAffiliated() throws android.os.RemoteException;
    public boolean isAffiliatedUser(int p0) throws android.os.RemoteException;
    public void setSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean isSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public long forceNetworkLogs() throws android.os.RemoteException;
    public long forceSecurityLogs() throws android.os.RemoteException;
    public boolean isUninstallInQueue(java.lang.String p0) throws android.os.RemoteException;
    public void uninstallPackageWithActiveAdmins(java.lang.String p0) throws android.os.RemoteException;
    public boolean isDeviceProvisioned() throws android.os.RemoteException;
    public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException;
    public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException;
    public void forceUpdateUserSetupComplete(int p0) throws android.os.RemoteException;
    public void setBackupServiceEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean isBackupServiceEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean isNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.app.admin.NetworkEvent> retrieveNetworkLogs(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName p0, android.app.IApplicationThread p1, android.os.IBinder p2, android.content.Intent p3, android.app.IServiceConnection p4, int p5, int p6) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isEphemeralUser(android.content.ComponentName p0) throws android.os.RemoteException;
    public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException;
    public long getLastBugReportRequestTime() throws android.os.RemoteException;
    public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException;
    public boolean setResetPasswordToken(android.content.ComponentName p0, byte[] p1) throws android.os.RemoteException;
    public boolean clearResetPasswordToken(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isResetPasswordTokenActive(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean resetPasswordWithToken(android.content.ComponentName p0, java.lang.String p1, byte[] p2, int p3) throws android.os.RemoteException;
    public boolean isCurrentInputMethodSetByOwner() throws android.os.RemoteException;
    public android.content.pm.StringParceledListSlice getOwnerInstalledCaCerts(android.os.UserHandle p0) throws android.os.RemoteException;
    public void clearApplicationUserData(android.content.ComponentName p0, java.lang.String p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException;
    public void setLogoutEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean isLogoutEnabled() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getDisallowedSystemApps(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void transferOwnership(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public android.os.PersistableBundle getTransferOwnershipBundle() throws android.os.RemoteException;
    public void setStartUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public void setEndUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public java.lang.CharSequence getStartUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.CharSequence getEndUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> setMeteredDataDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getMeteredDataDisabledPackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public int addOverrideApn(android.content.ComponentName p0, android.telephony.data.ApnSetting p1) throws android.os.RemoteException;
    public boolean updateOverrideApn(android.content.ComponentName p0, int p1, android.telephony.data.ApnSetting p2) throws android.os.RemoteException;
    public boolean removeOverrideApn(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.telephony.data.ApnSetting> getOverrideApns(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setOverrideApnsEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean isOverrideApnEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isMeteredDataDisabledPackageForUser(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int setGlobalPrivateDns(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public int getGlobalPrivateDnsMode(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.String getGlobalPrivateDnsHost(android.content.ComponentName p0) throws android.os.RemoteException;
    public void markProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void installUpdateFromFile(android.content.ComponentName p0, android.os.ParcelFileDescriptor p1, android.app.admin.StartInstallingUpdateCallback p2) throws android.os.RemoteException;
    public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException;
    public void setCrossProfilePackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllCrossProfilePackages() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getDefaultCrossProfilePackages() throws android.os.RemoteException;
    public boolean isManagedKiosk() throws android.os.RemoteException;
    public boolean isUnattendedManagedKiosk() throws android.os.RemoteException;
    public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException;
    public boolean setKeyGrantForApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException;
    public android.app.admin.ParcelableGranteeMap getKeyPairGrants(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setKeyGrantToWifiAuth(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean isKeyPairGrantedToWifiAuth(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setUserControlDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getUserControlDisabledPackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setCommonCriteriaModeEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean isCommonCriteriaModeEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getPersonalAppsSuspendedReasons(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setPersonalAppsSuspended(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public long getManagedProfileMaximumTimeOff(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setManagedProfileMaximumTimeOff(android.content.ComponentName p0, long p1) throws android.os.RemoteException;
    public void acknowledgeDeviceCompliant() throws android.os.RemoteException;
    public boolean isComplianceAcknowledgementRequired() throws android.os.RemoteException;
    public boolean canProfileOwnerResetPasswordWhenLocked(int p0) throws android.os.RemoteException;
    public void setNextOperationSafety(int p0, int p1) throws android.os.RemoteException;
    public boolean isSafeOperation(int p0) throws android.os.RemoteException;
    public java.lang.String getEnrollmentSpecificId(java.lang.String p0) throws android.os.RemoteException;
    public void setOrganizationIdForUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.os.UserHandle createAndProvisionManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException;
    public void provisionFullyManagedDevice(android.app.admin.FullyManagedDeviceProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException;
    public void setDeviceOwnerType(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public int getDeviceOwnerType(android.content.ComponentName p0) throws android.os.RemoteException;
    public void resetDefaultCrossProfileIntentFilters(int p0) throws android.os.RemoteException;
    public boolean canAdminGrantSensorsPermissionsForUser(int p0) throws android.os.RemoteException;
    public void setUsbDataSignalingEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean isUsbDataSignalingEnabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean isUsbDataSignalingEnabledForUser(int p0) throws android.os.RemoteException;
    public boolean canUsbDataSignalingBeDisabled() throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> listForegroundAffiliatedUsers() throws android.os.RemoteException;

    public static class Default implements android.app.admin.IDevicePolicyManager {
        public Default() {}
        public void setPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public android.app.admin.PasswordMetrics getPasswordMinimumMetrics(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public void setPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setPasswordExpirationTimeout(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException {}
        public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public boolean isActivePasswordSufficient(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean isActivePasswordSufficientForDeviceRequirement() throws android.os.RemoteException { return false; }
        public boolean isPasswordSufficientAfterProfileUnification(int p0, int p1) throws android.os.RemoteException { return false; }
        public int getPasswordComplexity(boolean p0) throws android.os.RemoteException { return 0; }
        public void setRequiredPasswordComplexity(int p0, boolean p1) throws android.os.RemoteException {}
        public int getRequiredPasswordComplexity(boolean p0) throws android.os.RemoteException { return 0; }
        public int getAggregatedPasswordComplexityForUser(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public boolean isUsingUnifiedPassword(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public int getCurrentFailedPasswordAttempts(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public int getProfileWithMinimumFailedPasswordsForWipe(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public void setMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public boolean resetPassword(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setMaximumTimeToLock(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException {}
        public long getMaximumTimeToLock(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public void setRequiredStrongAuthTimeout(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException {}
        public long getRequiredStrongAuthTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public void lockNow(int p0, boolean p1) throws android.os.RemoteException {}
        public void wipeDataWithReason(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, android.app.admin.FactoryResetProtectionPolicy p1) throws android.os.RemoteException {}
        public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isFactoryResetProtectionPolicySupported() throws android.os.RemoteException { return false; }
        public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException { return null; }
        public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException {}
        public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return 0; }
        public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void setCameraDisabled(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public boolean getCameraDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public void setScreenCaptureDisabled(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public void setNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException {}
        public int getNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException { return 0; }
        public void setNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException {}
        public int getNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException { return 0; }
        public void setKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2) throws android.os.RemoteException {}
        public boolean isAdminActive(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.content.ComponentName> getActiveAdmins(int p0) throws android.os.RemoteException { return null; }
        public boolean packageHasActiveAdmins(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1, int p2) throws android.os.RemoteException {}
        public void removeActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void reportPasswordChanged(int p0) throws android.os.RemoteException {}
        public void reportFailedPasswordAttempt(int p0) throws android.os.RemoteException {}
        public void reportSuccessfulPasswordAttempt(int p0) throws android.os.RemoteException {}
        public void reportFailedBiometricAttempt(int p0) throws android.os.RemoteException {}
        public void reportSuccessfulBiometricAttempt(int p0) throws android.os.RemoteException {}
        public void reportKeyguardDismissed(int p0) throws android.os.RemoteException {}
        public void reportKeyguardSecured(int p0) throws android.os.RemoteException {}
        public boolean setDeviceOwner(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public android.content.ComponentName getDeviceOwnerComponent(boolean p0) throws android.os.RemoteException { return null; }
        public boolean hasDeviceOwner() throws android.os.RemoteException { return false; }
        public java.lang.String getDeviceOwnerName() throws android.os.RemoteException { return null; }
        public void clearDeviceOwner(java.lang.String p0) throws android.os.RemoteException {}
        public int getDeviceOwnerUserId() throws android.os.RemoteException { return 0; }
        public boolean setProfileOwner(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public android.content.ComponentName getProfileOwnerAsUser(int p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
        public java.lang.String getProfileOwnerName(int p0) throws android.os.RemoteException { return null; }
        public void setProfileEnabled(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void setProfileName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public void clearProfileOwner(android.content.ComponentName p0) throws android.os.RemoteException {}
        public boolean hasUserSetupCompleted() throws android.os.RemoteException { return false; }
        public boolean isOrganizationOwnedDeviceWithManagedProfile() throws android.os.RemoteException { return false; }
        public boolean checkDeviceIdentifierAccess(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void setDeviceOwnerLockScreenInfo(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException { return null; }
        public java.lang.String[] setPackagesSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2, boolean p3) throws android.os.RemoteException { return null; }
        public boolean isPackageSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> listPolicyExemptApps() throws android.os.RemoteException { return null; }
        public boolean installCaCert(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException { return false; }
        public void uninstallCaCerts(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void enforceCanManageCaCerts(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean approveCaCert(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean isCaCertApproved(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean installKeyPair(android.content.ComponentName p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, java.lang.String p5, boolean p6, boolean p7) throws android.os.RemoteException { return false; }
        public boolean removeKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean hasKeyPair(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean generateKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.security.keystore.ParcelableKeyGenParameterSpec p3, int p4, android.security.keymaster.KeymasterCertificateChain p5) throws android.os.RemoteException { return false; }
        public boolean setKeyPairCertificate(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, boolean p5) throws android.os.RemoteException { return false; }
        public void choosePrivateKeyAlias(int p0, android.net.Uri p1, java.lang.String p2, android.os.IBinder p3) throws android.os.RemoteException {}
        public void setDelegatedScopes(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getDelegatedScopes(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getDelegatePackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setCertInstallerPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String getCertInstallerPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean setAlwaysOnVpnPackage(android.content.ComponentName p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException { return false; }
        public java.lang.String getAlwaysOnVpnPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.lang.String getAlwaysOnVpnPackageForUser(int p0) throws android.os.RemoteException { return null; }
        public boolean isAlwaysOnVpnLockdownEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isAlwaysOnVpnLockdownEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getAlwaysOnVpnLockdownAllowlist(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void addPersistentPreferredActivity(android.content.ComponentName p0, android.content.IntentFilter p1, android.content.ComponentName p2) throws android.os.RemoteException {}
        public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException { return null; }
        public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public android.os.Bundle getUserRestrictions(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return null; }
        public void addCrossProfileIntentFilter(android.content.ComponentName p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException {}
        public void clearCrossProfileIntentFilters(android.content.ComponentName p0) throws android.os.RemoteException {}
        public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List p1) throws android.os.RemoteException { return false; }
        public java.util.List getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException { return null; }
        public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean setPermittedInputMethods(android.content.ComponentName p0, java.util.List p1, boolean p2) throws android.os.RemoteException { return false; }
        public java.util.List getPermittedInputMethods(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return null; }
        public java.util.List getPermittedInputMethodsForCurrentUser() throws android.os.RemoteException { return null; }
        public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return false; }
        public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException { return false; }
        public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return false; }
        public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException { return null; }
        public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
        public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
        public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void resetNewUserDisclaimer() throws android.os.RemoteException {}
        public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException { return 0; }
        public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public java.lang.String[] getAccountTypesWithManagementDisabled() throws android.os.RemoteException { return null; }
        public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public void setSecondaryLockscreenEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean isSecondaryLockscreenEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
        public void setPreferentialNetworkServiceEnabled(boolean p0) throws android.os.RemoteException {}
        public boolean isPreferentialNetworkServiceEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setLockTaskFeatures(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public int getLockTaskFeatures(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setConfiguredNetworksLockdownState(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean hasLockdownAdminConfiguredNetworks(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void setLocationEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean setTime(android.content.ComponentName p0, long p1) throws android.os.RemoteException { return false; }
        public boolean setTimeZone(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setMasterVolumeMuted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean isMasterVolumeMuted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void notifyLockTaskModeChanged(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setUninstallBlocked(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public boolean isUninstallBlocked(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setCrossProfileCallerIdDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean getCrossProfileCallerIdDisabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void setCrossProfileContactsSearchDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean getCrossProfileContactsSearchDisabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void startManagedQuickContact(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) throws android.os.RemoteException {}
        public void setBluetoothContactSharingDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getBluetoothContactSharingDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean getBluetoothContactSharingDisabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void setTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2, boolean p3) throws android.os.RemoteException {}
        public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
        public boolean addCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean removeCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void setAutoTimeRequired(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getAutoTimeRequired() throws android.os.RemoteException { return false; }
        public void setAutoTimeEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getAutoTimeEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void setAutoTimeZoneEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getAutoTimeZoneEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void setForceEphemeralUsers(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getForceEphemeralUsers(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public void setUserIcon(android.content.ComponentName p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
        public void setSystemUpdatePolicy(android.content.ComponentName p0, android.app.admin.SystemUpdatePolicy p1) throws android.os.RemoteException {}
        public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException { return null; }
        public void clearSystemUpdatePolicyFreezePeriodRecord() throws android.os.RemoteException {}
        public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setStatusBarDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException { return false; }
        public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo p0) throws android.os.RemoteException {}
        public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void setPermissionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public int getPermissionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public void setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
        public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public boolean isProvisioningAllowed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int checkProvisioningPreCondition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void setKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isManagedProfile(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public java.lang.String getWifiMacAddress(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void reboot(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void setShortSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void setLongSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public boolean isSeparateProfileChallengeAllowed(int p0) throws android.os.RemoteException { return false; }
        public void setOrganizationColor(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void setOrganizationColorForUser(int p0, int p1) throws android.os.RemoteException {}
        public int getOrganizationColor(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public int getOrganizationColorForUser(int p0) throws android.os.RemoteException { return 0; }
        public void setOrganizationName(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getOrganizationNameForUser(int p0) throws android.os.RemoteException { return null; }
        public int getUserProvisioningState() throws android.os.RemoteException { return 0; }
        public void setUserProvisioningState(int p0, int p1) throws android.os.RemoteException {}
        public void setAffiliationIds(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getAffiliationIds(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isCallingUserAffiliated() throws android.os.RemoteException { return false; }
        public boolean isAffiliatedUser(int p0) throws android.os.RemoteException { return false; }
        public void setSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public boolean isSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public long forceNetworkLogs() throws android.os.RemoteException { return 0L; }
        public long forceSecurityLogs() throws android.os.RemoteException { return 0L; }
        public boolean isUninstallInQueue(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void uninstallPackageWithActiveAdmins(java.lang.String p0) throws android.os.RemoteException {}
        public boolean isDeviceProvisioned() throws android.os.RemoteException { return false; }
        public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException { return false; }
        public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException {}
        public void forceUpdateUserSetupComplete(int p0) throws android.os.RemoteException {}
        public void setBackupServiceEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean isBackupServiceEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void setNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public boolean isNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.app.admin.NetworkEvent> retrieveNetworkLogs(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException { return null; }
        public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName p0, android.app.IApplicationThread p1, android.os.IBinder p2, android.content.Intent p3, android.app.IServiceConnection p4, int p5, int p6) throws android.os.RemoteException { return false; }
        public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isEphemeralUser(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException { return 0L; }
        public long getLastBugReportRequestTime() throws android.os.RemoteException { return 0L; }
        public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException { return 0L; }
        public boolean setResetPasswordToken(android.content.ComponentName p0, byte[] p1) throws android.os.RemoteException { return false; }
        public boolean clearResetPasswordToken(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isResetPasswordTokenActive(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean resetPasswordWithToken(android.content.ComponentName p0, java.lang.String p1, byte[] p2, int p3) throws android.os.RemoteException { return false; }
        public boolean isCurrentInputMethodSetByOwner() throws android.os.RemoteException { return false; }
        public android.content.pm.StringParceledListSlice getOwnerInstalledCaCerts(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
        public void clearApplicationUserData(android.content.ComponentName p0, java.lang.String p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException {}
        public void setLogoutEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean isLogoutEnabled() throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getDisallowedSystemApps(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void transferOwnership(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public android.os.PersistableBundle getTransferOwnershipBundle() throws android.os.RemoteException { return null; }
        public void setStartUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public void setEndUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public java.lang.CharSequence getStartUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getEndUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> setMeteredDataDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getMeteredDataDisabledPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public int addOverrideApn(android.content.ComponentName p0, android.telephony.data.ApnSetting p1) throws android.os.RemoteException { return 0; }
        public boolean updateOverrideApn(android.content.ComponentName p0, int p1, android.telephony.data.ApnSetting p2) throws android.os.RemoteException { return false; }
        public boolean removeOverrideApn(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.telephony.data.ApnSetting> getOverrideApns(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void setOverrideApnsEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean isOverrideApnEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isMeteredDataDisabledPackageForUser(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public int setGlobalPrivateDns(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public int getGlobalPrivateDnsMode(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public java.lang.String getGlobalPrivateDnsHost(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void markProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void installUpdateFromFile(android.content.ComponentName p0, android.os.ParcelFileDescriptor p1, android.app.admin.StartInstallingUpdateCallback p2) throws android.os.RemoteException {}
        public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException { return null; }
        public void setCrossProfilePackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAllCrossProfilePackages() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getDefaultCrossProfilePackages() throws android.os.RemoteException { return null; }
        public boolean isManagedKiosk() throws android.os.RemoteException { return false; }
        public boolean isUnattendedManagedKiosk() throws android.os.RemoteException { return false; }
        public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
        public boolean setKeyGrantForApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
        public android.app.admin.ParcelableGranteeMap getKeyPairGrants(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean setKeyGrantToWifiAuth(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean isKeyPairGrantedToWifiAuth(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setUserControlDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getUserControlDisabledPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void setCommonCriteriaModeEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean isCommonCriteriaModeEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public int getPersonalAppsSuspendedReasons(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public void setPersonalAppsSuspended(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public long getManagedProfileMaximumTimeOff(android.content.ComponentName p0) throws android.os.RemoteException { return 0L; }
        public void setManagedProfileMaximumTimeOff(android.content.ComponentName p0, long p1) throws android.os.RemoteException {}
        public void acknowledgeDeviceCompliant() throws android.os.RemoteException {}
        public boolean isComplianceAcknowledgementRequired() throws android.os.RemoteException { return false; }
        public boolean canProfileOwnerResetPasswordWhenLocked(int p0) throws android.os.RemoteException { return false; }
        public void setNextOperationSafety(int p0, int p1) throws android.os.RemoteException {}
        public boolean isSafeOperation(int p0) throws android.os.RemoteException { return false; }
        public java.lang.String getEnrollmentSpecificId(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setOrganizationIdForUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public android.os.UserHandle createAndProvisionManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void provisionFullyManagedDevice(android.app.admin.FullyManagedDeviceProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setDeviceOwnerType(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public int getDeviceOwnerType(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public void resetDefaultCrossProfileIntentFilters(int p0) throws android.os.RemoteException {}
        public boolean canAdminGrantSensorsPermissionsForUser(int p0) throws android.os.RemoteException { return false; }
        public void setUsbDataSignalingEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public boolean isUsbDataSignalingEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isUsbDataSignalingEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public boolean canUsbDataSignalingBeDisabled() throws android.os.RemoteException { return false; }
        public java.util.List<android.os.UserHandle> listForegroundAffiliatedUsers() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.admin.IDevicePolicyManager {
        public static final java.lang.String DESCRIPTOR = "android.app.admin.IDevicePolicyManager";
        static final int TRANSACTION_setPasswordQuality = 1;
        static final int TRANSACTION_getPasswordQuality = 2;
        static final int TRANSACTION_setPasswordMinimumLength = 3;
        static final int TRANSACTION_getPasswordMinimumLength = 4;
        static final int TRANSACTION_setPasswordMinimumUpperCase = 5;
        static final int TRANSACTION_getPasswordMinimumUpperCase = 6;
        static final int TRANSACTION_setPasswordMinimumLowerCase = 7;
        static final int TRANSACTION_getPasswordMinimumLowerCase = 8;
        static final int TRANSACTION_setPasswordMinimumLetters = 9;
        static final int TRANSACTION_getPasswordMinimumLetters = 10;
        static final int TRANSACTION_setPasswordMinimumNumeric = 11;
        static final int TRANSACTION_getPasswordMinimumNumeric = 12;
        static final int TRANSACTION_setPasswordMinimumSymbols = 13;
        static final int TRANSACTION_getPasswordMinimumSymbols = 14;
        static final int TRANSACTION_setPasswordMinimumNonLetter = 15;
        static final int TRANSACTION_getPasswordMinimumNonLetter = 16;
        static final int TRANSACTION_getPasswordMinimumMetrics = 17;
        static final int TRANSACTION_setPasswordHistoryLength = 18;
        static final int TRANSACTION_getPasswordHistoryLength = 19;
        static final int TRANSACTION_setPasswordExpirationTimeout = 20;
        static final int TRANSACTION_getPasswordExpirationTimeout = 21;
        static final int TRANSACTION_getPasswordExpiration = 22;
        static final int TRANSACTION_isActivePasswordSufficient = 23;
        static final int TRANSACTION_isActivePasswordSufficientForDeviceRequirement = 24;
        static final int TRANSACTION_isPasswordSufficientAfterProfileUnification = 25;
        static final int TRANSACTION_getPasswordComplexity = 26;
        static final int TRANSACTION_setRequiredPasswordComplexity = 27;
        static final int TRANSACTION_getRequiredPasswordComplexity = 28;
        static final int TRANSACTION_getAggregatedPasswordComplexityForUser = 29;
        static final int TRANSACTION_isUsingUnifiedPassword = 30;
        static final int TRANSACTION_getCurrentFailedPasswordAttempts = 31;
        static final int TRANSACTION_getProfileWithMinimumFailedPasswordsForWipe = 32;
        static final int TRANSACTION_setMaximumFailedPasswordsForWipe = 33;
        static final int TRANSACTION_getMaximumFailedPasswordsForWipe = 34;
        static final int TRANSACTION_resetPassword = 35;
        static final int TRANSACTION_setMaximumTimeToLock = 36;
        static final int TRANSACTION_getMaximumTimeToLock = 37;
        static final int TRANSACTION_setRequiredStrongAuthTimeout = 38;
        static final int TRANSACTION_getRequiredStrongAuthTimeout = 39;
        static final int TRANSACTION_lockNow = 40;
        static final int TRANSACTION_wipeDataWithReason = 41;
        static final int TRANSACTION_setFactoryResetProtectionPolicy = 42;
        static final int TRANSACTION_getFactoryResetProtectionPolicy = 43;
        static final int TRANSACTION_isFactoryResetProtectionPolicySupported = 44;
        static final int TRANSACTION_setGlobalProxy = 45;
        static final int TRANSACTION_getGlobalProxyAdmin = 46;
        static final int TRANSACTION_setRecommendedGlobalProxy = 47;
        static final int TRANSACTION_setStorageEncryption = 48;
        static final int TRANSACTION_getStorageEncryption = 49;
        static final int TRANSACTION_getStorageEncryptionStatus = 50;
        static final int TRANSACTION_requestBugreport = 51;
        static final int TRANSACTION_setCameraDisabled = 52;
        static final int TRANSACTION_getCameraDisabled = 53;
        static final int TRANSACTION_setScreenCaptureDisabled = 54;
        static final int TRANSACTION_getScreenCaptureDisabled = 55;
        static final int TRANSACTION_setNearbyNotificationStreamingPolicy = 56;
        static final int TRANSACTION_getNearbyNotificationStreamingPolicy = 57;
        static final int TRANSACTION_setNearbyAppStreamingPolicy = 58;
        static final int TRANSACTION_getNearbyAppStreamingPolicy = 59;
        static final int TRANSACTION_setKeyguardDisabledFeatures = 60;
        static final int TRANSACTION_getKeyguardDisabledFeatures = 61;
        static final int TRANSACTION_setActiveAdmin = 62;
        static final int TRANSACTION_isAdminActive = 63;
        static final int TRANSACTION_getActiveAdmins = 64;
        static final int TRANSACTION_packageHasActiveAdmins = 65;
        static final int TRANSACTION_getRemoveWarning = 66;
        static final int TRANSACTION_removeActiveAdmin = 67;
        static final int TRANSACTION_forceRemoveActiveAdmin = 68;
        static final int TRANSACTION_hasGrantedPolicy = 69;
        static final int TRANSACTION_reportPasswordChanged = 70;
        static final int TRANSACTION_reportFailedPasswordAttempt = 71;
        static final int TRANSACTION_reportSuccessfulPasswordAttempt = 72;
        static final int TRANSACTION_reportFailedBiometricAttempt = 73;
        static final int TRANSACTION_reportSuccessfulBiometricAttempt = 74;
        static final int TRANSACTION_reportKeyguardDismissed = 75;
        static final int TRANSACTION_reportKeyguardSecured = 76;
        static final int TRANSACTION_setDeviceOwner = 77;
        static final int TRANSACTION_getDeviceOwnerComponent = 78;
        static final int TRANSACTION_hasDeviceOwner = 79;
        static final int TRANSACTION_getDeviceOwnerName = 80;
        static final int TRANSACTION_clearDeviceOwner = 81;
        static final int TRANSACTION_getDeviceOwnerUserId = 82;
        static final int TRANSACTION_setProfileOwner = 83;
        static final int TRANSACTION_getProfileOwnerAsUser = 84;
        static final int TRANSACTION_getProfileOwnerOrDeviceOwnerSupervisionComponent = 85;
        static final int TRANSACTION_getProfileOwnerName = 86;
        static final int TRANSACTION_setProfileEnabled = 87;
        static final int TRANSACTION_setProfileName = 88;
        static final int TRANSACTION_clearProfileOwner = 89;
        static final int TRANSACTION_hasUserSetupCompleted = 90;
        static final int TRANSACTION_isOrganizationOwnedDeviceWithManagedProfile = 91;
        static final int TRANSACTION_checkDeviceIdentifierAccess = 92;
        static final int TRANSACTION_setDeviceOwnerLockScreenInfo = 93;
        static final int TRANSACTION_getDeviceOwnerLockScreenInfo = 94;
        static final int TRANSACTION_setPackagesSuspended = 95;
        static final int TRANSACTION_isPackageSuspended = 96;
        static final int TRANSACTION_listPolicyExemptApps = 97;
        static final int TRANSACTION_installCaCert = 98;
        static final int TRANSACTION_uninstallCaCerts = 99;
        static final int TRANSACTION_enforceCanManageCaCerts = 100;
        static final int TRANSACTION_approveCaCert = 101;
        static final int TRANSACTION_isCaCertApproved = 102;
        static final int TRANSACTION_installKeyPair = 103;
        static final int TRANSACTION_removeKeyPair = 104;
        static final int TRANSACTION_hasKeyPair = 105;
        static final int TRANSACTION_generateKeyPair = 106;
        static final int TRANSACTION_setKeyPairCertificate = 107;
        static final int TRANSACTION_choosePrivateKeyAlias = 108;
        static final int TRANSACTION_setDelegatedScopes = 109;
        static final int TRANSACTION_getDelegatedScopes = 110;
        static final int TRANSACTION_getDelegatePackages = 111;
        static final int TRANSACTION_setCertInstallerPackage = 112;
        static final int TRANSACTION_getCertInstallerPackage = 113;
        static final int TRANSACTION_setAlwaysOnVpnPackage = 114;
        static final int TRANSACTION_getAlwaysOnVpnPackage = 115;
        static final int TRANSACTION_getAlwaysOnVpnPackageForUser = 116;
        static final int TRANSACTION_isAlwaysOnVpnLockdownEnabled = 117;
        static final int TRANSACTION_isAlwaysOnVpnLockdownEnabledForUser = 118;
        static final int TRANSACTION_getAlwaysOnVpnLockdownAllowlist = 119;
        static final int TRANSACTION_addPersistentPreferredActivity = 120;
        static final int TRANSACTION_clearPackagePersistentPreferredActivities = 121;
        static final int TRANSACTION_setDefaultSmsApplication = 122;
        static final int TRANSACTION_setApplicationRestrictions = 123;
        static final int TRANSACTION_getApplicationRestrictions = 124;
        static final int TRANSACTION_setApplicationRestrictionsManagingPackage = 125;
        static final int TRANSACTION_getApplicationRestrictionsManagingPackage = 126;
        static final int TRANSACTION_isCallerApplicationRestrictionsManagingPackage = 127;
        static final int TRANSACTION_setRestrictionsProvider = 128;
        static final int TRANSACTION_getRestrictionsProvider = 129;
        static final int TRANSACTION_setUserRestriction = 130;
        static final int TRANSACTION_getUserRestrictions = 131;
        static final int TRANSACTION_addCrossProfileIntentFilter = 132;
        static final int TRANSACTION_clearCrossProfileIntentFilters = 133;
        static final int TRANSACTION_setPermittedAccessibilityServices = 134;
        static final int TRANSACTION_getPermittedAccessibilityServices = 135;
        static final int TRANSACTION_getPermittedAccessibilityServicesForUser = 136;
        static final int TRANSACTION_isAccessibilityServicePermittedByAdmin = 137;
        static final int TRANSACTION_setPermittedInputMethods = 138;
        static final int TRANSACTION_getPermittedInputMethods = 139;
        static final int TRANSACTION_getPermittedInputMethodsForCurrentUser = 140;
        static final int TRANSACTION_isInputMethodPermittedByAdmin = 141;
        static final int TRANSACTION_setPermittedCrossProfileNotificationListeners = 142;
        static final int TRANSACTION_getPermittedCrossProfileNotificationListeners = 143;
        static final int TRANSACTION_isNotificationListenerServicePermitted = 144;
        static final int TRANSACTION_createAdminSupportIntent = 145;
        static final int TRANSACTION_setApplicationHidden = 146;
        static final int TRANSACTION_isApplicationHidden = 147;
        static final int TRANSACTION_createAndManageUser = 148;
        static final int TRANSACTION_removeUser = 149;
        static final int TRANSACTION_switchUser = 150;
        static final int TRANSACTION_startUserInBackground = 151;
        static final int TRANSACTION_stopUser = 152;
        static final int TRANSACTION_logoutUser = 153;
        static final int TRANSACTION_getSecondaryUsers = 154;
        static final int TRANSACTION_resetNewUserDisclaimer = 155;
        static final int TRANSACTION_enableSystemApp = 156;
        static final int TRANSACTION_enableSystemAppWithIntent = 157;
        static final int TRANSACTION_installExistingPackage = 158;
        static final int TRANSACTION_setAccountManagementDisabled = 159;
        static final int TRANSACTION_getAccountTypesWithManagementDisabled = 160;
        static final int TRANSACTION_getAccountTypesWithManagementDisabledAsUser = 161;
        static final int TRANSACTION_setSecondaryLockscreenEnabled = 162;
        static final int TRANSACTION_isSecondaryLockscreenEnabled = 163;
        static final int TRANSACTION_setPreferentialNetworkServiceEnabled = 164;
        static final int TRANSACTION_isPreferentialNetworkServiceEnabled = 165;
        static final int TRANSACTION_setLockTaskPackages = 166;
        static final int TRANSACTION_getLockTaskPackages = 167;
        static final int TRANSACTION_isLockTaskPermitted = 168;
        static final int TRANSACTION_setLockTaskFeatures = 169;
        static final int TRANSACTION_getLockTaskFeatures = 170;
        static final int TRANSACTION_setGlobalSetting = 171;
        static final int TRANSACTION_setSystemSetting = 172;
        static final int TRANSACTION_setSecureSetting = 173;
        static final int TRANSACTION_setConfiguredNetworksLockdownState = 174;
        static final int TRANSACTION_hasLockdownAdminConfiguredNetworks = 175;
        static final int TRANSACTION_setLocationEnabled = 176;
        static final int TRANSACTION_setTime = 177;
        static final int TRANSACTION_setTimeZone = 178;
        static final int TRANSACTION_setMasterVolumeMuted = 179;
        static final int TRANSACTION_isMasterVolumeMuted = 180;
        static final int TRANSACTION_notifyLockTaskModeChanged = 181;
        static final int TRANSACTION_setUninstallBlocked = 182;
        static final int TRANSACTION_isUninstallBlocked = 183;
        static final int TRANSACTION_setCrossProfileCallerIdDisabled = 184;
        static final int TRANSACTION_getCrossProfileCallerIdDisabled = 185;
        static final int TRANSACTION_getCrossProfileCallerIdDisabledForUser = 186;
        static final int TRANSACTION_setCrossProfileContactsSearchDisabled = 187;
        static final int TRANSACTION_getCrossProfileContactsSearchDisabled = 188;
        static final int TRANSACTION_getCrossProfileContactsSearchDisabledForUser = 189;
        static final int TRANSACTION_startManagedQuickContact = 190;
        static final int TRANSACTION_setBluetoothContactSharingDisabled = 191;
        static final int TRANSACTION_getBluetoothContactSharingDisabled = 192;
        static final int TRANSACTION_getBluetoothContactSharingDisabledForUser = 193;
        static final int TRANSACTION_setTrustAgentConfiguration = 194;
        static final int TRANSACTION_getTrustAgentConfiguration = 195;
        static final int TRANSACTION_addCrossProfileWidgetProvider = 196;
        static final int TRANSACTION_removeCrossProfileWidgetProvider = 197;
        static final int TRANSACTION_getCrossProfileWidgetProviders = 198;
        static final int TRANSACTION_setAutoTimeRequired = 199;
        static final int TRANSACTION_getAutoTimeRequired = 200;
        static final int TRANSACTION_setAutoTimeEnabled = 201;
        static final int TRANSACTION_getAutoTimeEnabled = 202;
        static final int TRANSACTION_setAutoTimeZoneEnabled = 203;
        static final int TRANSACTION_getAutoTimeZoneEnabled = 204;
        static final int TRANSACTION_setForceEphemeralUsers = 205;
        static final int TRANSACTION_getForceEphemeralUsers = 206;
        static final int TRANSACTION_isRemovingAdmin = 207;
        static final int TRANSACTION_setUserIcon = 208;
        static final int TRANSACTION_setSystemUpdatePolicy = 209;
        static final int TRANSACTION_getSystemUpdatePolicy = 210;
        static final int TRANSACTION_clearSystemUpdatePolicyFreezePeriodRecord = 211;
        static final int TRANSACTION_setKeyguardDisabled = 212;
        static final int TRANSACTION_setStatusBarDisabled = 213;
        static final int TRANSACTION_getDoNotAskCredentialsOnBoot = 214;
        static final int TRANSACTION_notifyPendingSystemUpdate = 215;
        static final int TRANSACTION_getPendingSystemUpdate = 216;
        static final int TRANSACTION_setPermissionPolicy = 217;
        static final int TRANSACTION_getPermissionPolicy = 218;
        static final int TRANSACTION_setPermissionGrantState = 219;
        static final int TRANSACTION_getPermissionGrantState = 220;
        static final int TRANSACTION_isProvisioningAllowed = 221;
        static final int TRANSACTION_checkProvisioningPreCondition = 222;
        static final int TRANSACTION_setKeepUninstalledPackages = 223;
        static final int TRANSACTION_getKeepUninstalledPackages = 224;
        static final int TRANSACTION_isManagedProfile = 225;
        static final int TRANSACTION_getWifiMacAddress = 226;
        static final int TRANSACTION_reboot = 227;
        static final int TRANSACTION_setShortSupportMessage = 228;
        static final int TRANSACTION_getShortSupportMessage = 229;
        static final int TRANSACTION_setLongSupportMessage = 230;
        static final int TRANSACTION_getLongSupportMessage = 231;
        static final int TRANSACTION_getShortSupportMessageForUser = 232;
        static final int TRANSACTION_getLongSupportMessageForUser = 233;
        static final int TRANSACTION_isSeparateProfileChallengeAllowed = 234;
        static final int TRANSACTION_setOrganizationColor = 235;
        static final int TRANSACTION_setOrganizationColorForUser = 236;
        static final int TRANSACTION_getOrganizationColor = 237;
        static final int TRANSACTION_getOrganizationColorForUser = 238;
        static final int TRANSACTION_setOrganizationName = 239;
        static final int TRANSACTION_getOrganizationName = 240;
        static final int TRANSACTION_getDeviceOwnerOrganizationName = 241;
        static final int TRANSACTION_getOrganizationNameForUser = 242;
        static final int TRANSACTION_getUserProvisioningState = 243;
        static final int TRANSACTION_setUserProvisioningState = 244;
        static final int TRANSACTION_setAffiliationIds = 245;
        static final int TRANSACTION_getAffiliationIds = 246;
        static final int TRANSACTION_isCallingUserAffiliated = 247;
        static final int TRANSACTION_isAffiliatedUser = 248;
        static final int TRANSACTION_setSecurityLoggingEnabled = 249;
        static final int TRANSACTION_isSecurityLoggingEnabled = 250;
        static final int TRANSACTION_retrieveSecurityLogs = 251;
        static final int TRANSACTION_retrievePreRebootSecurityLogs = 252;
        static final int TRANSACTION_forceNetworkLogs = 253;
        static final int TRANSACTION_forceSecurityLogs = 254;
        static final int TRANSACTION_isUninstallInQueue = 255;
        static final int TRANSACTION_uninstallPackageWithActiveAdmins = 256;
        static final int TRANSACTION_isDeviceProvisioned = 257;
        static final int TRANSACTION_isDeviceProvisioningConfigApplied = 258;
        static final int TRANSACTION_setDeviceProvisioningConfigApplied = 259;
        static final int TRANSACTION_forceUpdateUserSetupComplete = 260;
        static final int TRANSACTION_setBackupServiceEnabled = 261;
        static final int TRANSACTION_isBackupServiceEnabled = 262;
        static final int TRANSACTION_setNetworkLoggingEnabled = 263;
        static final int TRANSACTION_isNetworkLoggingEnabled = 264;
        static final int TRANSACTION_retrieveNetworkLogs = 265;
        static final int TRANSACTION_bindDeviceAdminServiceAsUser = 266;
        static final int TRANSACTION_getBindDeviceAdminTargetUsers = 267;
        static final int TRANSACTION_isEphemeralUser = 268;
        static final int TRANSACTION_getLastSecurityLogRetrievalTime = 269;
        static final int TRANSACTION_getLastBugReportRequestTime = 270;
        static final int TRANSACTION_getLastNetworkLogRetrievalTime = 271;
        static final int TRANSACTION_setResetPasswordToken = 272;
        static final int TRANSACTION_clearResetPasswordToken = 273;
        static final int TRANSACTION_isResetPasswordTokenActive = 274;
        static final int TRANSACTION_resetPasswordWithToken = 275;
        static final int TRANSACTION_isCurrentInputMethodSetByOwner = 276;
        static final int TRANSACTION_getOwnerInstalledCaCerts = 277;
        static final int TRANSACTION_clearApplicationUserData = 278;
        static final int TRANSACTION_setLogoutEnabled = 279;
        static final int TRANSACTION_isLogoutEnabled = 280;
        static final int TRANSACTION_getDisallowedSystemApps = 281;
        static final int TRANSACTION_transferOwnership = 282;
        static final int TRANSACTION_getTransferOwnershipBundle = 283;
        static final int TRANSACTION_setStartUserSessionMessage = 284;
        static final int TRANSACTION_setEndUserSessionMessage = 285;
        static final int TRANSACTION_getStartUserSessionMessage = 286;
        static final int TRANSACTION_getEndUserSessionMessage = 287;
        static final int TRANSACTION_setMeteredDataDisabledPackages = 288;
        static final int TRANSACTION_getMeteredDataDisabledPackages = 289;
        static final int TRANSACTION_addOverrideApn = 290;
        static final int TRANSACTION_updateOverrideApn = 291;
        static final int TRANSACTION_removeOverrideApn = 292;
        static final int TRANSACTION_getOverrideApns = 293;
        static final int TRANSACTION_setOverrideApnsEnabled = 294;
        static final int TRANSACTION_isOverrideApnEnabled = 295;
        static final int TRANSACTION_isMeteredDataDisabledPackageForUser = 296;
        static final int TRANSACTION_setGlobalPrivateDns = 297;
        static final int TRANSACTION_getGlobalPrivateDnsMode = 298;
        static final int TRANSACTION_getGlobalPrivateDnsHost = 299;
        static final int TRANSACTION_markProfileOwnerOnOrganizationOwnedDevice = 300;
        static final int TRANSACTION_installUpdateFromFile = 301;
        static final int TRANSACTION_setCrossProfileCalendarPackages = 302;
        static final int TRANSACTION_getCrossProfileCalendarPackages = 303;
        static final int TRANSACTION_isPackageAllowedToAccessCalendarForUser = 304;
        static final int TRANSACTION_getCrossProfileCalendarPackagesForUser = 305;
        static final int TRANSACTION_setCrossProfilePackages = 306;
        static final int TRANSACTION_getCrossProfilePackages = 307;
        static final int TRANSACTION_getAllCrossProfilePackages = 308;
        static final int TRANSACTION_getDefaultCrossProfilePackages = 309;
        static final int TRANSACTION_isManagedKiosk = 310;
        static final int TRANSACTION_isUnattendedManagedKiosk = 311;
        static final int TRANSACTION_startViewCalendarEventInManagedProfile = 312;
        static final int TRANSACTION_setKeyGrantForApp = 313;
        static final int TRANSACTION_getKeyPairGrants = 314;
        static final int TRANSACTION_setKeyGrantToWifiAuth = 315;
        static final int TRANSACTION_isKeyPairGrantedToWifiAuth = 316;
        static final int TRANSACTION_setUserControlDisabledPackages = 317;
        static final int TRANSACTION_getUserControlDisabledPackages = 318;
        static final int TRANSACTION_setCommonCriteriaModeEnabled = 319;
        static final int TRANSACTION_isCommonCriteriaModeEnabled = 320;
        static final int TRANSACTION_getPersonalAppsSuspendedReasons = 321;
        static final int TRANSACTION_setPersonalAppsSuspended = 322;
        static final int TRANSACTION_getManagedProfileMaximumTimeOff = 323;
        static final int TRANSACTION_setManagedProfileMaximumTimeOff = 324;
        static final int TRANSACTION_acknowledgeDeviceCompliant = 325;
        static final int TRANSACTION_isComplianceAcknowledgementRequired = 326;
        static final int TRANSACTION_canProfileOwnerResetPasswordWhenLocked = 327;
        static final int TRANSACTION_setNextOperationSafety = 328;
        static final int TRANSACTION_isSafeOperation = 329;
        static final int TRANSACTION_getEnrollmentSpecificId = 330;
        static final int TRANSACTION_setOrganizationIdForUser = 331;
        static final int TRANSACTION_createAndProvisionManagedProfile = 332;
        static final int TRANSACTION_provisionFullyManagedDevice = 333;
        static final int TRANSACTION_setDeviceOwnerType = 334;
        static final int TRANSACTION_getDeviceOwnerType = 335;
        static final int TRANSACTION_resetDefaultCrossProfileIntentFilters = 336;
        static final int TRANSACTION_canAdminGrantSensorsPermissionsForUser = 337;
        static final int TRANSACTION_setUsbDataSignalingEnabled = 338;
        static final int TRANSACTION_isUsbDataSignalingEnabled = 339;
        static final int TRANSACTION_isUsbDataSignalingEnabledForUser = 340;
        static final int TRANSACTION_canUsbDataSignalingBeDisabled = 341;
        static final int TRANSACTION_listForegroundAffiliatedUsers = 342;
        public Stub() { super(); }
        public static android.app.admin.IDevicePolicyManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        private boolean onTransact$getCameraDisabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setScreenCaptureDisabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getScreenCaptureDisabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeyguardDisabledFeatures$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getKeyguardDisabledFeatures$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setActiveAdmin$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getRemoveWarning$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$hasGrantedPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDeviceOwner$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setProfileOwner$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$checkDeviceIdentifierAccess$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPackagesSuspended$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isPackageSuspended$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$installCaCert$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$uninstallCaCerts$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$approveCaCert$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$installKeyPair$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$removeKeyPair$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$generateKeyPair$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeyPairCertificate$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$choosePrivateKeyAlias$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDelegatedScopes$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setAlwaysOnVpnPackage$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$addPersistentPreferredActivity$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setDefaultSmsApplication$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setApplicationRestrictions$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getApplicationRestrictions$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setUserRestriction$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$addCrossProfileIntentFilter$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isAccessibilityServicePermittedByAdmin$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPermittedInputMethods$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isInputMethodPermittedByAdmin$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setApplicationHidden$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isApplicationHidden$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$createAndManageUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$enableSystemApp$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$enableSystemAppWithIntent$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$installExistingPackage$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setAccountManagementDisabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setGlobalSetting$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSystemSetting$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSecureSetting$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$notifyLockTaskModeChanged$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setUninstallBlocked$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$startManagedQuickContact$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setTrustAgentConfiguration$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getTrustAgentConfiguration$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPermissionPolicy$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPermissionGrantState$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getPermissionGrantState$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeepUninstalledPackages$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setSecurityLoggingEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setNetworkLoggingEnabled$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$retrieveNetworkLogs$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$bindDeviceAdminServiceAsUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$resetPasswordWithToken$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$clearApplicationUserData$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$getDisallowedSystemApps$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$transferOwnership$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$updateOverrideApn$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$isMeteredDataDisabledPackageForUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setGlobalPrivateDns$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$installUpdateFromFile$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$startViewCalendarEventInManagedProfile$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeyGrantForApp$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeyGrantToWifiAuth$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setOrganizationIdForUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.admin.IDevicePolicyManager p0) { return false; }
        public static android.app.admin.IDevicePolicyManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.admin.IDevicePolicyManager {
            private android.os.IBinder mRemote;
            public static android.app.admin.IDevicePolicyManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getPasswordQuality(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getPasswordMinimumLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getPasswordMinimumUpperCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getPasswordMinimumLowerCase(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getPasswordMinimumLetters(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getPasswordMinimumNumeric(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getPasswordMinimumSymbols(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getPasswordMinimumNonLetter(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public android.app.admin.PasswordMetrics getPasswordMinimumMetrics(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public void setPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setPasswordExpirationTimeout(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException {}
            public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public boolean isActivePasswordSufficient(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean isActivePasswordSufficientForDeviceRequirement() throws android.os.RemoteException { return false; }
            public boolean isPasswordSufficientAfterProfileUnification(int p0, int p1) throws android.os.RemoteException { return false; }
            public int getPasswordComplexity(boolean p0) throws android.os.RemoteException { return 0; }
            public void setRequiredPasswordComplexity(int p0, boolean p1) throws android.os.RemoteException {}
            public int getRequiredPasswordComplexity(boolean p0) throws android.os.RemoteException { return 0; }
            public int getAggregatedPasswordComplexityForUser(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public boolean isUsingUnifiedPassword(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public int getCurrentFailedPasswordAttempts(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public int getProfileWithMinimumFailedPasswordsForWipe(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public void setMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public boolean resetPassword(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setMaximumTimeToLock(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException {}
            public long getMaximumTimeToLock(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public void setRequiredStrongAuthTimeout(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException {}
            public long getRequiredStrongAuthTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public void lockNow(int p0, boolean p1) throws android.os.RemoteException {}
            public void wipeDataWithReason(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, android.app.admin.FactoryResetProtectionPolicy p1) throws android.os.RemoteException {}
            public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isFactoryResetProtectionPolicySupported() throws android.os.RemoteException { return false; }
            public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException { return null; }
            public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException {}
            public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return 0; }
            public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void setCameraDisabled(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public boolean getCameraDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public void setScreenCaptureDisabled(android.content.ComponentName p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public void setNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException {}
            public int getNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException { return 0; }
            public void setNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException {}
            public int getNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException { return 0; }
            public void setKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2) throws android.os.RemoteException {}
            public boolean isAdminActive(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.content.ComponentName> getActiveAdmins(int p0) throws android.os.RemoteException { return null; }
            public boolean packageHasActiveAdmins(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1, int p2) throws android.os.RemoteException {}
            public void removeActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void reportPasswordChanged(int p0) throws android.os.RemoteException {}
            public void reportFailedPasswordAttempt(int p0) throws android.os.RemoteException {}
            public void reportSuccessfulPasswordAttempt(int p0) throws android.os.RemoteException {}
            public void reportFailedBiometricAttempt(int p0) throws android.os.RemoteException {}
            public void reportSuccessfulBiometricAttempt(int p0) throws android.os.RemoteException {}
            public void reportKeyguardDismissed(int p0) throws android.os.RemoteException {}
            public void reportKeyguardSecured(int p0) throws android.os.RemoteException {}
            public boolean setDeviceOwner(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public android.content.ComponentName getDeviceOwnerComponent(boolean p0) throws android.os.RemoteException { return null; }
            public boolean hasDeviceOwner() throws android.os.RemoteException { return false; }
            public java.lang.String getDeviceOwnerName() throws android.os.RemoteException { return null; }
            public void clearDeviceOwner(java.lang.String p0) throws android.os.RemoteException {}
            public int getDeviceOwnerUserId() throws android.os.RemoteException { return 0; }
            public boolean setProfileOwner(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public android.content.ComponentName getProfileOwnerAsUser(int p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
            public java.lang.String getProfileOwnerName(int p0) throws android.os.RemoteException { return null; }
            public void setProfileEnabled(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void setProfileName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public void clearProfileOwner(android.content.ComponentName p0) throws android.os.RemoteException {}
            public boolean hasUserSetupCompleted() throws android.os.RemoteException { return false; }
            public boolean isOrganizationOwnedDeviceWithManagedProfile() throws android.os.RemoteException { return false; }
            public boolean checkDeviceIdentifierAccess(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void setDeviceOwnerLockScreenInfo(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException { return null; }
            public java.lang.String[] setPackagesSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2, boolean p3) throws android.os.RemoteException { return null; }
            public boolean isPackageSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> listPolicyExemptApps() throws android.os.RemoteException { return null; }
            public boolean installCaCert(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException { return false; }
            public void uninstallCaCerts(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void enforceCanManageCaCerts(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean approveCaCert(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean isCaCertApproved(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean installKeyPair(android.content.ComponentName p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, java.lang.String p5, boolean p6, boolean p7) throws android.os.RemoteException { return false; }
            public boolean removeKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean hasKeyPair(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean generateKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.security.keystore.ParcelableKeyGenParameterSpec p3, int p4, android.security.keymaster.KeymasterCertificateChain p5) throws android.os.RemoteException { return false; }
            public boolean setKeyPairCertificate(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, boolean p5) throws android.os.RemoteException { return false; }
            public void choosePrivateKeyAlias(int p0, android.net.Uri p1, java.lang.String p2, android.os.IBinder p3) throws android.os.RemoteException {}
            public void setDelegatedScopes(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getDelegatedScopes(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getDelegatePackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setCertInstallerPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String getCertInstallerPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean setAlwaysOnVpnPackage(android.content.ComponentName p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) throws android.os.RemoteException { return false; }
            public java.lang.String getAlwaysOnVpnPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.lang.String getAlwaysOnVpnPackageForUser(int p0) throws android.os.RemoteException { return null; }
            public boolean isAlwaysOnVpnLockdownEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isAlwaysOnVpnLockdownEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getAlwaysOnVpnLockdownAllowlist(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void addPersistentPreferredActivity(android.content.ComponentName p0, android.content.IntentFilter p1, android.content.ComponentName p2) throws android.os.RemoteException {}
            public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException {}
            public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException { return null; }
            public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public android.os.Bundle getUserRestrictions(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return null; }
            public void addCrossProfileIntentFilter(android.content.ComponentName p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException {}
            public void clearCrossProfileIntentFilters(android.content.ComponentName p0) throws android.os.RemoteException {}
            public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List p1) throws android.os.RemoteException { return false; }
            public java.util.List getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException { return null; }
            public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean setPermittedInputMethods(android.content.ComponentName p0, java.util.List p1, boolean p2) throws android.os.RemoteException { return false; }
            public java.util.List getPermittedInputMethods(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return null; }
            public java.util.List getPermittedInputMethodsForCurrentUser() throws android.os.RemoteException { return null; }
            public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return false; }
            public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException { return false; }
            public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return false; }
            public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException { return null; }
            public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
            public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
            public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void resetNewUserDisclaimer() throws android.os.RemoteException {}
            public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException { return 0; }
            public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public java.lang.String[] getAccountTypesWithManagementDisabled() throws android.os.RemoteException { return null; }
            public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public void setSecondaryLockscreenEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean isSecondaryLockscreenEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
            public void setPreferentialNetworkServiceEnabled(boolean p0) throws android.os.RemoteException {}
            public boolean isPreferentialNetworkServiceEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setLockTaskFeatures(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public int getLockTaskFeatures(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setConfiguredNetworksLockdownState(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean hasLockdownAdminConfiguredNetworks(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void setLocationEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean setTime(android.content.ComponentName p0, long p1) throws android.os.RemoteException { return false; }
            public boolean setTimeZone(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setMasterVolumeMuted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean isMasterVolumeMuted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void notifyLockTaskModeChanged(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setUninstallBlocked(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public boolean isUninstallBlocked(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setCrossProfileCallerIdDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean getCrossProfileCallerIdDisabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void setCrossProfileContactsSearchDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean getCrossProfileContactsSearchDisabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void startManagedQuickContact(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) throws android.os.RemoteException {}
            public void setBluetoothContactSharingDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getBluetoothContactSharingDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean getBluetoothContactSharingDisabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void setTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2, boolean p3) throws android.os.RemoteException {}
            public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
            public boolean addCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean removeCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void setAutoTimeRequired(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getAutoTimeRequired() throws android.os.RemoteException { return false; }
            public void setAutoTimeEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getAutoTimeEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void setAutoTimeZoneEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getAutoTimeZoneEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void setForceEphemeralUsers(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getForceEphemeralUsers(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public void setUserIcon(android.content.ComponentName p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
            public void setSystemUpdatePolicy(android.content.ComponentName p0, android.app.admin.SystemUpdatePolicy p1) throws android.os.RemoteException {}
            public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException { return null; }
            public void clearSystemUpdatePolicyFreezePeriodRecord() throws android.os.RemoteException {}
            public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setStatusBarDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException { return false; }
            public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo p0) throws android.os.RemoteException {}
            public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void setPermissionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public int getPermissionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public void setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
            public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public boolean isProvisioningAllowed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int checkProvisioningPreCondition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void setKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isManagedProfile(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public java.lang.String getWifiMacAddress(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void reboot(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void setShortSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void setLongSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public boolean isSeparateProfileChallengeAllowed(int p0) throws android.os.RemoteException { return false; }
            public void setOrganizationColor(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void setOrganizationColorForUser(int p0, int p1) throws android.os.RemoteException {}
            public int getOrganizationColor(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public int getOrganizationColorForUser(int p0) throws android.os.RemoteException { return 0; }
            public void setOrganizationName(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getOrganizationNameForUser(int p0) throws android.os.RemoteException { return null; }
            public int getUserProvisioningState() throws android.os.RemoteException { return 0; }
            public void setUserProvisioningState(int p0, int p1) throws android.os.RemoteException {}
            public void setAffiliationIds(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getAffiliationIds(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isCallingUserAffiliated() throws android.os.RemoteException { return false; }
            public boolean isAffiliatedUser(int p0) throws android.os.RemoteException { return false; }
            public void setSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public boolean isSecurityLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public long forceNetworkLogs() throws android.os.RemoteException { return 0L; }
            public long forceSecurityLogs() throws android.os.RemoteException { return 0L; }
            public boolean isUninstallInQueue(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void uninstallPackageWithActiveAdmins(java.lang.String p0) throws android.os.RemoteException {}
            public boolean isDeviceProvisioned() throws android.os.RemoteException { return false; }
            public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException { return false; }
            public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException {}
            public void forceUpdateUserSetupComplete(int p0) throws android.os.RemoteException {}
            public void setBackupServiceEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean isBackupServiceEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void setNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public boolean isNetworkLoggingEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.app.admin.NetworkEvent> retrieveNetworkLogs(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException { return null; }
            public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName p0, android.app.IApplicationThread p1, android.os.IBinder p2, android.content.Intent p3, android.app.IServiceConnection p4, int p5, int p6) throws android.os.RemoteException { return false; }
            public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isEphemeralUser(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException { return 0L; }
            public long getLastBugReportRequestTime() throws android.os.RemoteException { return 0L; }
            public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException { return 0L; }
            public boolean setResetPasswordToken(android.content.ComponentName p0, byte[] p1) throws android.os.RemoteException { return false; }
            public boolean clearResetPasswordToken(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isResetPasswordTokenActive(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean resetPasswordWithToken(android.content.ComponentName p0, java.lang.String p1, byte[] p2, int p3) throws android.os.RemoteException { return false; }
            public boolean isCurrentInputMethodSetByOwner() throws android.os.RemoteException { return false; }
            public android.content.pm.StringParceledListSlice getOwnerInstalledCaCerts(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
            public void clearApplicationUserData(android.content.ComponentName p0, java.lang.String p1, android.content.pm.IPackageDataObserver p2) throws android.os.RemoteException {}
            public void setLogoutEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean isLogoutEnabled() throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getDisallowedSystemApps(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void transferOwnership(android.content.ComponentName p0, android.content.ComponentName p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public android.os.PersistableBundle getTransferOwnershipBundle() throws android.os.RemoteException { return null; }
            public void setStartUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public void setEndUserSessionMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public java.lang.CharSequence getStartUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getEndUserSessionMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> setMeteredDataDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getMeteredDataDisabledPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public int addOverrideApn(android.content.ComponentName p0, android.telephony.data.ApnSetting p1) throws android.os.RemoteException { return 0; }
            public boolean updateOverrideApn(android.content.ComponentName p0, int p1, android.telephony.data.ApnSetting p2) throws android.os.RemoteException { return false; }
            public boolean removeOverrideApn(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.telephony.data.ApnSetting> getOverrideApns(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void setOverrideApnsEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean isOverrideApnEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isMeteredDataDisabledPackageForUser(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public int setGlobalPrivateDns(android.content.ComponentName p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public int getGlobalPrivateDnsMode(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public java.lang.String getGlobalPrivateDnsHost(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void markProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void installUpdateFromFile(android.content.ComponentName p0, android.os.ParcelFileDescriptor p1, android.app.admin.StartInstallingUpdateCallback p2) throws android.os.RemoteException {}
            public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException { return null; }
            public void setCrossProfilePackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAllCrossProfilePackages() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getDefaultCrossProfilePackages() throws android.os.RemoteException { return null; }
            public boolean isManagedKiosk() throws android.os.RemoteException { return false; }
            public boolean isUnattendedManagedKiosk() throws android.os.RemoteException { return false; }
            public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
            public boolean setKeyGrantForApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
            public android.app.admin.ParcelableGranteeMap getKeyPairGrants(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean setKeyGrantToWifiAuth(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean isKeyPairGrantedToWifiAuth(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setUserControlDisabledPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getUserControlDisabledPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void setCommonCriteriaModeEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean isCommonCriteriaModeEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public int getPersonalAppsSuspendedReasons(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public void setPersonalAppsSuspended(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public long getManagedProfileMaximumTimeOff(android.content.ComponentName p0) throws android.os.RemoteException { return 0L; }
            public void setManagedProfileMaximumTimeOff(android.content.ComponentName p0, long p1) throws android.os.RemoteException {}
            public void acknowledgeDeviceCompliant() throws android.os.RemoteException {}
            public boolean isComplianceAcknowledgementRequired() throws android.os.RemoteException { return false; }
            public boolean canProfileOwnerResetPasswordWhenLocked(int p0) throws android.os.RemoteException { return false; }
            public void setNextOperationSafety(int p0, int p1) throws android.os.RemoteException {}
            public boolean isSafeOperation(int p0) throws android.os.RemoteException { return false; }
            public java.lang.String getEnrollmentSpecificId(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setOrganizationIdForUser(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public android.os.UserHandle createAndProvisionManagedProfile(android.app.admin.ManagedProfileProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void provisionFullyManagedDevice(android.app.admin.FullyManagedDeviceProvisioningParams p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setDeviceOwnerType(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public int getDeviceOwnerType(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public void resetDefaultCrossProfileIntentFilters(int p0) throws android.os.RemoteException {}
            public boolean canAdminGrantSensorsPermissionsForUser(int p0) throws android.os.RemoteException { return false; }
            public void setUsbDataSignalingEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public boolean isUsbDataSignalingEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isUsbDataSignalingEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public boolean canUsbDataSignalingBeDisabled() throws android.os.RemoteException { return false; }
            public java.util.List<android.os.UserHandle> listForegroundAffiliatedUsers() throws android.os.RemoteException { return null; }
        }
    }
}
