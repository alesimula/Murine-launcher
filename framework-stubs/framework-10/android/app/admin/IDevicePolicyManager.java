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
    public void setPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setPasswordExpirationTimeout(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException;
    public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isActivePasswordSufficient(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isProfileActivePasswordSufficientForParent(int p0) throws android.os.RemoteException;
    public int getPasswordComplexity() throws android.os.RemoteException;
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
    public void wipeDataWithReason(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException;
    public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException;
    public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setCameraDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getCameraDisabled(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setScreenCaptureDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean isAdminActive(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> getActiveAdmins(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean packageHasActiveAdmins(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1, int p2) throws android.os.RemoteException;
    public void removeActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    public void setActivePasswordState(android.app.admin.PasswordMetrics p0, int p1) throws android.os.RemoteException;
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
    public android.content.ComponentName getProfileOwner(int p0) throws android.os.RemoteException;
    public java.lang.String getProfileOwnerName(int p0) throws android.os.RemoteException;
    public void setProfileEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setProfileName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void clearProfileOwner(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean hasUserSetupCompleted() throws android.os.RemoteException;
    public boolean checkDeviceIdentifierAccess(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void setDeviceOwnerLockScreenInfo(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException;
    public java.lang.String[] setPackagesSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2, boolean p3) throws android.os.RemoteException;
    public boolean isPackageSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean installCaCert(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException;
    public void uninstallCaCerts(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException;
    public void enforceCanManageCaCerts(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean approveCaCert(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isCaCertApproved(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean installKeyPair(android.content.ComponentName p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, java.lang.String p5, boolean p6, boolean p7) throws android.os.RemoteException;
    public boolean removeKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
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
    public boolean isAlwaysOnVpnLockdownEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAlwaysOnVpnLockdownWhitelist(android.content.ComponentName p0) throws android.os.RemoteException;
    public void addPersistentPreferredActivity(android.content.ComponentName p0, android.content.IntentFilter p1, android.content.ComponentName p2) throws android.os.RemoteException;
    public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException;
    public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException;
    public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public android.os.Bundle getUserRestrictions(android.content.ComponentName p0) throws android.os.RemoteException;
    public void addCrossProfileIntentFilter(android.content.ComponentName p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException;
    public void clearCrossProfileIntentFilters(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List p1) throws android.os.RemoteException;
    public java.util.List getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException;
    public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean setPermittedInputMethods(android.content.ComponentName p0, java.util.List p1) throws android.os.RemoteException;
    public java.util.List getPermittedInputMethods(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List getPermittedInputMethodsForCurrentUser() throws android.os.RemoteException;
    public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException;
    public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException;
    public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException;
    public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException;
    public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public java.lang.String[] getAccountTypesWithManagementDisabled() throws android.os.RemoteException;
    public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0) throws android.os.RemoteException;
    public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String[] p1) throws android.os.RemoteException;
    public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException;
    public void setLockTaskFeatures(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public int getLockTaskFeatures(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
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
    public boolean isSystemOnlyUser(android.content.ComponentName p0) throws android.os.RemoteException;
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
    public boolean isAffiliatedUser() throws android.os.RemoteException;
    public void setSecurityLoggingEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean isSecurityLoggingEnabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName p0) throws android.os.RemoteException;
    public long forceNetworkLogs() throws android.os.RemoteException;
    public long forceSecurityLogs() throws android.os.RemoteException;
    public boolean isUninstallInQueue(java.lang.String p0) throws android.os.RemoteException;
    public void uninstallPackageWithActiveAdmins(java.lang.String p0) throws android.os.RemoteException;
    public boolean isDeviceProvisioned() throws android.os.RemoteException;
    public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException;
    public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException;
    public void forceUpdateUserSetupComplete() throws android.os.RemoteException;
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
    public void grantDeviceIdsAccessToProfileOwner(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void installUpdateFromFile(android.content.ComponentName p0, android.os.ParcelFileDescriptor p1, android.app.admin.StartInstallingUpdateCallback p2) throws android.os.RemoteException;
    public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException;
    public boolean isManagedKiosk() throws android.os.RemoteException;
    public boolean isUnattendedManagedKiosk() throws android.os.RemoteException;
    public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.admin.IDevicePolicyManager {
        private static final java.lang.String DESCRIPTOR = "android.app.admin.IDevicePolicyManager";
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
        static final int TRANSACTION_setPasswordHistoryLength = 17;
        static final int TRANSACTION_getPasswordHistoryLength = 18;
        static final int TRANSACTION_setPasswordExpirationTimeout = 19;
        static final int TRANSACTION_getPasswordExpirationTimeout = 20;
        static final int TRANSACTION_getPasswordExpiration = 21;
        static final int TRANSACTION_isActivePasswordSufficient = 22;
        static final int TRANSACTION_isProfileActivePasswordSufficientForParent = 23;
        static final int TRANSACTION_getPasswordComplexity = 24;
        static final int TRANSACTION_isUsingUnifiedPassword = 25;
        static final int TRANSACTION_getCurrentFailedPasswordAttempts = 26;
        static final int TRANSACTION_getProfileWithMinimumFailedPasswordsForWipe = 27;
        static final int TRANSACTION_setMaximumFailedPasswordsForWipe = 28;
        static final int TRANSACTION_getMaximumFailedPasswordsForWipe = 29;
        static final int TRANSACTION_resetPassword = 30;
        static final int TRANSACTION_setMaximumTimeToLock = 31;
        static final int TRANSACTION_getMaximumTimeToLock = 32;
        static final int TRANSACTION_setRequiredStrongAuthTimeout = 33;
        static final int TRANSACTION_getRequiredStrongAuthTimeout = 34;
        static final int TRANSACTION_lockNow = 35;
        static final int TRANSACTION_wipeDataWithReason = 36;
        static final int TRANSACTION_setGlobalProxy = 37;
        static final int TRANSACTION_getGlobalProxyAdmin = 38;
        static final int TRANSACTION_setRecommendedGlobalProxy = 39;
        static final int TRANSACTION_setStorageEncryption = 40;
        static final int TRANSACTION_getStorageEncryption = 41;
        static final int TRANSACTION_getStorageEncryptionStatus = 42;
        static final int TRANSACTION_requestBugreport = 43;
        static final int TRANSACTION_setCameraDisabled = 44;
        static final int TRANSACTION_getCameraDisabled = 45;
        static final int TRANSACTION_setScreenCaptureDisabled = 46;
        static final int TRANSACTION_getScreenCaptureDisabled = 47;
        static final int TRANSACTION_setKeyguardDisabledFeatures = 48;
        static final int TRANSACTION_getKeyguardDisabledFeatures = 49;
        static final int TRANSACTION_setActiveAdmin = 50;
        static final int TRANSACTION_isAdminActive = 51;
        static final int TRANSACTION_getActiveAdmins = 52;
        static final int TRANSACTION_packageHasActiveAdmins = 53;
        static final int TRANSACTION_getRemoveWarning = 54;
        static final int TRANSACTION_removeActiveAdmin = 55;
        static final int TRANSACTION_forceRemoveActiveAdmin = 56;
        static final int TRANSACTION_hasGrantedPolicy = 57;
        static final int TRANSACTION_setActivePasswordState = 58;
        static final int TRANSACTION_reportPasswordChanged = 59;
        static final int TRANSACTION_reportFailedPasswordAttempt = 60;
        static final int TRANSACTION_reportSuccessfulPasswordAttempt = 61;
        static final int TRANSACTION_reportFailedBiometricAttempt = 62;
        static final int TRANSACTION_reportSuccessfulBiometricAttempt = 63;
        static final int TRANSACTION_reportKeyguardDismissed = 64;
        static final int TRANSACTION_reportKeyguardSecured = 65;
        static final int TRANSACTION_setDeviceOwner = 66;
        static final int TRANSACTION_getDeviceOwnerComponent = 67;
        static final int TRANSACTION_hasDeviceOwner = 68;
        static final int TRANSACTION_getDeviceOwnerName = 69;
        static final int TRANSACTION_clearDeviceOwner = 70;
        static final int TRANSACTION_getDeviceOwnerUserId = 71;
        static final int TRANSACTION_setProfileOwner = 72;
        static final int TRANSACTION_getProfileOwnerAsUser = 73;
        static final int TRANSACTION_getProfileOwner = 74;
        static final int TRANSACTION_getProfileOwnerName = 75;
        static final int TRANSACTION_setProfileEnabled = 76;
        static final int TRANSACTION_setProfileName = 77;
        static final int TRANSACTION_clearProfileOwner = 78;
        static final int TRANSACTION_hasUserSetupCompleted = 79;
        static final int TRANSACTION_checkDeviceIdentifierAccess = 80;
        static final int TRANSACTION_setDeviceOwnerLockScreenInfo = 81;
        static final int TRANSACTION_getDeviceOwnerLockScreenInfo = 82;
        static final int TRANSACTION_setPackagesSuspended = 83;
        static final int TRANSACTION_isPackageSuspended = 84;
        static final int TRANSACTION_installCaCert = 85;
        static final int TRANSACTION_uninstallCaCerts = 86;
        static final int TRANSACTION_enforceCanManageCaCerts = 87;
        static final int TRANSACTION_approveCaCert = 88;
        static final int TRANSACTION_isCaCertApproved = 89;
        static final int TRANSACTION_installKeyPair = 90;
        static final int TRANSACTION_removeKeyPair = 91;
        static final int TRANSACTION_generateKeyPair = 92;
        static final int TRANSACTION_setKeyPairCertificate = 93;
        static final int TRANSACTION_choosePrivateKeyAlias = 94;
        static final int TRANSACTION_setDelegatedScopes = 95;
        static final int TRANSACTION_getDelegatedScopes = 96;
        static final int TRANSACTION_getDelegatePackages = 97;
        static final int TRANSACTION_setCertInstallerPackage = 98;
        static final int TRANSACTION_getCertInstallerPackage = 99;
        static final int TRANSACTION_setAlwaysOnVpnPackage = 100;
        static final int TRANSACTION_getAlwaysOnVpnPackage = 101;
        static final int TRANSACTION_isAlwaysOnVpnLockdownEnabled = 102;
        static final int TRANSACTION_getAlwaysOnVpnLockdownWhitelist = 103;
        static final int TRANSACTION_addPersistentPreferredActivity = 104;
        static final int TRANSACTION_clearPackagePersistentPreferredActivities = 105;
        static final int TRANSACTION_setDefaultSmsApplication = 106;
        static final int TRANSACTION_setApplicationRestrictions = 107;
        static final int TRANSACTION_getApplicationRestrictions = 108;
        static final int TRANSACTION_setApplicationRestrictionsManagingPackage = 109;
        static final int TRANSACTION_getApplicationRestrictionsManagingPackage = 110;
        static final int TRANSACTION_isCallerApplicationRestrictionsManagingPackage = 111;
        static final int TRANSACTION_setRestrictionsProvider = 112;
        static final int TRANSACTION_getRestrictionsProvider = 113;
        static final int TRANSACTION_setUserRestriction = 114;
        static final int TRANSACTION_getUserRestrictions = 115;
        static final int TRANSACTION_addCrossProfileIntentFilter = 116;
        static final int TRANSACTION_clearCrossProfileIntentFilters = 117;
        static final int TRANSACTION_setPermittedAccessibilityServices = 118;
        static final int TRANSACTION_getPermittedAccessibilityServices = 119;
        static final int TRANSACTION_getPermittedAccessibilityServicesForUser = 120;
        static final int TRANSACTION_isAccessibilityServicePermittedByAdmin = 121;
        static final int TRANSACTION_setPermittedInputMethods = 122;
        static final int TRANSACTION_getPermittedInputMethods = 123;
        static final int TRANSACTION_getPermittedInputMethodsForCurrentUser = 124;
        static final int TRANSACTION_isInputMethodPermittedByAdmin = 125;
        static final int TRANSACTION_setPermittedCrossProfileNotificationListeners = 126;
        static final int TRANSACTION_getPermittedCrossProfileNotificationListeners = 127;
        static final int TRANSACTION_isNotificationListenerServicePermitted = 128;
        static final int TRANSACTION_createAdminSupportIntent = 129;
        static final int TRANSACTION_setApplicationHidden = 130;
        static final int TRANSACTION_isApplicationHidden = 131;
        static final int TRANSACTION_createAndManageUser = 132;
        static final int TRANSACTION_removeUser = 133;
        static final int TRANSACTION_switchUser = 134;
        static final int TRANSACTION_startUserInBackground = 135;
        static final int TRANSACTION_stopUser = 136;
        static final int TRANSACTION_logoutUser = 137;
        static final int TRANSACTION_getSecondaryUsers = 138;
        static final int TRANSACTION_enableSystemApp = 139;
        static final int TRANSACTION_enableSystemAppWithIntent = 140;
        static final int TRANSACTION_installExistingPackage = 141;
        static final int TRANSACTION_setAccountManagementDisabled = 142;
        static final int TRANSACTION_getAccountTypesWithManagementDisabled = 143;
        static final int TRANSACTION_getAccountTypesWithManagementDisabledAsUser = 144;
        static final int TRANSACTION_setLockTaskPackages = 145;
        static final int TRANSACTION_getLockTaskPackages = 146;
        static final int TRANSACTION_isLockTaskPermitted = 147;
        static final int TRANSACTION_setLockTaskFeatures = 148;
        static final int TRANSACTION_getLockTaskFeatures = 149;
        static final int TRANSACTION_setGlobalSetting = 150;
        static final int TRANSACTION_setSystemSetting = 151;
        static final int TRANSACTION_setSecureSetting = 152;
        static final int TRANSACTION_setTime = 153;
        static final int TRANSACTION_setTimeZone = 154;
        static final int TRANSACTION_setMasterVolumeMuted = 155;
        static final int TRANSACTION_isMasterVolumeMuted = 156;
        static final int TRANSACTION_notifyLockTaskModeChanged = 157;
        static final int TRANSACTION_setUninstallBlocked = 158;
        static final int TRANSACTION_isUninstallBlocked = 159;
        static final int TRANSACTION_setCrossProfileCallerIdDisabled = 160;
        static final int TRANSACTION_getCrossProfileCallerIdDisabled = 161;
        static final int TRANSACTION_getCrossProfileCallerIdDisabledForUser = 162;
        static final int TRANSACTION_setCrossProfileContactsSearchDisabled = 163;
        static final int TRANSACTION_getCrossProfileContactsSearchDisabled = 164;
        static final int TRANSACTION_getCrossProfileContactsSearchDisabledForUser = 165;
        static final int TRANSACTION_startManagedQuickContact = 166;
        static final int TRANSACTION_setBluetoothContactSharingDisabled = 167;
        static final int TRANSACTION_getBluetoothContactSharingDisabled = 168;
        static final int TRANSACTION_getBluetoothContactSharingDisabledForUser = 169;
        static final int TRANSACTION_setTrustAgentConfiguration = 170;
        static final int TRANSACTION_getTrustAgentConfiguration = 171;
        static final int TRANSACTION_addCrossProfileWidgetProvider = 172;
        static final int TRANSACTION_removeCrossProfileWidgetProvider = 173;
        static final int TRANSACTION_getCrossProfileWidgetProviders = 174;
        static final int TRANSACTION_setAutoTimeRequired = 175;
        static final int TRANSACTION_getAutoTimeRequired = 176;
        static final int TRANSACTION_setForceEphemeralUsers = 177;
        static final int TRANSACTION_getForceEphemeralUsers = 178;
        static final int TRANSACTION_isRemovingAdmin = 179;
        static final int TRANSACTION_setUserIcon = 180;
        static final int TRANSACTION_setSystemUpdatePolicy = 181;
        static final int TRANSACTION_getSystemUpdatePolicy = 182;
        static final int TRANSACTION_clearSystemUpdatePolicyFreezePeriodRecord = 183;
        static final int TRANSACTION_setKeyguardDisabled = 184;
        static final int TRANSACTION_setStatusBarDisabled = 185;
        static final int TRANSACTION_getDoNotAskCredentialsOnBoot = 186;
        static final int TRANSACTION_notifyPendingSystemUpdate = 187;
        static final int TRANSACTION_getPendingSystemUpdate = 188;
        static final int TRANSACTION_setPermissionPolicy = 189;
        static final int TRANSACTION_getPermissionPolicy = 190;
        static final int TRANSACTION_setPermissionGrantState = 191;
        static final int TRANSACTION_getPermissionGrantState = 192;
        static final int TRANSACTION_isProvisioningAllowed = 193;
        static final int TRANSACTION_checkProvisioningPreCondition = 194;
        static final int TRANSACTION_setKeepUninstalledPackages = 195;
        static final int TRANSACTION_getKeepUninstalledPackages = 196;
        static final int TRANSACTION_isManagedProfile = 197;
        static final int TRANSACTION_isSystemOnlyUser = 198;
        static final int TRANSACTION_getWifiMacAddress = 199;
        static final int TRANSACTION_reboot = 200;
        static final int TRANSACTION_setShortSupportMessage = 201;
        static final int TRANSACTION_getShortSupportMessage = 202;
        static final int TRANSACTION_setLongSupportMessage = 203;
        static final int TRANSACTION_getLongSupportMessage = 204;
        static final int TRANSACTION_getShortSupportMessageForUser = 205;
        static final int TRANSACTION_getLongSupportMessageForUser = 206;
        static final int TRANSACTION_isSeparateProfileChallengeAllowed = 207;
        static final int TRANSACTION_setOrganizationColor = 208;
        static final int TRANSACTION_setOrganizationColorForUser = 209;
        static final int TRANSACTION_getOrganizationColor = 210;
        static final int TRANSACTION_getOrganizationColorForUser = 211;
        static final int TRANSACTION_setOrganizationName = 212;
        static final int TRANSACTION_getOrganizationName = 213;
        static final int TRANSACTION_getDeviceOwnerOrganizationName = 214;
        static final int TRANSACTION_getOrganizationNameForUser = 215;
        static final int TRANSACTION_getUserProvisioningState = 216;
        static final int TRANSACTION_setUserProvisioningState = 217;
        static final int TRANSACTION_setAffiliationIds = 218;
        static final int TRANSACTION_getAffiliationIds = 219;
        static final int TRANSACTION_isAffiliatedUser = 220;
        static final int TRANSACTION_setSecurityLoggingEnabled = 221;
        static final int TRANSACTION_isSecurityLoggingEnabled = 222;
        static final int TRANSACTION_retrieveSecurityLogs = 223;
        static final int TRANSACTION_retrievePreRebootSecurityLogs = 224;
        static final int TRANSACTION_forceNetworkLogs = 225;
        static final int TRANSACTION_forceSecurityLogs = 226;
        static final int TRANSACTION_isUninstallInQueue = 227;
        static final int TRANSACTION_uninstallPackageWithActiveAdmins = 228;
        static final int TRANSACTION_isDeviceProvisioned = 229;
        static final int TRANSACTION_isDeviceProvisioningConfigApplied = 230;
        static final int TRANSACTION_setDeviceProvisioningConfigApplied = 231;
        static final int TRANSACTION_forceUpdateUserSetupComplete = 232;
        static final int TRANSACTION_setBackupServiceEnabled = 233;
        static final int TRANSACTION_isBackupServiceEnabled = 234;
        static final int TRANSACTION_setNetworkLoggingEnabled = 235;
        static final int TRANSACTION_isNetworkLoggingEnabled = 236;
        static final int TRANSACTION_retrieveNetworkLogs = 237;
        static final int TRANSACTION_bindDeviceAdminServiceAsUser = 238;
        static final int TRANSACTION_getBindDeviceAdminTargetUsers = 239;
        static final int TRANSACTION_isEphemeralUser = 240;
        static final int TRANSACTION_getLastSecurityLogRetrievalTime = 241;
        static final int TRANSACTION_getLastBugReportRequestTime = 242;
        static final int TRANSACTION_getLastNetworkLogRetrievalTime = 243;
        static final int TRANSACTION_setResetPasswordToken = 244;
        static final int TRANSACTION_clearResetPasswordToken = 245;
        static final int TRANSACTION_isResetPasswordTokenActive = 246;
        static final int TRANSACTION_resetPasswordWithToken = 247;
        static final int TRANSACTION_isCurrentInputMethodSetByOwner = 248;
        static final int TRANSACTION_getOwnerInstalledCaCerts = 249;
        static final int TRANSACTION_clearApplicationUserData = 250;
        static final int TRANSACTION_setLogoutEnabled = 251;
        static final int TRANSACTION_isLogoutEnabled = 252;
        static final int TRANSACTION_getDisallowedSystemApps = 253;
        static final int TRANSACTION_transferOwnership = 254;
        static final int TRANSACTION_getTransferOwnershipBundle = 255;
        static final int TRANSACTION_setStartUserSessionMessage = 256;
        static final int TRANSACTION_setEndUserSessionMessage = 257;
        static final int TRANSACTION_getStartUserSessionMessage = 258;
        static final int TRANSACTION_getEndUserSessionMessage = 259;
        static final int TRANSACTION_setMeteredDataDisabledPackages = 260;
        static final int TRANSACTION_getMeteredDataDisabledPackages = 261;
        static final int TRANSACTION_addOverrideApn = 262;
        static final int TRANSACTION_updateOverrideApn = 263;
        static final int TRANSACTION_removeOverrideApn = 264;
        static final int TRANSACTION_getOverrideApns = 265;
        static final int TRANSACTION_setOverrideApnsEnabled = 266;
        static final int TRANSACTION_isOverrideApnEnabled = 267;
        static final int TRANSACTION_isMeteredDataDisabledPackageForUser = 268;
        static final int TRANSACTION_setGlobalPrivateDns = 269;
        static final int TRANSACTION_getGlobalPrivateDnsMode = 270;
        static final int TRANSACTION_getGlobalPrivateDnsHost = 271;
        static final int TRANSACTION_grantDeviceIdsAccessToProfileOwner = 272;
        static final int TRANSACTION_installUpdateFromFile = 273;
        static final int TRANSACTION_setCrossProfileCalendarPackages = 274;
        static final int TRANSACTION_getCrossProfileCalendarPackages = 275;
        static final int TRANSACTION_isPackageAllowedToAccessCalendarForUser = 276;
        static final int TRANSACTION_getCrossProfileCalendarPackagesForUser = 277;
        static final int TRANSACTION_isManagedKiosk = 278;
        static final int TRANSACTION_isUnattendedManagedKiosk = 279;
        static final int TRANSACTION_startViewCalendarEventInManagedProfile = 280;
        public Stub() { super(); }
        public static android.app.admin.IDevicePolicyManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        private boolean onTransact$installKeyPair$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setKeyPairCertificate$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$setPermissionGrantState$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$bindDeviceAdminServiceAsUser$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
        private boolean onTransact$startViewCalendarEventInManagedProfile$(android.os.Parcel p0, android.os.Parcel p1) throws android.os.RemoteException { return false; }
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
            public void setPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setPasswordExpirationTimeout(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException {}
            public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public boolean isActivePasswordSufficient(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean isProfileActivePasswordSufficientForParent(int p0) throws android.os.RemoteException { return false; }
            public int getPasswordComplexity() throws android.os.RemoteException { return 0; }
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
            public void wipeDataWithReason(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException { return null; }
            public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException {}
            public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return 0; }
            public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void setCameraDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getCameraDisabled(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public void setScreenCaptureDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
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
            public void setActivePasswordState(android.app.admin.PasswordMetrics p0, int p1) throws android.os.RemoteException {}
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
            public android.content.ComponentName getProfileOwner(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getProfileOwnerName(int p0) throws android.os.RemoteException { return null; }
            public void setProfileEnabled(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void setProfileName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public void clearProfileOwner(android.content.ComponentName p0) throws android.os.RemoteException {}
            public boolean hasUserSetupCompleted() throws android.os.RemoteException { return false; }
            public boolean checkDeviceIdentifierAccess(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void setDeviceOwnerLockScreenInfo(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException { return null; }
            public java.lang.String[] setPackagesSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2, boolean p3) throws android.os.RemoteException { return null; }
            public boolean isPackageSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean installCaCert(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException { return false; }
            public void uninstallCaCerts(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public void enforceCanManageCaCerts(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean approveCaCert(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean isCaCertApproved(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean installKeyPair(android.content.ComponentName p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, java.lang.String p5, boolean p6, boolean p7) throws android.os.RemoteException { return false; }
            public boolean removeKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
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
            public boolean isAlwaysOnVpnLockdownEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getAlwaysOnVpnLockdownWhitelist(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void addPersistentPreferredActivity(android.content.ComponentName p0, android.content.IntentFilter p1, android.content.ComponentName p2) throws android.os.RemoteException {}
            public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException {}
            public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException { return null; }
            public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public android.os.Bundle getUserRestrictions(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void addCrossProfileIntentFilter(android.content.ComponentName p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException {}
            public void clearCrossProfileIntentFilters(android.content.ComponentName p0) throws android.os.RemoteException {}
            public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List p1) throws android.os.RemoteException { return false; }
            public java.util.List getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException { return null; }
            public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean setPermittedInputMethods(android.content.ComponentName p0, java.util.List p1) throws android.os.RemoteException { return false; }
            public java.util.List getPermittedInputMethods(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List getPermittedInputMethodsForCurrentUser() throws android.os.RemoteException { return null; }
            public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return false; }
            public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException { return null; }
            public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
            public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
            public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException { return 0; }
            public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public java.lang.String[] getAccountTypesWithManagementDisabled() throws android.os.RemoteException { return null; }
            public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0) throws android.os.RemoteException { return null; }
            public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setLockTaskFeatures(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public int getLockTaskFeatures(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
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
            public boolean isSystemOnlyUser(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
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
            public boolean isAffiliatedUser() throws android.os.RemoteException { return false; }
            public void setSecurityLoggingEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean isSecurityLoggingEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public long forceNetworkLogs() throws android.os.RemoteException { return 0L; }
            public long forceSecurityLogs() throws android.os.RemoteException { return 0L; }
            public boolean isUninstallInQueue(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void uninstallPackageWithActiveAdmins(java.lang.String p0) throws android.os.RemoteException {}
            public boolean isDeviceProvisioned() throws android.os.RemoteException { return false; }
            public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException { return false; }
            public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException {}
            public void forceUpdateUserSetupComplete() throws android.os.RemoteException {}
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
            public void grantDeviceIdsAccessToProfileOwner(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void installUpdateFromFile(android.content.ComponentName p0, android.os.ParcelFileDescriptor p1, android.app.admin.StartInstallingUpdateCallback p2) throws android.os.RemoteException {}
            public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException { return null; }
            public boolean isManagedKiosk() throws android.os.RemoteException { return false; }
            public boolean isUnattendedManagedKiosk() throws android.os.RemoteException { return false; }
            public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
        }
    }

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
        public void setPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getPasswordHistoryLength(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setPasswordExpirationTimeout(android.content.ComponentName p0, long p1, boolean p2) throws android.os.RemoteException {}
        public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public boolean isActivePasswordSufficient(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean isProfileActivePasswordSufficientForParent(int p0) throws android.os.RemoteException { return false; }
        public int getPasswordComplexity() throws android.os.RemoteException { return 0; }
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
        public void wipeDataWithReason(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException { return null; }
        public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException {}
        public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return 0; }
        public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void setCameraDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getCameraDisabled(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public void setScreenCaptureDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
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
        public void setActivePasswordState(android.app.admin.PasswordMetrics p0, int p1) throws android.os.RemoteException {}
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
        public android.content.ComponentName getProfileOwner(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getProfileOwnerName(int p0) throws android.os.RemoteException { return null; }
        public void setProfileEnabled(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void setProfileName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public void clearProfileOwner(android.content.ComponentName p0) throws android.os.RemoteException {}
        public boolean hasUserSetupCompleted() throws android.os.RemoteException { return false; }
        public boolean checkDeviceIdentifierAccess(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void setDeviceOwnerLockScreenInfo(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public java.lang.CharSequence getDeviceOwnerLockScreenInfo() throws android.os.RemoteException { return null; }
        public java.lang.String[] setPackagesSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2, boolean p3) throws android.os.RemoteException { return null; }
        public boolean isPackageSuspended(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean installCaCert(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException { return false; }
        public void uninstallCaCerts(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public void enforceCanManageCaCerts(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean approveCaCert(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean isCaCertApproved(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean installKeyPair(android.content.ComponentName p0, java.lang.String p1, byte[] p2, byte[] p3, byte[] p4, java.lang.String p5, boolean p6, boolean p7) throws android.os.RemoteException { return false; }
        public boolean removeKeyPair(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
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
        public boolean isAlwaysOnVpnLockdownEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getAlwaysOnVpnLockdownWhitelist(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void addPersistentPreferredActivity(android.content.ComponentName p0, android.content.IntentFilter p1, android.content.ComponentName p2) throws android.os.RemoteException {}
        public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException { return null; }
        public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public android.os.Bundle getUserRestrictions(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void addCrossProfileIntentFilter(android.content.ComponentName p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException {}
        public void clearCrossProfileIntentFilters(android.content.ComponentName p0) throws android.os.RemoteException {}
        public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List p1) throws android.os.RemoteException { return false; }
        public java.util.List getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException { return null; }
        public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean setPermittedInputMethods(android.content.ComponentName p0, java.util.List p1) throws android.os.RemoteException { return false; }
        public java.util.List getPermittedInputMethods(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List getPermittedInputMethodsForCurrentUser() throws android.os.RemoteException { return null; }
        public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return false; }
        public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException { return null; }
        public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
        public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
        public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException { return 0; }
        public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public java.lang.String[] getAccountTypesWithManagementDisabled() throws android.os.RemoteException { return null; }
        public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0) throws android.os.RemoteException { return null; }
        public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setLockTaskFeatures(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public int getLockTaskFeatures(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
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
        public boolean isSystemOnlyUser(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
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
        public boolean isAffiliatedUser() throws android.os.RemoteException { return false; }
        public void setSecurityLoggingEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean isSecurityLoggingEnabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public android.content.pm.ParceledListSlice retrieveSecurityLogs(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice retrievePreRebootSecurityLogs(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public long forceNetworkLogs() throws android.os.RemoteException { return 0L; }
        public long forceSecurityLogs() throws android.os.RemoteException { return 0L; }
        public boolean isUninstallInQueue(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void uninstallPackageWithActiveAdmins(java.lang.String p0) throws android.os.RemoteException {}
        public boolean isDeviceProvisioned() throws android.os.RemoteException { return false; }
        public boolean isDeviceProvisioningConfigApplied() throws android.os.RemoteException { return false; }
        public void setDeviceProvisioningConfigApplied() throws android.os.RemoteException {}
        public void forceUpdateUserSetupComplete() throws android.os.RemoteException {}
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
        public void grantDeviceIdsAccessToProfileOwner(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void installUpdateFromFile(android.content.ComponentName p0, android.os.ParcelFileDescriptor p1, android.app.admin.StartInstallingUpdateCallback p2) throws android.os.RemoteException {}
        public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException { return null; }
        public boolean isManagedKiosk() throws android.os.RemoteException { return false; }
        public boolean isUnattendedManagedKiosk() throws android.os.RemoteException { return false; }
        public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}
