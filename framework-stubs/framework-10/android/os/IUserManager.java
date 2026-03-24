package android.os;

public interface IUserManager extends android.os.IInterface {
    public int getCredentialOwnerProfile(int p0) throws android.os.RemoteException;
    public int getProfileParentId(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo createUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.UserInfo createProfileForUser(java.lang.String p0, int p1, int p2, java.lang.String[] p3) throws android.os.RemoteException;
    public android.content.pm.UserInfo createRestrictedProfile(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setUserEnabled(int p0) throws android.os.RemoteException;
    public void setUserAdmin(int p0) throws android.os.RemoteException;
    public void evictCredentialEncryptionKey(int p0) throws android.os.RemoteException;
    public boolean removeUser(int p0) throws android.os.RemoteException;
    public boolean removeUserEvenWhenDisallowed(int p0) throws android.os.RemoteException;
    public void setUserName(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setUserIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getUserIcon(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException;
    public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0) throws android.os.RemoteException;
    public java.util.List<android.content.pm.UserInfo> getProfiles(int p0, boolean p1) throws android.os.RemoteException;
    public int[] getProfileIds(int p0, boolean p1) throws android.os.RemoteException;
    public boolean canAddMoreManagedProfiles(int p0, boolean p1) throws android.os.RemoteException;
    public android.content.pm.UserInfo getProfileParent(int p0) throws android.os.RemoteException;
    public boolean isSameProfileGroup(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
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
    public void setUserRestriction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setDefaultGuestRestrictions(android.os.Bundle p0) throws android.os.RemoteException;
    public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException;
    public boolean markGuestForDeletion(int p0) throws android.os.RemoteException;
    public boolean isQuietModeEnabled(int p0) throws android.os.RemoteException;
    public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException;
    public java.lang.String getSeedAccountName() throws android.os.RemoteException;
    public java.lang.String getSeedAccountType() throws android.os.RemoteException;
    public android.os.PersistableBundle getSeedAccountOptions() throws android.os.RemoteException;
    public void clearSeedAccountData() throws android.os.RemoteException;
    public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isManagedProfile(int p0) throws android.os.RemoteException;
    public boolean isDemoUser(int p0) throws android.os.RemoteException;
    public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowed(java.lang.String p0, int p1, int p2, java.lang.String[] p3) throws android.os.RemoteException;
    public boolean isUserUnlockingOrUnlocked(int p0) throws android.os.RemoteException;
    public int getManagedProfileBadge(int p0) throws android.os.RemoteException;
    public boolean isUserUnlocked(int p0) throws android.os.RemoteException;
    public boolean isUserRunning(int p0) throws android.os.RemoteException;
    public boolean isUserNameSet(int p0) throws android.os.RemoteException;
    public boolean hasRestrictedProfiles() throws android.os.RemoteException;
    public boolean requestQuietModeEnabled(java.lang.String p0, boolean p1, int p2, android.content.IntentSender p3) throws android.os.RemoteException;
    public java.lang.String getUserName() throws android.os.RemoteException;
    public long getUserStartRealtime() throws android.os.RemoteException;
    public long getUserUnlockRealtime() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IUserManager {
        private static final java.lang.String DESCRIPTOR = "android.os.IUserManager";
        static final int TRANSACTION_getCredentialOwnerProfile = 1;
        static final int TRANSACTION_getProfileParentId = 2;
        static final int TRANSACTION_createUser = 3;
        static final int TRANSACTION_createProfileForUser = 4;
        static final int TRANSACTION_createRestrictedProfile = 5;
        static final int TRANSACTION_setUserEnabled = 6;
        static final int TRANSACTION_setUserAdmin = 7;
        static final int TRANSACTION_evictCredentialEncryptionKey = 8;
        static final int TRANSACTION_removeUser = 9;
        static final int TRANSACTION_removeUserEvenWhenDisallowed = 10;
        static final int TRANSACTION_setUserName = 11;
        static final int TRANSACTION_setUserIcon = 12;
        static final int TRANSACTION_getUserIcon = 13;
        static final int TRANSACTION_getPrimaryUser = 14;
        static final int TRANSACTION_getUsers = 15;
        static final int TRANSACTION_getProfiles = 16;
        static final int TRANSACTION_getProfileIds = 17;
        static final int TRANSACTION_canAddMoreManagedProfiles = 18;
        static final int TRANSACTION_getProfileParent = 19;
        static final int TRANSACTION_isSameProfileGroup = 20;
        static final int TRANSACTION_getUserInfo = 21;
        static final int TRANSACTION_getUserAccount = 22;
        static final int TRANSACTION_setUserAccount = 23;
        static final int TRANSACTION_getUserCreationTime = 24;
        static final int TRANSACTION_isRestricted = 25;
        static final int TRANSACTION_canHaveRestrictedProfile = 26;
        static final int TRANSACTION_getUserSerialNumber = 27;
        static final int TRANSACTION_getUserHandle = 28;
        static final int TRANSACTION_getUserRestrictionSource = 29;
        static final int TRANSACTION_getUserRestrictionSources = 30;
        static final int TRANSACTION_getUserRestrictions = 31;
        static final int TRANSACTION_hasBaseUserRestriction = 32;
        static final int TRANSACTION_hasUserRestriction = 33;
        static final int TRANSACTION_hasUserRestrictionOnAnyUser = 34;
        static final int TRANSACTION_setUserRestriction = 35;
        static final int TRANSACTION_setApplicationRestrictions = 36;
        static final int TRANSACTION_getApplicationRestrictions = 37;
        static final int TRANSACTION_getApplicationRestrictionsForUser = 38;
        static final int TRANSACTION_setDefaultGuestRestrictions = 39;
        static final int TRANSACTION_getDefaultGuestRestrictions = 40;
        static final int TRANSACTION_markGuestForDeletion = 41;
        static final int TRANSACTION_isQuietModeEnabled = 42;
        static final int TRANSACTION_setSeedAccountData = 43;
        static final int TRANSACTION_getSeedAccountName = 44;
        static final int TRANSACTION_getSeedAccountType = 45;
        static final int TRANSACTION_getSeedAccountOptions = 46;
        static final int TRANSACTION_clearSeedAccountData = 47;
        static final int TRANSACTION_someUserHasSeedAccount = 48;
        static final int TRANSACTION_isManagedProfile = 49;
        static final int TRANSACTION_isDemoUser = 50;
        static final int TRANSACTION_createProfileForUserEvenWhenDisallowed = 51;
        static final int TRANSACTION_isUserUnlockingOrUnlocked = 52;
        static final int TRANSACTION_getManagedProfileBadge = 53;
        static final int TRANSACTION_isUserUnlocked = 54;
        static final int TRANSACTION_isUserRunning = 55;
        static final int TRANSACTION_isUserNameSet = 56;
        static final int TRANSACTION_hasRestrictedProfiles = 57;
        static final int TRANSACTION_requestQuietModeEnabled = 58;
        static final int TRANSACTION_getUserName = 59;
        static final int TRANSACTION_getUserStartRealtime = 60;
        static final int TRANSACTION_getUserUnlockRealtime = 61;
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
            public android.content.pm.UserInfo createUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.UserInfo createProfileForUser(java.lang.String p0, int p1, int p2, java.lang.String[] p3) throws android.os.RemoteException { return null; }
            public android.content.pm.UserInfo createRestrictedProfile(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setUserEnabled(int p0) throws android.os.RemoteException {}
            public void setUserAdmin(int p0) throws android.os.RemoteException {}
            public void evictCredentialEncryptionKey(int p0) throws android.os.RemoteException {}
            public boolean removeUser(int p0) throws android.os.RemoteException { return false; }
            public boolean removeUserEvenWhenDisallowed(int p0) throws android.os.RemoteException { return false; }
            public void setUserName(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setUserIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor getUserIcon(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.UserInfo> getProfiles(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public int[] getProfileIds(int p0, boolean p1) throws android.os.RemoteException { return null; }
            public boolean canAddMoreManagedProfiles(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public android.content.pm.UserInfo getProfileParent(int p0) throws android.os.RemoteException { return null; }
            public boolean isSameProfileGroup(int p0, int p1) throws android.os.RemoteException { return false; }
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
            public void setUserRestriction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
            public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setDefaultGuestRestrictions(android.os.Bundle p0) throws android.os.RemoteException {}
            public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException { return null; }
            public boolean markGuestForDeletion(int p0) throws android.os.RemoteException { return false; }
            public boolean isQuietModeEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException {}
            public java.lang.String getSeedAccountName() throws android.os.RemoteException { return null; }
            public java.lang.String getSeedAccountType() throws android.os.RemoteException { return null; }
            public android.os.PersistableBundle getSeedAccountOptions() throws android.os.RemoteException { return null; }
            public void clearSeedAccountData() throws android.os.RemoteException {}
            public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isManagedProfile(int p0) throws android.os.RemoteException { return false; }
            public boolean isDemoUser(int p0) throws android.os.RemoteException { return false; }
            public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowed(java.lang.String p0, int p1, int p2, java.lang.String[] p3) throws android.os.RemoteException { return null; }
            public boolean isUserUnlockingOrUnlocked(int p0) throws android.os.RemoteException { return false; }
            public int getManagedProfileBadge(int p0) throws android.os.RemoteException { return 0; }
            public boolean isUserUnlocked(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserRunning(int p0) throws android.os.RemoteException { return false; }
            public boolean isUserNameSet(int p0) throws android.os.RemoteException { return false; }
            public boolean hasRestrictedProfiles() throws android.os.RemoteException { return false; }
            public boolean requestQuietModeEnabled(java.lang.String p0, boolean p1, int p2, android.content.IntentSender p3) throws android.os.RemoteException { return false; }
            public java.lang.String getUserName() throws android.os.RemoteException { return null; }
            public long getUserStartRealtime() throws android.os.RemoteException { return 0L; }
            public long getUserUnlockRealtime() throws android.os.RemoteException { return 0L; }
        }
    }

    public static class Default implements android.os.IUserManager {
        public Default() {}
        public int getCredentialOwnerProfile(int p0) throws android.os.RemoteException { return 0; }
        public int getProfileParentId(int p0) throws android.os.RemoteException { return 0; }
        public android.content.pm.UserInfo createUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.UserInfo createProfileForUser(java.lang.String p0, int p1, int p2, java.lang.String[] p3) throws android.os.RemoteException { return null; }
        public android.content.pm.UserInfo createRestrictedProfile(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setUserEnabled(int p0) throws android.os.RemoteException {}
        public void setUserAdmin(int p0) throws android.os.RemoteException {}
        public void evictCredentialEncryptionKey(int p0) throws android.os.RemoteException {}
        public boolean removeUser(int p0) throws android.os.RemoteException { return false; }
        public boolean removeUserEvenWhenDisallowed(int p0) throws android.os.RemoteException { return false; }
        public void setUserName(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setUserIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor getUserIcon(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.UserInfo getPrimaryUser() throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.UserInfo> getUsers(boolean p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.UserInfo> getProfiles(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public int[] getProfileIds(int p0, boolean p1) throws android.os.RemoteException { return null; }
        public boolean canAddMoreManagedProfiles(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public android.content.pm.UserInfo getProfileParent(int p0) throws android.os.RemoteException { return null; }
        public boolean isSameProfileGroup(int p0, int p1) throws android.os.RemoteException { return false; }
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
        public void setUserRestriction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void setApplicationRestrictions(java.lang.String p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public android.os.Bundle getApplicationRestrictions(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getApplicationRestrictionsForUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setDefaultGuestRestrictions(android.os.Bundle p0) throws android.os.RemoteException {}
        public android.os.Bundle getDefaultGuestRestrictions() throws android.os.RemoteException { return null; }
        public boolean markGuestForDeletion(int p0) throws android.os.RemoteException { return false; }
        public boolean isQuietModeEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setSeedAccountData(int p0, java.lang.String p1, java.lang.String p2, android.os.PersistableBundle p3, boolean p4) throws android.os.RemoteException {}
        public java.lang.String getSeedAccountName() throws android.os.RemoteException { return null; }
        public java.lang.String getSeedAccountType() throws android.os.RemoteException { return null; }
        public android.os.PersistableBundle getSeedAccountOptions() throws android.os.RemoteException { return null; }
        public void clearSeedAccountData() throws android.os.RemoteException {}
        public boolean someUserHasSeedAccount(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isManagedProfile(int p0) throws android.os.RemoteException { return false; }
        public boolean isDemoUser(int p0) throws android.os.RemoteException { return false; }
        public android.content.pm.UserInfo createProfileForUserEvenWhenDisallowed(java.lang.String p0, int p1, int p2, java.lang.String[] p3) throws android.os.RemoteException { return null; }
        public boolean isUserUnlockingOrUnlocked(int p0) throws android.os.RemoteException { return false; }
        public int getManagedProfileBadge(int p0) throws android.os.RemoteException { return 0; }
        public boolean isUserUnlocked(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserRunning(int p0) throws android.os.RemoteException { return false; }
        public boolean isUserNameSet(int p0) throws android.os.RemoteException { return false; }
        public boolean hasRestrictedProfiles() throws android.os.RemoteException { return false; }
        public boolean requestQuietModeEnabled(java.lang.String p0, boolean p1, int p2, android.content.IntentSender p3) throws android.os.RemoteException { return false; }
        public java.lang.String getUserName() throws android.os.RemoteException { return null; }
        public long getUserStartRealtime() throws android.os.RemoteException { return 0L; }
        public long getUserUnlockRealtime() throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }
}
