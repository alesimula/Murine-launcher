package com.android.server.vcn.repackaged.util;

public class PersistableBundleUtils {
    private static final java.lang.String LIST_KEY_FORMAT = "LIST_ITEM_%d";
    private static final java.lang.String COLLECTION_SIZE_KEY = "COLLECTION_LENGTH";
    private static final java.lang.String MAP_KEY_FORMAT = "MAP_KEY_%d";
    private static final java.lang.String MAP_VALUE_FORMAT = "MAP_VALUE_%d";
    private static final java.lang.String PARCEL_UUID_KEY = "PARCEL_UUID";
    private static final java.lang.String BYTE_ARRAY_KEY = "BYTE_ARRAY_KEY";
    private static final java.lang.String INTEGER_KEY = "INTEGER_KEY";
    public static final com.android.server.vcn.repackaged.util.PersistableBundleUtils.Serializer<java.lang.Integer> INTEGER_SERIALIZER = null;
    public static final com.android.server.vcn.repackaged.util.PersistableBundleUtils.Deserializer<java.lang.Integer> INTEGER_DESERIALIZER = null;
    public PersistableBundleUtils() {}
    public static android.os.PersistableBundle fromParcelUuid(android.os.ParcelUuid p0) { return null; }
    public static android.os.ParcelUuid toParcelUuid(android.os.PersistableBundle p0) { return null; }
    public static <T extends java.lang.Object> android.os.PersistableBundle fromList(java.util.List<T> p0, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Serializer<T> p1) { return null; }
    public static <T extends java.lang.Object> java.util.List<T> toList(android.os.PersistableBundle p0, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Deserializer<T> p1) { return null; }
    public static android.os.PersistableBundle fromByteArray(byte[] p0) { return null; }
    public static byte[] toByteArray(android.os.PersistableBundle p0) { return null; }
    public static <K extends java.lang.Object, V extends java.lang.Object> android.os.PersistableBundle fromMap(java.util.Map<K, V> p0, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Serializer<K> p1, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Serializer<V> p2) { return null; }
    public static <K extends java.lang.Object, V extends java.lang.Object> java.util.LinkedHashMap<K, V> toMap(android.os.PersistableBundle p0, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Deserializer<K> p1, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Deserializer<V> p2) { return null; }

    public static interface Deserializer<T extends java.lang.Object> {
        public T fromPersistableBundle(android.os.PersistableBundle p0);
    }

    public static class LockingReadWriteHelper {
        private final java.util.concurrent.locks.ReadWriteLock mDiskLock = null;
        private final java.lang.String mPath = null;
        public LockingReadWriteHelper(java.lang.String p0) {}
        public android.os.PersistableBundle readFromDisk() throws java.io.IOException { return null; }
        public void writeToDisk(android.os.PersistableBundle p0) throws java.io.IOException {}
    }

    public static interface Serializer<T extends java.lang.Object> {
        public android.os.PersistableBundle toPersistableBundle(T p0);
    }
}
