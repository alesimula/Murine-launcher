package android.provider;

@android.annotation.FlaggedApi("android.provider.user_keys")
public final class E2eeContactKeysManager {
    public static final java.lang.String AUTHORITY = "com.android.contactkeys.contactkeysprovider";
    @android.annotation.NonNull
    public static final android.net.Uri AUTHORITY_URI = null;
    public static final int VERIFICATION_STATE_UNVERIFIED = 0;
    public static final int VERIFICATION_STATE_VERIFICATION_FAILED = 1;
    public static final int VERIFICATION_STATE_VERIFIED = 2;
    public E2eeContactKeysManager(android.content.Context p0) {}
    @android.annotation.RequiresPermission("android.permission.WRITE_CONTACTS")
    public void updateOrInsertE2eeContactKey(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3) {}
    @android.annotation.RequiresPermission("android.permission.READ_CONTACTS")
    @android.annotation.Nullable
    public android.provider.E2eeContactKeysManager.E2eeContactKey getE2eeContactKey(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_CONTACTS")
    @android.annotation.NonNull
    public java.util.List<android.provider.E2eeContactKeysManager.E2eeContactKey> getAllE2eeContactKeys(java.lang.String p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_CONTACTS")
    @android.annotation.NonNull
    public java.util.List<android.provider.E2eeContactKeysManager.E2eeContactKey> getOwnerE2eeContactKeys(java.lang.String p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.WRITE_CONTACTS")
    public boolean updateE2eeContactKeyLocalVerificationState(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.WRITE_VERIFICATION_STATE_E2EE_CONTACT_KEYS", "android.permission.WRITE_CONTACTS"})
    public boolean updateE2eeContactKeyLocalVerificationState(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_CONTACTS")
    public boolean updateE2eeContactKeyRemoteVerificationState(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.WRITE_VERIFICATION_STATE_E2EE_CONTACT_KEYS", "android.permission.WRITE_CONTACTS"})
    public boolean updateE2eeContactKeyRemoteVerificationState(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_CONTACTS")
    public boolean removeE2eeContactKey(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_CONTACTS")
    public boolean updateOrInsertE2eeSelfKey(java.lang.String p0, java.lang.String p1, byte[] p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_CONTACTS")
    public boolean updateE2eeSelfKeyRemoteVerificationState(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.WRITE_VERIFICATION_STATE_E2EE_CONTACT_KEYS", "android.permission.WRITE_CONTACTS"})
    public boolean updateE2eeSelfKeyRemoteVerificationState(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) { return false; }
    public static int getMaxKeySizeBytes() { return 0; }
    @android.annotation.RequiresPermission("android.permission.READ_CONTACTS")
    @android.annotation.Nullable
    public android.provider.E2eeContactKeysManager.E2eeSelfKey getE2eeSelfKey(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_CONTACTS")
    @android.annotation.NonNull
    public java.util.List<android.provider.E2eeContactKeysManager.E2eeSelfKey> getAllE2eeSelfKeys() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_CONTACTS")
    @android.annotation.NonNull
    public java.util.List<android.provider.E2eeContactKeysManager.E2eeSelfKey> getOwnerE2eeSelfKeys() { return null; }
    @android.annotation.RequiresPermission("android.permission.WRITE_CONTACTS")
    public boolean removeE2eeSelfKey(java.lang.String p0, java.lang.String p1) { return false; }

    static abstract class E2eeBaseKey {
        protected final java.lang.String mDeviceId = null;
        protected final java.lang.String mAccountId = null;
        protected final java.lang.String mOwnerPackageName = null;
        protected final long mTimeUpdated = 0L;
        protected final byte[] mKeyValue = null;
        protected final int mRemoteVerificationState = 0;
        protected E2eeBaseKey(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, byte[] p4, int p5) {}
        @android.annotation.Nullable
        public java.lang.String getDeviceId() { return null; }
        @android.annotation.NonNull
        public java.lang.String getAccountId() { return null; }
        @android.annotation.NonNull
        public java.lang.String getOwnerPackageName() { return null; }
        public long getTimeUpdated() { return 0L; }
        @android.annotation.Nullable
        public byte[] getKeyValue() { return null; }
        public int getRemoteVerificationState() { return 0; }
    }

    public static final class E2eeContactKey extends android.provider.E2eeContactKeysManager.E2eeBaseKey implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.provider.E2eeContactKeysManager.E2eeContactKey> CREATOR = null;
        public E2eeContactKey(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, byte[] p4, int p5, int p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) { super(null, null, null, 0L, null, 0); }
        public int getLocalVerificationState() { return 0; }
        @android.annotation.Nullable
        public java.lang.String getDisplayName() { return null; }
        @android.annotation.Nullable
        public java.lang.String getPhoneNumber() { return null; }
        @android.annotation.Nullable
        public java.lang.String getEmailAddress() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }

    public static final class E2eeContactKeys {
        public static final java.lang.String LOOKUP_KEY = "lookup";
        public static final java.lang.String DEVICE_ID = "device_id";
        public static final java.lang.String ACCOUNT_ID = "account_id";
        public static final java.lang.String DISPLAY_NAME = "display_name";
        public static final java.lang.String PHONE_NUMBER = "number";
        public static final java.lang.String EMAIL_ADDRESS = "address";
        public static final java.lang.String TIME_UPDATED = "time_updated";
        public static final java.lang.String KEY_VALUE = "key_value";
        public static final java.lang.String OWNER_PACKAGE_NAME = "owner_package_name";
        public static final java.lang.String LOCAL_VERIFICATION_STATE = "local_verification_state";
        public static final java.lang.String REMOTE_VERIFICATION_STATE = "remote_verification_state";
        public static final java.lang.String UPDATE_OR_INSERT_CONTACT_KEY_METHOD = "updateOrInsertContactKey";
        public static final java.lang.String GET_CONTACT_KEY_METHOD = "getContactKey";
        public static final java.lang.String GET_ALL_CONTACT_KEYS_METHOD = "getAllContactKeys";
        public static final java.lang.String GET_OWNER_CONTACT_KEYS_METHOD = "getOwnerContactKeys";
        public static final java.lang.String UPDATE_CONTACT_KEY_LOCAL_VERIFICATION_STATE_METHOD = "updateContactKeyLocalVerificationState";
        public static final java.lang.String UPDATE_CONTACT_KEY_REMOTE_VERIFICATION_STATE_METHOD = "updateContactKeyRemoteVerificationState";
        public static final java.lang.String REMOVE_CONTACT_KEY_METHOD = "removeContactKey";
        public static final java.lang.String UPDATE_OR_INSERT_SELF_KEY_METHOD = "updateOrInsertSelfKey";
        public static final java.lang.String UPDATE_SELF_KEY_REMOTE_VERIFICATION_STATE_METHOD = "updateSelfKeyRemoteVerificationState";
        public static final java.lang.String GET_SELF_KEY_METHOD = "getSelfKey";
        public static final java.lang.String GET_ALL_SELF_KEYS_METHOD = "getAllSelfKeys";
        public static final java.lang.String GET_OWNER_SELF_KEYS_METHOD = "getOwnerSelfKeys";
        public static final java.lang.String REMOVE_SELF_KEY_METHOD = "removeSelfKey";
        public static final java.lang.String KEY_CONTACT_KEYS = "key_contact_keys";
        public static final java.lang.String KEY_CONTACT_KEY = "key_contact_key";
        public static final java.lang.String KEY_UPDATED_ROWS = "key_updated_rows";
    }

    public static final class E2eeSelfKey extends android.provider.E2eeContactKeysManager.E2eeBaseKey implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.provider.E2eeContactKeysManager.E2eeSelfKey> CREATOR = null;
        public E2eeSelfKey(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, byte[] p4, int p5) { super(null, null, null, 0L, null, 0); }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerificationState {
    }
}
