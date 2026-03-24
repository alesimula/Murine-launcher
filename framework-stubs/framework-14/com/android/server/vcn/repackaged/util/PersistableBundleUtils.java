package com.android.server.vcn.repackaged.util;

public class PersistableBundleUtils {
    public static final com.android.server.vcn.repackaged.util.PersistableBundleUtils.Serializer<java.lang.Integer> INTEGER_SERIALIZER = null;
    public static final com.android.server.vcn.repackaged.util.PersistableBundleUtils.Deserializer<java.lang.Integer> INTEGER_DESERIALIZER = null;
    public static final com.android.server.vcn.repackaged.util.PersistableBundleUtils.Serializer<java.lang.String> STRING_SERIALIZER = null;
    public static final com.android.server.vcn.repackaged.util.PersistableBundleUtils.Deserializer<java.lang.String> STRING_DESERIALIZER = null;
    public PersistableBundleUtils() {}
    public static android.os.PersistableBundle fromParcelUuid(android.os.ParcelUuid p0) { return null; }
    public static android.os.ParcelUuid toParcelUuid(android.os.PersistableBundle p0) { return null; }
    public static <T extends java.lang.Object> android.os.PersistableBundle fromList(java.util.List<T> p0, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Serializer<T> p1) { return null; }
    public static <T extends java.lang.Object> java.util.List<T> toList(android.os.PersistableBundle p0, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Deserializer<T> p1) { return null; }
    public static android.os.PersistableBundle fromByteArray(byte[] p0) { return null; }
    public static byte[] toByteArray(android.os.PersistableBundle p0) { return null; }
    public static <K extends java.lang.Object, V extends java.lang.Object> android.os.PersistableBundle fromMap(java.util.Map<K, V> p0, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Serializer<K> p1, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Serializer<V> p2) { return null; }
    public static <K extends java.lang.Object, V extends java.lang.Object> java.util.LinkedHashMap<K, V> toMap(android.os.PersistableBundle p0, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Deserializer<K> p1, com.android.server.vcn.repackaged.util.PersistableBundleUtils.Deserializer<V> p2) { return null; }
    public static byte[] toDiskStableBytes(android.os.PersistableBundle p0) throws java.io.IOException { return null; }
    public static android.os.PersistableBundle fromDiskStableBytes(byte[] p0) throws java.io.IOException { return null; }
    public static android.os.PersistableBundle minimizeBundle(android.os.PersistableBundle p0, java.lang.String... p1) { return null; }
    public static int getHashCode(android.os.PersistableBundle p0) { return 0; }
    public static boolean isEqual(android.os.PersistableBundle p0, android.os.PersistableBundle p1) { return false; }

    public static interface Deserializer<T extends java.lang.Object> {
        public T fromPersistableBundle(android.os.PersistableBundle p0);
    }

    public static class LockingReadWriteHelper {
        public LockingReadWriteHelper(java.lang.String p0) {}
        public android.os.PersistableBundle readFromDisk() throws java.io.IOException { return null; }
        public void writeToDisk(android.os.PersistableBundle p0) throws java.io.IOException {}
    }

    public static class PersistableBundleWrapper {
        public PersistableBundleWrapper(android.os.PersistableBundle p0) {}
        public int getInt(java.lang.String p0, int p1) { return 0; }
        public int[] getIntArray(java.lang.String p0, int[] p1) { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static interface Serializer<T extends java.lang.Object> {
        public android.os.PersistableBundle toPersistableBundle(T p0);
    }
}
