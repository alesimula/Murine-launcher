package android.app.admin;

public final class ManagedProfileProvisioningParams implements android.os.Parcelable {
    private static final java.lang.String LEAVE_ALL_SYSTEM_APPS_ENABLED_PARAM = "LEAVE_ALL_SYSTEM_APPS_ENABLED";
    private static final java.lang.String ORGANIZATION_OWNED_PROVISIONING_PARAM = "ORGANIZATION_OWNED_PROVISIONING";
    private static final java.lang.String ACCOUNT_TO_MIGRATE_PROVIDED_PARAM = "ACCOUNT_TO_MIGRATE_PROVIDED";
    private static final java.lang.String KEEP_MIGRATED_ACCOUNT_PARAM = "KEEP_MIGRATED_ACCOUNT";
    private final android.content.ComponentName mProfileAdminComponentName = null;
    private final java.lang.String mOwnerName = null;
    private final java.lang.String mProfileName = null;
    private final android.accounts.Account mAccountToMigrate = null;
    private final boolean mLeaveAllSystemAppsEnabled = false;
    private final boolean mOrganizationOwnedProvisioning = false;
    private final boolean mKeepAccountMigrated = false;
    public static final android.os.Parcelable.Creator<android.app.admin.ManagedProfileProvisioningParams> CREATOR = null;
    private ManagedProfileProvisioningParams(android.content.ComponentName p0, java.lang.String p1, java.lang.String p2, android.accounts.Account p3, boolean p4, boolean p5, boolean p6) {}
    public android.content.ComponentName getProfileAdminComponentName() { return null; }
    public java.lang.String getOwnerName() { return null; }
    public java.lang.String getProfileName() { return null; }
    public android.accounts.Account getAccountToMigrate() { return null; }
    public boolean isLeaveAllSystemAppsEnabled() { return false; }
    public boolean isOrganizationOwnedProvisioning() { return false; }
    public boolean isKeepAccountMigrated() { return false; }
    public void logParams(java.lang.String p0) {}
    private void logParam(java.lang.String p0, java.lang.String p1, boolean p2) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.content.ComponentName mProfileAdminComponentName = null;
        private final java.lang.String mOwnerName = null;
        private java.lang.String mProfileName;
        private android.accounts.Account mAccountToMigrate;
        private boolean mLeaveAllSystemAppsEnabled;
        private boolean mOrganizationOwnedProvisioning;
        private boolean mKeepAccountMigrated;
        public Builder(android.content.ComponentName p0, java.lang.String p1) {}
        public android.app.admin.ManagedProfileProvisioningParams.Builder setProfileName(java.lang.String p0) { return null; }
        public android.app.admin.ManagedProfileProvisioningParams.Builder setAccountToMigrate(android.accounts.Account p0) { return null; }
        public android.app.admin.ManagedProfileProvisioningParams.Builder setLeaveAllSystemAppsEnabled(boolean p0) { return null; }
        public android.app.admin.ManagedProfileProvisioningParams.Builder setOrganizationOwnedProvisioning(boolean p0) { return null; }
        public android.app.admin.ManagedProfileProvisioningParams.Builder setKeepAccountMigrated(boolean p0) { return null; }
        public android.app.admin.ManagedProfileProvisioningParams build() { return null; }
    }
}
