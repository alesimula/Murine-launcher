package com.android.internal.hidden_from_bootclasspath.android.security.keystore2;

public final class Flags {
    public static final java.lang.String FLAG_ATTEST_MODULES = "android.security.keystore2.attest_modules";
    public static final java.lang.String FLAG_COUNT_KEYS_PER_UID = "android.security.keystore2.count_keys_per_uid";
    public static final java.lang.String FLAG_DISABLE_LEGACY_KEYSTORE_GET = "android.security.keystore2.disable_legacy_keystore_get";
    public static final java.lang.String FLAG_DISABLE_LEGACY_KEYSTORE_PUT_V2 = "android.security.keystore2.disable_legacy_keystore_put_v2";
    public static final java.lang.String FLAG_IMPORT_PREVIOUSLY_EMULATED_KEYS = "android.security.keystore2.import_previously_emulated_keys";
    public static final java.lang.String FLAG_REMOVE_REBOUND_KEYBLOBS_FIX = "android.security.keystore2.remove_rebound_keyblobs_fix";
    public static final java.lang.String FLAG_WAL_DB_JOURNALMODE_V3 = "android.security.keystore2.wal_db_journalmode_v3";
    public Flags() {}
    public static boolean attestModules() { return false; }
    public static boolean countKeysPerUid() { return false; }
    public static boolean disableLegacyKeystoreGet() { return false; }
    public static boolean disableLegacyKeystorePutV2() { return false; }
    public static boolean importPreviouslyEmulatedKeys() { return false; }
    public static boolean removeReboundKeyblobsFix() { return false; }
    public static boolean walDbJournalmodeV3() { return false; }
}
