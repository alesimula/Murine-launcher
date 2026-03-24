package android.os;

public interface IUserManager extends android.os.IInterface {
    public int getCredentialOwnerProfile(int p0) throws android.os.RemoteException;
    public int getProfileParentId(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo createUserWithThrow(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public android.content.pm.UserInfo preCreateUserWithThrow(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo createProfileForUserWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException;
    public android.content.pm.UserInfo createRestrictedProfileWithThrow(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setUserEnabled(int p0) throws android.os.RemoteException;
    public void setUserAdmin(int p0) throws android.os.RemoteException;
    public void evictCredentialEncryptionKey(int p0) throws android.os.RemoteException;
    public boolean removeUser(int p0) throws android.os.RemoteException;
    public boolean removeUserEvenWhenDisallowed(int p0) throws android.os.RemoteException;
    public void setUserName(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setUserIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getUserIcon(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException;
    public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public java.util.List<android.content.pm.UserInfo> getProfiles(int p0, boolean p1) throws android.os.RemoteException;
    public int[] getProfileIds(int p0, boolean p1) throws android.os.RemoteException;
    public boolean canAddMoreProfilesToUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean canAddMoreManagedProfiles(int p0, boolean p1) throws android.os.RemoteException;
    public android.content.pm.UserInfo getProfileParent(int p0) throws android.os.RemoteException;
    public boolean isSameProfileGroup(int p0, int p1) throws android.os.RemoteException;
    public boolean isUserOfType(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.content.pm.UserInfo getUserInfo(int p0) throws android.os.RemoteException;
    public java.lang.String getUserAccount(int p0) throws android.os.RemoteException;
    public void setUserAccount(int p0, java.lang.String p1) throws android.os.RemoteException;
    public long getUserCreationTime(int p0) throws android.os.RemoteException;
    public boolean isRestricted() throws android.os.RemoteException;
    public boolean canHaveRestrictedProfile(int p0) throws android.os.RemoteException;
    public int getUserSerialNumber(int p0) throws android.os.RemoteException;
    public int getUserHandle(int p0) throws android.os.RemoteException;
    public int getUserRestrictionSource(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.Bundle getUserRestrictions(int p0) throws android.os.RemoteException;
    public boolean hasBaseUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasUserRestrictionOnAnyUser(java.lang.String p0) throws android.os.RemoteException;
    public boolean isSettingRestrictedForUser(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void addUserRestrictionsListener(android.os.IUserRestrictionsListener p0) throws android.os.RemoteException;
    public void setUserRestriction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setDefaultGuestRestrictions(android.os.Bundle p0) throws android.os.RemoteException;
    public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException;
    public boolean markGuestForDeletion(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo findCurrentGuestUser() throws android.os.RemoteException;
    public boolean isQuietModeEnabled(int p0) throws android.os.RemoteException;
    public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException;
    public java.lang.String getSeedAccountName() throws android.os.RemoteException;
    public java.lang.String getSeedAccountType() throws android.os.RemoteException;
    public android.os.PersistableBundle getSeedAccountOptions() throws android.os.RemoteException;
    public void clearSeedAccountData() throws android.os.RemoteException;
    public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isProfile(int p0) throws android.os.RemoteException;
    public boolean isManagedProfile(int p0) throws android.os.RemoteException;
    public boolean isDemoUser(int p0) throws android.os.RemoteException;
    public boolean isPreCreated(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowedWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException;
    public boolean isUserUnlockingOrUnlocked(int p0) throws android.os.RemoteException;
    public int getUserIconBadgeResId(int p0) throws android.os.RemoteException;
    public int getUserBadgeResId(int p0) throws android.os.RemoteException;
    public int getUserBadgeNoBackgroundResId(int p0) throws android.os.RemoteException;
    public int getUserBadgeLabelResId(int p0) throws android.os.RemoteException;
    public int getUserBadgeColorResId(int p0) throws android.os.RemoteException;
    public int getUserBadgeDarkColorResId(int p0) throws android.os.RemoteException;
    public boolean hasBadge(int p0) throws android.os.RemoteException;
    public boolean isUserUnlocked(int p0) throws android.os.RemoteException;
    public boolean isUserRunning(int p0) throws android.os.RemoteException;
    public boolean isUserNameSet(int p0) throws android.os.RemoteException;
    public boolean hasRestrictedProfiles() throws android.os.RemoteException;
    public boolean requestQuietModeEnabled(java.lang.String p0, boolean p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException;
    public java.lang.String getUserName() throws android.os.RemoteException;
    public long getUserStartRealtime() throws android.os.RemoteException;
    public long getUserUnlockRealtime() throws android.os.RemoteException;

    public static class Default implements android.os.IUserManager {
        public Default() {}
        public int getCredentialOwnerProfile(int p0) throws android.os.RemoteException { return 0; }
        public int getProfileParentId(int p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.UserInfo createUserWithThrow(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public android.content.pm.UserInfo preCreateUserWithThrow(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.UserInfo createProfileForUserWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException { return null; }
        public android.content.pm.UserInfo createRestrictedProfileWithThrow(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setUserEnabled(int p0) throws android.os.RemoteException {}
        public void setUserAdmin(int p0) throws android.os.RemoteException {}
        public void evictCredentialEncryptionKey(int p0) throws android.os.RemoteException {}
        public boolean removeUser(int p0) throws android.os.RemoteException { return false; }
        public boolean removeUserEvenWhenDisallowed(int p0) throws android.os.RemoteException { return false; }
        public void setUserName(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setUserIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor getUserIcon(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0, boolean p1, boolean p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.UserInfo> getProfiles(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public int[] getProfileIds(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public boolean canAddMoreProfilesToUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
        public boolean canAddMoreManagedProfiles(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public android.content.pm.UserInfo getProfileParent(int p0) throws android.os.RemoteException { return null; }
        public boolean isSameProfileGroup(int p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isUserOfType(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.content.pm.UserInfo getUserInfo(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getUserAccount(int p0) throws android.os.RemoteException { return null; }
        public void setUserAccount(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public long getUserCreationTime(int p0) throws android.os.RemoteException { return 0L; }
        public boolean isRestricted() throws android.os.RemoteException { return false; }
        public boolean canHaveRestrictedProfile(int p0) throws android.os.RemoteException { return false; }
        public int getUserSerialNumber(int p0) throws android.os.RemoteException { return 0; }
        public int getUserHandle(int p0) throws android.os.RemoteException { return 0; }
        public int getUserRestrictionSource(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getUserRestrictions(int p0) throws android.os.RemoteException { return null; }
        public boolean hasBaseUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasUserRestrictionOnAnyUser(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isSettingRestrictedForUser(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException { return false; }
        public void addUserRestrictionsListener(android.os.IUserRestrictionsListener p0) throws android.os.RemoteException {}
        public void setUserRestriction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setDefaultGuestRestrictions(android.os.Bundle p0) throws android.os.RemoteException {}
        public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException { return null; }
        public boolean markGuestForDeletion(int p0) throws android.os.RemoteException { return false; }
        public android.content.pm.UserInfo findCurrentGuestUser() throws android.os.RemoteException { return null; }
        public boolean isQuietModeEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException {}
        public java.lang.String getSeedAccountName() throws android.os.RemoteException { return null; }
        public java.lang.String getSeedAccountType() throws android.os.RemoteException { return null; }
        public android.os.PersistableBundle getSeedAccountOptions() throws android.os.RemoteException { return null; }
        public void clearSeedAccountData() throws android.os.RemoteException {}
        public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isProfile(int p0) throws android.os.RemoteException { return false; }
        public boolean isManagedProfile(int p0) throws android.os.RemoteException { return false; }
        public boolean isDemoUser(int p0) throws android.os.RemoteException { return false; }
        public boolean isPreCreated(int p0) throws android.os.RemoteException { return false; }
        public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowedWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException { return null; }
        public boolean isUserUnlockingOrUnlocked(int p0) throws android.os.RemoteException { return false; }
        public int getUserIconBadgeResId(int p0) throws android.os.RemoteException { return 0; }
        public int getUserBadgeResId(int p0) throws android.os.RemoteException { return 0; }
        public int getUserBadgeNoBackgroundResId(int p0) throws android.os.RemoteException { return 0; }
        public int getUserBadgeLabelResId(int p0) throws android.os.RemoteException { return 0; }
        public int getUserBadgeColorResId(int p0) throws android.os.RemoteException { return 0; }
        public int getUserBadgeDarkColorResId(int p0) throws android.os.RemoteException { return 0; }
        public boolean hasBadge(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserUnlocked(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserRunning(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserNameSet(int p0) throws android.os.RemoteException { return false; }
        public boolean hasRestrictedProfiles() throws android.os.RemoteException { return false; }
        public boolean requestQuietModeEnabled(java.lang.String p0, boolean p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException { return false; }
        public java.lang.String getUserName() throws android.os.RemoteException { return null; }
        public long getUserStartRealtime() throws android.os.RemoteException { return 0L; }
        public long getUserUnlockRealtime() throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IUserManager {
        private static final java.lang.String DESCRIPTOR = "android.os.IUserManager";
        static final int TRANSACTION_getCredentialOwnerProfile = 1;
        static final int TRANSACTION_getProfileParentId = 2;
        static final int TRANSACTION_createUserWithThrow = 3;
        static final int TRANSACTION_preCreateUserWithThrow = 4;
        static final int TRANSACTION_createProfileForUserWithThrow = 5;
        static final int TRANSACTION_createRestrictedProfileWithThrow = 6;
        static final int TRANSACTION_setUserEnabled = 7;
        static final int TRANSACTION_setUserAdmin = 8;
        static final int TRANSACTION_evictCredentialEncryptionKey = 9;
        static final int TRANSACTION_removeUser = 10;
        static final int TRANSACTION_removeUserEvenWhenDisallowed = 11;
        static final int TRANSACTION_setUserName = 12;
        static final int TRANSACTION_setUserIcon = 13;
        static final int TRANSACTION_getUserIcon = 14;
        static final int TRANSACTION_getPrimaryUser = 15;
        static final int TRANSACTION_getUsers = 16;
        static final int TRANSACTION_getProfiles = 17;
        static final int TRANSACTION_getProfileIds = 18;
        static final int TRANSACTION_canAddMoreProfilesToUser = 19;
        static final int TRANSACTION_canAddMoreManagedProfiles = 20;
        static final int TRANSACTION_getProfileParent = 21;
        static final int TRANSACTION_isSameProfileGroup = 22;
        static final int TRANSACTION_isUserOfType = 23;
        static final int TRANSACTION_getUserInfo = 24;
        static final int TRANSACTION_getUserAccount = 25;
        static final int TRANSACTION_setUserAccount = 26;
        static final int TRANSACTION_getUserCreationTime = 27;
        static final int TRANSACTION_isRestricted = 28;
        static final int TRANSACTION_canHaveRestrictedProfile = 29;
        static final int TRANSACTION_getUserSerialNumber = 30;
        static final int TRANSACTION_getUserHandle = 31;
        static final int TRANSACTION_getUserRestrictionSource = 32;
        static final int TRANSACTION_getUserRestrictionSources = 33;
        static final int TRANSACTION_getUserRestrictions = 34;
        static final int TRANSACTION_hasBaseUserRestriction = 35;
        static final int TRANSACTION_hasUserRestriction = 36;
        static final int TRANSACTION_hasUserRestrictionOnAnyUser = 37;
        static final int TRANSACTION_isSettingRestrictedForUser = 38;
        static final int TRANSACTION_addUserRestrictionsListener = 39;
        static final int TRANSACTION_setUserRestriction = 40;
        static final int TRANSACTION_setApplicationRestrictions = 41;
        static final int TRANSACTION_getApplicationRestrictions = 42;
        static final int TRANSACTION_getApplicationRestrictionsForUser = 43;
        static final int TRANSACTION_setDefaultGuestRestrictions = 44;
        static final int TRANSACTION_getDefaultGuestRestrictions = 45;
        static final int TRANSACTION_markGuestForDeletion = 46;
        static final int TRANSACTION_findCurrentGuestUser = 47;
        static final int TRANSACTION_isQuietModeEnabled = 48;
        static final int TRANSACTION_setSeedAccountData = 49;
        static final int TRANSACTION_getSeedAccountName = 50;
        static final int TRANSACTION_getSeedAccountType = 51;
        static final int TRANSACTION_getSeedAccountOptions = 52;
        static final int TRANSACTION_clearSeedAccountData = 53;
        static final int TRANSACTION_someUserHasSeedAccount = 54;
        static final int TRANSACTION_isProfile = 55;
        static final int TRANSACTION_isManagedProfile = 56;
        static final int TRANSACTION_isDemoUser = 57;
        static final int TRANSACTION_isPreCreated = 58;
        static final int TRANSACTION_createProfileForUserEvenWhenDisallowedWithThrow = 59;
        static final int TRANSACTION_isUserUnlockingOrUnlocked = 60;
        static final int TRANSACTION_getUserIconBadgeResId = 61;
        static final int TRANSACTION_getUserBadgeResId = 62;
        static final int TRANSACTION_getUserBadgeNoBackgroundResId = 63;
        static final int TRANSACTION_getUserBadgeLabelResId = 64;
        static final int TRANSACTION_getUserBadgeColorResId = 65;
        static final int TRANSACTION_getUserBadgeDarkColorResId = 66;
        static final int TRANSACTION_hasBadge = 67;
        static final int TRANSACTION_isUserUnlocked = 68;
        static final int TRANSACTION_isUserRunning = 69;
        static final int TRANSACTION_isUserNameSet = 70;
        static final int TRANSACTION_hasRestrictedProfiles = 71;
        static final int TRANSACTION_requestQuietModeEnabled = 72;
        static final int TRANSACTION_getUserName = 73;
        static final int TRANSACTION_getUserStartRealtime = 74;
        static final int TRANSACTION_getUserUnlockRealtime = 75;
        public Stub() { super(); }
        public static android.os.IUserManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IUserManager p0) { return false; }
        public static android.os.IUserManager getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IUserManager {
            private android.os.IBinder mRemote;
            public static android.os.IUserManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getCredentialOwnerProfile(int p0) throws android.os.RemoteException { return 0; }
            public int getProfileParentId(int p0) throws android.os.RemoteException { return 0; }
            public android.content.pm.UserInfo createUserWithThrow(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public android.content.pm.UserInfo preCreateUserWithThrow(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.UserInfo createProfileForUserWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException { return null; }
            public android.content.pm.UserInfo createRestrictedProfileWithThrow(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setUserEnabled(int p0) throws android.os.RemoteException {}
            public void setUserAdmin(int p0) throws android.os.RemoteException {}
            public void evictCredentialEncryptionKey(int p0) throws android.os.RemoteException {}
            public boolean removeUser(int p0) throws android.os.RemoteException { return false; }
            public boolean removeUserEvenWhenDisallowed(int p0) throws android.os.RemoteException { return false; }
            public void setUserName(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setUserIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor getUserIcon(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0, boolean p1, boolean p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.UserInfo> getProfiles(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public int[] getProfileIds(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public boolean canAddMoreProfilesToUser(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException { return false; }
            public boolean canAddMoreManagedProfiles(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public android.content.pm.UserInfo getProfileParent(int p0) throws android.os.RemoteException { return null; }
            public boolean isSameProfileGroup(int p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isUserOfType(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public android.content.pm.UserInfo getUserInfo(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getUserAccount(int p0) throws android.os.RemoteException { return null; }
            public void setUserAccount(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public long getUserCreationTime(int p0) throws android.os.RemoteException { return 0L; }
            public boolean isRestricted() throws android.os.RemoteException { return false; }
            public boolean canHaveRestrictedProfile(int p0) throws android.os.RemoteException { return false; }
            public int getUserSerialNumber(int p0) throws android.os.RemoteException { return 0; }
            public int getUserHandle(int p0) throws android.os.RemoteException { return 0; }
            public int getUserRestrictionSource(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public java.util.List<android.os.UserManager.EnforcingUser> getUserRestrictionSources(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getUserRestrictions(int p0) throws android.os.RemoteException { return null; }
            public boolean hasBaseUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasUserRestriction(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasUserRestrictionOnAnyUser(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isSettingRestrictedForUser(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException { return false; }
            public void addUserRestrictionsListener(android.os.IUserRestrictionsListener p0) throws android.os.RemoteException {}
            public void setUserRestriction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setDefaultGuestRestrictions(android.os.Bundle p0) throws android.os.RemoteException {}
            public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException { return null; }
            public boolean markGuestForDeletion(int p0) throws android.os.RemoteException { return false; }
            public android.content.pm.UserInfo findCurrentGuestUser() throws android.os.RemoteException { return null; }
            public boolean isQuietModeEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException {}
            public java.lang.String getSeedAccountName() throws android.os.RemoteException { return null; }
            public java.lang.String getSeedAccountType() throws android.os.RemoteException { return null; }
            public android.os.PersistableBundle getSeedAccountOptions() throws android.os.RemoteException { return null; }
            public void clearSeedAccountData() throws android.os.RemoteException {}
            public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isProfile(int p0) throws android.os.RemoteException { return false; }
            public boolean isManagedProfile(int p0) throws android.os.RemoteException { return false; }
            public boolean isDemoUser(int p0) throws android.os.RemoteException { return false; }
            public boolean isPreCreated(int p0) throws android.os.RemoteException { return false; }
            public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowedWithThrow(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String[] p4) throws android.os.RemoteException { return null; }
            public boolean isUserUnlockingOrUnlocked(int p0) throws android.os.RemoteException { return false; }
            public int getUserIconBadgeResId(int p0) throws android.os.RemoteException { return 0; }
            public int getUserBadgeResId(int p0) throws android.os.RemoteException { return 0; }
            public int getUserBadgeNoBackgroundResId(int p0) throws android.os.RemoteException { return 0; }
            public int getUserBadgeLabelResId(int p0) throws android.os.RemoteException { return 0; }
            public int getUserBadgeColorResId(int p0) throws android.os.RemoteException { return 0; }
            public int getUserBadgeDarkColorResId(int p0) throws android.os.RemoteException { return 0; }
            public boolean hasBadge(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserUnlocked(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserRunning(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserNameSet(int p0) throws android.os.RemoteException { return false; }
            public boolean hasRestrictedProfiles() throws android.os.RemoteException { return false; }
            public boolean requestQuietModeEnabled(java.lang.String p0, boolean p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException { return false; }
            public java.lang.String getUserName() throws android.os.RemoteException { return null; }
            public long getUserStartRealtime() throws android.os.RemoteException { return 0L; }
            public long getUserUnlockRealtime() throws android.os.RemoteException { return 0L; }
        }
    }
}
