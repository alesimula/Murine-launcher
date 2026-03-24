package com.android.server.backup;

public class AccountSyncSettingsBackupHelper implements android.app.backup.BackupHelper {
    private static final java.lang.String TAG = "AccountSyncSettingsBackupHelper";
    private static final boolean DEBUG = false;
    private static final int STATE_VERSION = 1;
    private static final int MD5_BYTE_SIZE = 16;
    private static final int SYNC_REQUEST_LATCH_TIMEOUT_SECONDS = 1;
    private static final java.lang.String JSON_FORMAT_HEADER_KEY = "account_data";
    private static final java.lang.String JSON_FORMAT_ENCODING = "UTF-8";
    private static final int JSON_FORMAT_VERSION = 1;
    private static final java.lang.String KEY_VERSION = "version";
    private static final java.lang.String KEY_MASTER_SYNC_ENABLED = "masterSyncEnabled";
    private static final java.lang.String KEY_ACCOUNTS = "accounts";
    private static final java.lang.String KEY_ACCOUNT_NAME = "name";
    private static final java.lang.String KEY_ACCOUNT_TYPE = "type";
    private static final java.lang.String KEY_ACCOUNT_AUTHORITIES = "authorities";
    private static final java.lang.String KEY_AUTHORITY_NAME = "name";
    private static final java.lang.String KEY_AUTHORITY_SYNC_STATE = "syncState";
    private static final java.lang.String KEY_AUTHORITY_SYNC_ENABLED = "syncEnabled";
    private static final java.lang.String STASH_FILE = "/backup/unadded_account_syncsettings.json";
    private android.content.Context mContext;
    private android.accounts.AccountManager mAccountManager;
    private final int mUserId = 0;
    public AccountSyncSettingsBackupHelper(android.content.Context p0, int p1) {}
    public void performBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) {}
    private org.json.JSONObject serializeAccountSyncSettingsToJSON(int p0) throws org.json.JSONException { return null; }
    private byte[] readOldMd5Checksum(android.os.ParcelFileDescriptor p0) throws java.io.IOException { return null; }
    private void writeNewMd5Checksum(android.os.ParcelFileDescriptor p0, byte[] p1) throws java.io.IOException {}
    private byte[] generateMd5Checksum(byte[] p0) throws java.security.NoSuchAlgorithmException { return null; }
    public void restoreEntity(android.app.backup.BackupDataInputStream p0) {}
    private void restoreFromJsonArray(org.json.JSONArray p0, int p1) throws org.json.JSONException {}
    private void accountAddedInternal(int p0) {}
    public static void accountAdded(android.content.Context p0, int p1) {}
    private java.util.Set<android.accounts.Account> getAccounts(int p0) { return null; }
    private void restoreExistingAccountSyncSettingsFromJSON(org.json.JSONObject p0, int p1) throws org.json.JSONException {}
    public void writeNewStateDescription(android.os.ParcelFileDescriptor p0) {}
    private static java.io.File getStashFile(int p0) { return null; }
}
