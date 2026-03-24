package android.app.admin;

@android.annotation.SystemApi
public final class ManagedProfileProvisioningParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.admin.ManagedProfileProvisioningParams> CREATOR = null;
    @android.annotation.NonNull
    public android.content.ComponentName getProfileAdminComponentName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getOwnerName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getProfileName() { return null; }
    @android.annotation.Nullable
    public android.accounts.Account getAccountToMigrate() { return null; }
    public boolean isLeaveAllSystemAppsEnabled() { return false; }
    public boolean isOrganizationOwnedProvisioning() { return false; }
    public boolean isKeepingAccountOnMigration() { return false; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getAdminExtras() { return null; }
    public void logParams(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.content.ComponentName p0, java.lang.String p1) {}
        @android.annotation.NonNull
        public android.app.admin.ManagedProfileProvisioningParams.Builder setProfileName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.ManagedProfileProvisioningParams.Builder setAccountToMigrate(android.accounts.Account p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.ManagedProfileProvisioningParams.Builder setLeaveAllSystemAppsEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.ManagedProfileProvisioningParams.Builder setOrganizationOwnedProvisioning(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.ManagedProfileProvisioningParams.Builder setKeepingAccountOnMigration(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.ManagedProfileProvisioningParams.Builder setAdminExtras(android.os.PersistableBundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.admin.ManagedProfileProvisioningParams build() { return null; }
    }
}
