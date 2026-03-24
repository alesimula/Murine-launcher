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
    public void setPasswordExpirationTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException;
    public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isActivePasswordSufficient(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean isActivePasswordSufficientForDeviceRequirement() throws android.os.RemoteException;
    public boolean isPasswordSufficientAfterProfileUnification(int p0, int p1) throws android.os.RemoteException;
    public int getPasswordComplexity(boolean p0) throws android.os.RemoteException;
    public void setRequiredPasswordComplexity(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getRequiredPasswordComplexity(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public int getAggregatedPasswordComplexityForUser(int p0, boolean p1) throws android.os.RemoteException;
    public boolean isUsingUnifiedPassword(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getCurrentFailedPasswordAttempts(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public int getProfileWithMinimumFailedPasswordsForWipe(int p0, boolean p1) throws android.os.RemoteException;
    public void setMaximumFailedPasswordsForWipe(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean resetPassword(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setMaximumTimeToLock(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException;
    public long getMaximumTimeToLock(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setRequiredStrongAuthTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException;
    public long getRequiredStrongAuthTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void lockNow(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void wipeDataWithReason(java.lang.String p0, int p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.FactoryResetProtectionPolicy p2) throws android.os.RemoteException;
    public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isFactoryResetProtectionPolicySupported() throws android.os.RemoteException;
    public void sendLostModeLocationUpdate(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException;
    public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException;
    public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException;
    public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setCameraDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public boolean getCameraDisabled(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public void setScreenCaptureDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException;
    public int getNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException;
    public void setNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException;
    public int getNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException;
    public void setKeyguardDisabledFeatures(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean isAdminActive(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> getActiveAdmins(int p0) throws android.os.RemoteException;
    public boolean packageHasActiveAdmins(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1, int p2) throws android.os.RemoteException;
    public void removeActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException;
    public void reportPasswordChanged(android.app.admin.PasswordMetrics p0, int p1) throws android.os.RemoteException;
    public void reportFailedPasswordAttempt(int p0, boolean p1) throws android.os.RemoteException;
    public void reportSuccessfulPasswordAttempt(int p0) throws android.os.RemoteException;
    public void reportFailedBiometricAttempt(int p0) throws android.os.RemoteException;
    public void reportSuccessfulBiometricAttempt(int p0) throws android.os.RemoteException;
    public void reportKeyguardDismissed(int p0) throws android.os.RemoteException;
    public void reportKeyguardSecured(int p0) throws android.os.RemoteException;
    public boolean setDeviceOwner(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public android.content.ComponentName getDeviceOwnerComponent(boolean p0) throws android.os.RemoteException;
    public android.content.ComponentName getDeviceOwnerComponentOnUser(int p0) throws android.os.RemoteException;
    public boolean hasDeviceOwner() throws android.os.RemoteException;
    public java.lang.String getDeviceOwnerName() throws android.os.RemoteException;
    public void clearDeviceOwner(java.lang.String p0) throws android.os.RemoteException;
    public int getDeviceOwnerUserId() throws android.os.RemoteException;
    public boolean setProfileOwner(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public android.content.ComponentName getProfileOwnerAsUser(int p0) throws android.os.RemoteException;
    public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) throws android.os.RemoteException;
    public boolean isSupervisionComponent(android.content.ComponentName p0) throws android.os.RemoteException;
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
    public void addPersistentPreferredActivity(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, android.content.ComponentName p3) throws android.os.RemoteException;
    public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void setDefaultDialerApplication(java.lang.String p0) throws android.os.RemoteException;
    public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, boolean p4) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException;
    public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException;
    public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public void setUserRestrictionGlobally(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.Bundle getUserRestrictions(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public android.os.Bundle getUserRestrictionsGlobally(java.lang.String p0) throws android.os.RemoteException;
    public void addCrossProfileIntentFilter(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, int p3) throws android.os.RemoteException;
    public void clearCrossProfileIntentFilters(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException;
    public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean setPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2, boolean p3) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedInputMethodsAsUser(int p0) throws android.os.RemoteException;
    public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getEnforcingAdminAndUserDetails(int p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.app.admin.EnforcingAdmin> getEnforcingAdminsForRestriction(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException;
    public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException;
    public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException;
    public int logoutUserInternal() throws android.os.RemoteException;
    public int getLogoutUserId() throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException;
    public void acknowledgeNewUserDisclaimer(int p0) throws android.os.RemoteException;
    public boolean isNewUserDisclaimerAcknowledged(int p0) throws android.os.RemoteException;
    public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException;
    public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException;
    public java.lang.String[] getAccountTypesWithManagementDisabled(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void setSecondaryLockscreenEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean isSecondaryLockscreenEnabled(android.os.UserHandle p0) throws android.os.RemoteException;
    public void setPreferentialNetworkServiceConfigs(java.util.List<android.app.admin.PreferentialNetworkServiceConfig> p0) throws android.os.RemoteException;
    public java.util.List<android.app.admin.PreferentialNetworkServiceConfig> getPreferentialNetworkServiceConfigs() throws android.os.RemoteException;
    public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException;
    public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException;
    public void setLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int getLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setConfiguredNetworksLockdownState(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean hasLockdownAdminConfiguredNetworks(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setLocationEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean setTime(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException;
    public boolean setTimeZone(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void setMasterVolumeMuted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean isMasterVolumeMuted(android.content.ComponentName p0) throws android.os.RemoteException;
    public void notifyLockTaskModeChanged(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setUninstallBlocked(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public boolean isUninstallBlocked(java.lang.String p0) throws android.os.RemoteException;
    public void setCrossProfileCallerIdDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getCrossProfileCallerIdDisabledForUser(int p0) throws android.os.RemoteException;
    public void setCrossProfileContactsSearchDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getCrossProfileContactsSearchDisabledForUser(int p0) throws android.os.RemoteException;
    public void startManagedQuickContact(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) throws android.os.RemoteException;
    public void setManagedProfileCallerIdAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException;
    public android.app.admin.PackagePolicy getManagedProfileCallerIdAccessPolicy() throws android.os.RemoteException;
    public boolean hasManagedProfileCallerIdAccess(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setCredentialManagerPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException;
    public android.app.admin.PackagePolicy getCredentialManagerPolicy(int p0) throws android.os.RemoteException;
    public void setManagedProfileContactsAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException;
    public android.app.admin.PackagePolicy getManagedProfileContactsAccessPolicy() throws android.os.RemoteException;
    public boolean hasManagedProfileContactsAccess(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setBluetoothContactSharingDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getBluetoothContactSharingDisabled(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean getBluetoothContactSharingDisabledForUser(int p0) throws android.os.RemoteException;
    public void setTrustAgentConfiguration(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException;
    public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException;
    public boolean addCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean removeCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setAutoTimeRequired(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getAutoTimeRequired() throws android.os.RemoteException;
    public void setAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean getAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean getAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setForceEphemeralUsers(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean getForceEphemeralUsers(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setUserIcon(android.content.ComponentName p0, android.graphics.Bitmap p1) throws android.os.RemoteException;
    public void setSystemUpdatePolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.SystemUpdatePolicy p2) throws android.os.RemoteException;
    public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException;
    public void clearSystemUpdatePolicyFreezePeriodRecord() throws android.os.RemoteException;
    public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException;
    public boolean setStatusBarDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean isStatusBarDisabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException;
    public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo p0) throws android.os.RemoteException;
    public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setPermissionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int getPermissionPolicy(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.RemoteCallback p5) throws android.os.RemoteException;
    public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean isProvisioningAllowed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public int checkProvisioningPrecondition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isManagedProfile(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.String getWifiMacAddress(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void reboot(android.content.ComponentName p0) throws android.os.RemoteException;
    public void setShortSupportMessage(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setLongSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setOrganizationColor(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void setOrganizationColorForUser(int p0, int p1) throws android.os.RemoteException;
    public void clearOrganizationIdForUser(int p0) throws android.os.RemoteException;
    public int getOrganizationColor(android.content.ComponentName p0) throws android.os.RemoteException;
    public int getOrganizationColorForUser(int p0) throws android.os.RemoteException;
    public void setOrganizationName(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException;
    public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException;
    public java.lang.CharSequence getOrganizationNameForUser(int p0) throws android.os.RemoteException;
    public int getUserProvisioningState(int p0) throws android.os.RemoteException;
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
    public void setAuditLogEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean isAuditLogEnabled(java.lang.String p0) throws android.os.RemoteException;
    public void setAuditLogEventsCallback(java.lang.String p0, android.app.admin.IAuditLogEventsCallback p1) throws android.os.RemoteException;
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
    public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName p0, android.app.IApplicationThread p1, android.os.IBinder p2, android.content.Intent p3, android.app.IServiceConnection p4, long p5, int p6) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isEphemeralUser(android.content.ComponentName p0) throws android.os.RemoteException;
    public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException;
    public long getLastBugReportRequestTime() throws android.os.RemoteException;
    public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException;
    public boolean setResetPasswordToken(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException;
    public boolean clearResetPasswordToken(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isResetPasswordTokenActive(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean resetPasswordWithToken(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException;
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
    public void setProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException;
    public void installUpdateFromFile(android.content.ComponentName p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, android.app.admin.StartInstallingUpdateCallback p3) throws android.os.RemoteException;
    public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException;
    public void setCrossProfilePackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllCrossProfilePackages(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getDefaultCrossProfilePackages() throws android.os.RemoteException;
    public boolean isManagedKiosk() throws android.os.RemoteException;
    public boolean isUnattendedManagedKiosk() throws android.os.RemoteException;
    public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException;
    public boolean setKeyGrantForApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException;
    public android.app.admin.ParcelableGranteeMap getKeyPairGrants(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean setKeyGrantToWifiAuth(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public boolean isKeyPairGrantedToWifiAuth(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void setUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void setCommonCriteriaModeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
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
    public void finalizeWorkProfileProvisioning(android.os.UserHandle p0, android.accounts.Account p1) throws android.os.RemoteException;
    public void setDeviceOwnerType(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public int getDeviceOwnerType(android.content.ComponentName p0) throws android.os.RemoteException;
    public void resetDefaultCrossProfileIntentFilters(int p0) throws android.os.RemoteException;
    public boolean canAdminGrantSensorsPermissions() throws android.os.RemoteException;
    public void setUsbDataSignalingEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean isUsbDataSignalingEnabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean canUsbDataSignalingBeDisabled() throws android.os.RemoteException;
    public void setMinimumRequiredWifiSecurityLevel(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getMinimumRequiredWifiSecurityLevel() throws android.os.RemoteException;
    public void setWifiSsidPolicy(java.lang.String p0, android.app.admin.WifiSsidPolicy p1) throws android.os.RemoteException;
    public android.app.admin.WifiSsidPolicy getWifiSsidPolicy(java.lang.String p0) throws android.os.RemoteException;
    public boolean isDevicePotentiallyStolen(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> listForegroundAffiliatedUsers() throws android.os.RemoteException;
    public void setDrawables(java.util.List<android.app.admin.DevicePolicyDrawableResource> p0) throws android.os.RemoteException;
    public void resetDrawables(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public android.app.admin.ParcelableResource getDrawable(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean isDpcDownloaded() throws android.os.RemoteException;
    public void setDpcDownloaded(boolean p0) throws android.os.RemoteException;
    public void setStrings(java.util.List<android.app.admin.DevicePolicyStringResource> p0) throws android.os.RemoteException;
    public void resetStrings(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public android.app.admin.ParcelableResource getString(java.lang.String p0) throws android.os.RemoteException;
    public void resetShouldAllowBypassingDevicePolicyManagementRoleQualificationState() throws android.os.RemoteException;
    public boolean shouldAllowBypassingDevicePolicyManagementRoleQualification() throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getPolicyManagedProfiles(android.os.UserHandle p0) throws android.os.RemoteException;
    public void setApplicationExemptions(java.lang.String p0, java.lang.String p1, int[] p2) throws android.os.RemoteException;
    public int[] getApplicationExemptions(java.lang.String p0) throws android.os.RemoteException;
    public void setMtePolicy(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getMtePolicy(java.lang.String p0) throws android.os.RemoteException;
    public void setManagedSubscriptionsPolicy(android.app.admin.ManagedSubscriptionsPolicy p0) throws android.os.RemoteException;
    public android.app.admin.ManagedSubscriptionsPolicy getManagedSubscriptionsPolicy() throws android.os.RemoteException;
    public android.app.admin.DevicePolicyState getDevicePolicyState() throws android.os.RemoteException;
    public boolean triggerDevicePolicyEngineMigration(boolean p0) throws android.os.RemoteException;
    public boolean isDeviceFinanced(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getFinancedDeviceKioskRoleHolder(java.lang.String p0) throws android.os.RemoteException;
    public void calculateHasIncompatibleAccounts() throws android.os.RemoteException;
    public void setContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public int getContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public int[] getSubscriptionIds(java.lang.String p0) throws android.os.RemoteException;
    public void setMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void forceSetMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getMaxPolicyStorageLimit(java.lang.String p0) throws android.os.RemoteException;
    public int getPolicySizeForAdmin(java.lang.String p0, android.app.admin.EnforcingAdmin p1) throws android.os.RemoteException;
    public int getHeadlessDeviceOwnerMode(java.lang.String p0) throws android.os.RemoteException;

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
        public void setPasswordExpirationTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
        public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public boolean isActivePasswordSufficient(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean isActivePasswordSufficientForDeviceRequirement() throws android.os.RemoteException { return false; }
        public boolean isPasswordSufficientAfterProfileUnification(int p0, int p1) throws android.os.RemoteException { return false; }
        public int getPasswordComplexity(boolean p0) throws android.os.RemoteException { return 0; }
        public void setRequiredPasswordComplexity(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public int getRequiredPasswordComplexity(java.lang.String p0, boolean p1) throws android.os.RemoteException { return 0; }
        public int getAggregatedPasswordComplexityForUser(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public boolean isUsingUnifiedPassword(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public int getCurrentFailedPasswordAttempts(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int getProfileWithMinimumFailedPasswordsForWipe(int p0, boolean p1) throws android.os.RemoteException { return 0; }
        public void setMaximumFailedPasswordsForWipe(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
        public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public boolean resetPassword(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setMaximumTimeToLock(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
        public long getMaximumTimeToLock(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public void setRequiredStrongAuthTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
        public long getRequiredStrongAuthTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
        public void lockNow(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void wipeDataWithReason(java.lang.String p0, int p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.FactoryResetProtectionPolicy p2) throws android.os.RemoteException {}
        public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isFactoryResetProtectionPolicySupported() throws android.os.RemoteException { return false; }
        public void sendLostModeLocationUpdate(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException {}
        public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException { return null; }
        public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException {}
        public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return 0; }
        public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void setCameraDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public boolean getCameraDisabled(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return false; }
        public void setScreenCaptureDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
        public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public void setNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException {}
        public int getNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException { return 0; }
        public void setNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException {}
        public int getNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException { return 0; }
        public void setKeyguardDisabledFeatures(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
        public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
        public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2) throws android.os.RemoteException {}
        public boolean isAdminActive(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.content.ComponentName> getActiveAdmins(int p0) throws android.os.RemoteException { return null; }
        public boolean packageHasActiveAdmins(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1, int p2) throws android.os.RemoteException {}
        public void removeActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void reportPasswordChanged(android.app.admin.PasswordMetrics p0, int p1) throws android.os.RemoteException {}
        public void reportFailedPasswordAttempt(int p0, boolean p1) throws android.os.RemoteException {}
        public void reportSuccessfulPasswordAttempt(int p0) throws android.os.RemoteException {}
        public void reportFailedBiometricAttempt(int p0) throws android.os.RemoteException {}
        public void reportSuccessfulBiometricAttempt(int p0) throws android.os.RemoteException {}
        public void reportKeyguardDismissed(int p0) throws android.os.RemoteException {}
        public void reportKeyguardSecured(int p0) throws android.os.RemoteException {}
        public boolean setDeviceOwner(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public android.content.ComponentName getDeviceOwnerComponent(boolean p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getDeviceOwnerComponentOnUser(int p0) throws android.os.RemoteException { return null; }
        public boolean hasDeviceOwner() throws android.os.RemoteException { return false; }
        public java.lang.String getDeviceOwnerName() throws android.os.RemoteException { return null; }
        public void clearDeviceOwner(java.lang.String p0) throws android.os.RemoteException {}
        public int getDeviceOwnerUserId() throws android.os.RemoteException { return 0; }
        public boolean setProfileOwner(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public android.content.ComponentName getProfileOwnerAsUser(int p0) throws android.os.RemoteException { return null; }
        public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
        public boolean isSupervisionComponent(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
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
        public void addPersistentPreferredActivity(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, android.content.ComponentName p3) throws android.os.RemoteException {}
        public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void setDefaultDialerApplication(java.lang.String p0) throws android.os.RemoteException {}
        public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, boolean p4) throws android.os.RemoteException {}
        public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
        public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException { return null; }
        public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        public void setUserRestrictionGlobally(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.Bundle getUserRestrictions(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
        public android.os.Bundle getUserRestrictionsGlobally(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void addCrossProfileIntentFilter(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, int p3) throws android.os.RemoteException {}
        public void clearCrossProfileIntentFilters(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException { return null; }
        public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
        public boolean setPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2, boolean p3) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPermittedInputMethodsAsUser(int p0) throws android.os.RemoteException { return null; }
        public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return false; }
        public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getEnforcingAdminAndUserDetails(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.admin.EnforcingAdmin> getEnforcingAdminsForRestriction(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException { return false; }
        public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return false; }
        public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException { return null; }
        public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
        public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
        public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
        public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public int logoutUserInternal() throws android.os.RemoteException { return 0; }
        public int getLogoutUserId() throws android.os.RemoteException { return 0; }
        public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public void acknowledgeNewUserDisclaimer(int p0) throws android.os.RemoteException {}
        public boolean isNewUserDisclaimerAcknowledged(int p0) throws android.os.RemoteException { return false; }
        public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException { return 0; }
        public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
        public java.lang.String[] getAccountTypesWithManagementDisabled(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
        public void setSecondaryLockscreenEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean isSecondaryLockscreenEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
        public void setPreferentialNetworkServiceConfigs(java.util.List<android.app.admin.PreferentialNetworkServiceConfig> p0) throws android.os.RemoteException {}
        public java.util.List<android.app.admin.PreferentialNetworkServiceConfig> getPreferentialNetworkServiceConfigs() throws android.os.RemoteException { return null; }
        public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
        public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public int getLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setConfiguredNetworksLockdownState(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public boolean hasLockdownAdminConfiguredNetworks(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void setLocationEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean setTime(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException { return false; }
        public boolean setTimeZone(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void setMasterVolumeMuted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean isMasterVolumeMuted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public void notifyLockTaskModeChanged(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setUninstallBlocked(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public boolean isUninstallBlocked(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setCrossProfileCallerIdDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean getCrossProfileCallerIdDisabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void setCrossProfileContactsSearchDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean getCrossProfileContactsSearchDisabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void startManagedQuickContact(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) throws android.os.RemoteException {}
        public void setManagedProfileCallerIdAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
        public android.app.admin.PackagePolicy getManagedProfileCallerIdAccessPolicy() throws android.os.RemoteException { return null; }
        public boolean hasManagedProfileCallerIdAccess(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setCredentialManagerPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
        public android.app.admin.PackagePolicy getCredentialManagerPolicy(int p0) throws android.os.RemoteException { return null; }
        public void setManagedProfileContactsAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
        public android.app.admin.PackagePolicy getManagedProfileContactsAccessPolicy() throws android.os.RemoteException { return null; }
        public boolean hasManagedProfileContactsAccess(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setBluetoothContactSharingDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getBluetoothContactSharingDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean getBluetoothContactSharingDisabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void setTrustAgentConfiguration(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException {}
        public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
        public boolean addCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public boolean removeCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setAutoTimeRequired(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getAutoTimeRequired() throws android.os.RemoteException { return false; }
        public void setAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public boolean getAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public boolean getAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setForceEphemeralUsers(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
        public boolean getForceEphemeralUsers(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
        public void setUserIcon(android.content.ComponentName p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
        public void setSystemUpdatePolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.SystemUpdatePolicy p2) throws android.os.RemoteException {}
        public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException { return null; }
        public void clearSystemUpdatePolicyFreezePeriodRecord() throws android.os.RemoteException {}
        public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setStatusBarDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean isStatusBarDisabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException { return false; }
        public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo p0) throws android.os.RemoteException {}
        public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setPermissionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public int getPermissionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public void setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
        public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public boolean isProvisioningAllowed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public int checkProvisioningPrecondition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void setKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isManagedProfile(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public java.lang.String getWifiMacAddress(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void reboot(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void setShortSupportMessage(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setLongSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
        public void setOrganizationColor(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void setOrganizationColorForUser(int p0, int p1) throws android.os.RemoteException {}
        public void clearOrganizationIdForUser(int p0) throws android.os.RemoteException {}
        public int getOrganizationColor(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public int getOrganizationColorForUser(int p0) throws android.os.RemoteException { return 0; }
        public void setOrganizationName(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
        public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException { return null; }
        public java.lang.CharSequence getOrganizationNameForUser(int p0) throws android.os.RemoteException { return null; }
        public int getUserProvisioningState(int p0) throws android.os.RemoteException { return 0; }
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
        public void setAuditLogEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public boolean isAuditLogEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setAuditLogEventsCallback(java.lang.String p0, android.app.admin.IAuditLogEventsCallback p1) throws android.os.RemoteException {}
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
        public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName p0, android.app.IApplicationThread p1, android.os.IBinder p2, android.content.Intent p3, android.app.IServiceConnection p4, long p5, int p6) throws android.os.RemoteException { return false; }
        public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isEphemeralUser(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
        public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException { return 0L; }
        public long getLastBugReportRequestTime() throws android.os.RemoteException { return 0L; }
        public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException { return 0L; }
        public boolean setResetPasswordToken(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException { return false; }
        public boolean clearResetPasswordToken(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isResetPasswordTokenActive(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean resetPasswordWithToken(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException { return false; }
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
        public void setProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void installUpdateFromFile(android.content.ComponentName p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, android.app.admin.StartInstallingUpdateCallback p3) throws android.os.RemoteException {}
        public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException { return null; }
        public void setCrossProfilePackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAllCrossProfilePackages(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getDefaultCrossProfilePackages() throws android.os.RemoteException { return null; }
        public boolean isManagedKiosk() throws android.os.RemoteException { return false; }
        public boolean isUnattendedManagedKiosk() throws android.os.RemoteException { return false; }
        public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
        public boolean setKeyGrantForApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
        public android.app.admin.ParcelableGranteeMap getKeyPairGrants(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean setKeyGrantToWifiAuth(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean isKeyPairGrantedToWifiAuth(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void setUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setCommonCriteriaModeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
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
        public void finalizeWorkProfileProvisioning(android.os.UserHandle p0, android.accounts.Account p1) throws android.os.RemoteException {}
        public void setDeviceOwnerType(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public int getDeviceOwnerType(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
        public void resetDefaultCrossProfileIntentFilters(int p0) throws android.os.RemoteException {}
        public boolean canAdminGrantSensorsPermissions() throws android.os.RemoteException { return false; }
        public void setUsbDataSignalingEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public boolean isUsbDataSignalingEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean canUsbDataSignalingBeDisabled() throws android.os.RemoteException { return false; }
        public void setMinimumRequiredWifiSecurityLevel(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public int getMinimumRequiredWifiSecurityLevel() throws android.os.RemoteException { return 0; }
        public void setWifiSsidPolicy(java.lang.String p0, android.app.admin.WifiSsidPolicy p1) throws android.os.RemoteException {}
        public android.app.admin.WifiSsidPolicy getWifiSsidPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isDevicePotentiallyStolen(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.os.UserHandle> listForegroundAffiliatedUsers() throws android.os.RemoteException { return null; }
        public void setDrawables(java.util.List<android.app.admin.DevicePolicyDrawableResource> p0) throws android.os.RemoteException {}
        public void resetDrawables(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public android.app.admin.ParcelableResource getDrawable(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public boolean isDpcDownloaded() throws android.os.RemoteException { return false; }
        public void setDpcDownloaded(boolean p0) throws android.os.RemoteException {}
        public void setStrings(java.util.List<android.app.admin.DevicePolicyStringResource> p0) throws android.os.RemoteException {}
        public void resetStrings(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public android.app.admin.ParcelableResource getString(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void resetShouldAllowBypassingDevicePolicyManagementRoleQualificationState() throws android.os.RemoteException {}
        public boolean shouldAllowBypassingDevicePolicyManagementRoleQualification() throws android.os.RemoteException { return false; }
        public java.util.List<android.os.UserHandle> getPolicyManagedProfiles(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
        public void setApplicationExemptions(java.lang.String p0, java.lang.String p1, int[] p2) throws android.os.RemoteException {}
        public int[] getApplicationExemptions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setMtePolicy(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getMtePolicy(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public void setManagedSubscriptionsPolicy(android.app.admin.ManagedSubscriptionsPolicy p0) throws android.os.RemoteException {}
        public android.app.admin.ManagedSubscriptionsPolicy getManagedSubscriptionsPolicy() throws android.os.RemoteException { return null; }
        public android.app.admin.DevicePolicyState getDevicePolicyState() throws android.os.RemoteException { return null; }
        public boolean triggerDevicePolicyEngineMigration(boolean p0) throws android.os.RemoteException { return false; }
        public boolean isDeviceFinanced(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.lang.String getFinancedDeviceKioskRoleHolder(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void calculateHasIncompatibleAccounts() throws android.os.RemoteException {}
        public void setContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public int getContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int[] getSubscriptionIds(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void forceSetMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public int getMaxPolicyStorageLimit(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getPolicySizeForAdmin(java.lang.String p0, android.app.admin.EnforcingAdmin p1) throws android.os.RemoteException { return 0; }
        public int getHeadlessDeviceOwnerMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
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
        static final int TRANSACTION_sendLostModeLocationUpdate = 45;
        static final int TRANSACTION_setGlobalProxy = 46;
        static final int TRANSACTION_getGlobalProxyAdmin = 47;
        static final int TRANSACTION_setRecommendedGlobalProxy = 48;
        static final int TRANSACTION_setStorageEncryption = 49;
        static final int TRANSACTION_getStorageEncryption = 50;
        static final int TRANSACTION_getStorageEncryptionStatus = 51;
        static final int TRANSACTION_requestBugreport = 52;
        static final int TRANSACTION_setCameraDisabled = 53;
        static final int TRANSACTION_getCameraDisabled = 54;
        static final int TRANSACTION_setScreenCaptureDisabled = 55;
        static final int TRANSACTION_getScreenCaptureDisabled = 56;
        static final int TRANSACTION_setNearbyNotificationStreamingPolicy = 57;
        static final int TRANSACTION_getNearbyNotificationStreamingPolicy = 58;
        static final int TRANSACTION_setNearbyAppStreamingPolicy = 59;
        static final int TRANSACTION_getNearbyAppStreamingPolicy = 60;
        static final int TRANSACTION_setKeyguardDisabledFeatures = 61;
        static final int TRANSACTION_getKeyguardDisabledFeatures = 62;
        static final int TRANSACTION_setActiveAdmin = 63;
        static final int TRANSACTION_isAdminActive = 64;
        static final int TRANSACTION_getActiveAdmins = 65;
        static final int TRANSACTION_packageHasActiveAdmins = 66;
        static final int TRANSACTION_getRemoveWarning = 67;
        static final int TRANSACTION_removeActiveAdmin = 68;
        static final int TRANSACTION_forceRemoveActiveAdmin = 69;
        static final int TRANSACTION_hasGrantedPolicy = 70;
        static final int TRANSACTION_reportPasswordChanged = 71;
        static final int TRANSACTION_reportFailedPasswordAttempt = 72;
        static final int TRANSACTION_reportSuccessfulPasswordAttempt = 73;
        static final int TRANSACTION_reportFailedBiometricAttempt = 74;
        static final int TRANSACTION_reportSuccessfulBiometricAttempt = 75;
        static final int TRANSACTION_reportKeyguardDismissed = 76;
        static final int TRANSACTION_reportKeyguardSecured = 77;
        static final int TRANSACTION_setDeviceOwner = 78;
        static final int TRANSACTION_getDeviceOwnerComponent = 79;
        static final int TRANSACTION_getDeviceOwnerComponentOnUser = 80;
        static final int TRANSACTION_hasDeviceOwner = 81;
        static final int TRANSACTION_getDeviceOwnerName = 82;
        static final int TRANSACTION_clearDeviceOwner = 83;
        static final int TRANSACTION_getDeviceOwnerUserId = 84;
        static final int TRANSACTION_setProfileOwner = 85;
        static final int TRANSACTION_getProfileOwnerAsUser = 86;
        static final int TRANSACTION_getProfileOwnerOrDeviceOwnerSupervisionComponent = 87;
        static final int TRANSACTION_isSupervisionComponent = 88;
        static final int TRANSACTION_getProfileOwnerName = 89;
        static final int TRANSACTION_setProfileEnabled = 90;
        static final int TRANSACTION_setProfileName = 91;
        static final int TRANSACTION_clearProfileOwner = 92;
        static final int TRANSACTION_hasUserSetupCompleted = 93;
        static final int TRANSACTION_isOrganizationOwnedDeviceWithManagedProfile = 94;
        static final int TRANSACTION_checkDeviceIdentifierAccess = 95;
        static final int TRANSACTION_setDeviceOwnerLockScreenInfo = 96;
        static final int TRANSACTION_getDeviceOwnerLockScreenInfo = 97;
        static final int TRANSACTION_setPackagesSuspended = 98;
        static final int TRANSACTION_isPackageSuspended = 99;
        static final int TRANSACTION_listPolicyExemptApps = 100;
        static final int TRANSACTION_installCaCert = 101;
        static final int TRANSACTION_uninstallCaCerts = 102;
        static final int TRANSACTION_enforceCanManageCaCerts = 103;
        static final int TRANSACTION_approveCaCert = 104;
        static final int TRANSACTION_isCaCertApproved = 105;
        static final int TRANSACTION_installKeyPair = 106;
        static final int TRANSACTION_removeKeyPair = 107;
        static final int TRANSACTION_hasKeyPair = 108;
        static final int TRANSACTION_generateKeyPair = 109;
        static final int TRANSACTION_setKeyPairCertificate = 110;
        static final int TRANSACTION_choosePrivateKeyAlias = 111;
        static final int TRANSACTION_setDelegatedScopes = 112;
        static final int TRANSACTION_getDelegatedScopes = 113;
        static final int TRANSACTION_getDelegatePackages = 114;
        static final int TRANSACTION_setCertInstallerPackage = 115;
        static final int TRANSACTION_getCertInstallerPackage = 116;
        static final int TRANSACTION_setAlwaysOnVpnPackage = 117;
        static final int TRANSACTION_getAlwaysOnVpnPackage = 118;
        static final int TRANSACTION_getAlwaysOnVpnPackageForUser = 119;
        static final int TRANSACTION_isAlwaysOnVpnLockdownEnabled = 120;
        static final int TRANSACTION_isAlwaysOnVpnLockdownEnabledForUser = 121;
        static final int TRANSACTION_getAlwaysOnVpnLockdownAllowlist = 122;
        static final int TRANSACTION_addPersistentPreferredActivity = 123;
        static final int TRANSACTION_clearPackagePersistentPreferredActivities = 124;
        static final int TRANSACTION_setDefaultSmsApplication = 125;
        static final int TRANSACTION_setDefaultDialerApplication = 126;
        static final int TRANSACTION_setApplicationRestrictions = 127;
        static final int TRANSACTION_getApplicationRestrictions = 128;
        static final int TRANSACTION_setApplicationRestrictionsManagingPackage = 129;
        static final int TRANSACTION_getApplicationRestrictionsManagingPackage = 130;
        static final int TRANSACTION_isCallerApplicationRestrictionsManagingPackage = 131;
        static final int TRANSACTION_setRestrictionsProvider = 132;
        static final int TRANSACTION_getRestrictionsProvider = 133;
        static final int TRANSACTION_setUserRestriction = 134;
        static final int TRANSACTION_setUserRestrictionGlobally = 135;
        static final int TRANSACTION_getUserRestrictions = 136;
        static final int TRANSACTION_getUserRestrictionsGlobally = 137;
        static final int TRANSACTION_addCrossProfileIntentFilter = 138;
        static final int TRANSACTION_clearCrossProfileIntentFilters = 139;
        static final int TRANSACTION_setPermittedAccessibilityServices = 140;
        static final int TRANSACTION_getPermittedAccessibilityServices = 141;
        static final int TRANSACTION_getPermittedAccessibilityServicesForUser = 142;
        static final int TRANSACTION_isAccessibilityServicePermittedByAdmin = 143;
        static final int TRANSACTION_setPermittedInputMethods = 144;
        static final int TRANSACTION_getPermittedInputMethods = 145;
        static final int TRANSACTION_getPermittedInputMethodsAsUser = 146;
        static final int TRANSACTION_isInputMethodPermittedByAdmin = 147;
        static final int TRANSACTION_setPermittedCrossProfileNotificationListeners = 148;
        static final int TRANSACTION_getPermittedCrossProfileNotificationListeners = 149;
        static final int TRANSACTION_isNotificationListenerServicePermitted = 150;
        static final int TRANSACTION_createAdminSupportIntent = 151;
        static final int TRANSACTION_getEnforcingAdminAndUserDetails = 152;
        static final int TRANSACTION_getEnforcingAdminsForRestriction = 153;
        static final int TRANSACTION_setApplicationHidden = 154;
        static final int TRANSACTION_isApplicationHidden = 155;
        static final int TRANSACTION_createAndManageUser = 156;
        static final int TRANSACTION_removeUser = 157;
        static final int TRANSACTION_switchUser = 158;
        static final int TRANSACTION_startUserInBackground = 159;
        static final int TRANSACTION_stopUser = 160;
        static final int TRANSACTION_logoutUser = 161;
        static final int TRANSACTION_logoutUserInternal = 162;
        static final int TRANSACTION_getLogoutUserId = 163;
        static final int TRANSACTION_getSecondaryUsers = 164;
        static final int TRANSACTION_acknowledgeNewUserDisclaimer = 165;
        static final int TRANSACTION_isNewUserDisclaimerAcknowledged = 166;
        static final int TRANSACTION_enableSystemApp = 167;
        static final int TRANSACTION_enableSystemAppWithIntent = 168;
        static final int TRANSACTION_installExistingPackage = 169;
        static final int TRANSACTION_setAccountManagementDisabled = 170;
        static final int TRANSACTION_getAccountTypesWithManagementDisabled = 171;
        static final int TRANSACTION_getAccountTypesWithManagementDisabledAsUser = 172;
        static final int TRANSACTION_setSecondaryLockscreenEnabled = 173;
        static final int TRANSACTION_isSecondaryLockscreenEnabled = 174;
        static final int TRANSACTION_setPreferentialNetworkServiceConfigs = 175;
        static final int TRANSACTION_getPreferentialNetworkServiceConfigs = 176;
        static final int TRANSACTION_setLockTaskPackages = 177;
        static final int TRANSACTION_getLockTaskPackages = 178;
        static final int TRANSACTION_isLockTaskPermitted = 179;
        static final int TRANSACTION_setLockTaskFeatures = 180;
        static final int TRANSACTION_getLockTaskFeatures = 181;
        static final int TRANSACTION_setGlobalSetting = 182;
        static final int TRANSACTION_setSystemSetting = 183;
        static final int TRANSACTION_setSecureSetting = 184;
        static final int TRANSACTION_setConfiguredNetworksLockdownState = 185;
        static final int TRANSACTION_hasLockdownAdminConfiguredNetworks = 186;
        static final int TRANSACTION_setLocationEnabled = 187;
        static final int TRANSACTION_setTime = 188;
        static final int TRANSACTION_setTimeZone = 189;
        static final int TRANSACTION_setMasterVolumeMuted = 190;
        static final int TRANSACTION_isMasterVolumeMuted = 191;
        static final int TRANSACTION_notifyLockTaskModeChanged = 192;
        static final int TRANSACTION_setUninstallBlocked = 193;
        static final int TRANSACTION_isUninstallBlocked = 194;
        static final int TRANSACTION_setCrossProfileCallerIdDisabled = 195;
        static final int TRANSACTION_getCrossProfileCallerIdDisabled = 196;
        static final int TRANSACTION_getCrossProfileCallerIdDisabledForUser = 197;
        static final int TRANSACTION_setCrossProfileContactsSearchDisabled = 198;
        static final int TRANSACTION_getCrossProfileContactsSearchDisabled = 199;
        static final int TRANSACTION_getCrossProfileContactsSearchDisabledForUser = 200;
        static final int TRANSACTION_startManagedQuickContact = 201;
        static final int TRANSACTION_setManagedProfileCallerIdAccessPolicy = 202;
        static final int TRANSACTION_getManagedProfileCallerIdAccessPolicy = 203;
        static final int TRANSACTION_hasManagedProfileCallerIdAccess = 204;
        static final int TRANSACTION_setCredentialManagerPolicy = 205;
        static final int TRANSACTION_getCredentialManagerPolicy = 206;
        static final int TRANSACTION_setManagedProfileContactsAccessPolicy = 207;
        static final int TRANSACTION_getManagedProfileContactsAccessPolicy = 208;
        static final int TRANSACTION_hasManagedProfileContactsAccess = 209;
        static final int TRANSACTION_setBluetoothContactSharingDisabled = 210;
        static final int TRANSACTION_getBluetoothContactSharingDisabled = 211;
        static final int TRANSACTION_getBluetoothContactSharingDisabledForUser = 212;
        static final int TRANSACTION_setTrustAgentConfiguration = 213;
        static final int TRANSACTION_getTrustAgentConfiguration = 214;
        static final int TRANSACTION_addCrossProfileWidgetProvider = 215;
        static final int TRANSACTION_removeCrossProfileWidgetProvider = 216;
        static final int TRANSACTION_getCrossProfileWidgetProviders = 217;
        static final int TRANSACTION_setAutoTimeRequired = 218;
        static final int TRANSACTION_getAutoTimeRequired = 219;
        static final int TRANSACTION_setAutoTimeEnabled = 220;
        static final int TRANSACTION_getAutoTimeEnabled = 221;
        static final int TRANSACTION_setAutoTimeZoneEnabled = 222;
        static final int TRANSACTION_getAutoTimeZoneEnabled = 223;
        static final int TRANSACTION_setForceEphemeralUsers = 224;
        static final int TRANSACTION_getForceEphemeralUsers = 225;
        static final int TRANSACTION_isRemovingAdmin = 226;
        static final int TRANSACTION_setUserIcon = 227;
        static final int TRANSACTION_setSystemUpdatePolicy = 228;
        static final int TRANSACTION_getSystemUpdatePolicy = 229;
        static final int TRANSACTION_clearSystemUpdatePolicyFreezePeriodRecord = 230;
        static final int TRANSACTION_setKeyguardDisabled = 231;
        static final int TRANSACTION_setStatusBarDisabled = 232;
        static final int TRANSACTION_isStatusBarDisabled = 233;
        static final int TRANSACTION_getDoNotAskCredentialsOnBoot = 234;
        static final int TRANSACTION_notifyPendingSystemUpdate = 235;
        static final int TRANSACTION_getPendingSystemUpdate = 236;
        static final int TRANSACTION_setPermissionPolicy = 237;
        static final int TRANSACTION_getPermissionPolicy = 238;
        static final int TRANSACTION_setPermissionGrantState = 239;
        static final int TRANSACTION_getPermissionGrantState = 240;
        static final int TRANSACTION_isProvisioningAllowed = 241;
        static final int TRANSACTION_checkProvisioningPrecondition = 242;
        static final int TRANSACTION_setKeepUninstalledPackages = 243;
        static final int TRANSACTION_getKeepUninstalledPackages = 244;
        static final int TRANSACTION_isManagedProfile = 245;
        static final int TRANSACTION_getWifiMacAddress = 246;
        static final int TRANSACTION_reboot = 247;
        static final int TRANSACTION_setShortSupportMessage = 248;
        static final int TRANSACTION_getShortSupportMessage = 249;
        static final int TRANSACTION_setLongSupportMessage = 250;
        static final int TRANSACTION_getLongSupportMessage = 251;
        static final int TRANSACTION_getShortSupportMessageForUser = 252;
        static final int TRANSACTION_getLongSupportMessageForUser = 253;
        static final int TRANSACTION_setOrganizationColor = 254;
        static final int TRANSACTION_setOrganizationColorForUser = 255;
        static final int TRANSACTION_clearOrganizationIdForUser = 256;
        static final int TRANSACTION_getOrganizationColor = 257;
        static final int TRANSACTION_getOrganizationColorForUser = 258;
        static final int TRANSACTION_setOrganizationName = 259;
        static final int TRANSACTION_getOrganizationName = 260;
        static final int TRANSACTION_getDeviceOwnerOrganizationName = 261;
        static final int TRANSACTION_getOrganizationNameForUser = 262;
        static final int TRANSACTION_getUserProvisioningState = 263;
        static final int TRANSACTION_setUserProvisioningState = 264;
        static final int TRANSACTION_setAffiliationIds = 265;
        static final int TRANSACTION_getAffiliationIds = 266;
        static final int TRANSACTION_isCallingUserAffiliated = 267;
        static final int TRANSACTION_isAffiliatedUser = 268;
        static final int TRANSACTION_setSecurityLoggingEnabled = 269;
        static final int TRANSACTION_isSecurityLoggingEnabled = 270;
        static final int TRANSACTION_retrieveSecurityLogs = 271;
        static final int TRANSACTION_retrievePreRebootSecurityLogs = 272;
        static final int TRANSACTION_forceNetworkLogs = 273;
        static final int TRANSACTION_forceSecurityLogs = 274;
        static final int TRANSACTION_setAuditLogEnabled = 275;
        static final int TRANSACTION_isAuditLogEnabled = 276;
        static final int TRANSACTION_setAuditLogEventsCallback = 277;
        static final int TRANSACTION_isUninstallInQueue = 278;
        static final int TRANSACTION_uninstallPackageWithActiveAdmins = 279;
        static final int TRANSACTION_isDeviceProvisioned = 280;
        static final int TRANSACTION_isDeviceProvisioningConfigApplied = 281;
        static final int TRANSACTION_setDeviceProvisioningConfigApplied = 282;
        static final int TRANSACTION_forceUpdateUserSetupComplete = 283;
        static final int TRANSACTION_setBackupServiceEnabled = 284;
        static final int TRANSACTION_isBackupServiceEnabled = 285;
        static final int TRANSACTION_setNetworkLoggingEnabled = 286;
        static final int TRANSACTION_isNetworkLoggingEnabled = 287;
        static final int TRANSACTION_retrieveNetworkLogs = 288;
        static final int TRANSACTION_bindDeviceAdminServiceAsUser = 289;
        static final int TRANSACTION_getBindDeviceAdminTargetUsers = 290;
        static final int TRANSACTION_isEphemeralUser = 291;
        static final int TRANSACTION_getLastSecurityLogRetrievalTime = 292;
        static final int TRANSACTION_getLastBugReportRequestTime = 293;
        static final int TRANSACTION_getLastNetworkLogRetrievalTime = 294;
        static final int TRANSACTION_setResetPasswordToken = 295;
        static final int TRANSACTION_clearResetPasswordToken = 296;
        static final int TRANSACTION_isResetPasswordTokenActive = 297;
        static final int TRANSACTION_resetPasswordWithToken = 298;
        static final int TRANSACTION_isCurrentInputMethodSetByOwner = 299;
        static final int TRANSACTION_getOwnerInstalledCaCerts = 300;
        static final int TRANSACTION_clearApplicationUserData = 301;
        static final int TRANSACTION_setLogoutEnabled = 302;
        static final int TRANSACTION_isLogoutEnabled = 303;
        static final int TRANSACTION_getDisallowedSystemApps = 304;
        static final int TRANSACTION_transferOwnership = 305;
        static final int TRANSACTION_getTransferOwnershipBundle = 306;
        static final int TRANSACTION_setStartUserSessionMessage = 307;
        static final int TRANSACTION_setEndUserSessionMessage = 308;
        static final int TRANSACTION_getStartUserSessionMessage = 309;
        static final int TRANSACTION_getEndUserSessionMessage = 310;
        static final int TRANSACTION_setMeteredDataDisabledPackages = 311;
        static final int TRANSACTION_getMeteredDataDisabledPackages = 312;
        static final int TRANSACTION_addOverrideApn = 313;
        static final int TRANSACTION_updateOverrideApn = 314;
        static final int TRANSACTION_removeOverrideApn = 315;
        static final int TRANSACTION_getOverrideApns = 316;
        static final int TRANSACTION_setOverrideApnsEnabled = 317;
        static final int TRANSACTION_isOverrideApnEnabled = 318;
        static final int TRANSACTION_isMeteredDataDisabledPackageForUser = 319;
        static final int TRANSACTION_setGlobalPrivateDns = 320;
        static final int TRANSACTION_getGlobalPrivateDnsMode = 321;
        static final int TRANSACTION_getGlobalPrivateDnsHost = 322;
        static final int TRANSACTION_setProfileOwnerOnOrganizationOwnedDevice = 323;
        static final int TRANSACTION_installUpdateFromFile = 324;
        static final int TRANSACTION_setCrossProfileCalendarPackages = 325;
        static final int TRANSACTION_getCrossProfileCalendarPackages = 326;
        static final int TRANSACTION_isPackageAllowedToAccessCalendarForUser = 327;
        static final int TRANSACTION_getCrossProfileCalendarPackagesForUser = 328;
        static final int TRANSACTION_setCrossProfilePackages = 329;
        static final int TRANSACTION_getCrossProfilePackages = 330;
        static final int TRANSACTION_getAllCrossProfilePackages = 331;
        static final int TRANSACTION_getDefaultCrossProfilePackages = 332;
        static final int TRANSACTION_isManagedKiosk = 333;
        static final int TRANSACTION_isUnattendedManagedKiosk = 334;
        static final int TRANSACTION_startViewCalendarEventInManagedProfile = 335;
        static final int TRANSACTION_setKeyGrantForApp = 336;
        static final int TRANSACTION_getKeyPairGrants = 337;
        static final int TRANSACTION_setKeyGrantToWifiAuth = 338;
        static final int TRANSACTION_isKeyPairGrantedToWifiAuth = 339;
        static final int TRANSACTION_setUserControlDisabledPackages = 340;
        static final int TRANSACTION_getUserControlDisabledPackages = 341;
        static final int TRANSACTION_setCommonCriteriaModeEnabled = 342;
        static final int TRANSACTION_isCommonCriteriaModeEnabled = 343;
        static final int TRANSACTION_getPersonalAppsSuspendedReasons = 344;
        static final int TRANSACTION_setPersonalAppsSuspended = 345;
        static final int TRANSACTION_getManagedProfileMaximumTimeOff = 346;
        static final int TRANSACTION_setManagedProfileMaximumTimeOff = 347;
        static final int TRANSACTION_acknowledgeDeviceCompliant = 348;
        static final int TRANSACTION_isComplianceAcknowledgementRequired = 349;
        static final int TRANSACTION_canProfileOwnerResetPasswordWhenLocked = 350;
        static final int TRANSACTION_setNextOperationSafety = 351;
        static final int TRANSACTION_isSafeOperation = 352;
        static final int TRANSACTION_getEnrollmentSpecificId = 353;
        static final int TRANSACTION_setOrganizationIdForUser = 354;
        static final int TRANSACTION_createAndProvisionManagedProfile = 355;
        static final int TRANSACTION_provisionFullyManagedDevice = 356;
        static final int TRANSACTION_finalizeWorkProfileProvisioning = 357;
        static final int TRANSACTION_setDeviceOwnerType = 358;
        static final int TRANSACTION_getDeviceOwnerType = 359;
        static final int TRANSACTION_resetDefaultCrossProfileIntentFilters = 360;
        static final int TRANSACTION_canAdminGrantSensorsPermissions = 361;
        static final int TRANSACTION_setUsbDataSignalingEnabled = 362;
        static final int TRANSACTION_isUsbDataSignalingEnabled = 363;
        static final int TRANSACTION_canUsbDataSignalingBeDisabled = 364;
        static final int TRANSACTION_setMinimumRequiredWifiSecurityLevel = 365;
        static final int TRANSACTION_getMinimumRequiredWifiSecurityLevel = 366;
        static final int TRANSACTION_setWifiSsidPolicy = 367;
        static final int TRANSACTION_getWifiSsidPolicy = 368;
        static final int TRANSACTION_isDevicePotentiallyStolen = 369;
        static final int TRANSACTION_listForegroundAffiliatedUsers = 370;
        static final int TRANSACTION_setDrawables = 371;
        static final int TRANSACTION_resetDrawables = 372;
        static final int TRANSACTION_getDrawable = 373;
        static final int TRANSACTION_isDpcDownloaded = 374;
        static final int TRANSACTION_setDpcDownloaded = 375;
        static final int TRANSACTION_setStrings = 376;
        static final int TRANSACTION_resetStrings = 377;
        static final int TRANSACTION_getString = 378;
        static final int TRANSACTION_resetShouldAllowBypassingDevicePolicyManagementRoleQualificationState = 379;
        static final int TRANSACTION_shouldAllowBypassingDevicePolicyManagementRoleQualification = 380;
        static final int TRANSACTION_getPolicyManagedProfiles = 381;
        static final int TRANSACTION_setApplicationExemptions = 382;
        static final int TRANSACTION_getApplicationExemptions = 383;
        static final int TRANSACTION_setMtePolicy = 384;
        static final int TRANSACTION_getMtePolicy = 385;
        static final int TRANSACTION_setManagedSubscriptionsPolicy = 386;
        static final int TRANSACTION_getManagedSubscriptionsPolicy = 387;
        static final int TRANSACTION_getDevicePolicyState = 388;
        static final int TRANSACTION_triggerDevicePolicyEngineMigration = 389;
        static final int TRANSACTION_isDeviceFinanced = 390;
        static final int TRANSACTION_getFinancedDeviceKioskRoleHolder = 391;
        static final int TRANSACTION_calculateHasIncompatibleAccounts = 392;
        static final int TRANSACTION_setContentProtectionPolicy = 393;
        static final int TRANSACTION_getContentProtectionPolicy = 394;
        static final int TRANSACTION_getSubscriptionIds = 395;
        static final int TRANSACTION_setMaxPolicyStorageLimit = 396;
        static final int TRANSACTION_forceSetMaxPolicyStorageLimit = 397;
        static final int TRANSACTION_getMaxPolicyStorageLimit = 398;
        static final int TRANSACTION_getPolicySizeForAdmin = 399;
        static final int TRANSACTION_getHeadlessDeviceOwnerMode = 400;
        public Stub() { super(); }
        public static android.app.admin.IDevicePolicyManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.admin.IDevicePolicyManager {
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
            public void setPasswordExpirationTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
            public long getPasswordExpirationTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public long getPasswordExpiration(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public boolean isActivePasswordSufficient(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean isActivePasswordSufficientForDeviceRequirement() throws android.os.RemoteException { return false; }
            public boolean isPasswordSufficientAfterProfileUnification(int p0, int p1) throws android.os.RemoteException { return false; }
            public int getPasswordComplexity(boolean p0) throws android.os.RemoteException { return 0; }
            public void setRequiredPasswordComplexity(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public int getRequiredPasswordComplexity(java.lang.String p0, boolean p1) throws android.os.RemoteException { return 0; }
            public int getAggregatedPasswordComplexityForUser(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public boolean isUsingUnifiedPassword(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public int getCurrentFailedPasswordAttempts(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int getProfileWithMinimumFailedPasswordsForWipe(int p0, boolean p1) throws android.os.RemoteException { return 0; }
            public void setMaximumFailedPasswordsForWipe(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
            public int getMaximumFailedPasswordsForWipe(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public boolean resetPassword(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setMaximumTimeToLock(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
            public long getMaximumTimeToLock(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public void setRequiredStrongAuthTimeout(android.content.ComponentName p0, java.lang.String p1, long p2, boolean p3) throws android.os.RemoteException {}
            public long getRequiredStrongAuthTimeout(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0L; }
            public void lockNow(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void wipeDataWithReason(java.lang.String p0, int p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
            public void setFactoryResetProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.FactoryResetProtectionPolicy p2) throws android.os.RemoteException {}
            public android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isFactoryResetProtectionPolicySupported() throws android.os.RemoteException { return false; }
            public void sendLostModeLocationUpdate(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException {}
            public android.content.ComponentName setGlobalProxy(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getGlobalProxyAdmin(int p0) throws android.os.RemoteException { return null; }
            public void setRecommendedGlobalProxy(android.content.ComponentName p0, android.net.ProxyInfo p1) throws android.os.RemoteException {}
            public int setStorageEncryption(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return 0; }
            public boolean getStorageEncryption(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public int getStorageEncryptionStatus(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public boolean requestBugreport(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void setCameraDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public boolean getCameraDisabled(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return false; }
            public void setScreenCaptureDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2, boolean p3) throws android.os.RemoteException {}
            public boolean getScreenCaptureDisabled(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public void setNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException {}
            public int getNearbyNotificationStreamingPolicy(int p0) throws android.os.RemoteException { return 0; }
            public void setNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException {}
            public int getNearbyAppStreamingPolicy(int p0) throws android.os.RemoteException { return 0; }
            public void setKeyguardDisabledFeatures(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
            public int getKeyguardDisabledFeatures(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
            public void setActiveAdmin(android.content.ComponentName p0, boolean p1, int p2) throws android.os.RemoteException {}
            public boolean isAdminActive(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.content.ComponentName> getActiveAdmins(int p0) throws android.os.RemoteException { return null; }
            public boolean packageHasActiveAdmins(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void getRemoveWarning(android.content.ComponentName p0, android.os.RemoteCallback p1, int p2) throws android.os.RemoteException {}
            public void removeActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void forceRemoveActiveAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public boolean hasGrantedPolicy(android.content.ComponentName p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void reportPasswordChanged(android.app.admin.PasswordMetrics p0, int p1) throws android.os.RemoteException {}
            public void reportFailedPasswordAttempt(int p0, boolean p1) throws android.os.RemoteException {}
            public void reportSuccessfulPasswordAttempt(int p0) throws android.os.RemoteException {}
            public void reportFailedBiometricAttempt(int p0) throws android.os.RemoteException {}
            public void reportSuccessfulBiometricAttempt(int p0) throws android.os.RemoteException {}
            public void reportKeyguardDismissed(int p0) throws android.os.RemoteException {}
            public void reportKeyguardSecured(int p0) throws android.os.RemoteException {}
            public boolean setDeviceOwner(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public android.content.ComponentName getDeviceOwnerComponent(boolean p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getDeviceOwnerComponentOnUser(int p0) throws android.os.RemoteException { return null; }
            public boolean hasDeviceOwner() throws android.os.RemoteException { return false; }
            public java.lang.String getDeviceOwnerName() throws android.os.RemoteException { return null; }
            public void clearDeviceOwner(java.lang.String p0) throws android.os.RemoteException {}
            public int getDeviceOwnerUserId() throws android.os.RemoteException { return 0; }
            public boolean setProfileOwner(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public android.content.ComponentName getProfileOwnerAsUser(int p0) throws android.os.RemoteException { return null; }
            public android.content.ComponentName getProfileOwnerOrDeviceOwnerSupervisionComponent(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
            public boolean isSupervisionComponent(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
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
            public void addPersistentPreferredActivity(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, android.content.ComponentName p3) throws android.os.RemoteException {}
            public void clearPackagePersistentPreferredActivities(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setDefaultSmsApplication(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void setDefaultDialerApplication(java.lang.String p0) throws android.os.RemoteException {}
            public void setApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3, boolean p4) throws android.os.RemoteException {}
            public android.os.Bundle getApplicationRestrictions(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return null; }
            public boolean setApplicationRestrictionsManagingPackage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.lang.String getApplicationRestrictionsManagingPackage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isCallerApplicationRestrictionsManagingPackage(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setRestrictionsProvider(android.content.ComponentName p0, android.content.ComponentName p1) throws android.os.RemoteException {}
            public android.content.ComponentName getRestrictionsProvider(int p0) throws android.os.RemoteException { return null; }
            public void setUserRestriction(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
            public void setUserRestrictionGlobally(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.os.Bundle getUserRestrictions(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
            public android.os.Bundle getUserRestrictionsGlobally(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void addCrossProfileIntentFilter(android.content.ComponentName p0, java.lang.String p1, android.content.IntentFilter p2, int p3) throws android.os.RemoteException {}
            public void clearCrossProfileIntentFilters(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean setPermittedAccessibilityServices(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getPermittedAccessibilityServices(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPermittedAccessibilityServicesForUser(int p0) throws android.os.RemoteException { return null; }
            public boolean isAccessibilityServicePermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException { return false; }
            public boolean setPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2, boolean p3) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getPermittedInputMethods(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPermittedInputMethodsAsUser(int p0) throws android.os.RemoteException { return null; }
            public boolean isInputMethodPermittedByAdmin(android.content.ComponentName p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return false; }
            public boolean setPermittedCrossProfileNotificationListeners(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getPermittedCrossProfileNotificationListeners(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isNotificationListenerServicePermitted(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.content.Intent createAdminSupportIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getEnforcingAdminAndUserDetails(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.admin.EnforcingAdmin> getEnforcingAdminsForRestriction(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean setApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException { return false; }
            public boolean isApplicationHidden(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException { return false; }
            public android.os.UserHandle createAndManageUser(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, int p4) throws android.os.RemoteException { return null; }
            public boolean removeUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public boolean switchUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return false; }
            public int startUserInBackground(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
            public int stopUser(android.content.ComponentName p0, android.os.UserHandle p1) throws android.os.RemoteException { return 0; }
            public int logoutUser(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public int logoutUserInternal() throws android.os.RemoteException { return 0; }
            public int getLogoutUserId() throws android.os.RemoteException { return 0; }
            public java.util.List<android.os.UserHandle> getSecondaryUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public void acknowledgeNewUserDisclaimer(int p0) throws android.os.RemoteException {}
            public boolean isNewUserDisclaimerAcknowledged(int p0) throws android.os.RemoteException { return false; }
            public void enableSystemApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public int enableSystemAppWithIntent(android.content.ComponentName p0, java.lang.String p1, android.content.Intent p2) throws android.os.RemoteException { return 0; }
            public boolean installExistingPackage(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setAccountManagementDisabled(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws android.os.RemoteException {}
            public java.lang.String[] getAccountTypesWithManagementDisabled(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getAccountTypesWithManagementDisabledAsUser(int p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return null; }
            public void setSecondaryLockscreenEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean isSecondaryLockscreenEnabled(android.os.UserHandle p0) throws android.os.RemoteException { return false; }
            public void setPreferentialNetworkServiceConfigs(java.util.List<android.app.admin.PreferentialNetworkServiceConfig> p0) throws android.os.RemoteException {}
            public java.util.List<android.app.admin.PreferentialNetworkServiceConfig> getPreferentialNetworkServiceConfigs() throws android.os.RemoteException { return null; }
            public void setLockTaskPackages(android.content.ComponentName p0, java.lang.String p1, java.lang.String[] p2) throws android.os.RemoteException {}
            public java.lang.String[] getLockTaskPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isLockTaskPermitted(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public int getLockTaskFeatures(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void setGlobalSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setSystemSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void setSecureSetting(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setConfiguredNetworksLockdownState(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public boolean hasLockdownAdminConfiguredNetworks(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void setLocationEnabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean setTime(android.content.ComponentName p0, java.lang.String p1, long p2) throws android.os.RemoteException { return false; }
            public boolean setTimeZone(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void setMasterVolumeMuted(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean isMasterVolumeMuted(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public void notifyLockTaskModeChanged(boolean p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setUninstallBlocked(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public boolean isUninstallBlocked(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setCrossProfileCallerIdDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getCrossProfileCallerIdDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean getCrossProfileCallerIdDisabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void setCrossProfileContactsSearchDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getCrossProfileContactsSearchDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean getCrossProfileContactsSearchDisabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void startManagedQuickContact(java.lang.String p0, long p1, boolean p2, long p3, android.content.Intent p4) throws android.os.RemoteException {}
            public void setManagedProfileCallerIdAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
            public android.app.admin.PackagePolicy getManagedProfileCallerIdAccessPolicy() throws android.os.RemoteException { return null; }
            public boolean hasManagedProfileCallerIdAccess(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setCredentialManagerPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
            public android.app.admin.PackagePolicy getCredentialManagerPolicy(int p0) throws android.os.RemoteException { return null; }
            public void setManagedProfileContactsAccessPolicy(android.app.admin.PackagePolicy p0) throws android.os.RemoteException {}
            public android.app.admin.PackagePolicy getManagedProfileContactsAccessPolicy() throws android.os.RemoteException { return null; }
            public boolean hasManagedProfileContactsAccess(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setBluetoothContactSharingDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getBluetoothContactSharingDisabled(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean getBluetoothContactSharingDisabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void setTrustAgentConfiguration(android.content.ComponentName p0, java.lang.String p1, android.content.ComponentName p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException {}
            public java.util.List<android.os.PersistableBundle> getTrustAgentConfiguration(android.content.ComponentName p0, android.content.ComponentName p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
            public boolean addCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public boolean removeCrossProfileWidgetProvider(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getCrossProfileWidgetProviders(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setAutoTimeRequired(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getAutoTimeRequired() throws android.os.RemoteException { return false; }
            public void setAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public boolean getAutoTimeEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public boolean getAutoTimeZoneEnabled(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setForceEphemeralUsers(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException {}
            public boolean getForceEphemeralUsers(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public boolean isRemovingAdmin(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return false; }
            public void setUserIcon(android.content.ComponentName p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
            public void setSystemUpdatePolicy(android.content.ComponentName p0, java.lang.String p1, android.app.admin.SystemUpdatePolicy p2) throws android.os.RemoteException {}
            public android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() throws android.os.RemoteException { return null; }
            public void clearSystemUpdatePolicyFreezePeriodRecord() throws android.os.RemoteException {}
            public boolean setKeyguardDisabled(android.content.ComponentName p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setStatusBarDisabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean isStatusBarDisabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean getDoNotAskCredentialsOnBoot() throws android.os.RemoteException { return false; }
            public void notifyPendingSystemUpdate(android.app.admin.SystemUpdateInfo p0) throws android.os.RemoteException {}
            public android.app.admin.SystemUpdateInfo getPendingSystemUpdate(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setPermissionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public int getPermissionPolicy(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public void setPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
            public int getPermissionGrantState(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public boolean isProvisioningAllowed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public int checkProvisioningPrecondition(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void setKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getKeepUninstalledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isManagedProfile(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public java.lang.String getWifiMacAddress(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void reboot(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void setShortSupportMessage(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public java.lang.CharSequence getShortSupportMessage(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setLongSupportMessage(android.content.ComponentName p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public java.lang.CharSequence getLongSupportMessage(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getShortSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getLongSupportMessageForUser(android.content.ComponentName p0, int p1) throws android.os.RemoteException { return null; }
            public void setOrganizationColor(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void setOrganizationColorForUser(int p0, int p1) throws android.os.RemoteException {}
            public void clearOrganizationIdForUser(int p0) throws android.os.RemoteException {}
            public int getOrganizationColor(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public int getOrganizationColorForUser(int p0) throws android.os.RemoteException { return 0; }
            public void setOrganizationName(android.content.ComponentName p0, java.lang.String p1, java.lang.CharSequence p2) throws android.os.RemoteException {}
            public java.lang.CharSequence getOrganizationName(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getDeviceOwnerOrganizationName() throws android.os.RemoteException { return null; }
            public java.lang.CharSequence getOrganizationNameForUser(int p0) throws android.os.RemoteException { return null; }
            public int getUserProvisioningState(int p0) throws android.os.RemoteException { return 0; }
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
            public void setAuditLogEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public boolean isAuditLogEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setAuditLogEventsCallback(java.lang.String p0, android.app.admin.IAuditLogEventsCallback p1) throws android.os.RemoteException {}
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
            public boolean bindDeviceAdminServiceAsUser(android.content.ComponentName p0, android.app.IApplicationThread p1, android.os.IBinder p2, android.content.Intent p3, android.app.IServiceConnection p4, long p5, int p6) throws android.os.RemoteException { return false; }
            public java.util.List<android.os.UserHandle> getBindDeviceAdminTargetUsers(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isEphemeralUser(android.content.ComponentName p0) throws android.os.RemoteException { return false; }
            public long getLastSecurityLogRetrievalTime() throws android.os.RemoteException { return 0L; }
            public long getLastBugReportRequestTime() throws android.os.RemoteException { return 0L; }
            public long getLastNetworkLogRetrievalTime() throws android.os.RemoteException { return 0L; }
            public boolean setResetPasswordToken(android.content.ComponentName p0, java.lang.String p1, byte[] p2) throws android.os.RemoteException { return false; }
            public boolean clearResetPasswordToken(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isResetPasswordTokenActive(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean resetPasswordWithToken(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4) throws android.os.RemoteException { return false; }
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
            public void setProfileOwnerOnOrganizationOwnedDevice(android.content.ComponentName p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void installUpdateFromFile(android.content.ComponentName p0, java.lang.String p1, android.os.ParcelFileDescriptor p2, android.app.admin.StartInstallingUpdateCallback p3) throws android.os.RemoteException {}
            public void setCrossProfileCalendarPackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getCrossProfileCalendarPackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isPackageAllowedToAccessCalendarForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getCrossProfileCalendarPackagesForUser(int p0) throws android.os.RemoteException { return null; }
            public void setCrossProfilePackages(android.content.ComponentName p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getCrossProfilePackages(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAllCrossProfilePackages(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getDefaultCrossProfilePackages() throws android.os.RemoteException { return null; }
            public boolean isManagedKiosk() throws android.os.RemoteException { return false; }
            public boolean isUnattendedManagedKiosk() throws android.os.RemoteException { return false; }
            public boolean startViewCalendarEventInManagedProfile(java.lang.String p0, long p1, long p2, long p3, boolean p4, int p5) throws android.os.RemoteException { return false; }
            public boolean setKeyGrantForApp(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
            public android.app.admin.ParcelableGranteeMap getKeyPairGrants(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean setKeyGrantToWifiAuth(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean isKeyPairGrantedToWifiAuth(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void setUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) throws android.os.RemoteException {}
            public java.util.List<java.lang.String> getUserControlDisabledPackages(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setCommonCriteriaModeEnabled(android.content.ComponentName p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
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
            public void finalizeWorkProfileProvisioning(android.os.UserHandle p0, android.accounts.Account p1) throws android.os.RemoteException {}
            public void setDeviceOwnerType(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public int getDeviceOwnerType(android.content.ComponentName p0) throws android.os.RemoteException { return 0; }
            public void resetDefaultCrossProfileIntentFilters(int p0) throws android.os.RemoteException {}
            public boolean canAdminGrantSensorsPermissions() throws android.os.RemoteException { return false; }
            public void setUsbDataSignalingEnabled(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public boolean isUsbDataSignalingEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean canUsbDataSignalingBeDisabled() throws android.os.RemoteException { return false; }
            public void setMinimumRequiredWifiSecurityLevel(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public int getMinimumRequiredWifiSecurityLevel() throws android.os.RemoteException { return 0; }
            public void setWifiSsidPolicy(java.lang.String p0, android.app.admin.WifiSsidPolicy p1) throws android.os.RemoteException {}
            public android.app.admin.WifiSsidPolicy getWifiSsidPolicy(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isDevicePotentiallyStolen(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.os.UserHandle> listForegroundAffiliatedUsers() throws android.os.RemoteException { return null; }
            public void setDrawables(java.util.List<android.app.admin.DevicePolicyDrawableResource> p0) throws android.os.RemoteException {}
            public void resetDrawables(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public android.app.admin.ParcelableResource getDrawable(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public boolean isDpcDownloaded() throws android.os.RemoteException { return false; }
            public void setDpcDownloaded(boolean p0) throws android.os.RemoteException {}
            public void setStrings(java.util.List<android.app.admin.DevicePolicyStringResource> p0) throws android.os.RemoteException {}
            public void resetStrings(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public android.app.admin.ParcelableResource getString(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void resetShouldAllowBypassingDevicePolicyManagementRoleQualificationState() throws android.os.RemoteException {}
            public boolean shouldAllowBypassingDevicePolicyManagementRoleQualification() throws android.os.RemoteException { return false; }
            public java.util.List<android.os.UserHandle> getPolicyManagedProfiles(android.os.UserHandle p0) throws android.os.RemoteException { return null; }
            public void setApplicationExemptions(java.lang.String p0, java.lang.String p1, int[] p2) throws android.os.RemoteException {}
            public int[] getApplicationExemptions(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setMtePolicy(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public int getMtePolicy(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public void setManagedSubscriptionsPolicy(android.app.admin.ManagedSubscriptionsPolicy p0) throws android.os.RemoteException {}
            public android.app.admin.ManagedSubscriptionsPolicy getManagedSubscriptionsPolicy() throws android.os.RemoteException { return null; }
            public android.app.admin.DevicePolicyState getDevicePolicyState() throws android.os.RemoteException { return null; }
            public boolean triggerDevicePolicyEngineMigration(boolean p0) throws android.os.RemoteException { return false; }
            public boolean isDeviceFinanced(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.lang.String getFinancedDeviceKioskRoleHolder(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void calculateHasIncompatibleAccounts() throws android.os.RemoteException {}
            public void setContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public int getContentProtectionPolicy(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int[] getSubscriptionIds(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void forceSetMaxPolicyStorageLimit(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public int getMaxPolicyStorageLimit(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getPolicySizeForAdmin(java.lang.String p0, android.app.admin.EnforcingAdmin p1) throws android.os.RemoteException { return 0; }
            public int getHeadlessDeviceOwnerMode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        }
    }
}
