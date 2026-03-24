package android.util;

public class HashedStringCache {
    private static android.util.HashedStringCache sHashedStringCache;
    private static final java.nio.charset.Charset UTF_8 = null;
    private static final int HASH_CACHE_SIZE = 100;
    private static final int HASH_LENGTH = 8;
    static final java.lang.String HASH_SALT = "_hash_salt";
    static final java.lang.String HASH_SALT_DATE = "_hash_salt_date";
    static final java.lang.String HASH_SALT_GEN = "_hash_salt_gen";
    private static final long DAYS_TO_MILLIS = 86400000L;
    private static final int MAX_SALT_DAYS = 100;
    private final android.util.LruCache<java.lang.String, java.lang.String> mHashes = null;
    private final java.security.SecureRandom mSecureRandom = null;
    private final java.lang.Object mPreferenceLock = null;
    private final java.security.MessageDigest mDigester = null;
    private byte[] mSalt;
    private int mSaltGen;
    private android.content.SharedPreferences mSharedPreferences;
    private static final java.lang.String TAG = "HashedStringCache";
    private static final boolean DEBUG = false;
    private HashedStringCache() {}
    public static android.util.HashedStringCache getInstance() { return null; }
    public android.util.HashedStringCache.HashResult hashString(android.content.Context p0, java.lang.String p1, java.lang.String p2, int p3) { return null; }
    private boolean checkNeedsNewSalt(java.lang.String p0, int p1, long p2) { return false; }
    private void populateSaltValues(android.content.Context p0, java.lang.String p1, int p2) {}
    private android.content.SharedPreferences getHashSharedPreferences(android.content.Context p0) { return null; }

    public class HashResult {
        public java.lang.String hashedString;
        public int saltGeneration;
        public HashResult(android.util.HashedStringCache p0, java.lang.String p1, int p2) {}
    }
}
