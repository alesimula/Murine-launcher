package android.util;

public class HashedStringCache {
    static final java.lang.String HASH_SALT = "_hash_salt";
    static final java.lang.String HASH_SALT_DATE = "_hash_salt_date";
    static final java.lang.String HASH_SALT_GEN = "_hash_salt_gen";
    public static android.util.HashedStringCache getInstance() { return null; }
    public android.util.HashedStringCache.HashResult hashString(android.content.Context p0, java.lang.String p1, java.lang.String p2, int p3) { return null; }

    public class HashResult {
        public java.lang.String hashedString;
        public int saltGeneration;
        public HashResult(android.util.HashedStringCache p0, java.lang.String p1, int p2) {}
    }
}
