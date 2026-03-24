package android.content.pm;

public class PackagePartitions {
    public static final int PARTITION_SYSTEM = 0;
    public static final int PARTITION_VENDOR = 1;
    public static final int PARTITION_ODM = 2;
    public static final int PARTITION_OEM = 3;
    public static final int PARTITION_PRODUCT = 4;
    public static final int PARTITION_SYSTEM_EXT = 5;
    public static final java.lang.String FINGERPRINT = null;
    public PackagePartitions() {}
    public static <T extends java.lang.Object> java.util.ArrayList<T> getOrderedPartitions(java.util.function.Function<android.content.pm.PackagePartitions.SystemPartition, T> p0) { return null; }

    private static class DeferredCanonicalFile {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PartitionType {
    }

    public static class SystemPartition {
        public final int type = 0;
        public SystemPartition(android.content.pm.PackagePartitions.SystemPartition p0) {}
        public SystemPartition(java.io.File p0, android.content.pm.PackagePartitions.SystemPartition p1) {}
        @android.annotation.NonNull
        public java.lang.String getName() { return null; }
        @android.annotation.NonNull
        public java.io.File getFolder() { return null; }
        @android.annotation.NonNull
        public java.io.File getNonConicalFolder() { return null; }
        @android.annotation.Nullable
        public java.io.File getAppFolder() { return null; }
        @android.annotation.Nullable
        public java.io.File getPrivAppFolder() { return null; }
        @android.annotation.Nullable
        public java.io.File getOverlayFolder() { return null; }
        public boolean containsPath(java.lang.String p0) { return false; }
        public boolean containsFile(java.io.File p0) { return false; }
        public boolean containsPrivApp(java.io.File p0) { return false; }
        public boolean containsApp(java.io.File p0) { return false; }
        public boolean containsOverlay(java.io.File p0) { return false; }
    }
}
