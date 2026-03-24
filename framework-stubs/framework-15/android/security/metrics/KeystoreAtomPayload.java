package android.security.metrics;

public final class KeystoreAtomPayload implements android.os.Parcelable {
    public static final int storageStats = 0;
    public static final int keyCreationWithGeneralInfo = 1;
    public static final int keyCreationWithAuthInfo = 2;
    public static final int keyCreationWithPurposeAndModesInfo = 3;
    public static final int keystore2AtomWithOverflow = 4;
    public static final int keyOperationWithPurposeAndModesInfo = 5;
    public static final int keyOperationWithGeneralInfo = 6;
    public static final int rkpErrorStats = 7;
    public static final int crashStats = 8;
    public static final android.os.Parcelable.Creator<android.security.metrics.KeystoreAtomPayload> CREATOR = null;
    public KeystoreAtomPayload() {}
    public int getTag() { return 0; }
    public static android.security.metrics.KeystoreAtomPayload storageStats(android.security.metrics.StorageStats p0) { return null; }
    public android.security.metrics.StorageStats getStorageStats() { return null; }
    public void setStorageStats(android.security.metrics.StorageStats p0) {}
    public static android.security.metrics.KeystoreAtomPayload keyCreationWithGeneralInfo(android.security.metrics.KeyCreationWithGeneralInfo p0) { return null; }
    public android.security.metrics.KeyCreationWithGeneralInfo getKeyCreationWithGeneralInfo() { return null; }
    public void setKeyCreationWithGeneralInfo(android.security.metrics.KeyCreationWithGeneralInfo p0) {}
    public static android.security.metrics.KeystoreAtomPayload keyCreationWithAuthInfo(android.security.metrics.KeyCreationWithAuthInfo p0) { return null; }
    public android.security.metrics.KeyCreationWithAuthInfo getKeyCreationWithAuthInfo() { return null; }
    public void setKeyCreationWithAuthInfo(android.security.metrics.KeyCreationWithAuthInfo p0) {}
    public static android.security.metrics.KeystoreAtomPayload keyCreationWithPurposeAndModesInfo(android.security.metrics.KeyCreationWithPurposeAndModesInfo p0) { return null; }
    public android.security.metrics.KeyCreationWithPurposeAndModesInfo getKeyCreationWithPurposeAndModesInfo() { return null; }
    public void setKeyCreationWithPurposeAndModesInfo(android.security.metrics.KeyCreationWithPurposeAndModesInfo p0) {}
    public static android.security.metrics.KeystoreAtomPayload keystore2AtomWithOverflow(android.security.metrics.Keystore2AtomWithOverflow p0) { return null; }
    public android.security.metrics.Keystore2AtomWithOverflow getKeystore2AtomWithOverflow() { return null; }
    public void setKeystore2AtomWithOverflow(android.security.metrics.Keystore2AtomWithOverflow p0) {}
    public static android.security.metrics.KeystoreAtomPayload keyOperationWithPurposeAndModesInfo(android.security.metrics.KeyOperationWithPurposeAndModesInfo p0) { return null; }
    public android.security.metrics.KeyOperationWithPurposeAndModesInfo getKeyOperationWithPurposeAndModesInfo() { return null; }
    public void setKeyOperationWithPurposeAndModesInfo(android.security.metrics.KeyOperationWithPurposeAndModesInfo p0) {}
    public static android.security.metrics.KeystoreAtomPayload keyOperationWithGeneralInfo(android.security.metrics.KeyOperationWithGeneralInfo p0) { return null; }
    public android.security.metrics.KeyOperationWithGeneralInfo getKeyOperationWithGeneralInfo() { return null; }
    public void setKeyOperationWithGeneralInfo(android.security.metrics.KeyOperationWithGeneralInfo p0) {}
    public static android.security.metrics.KeystoreAtomPayload rkpErrorStats(android.security.metrics.RkpErrorStats p0) { return null; }
    public android.security.metrics.RkpErrorStats getRkpErrorStats() { return null; }
    public void setRkpErrorStats(android.security.metrics.RkpErrorStats p0) {}
    public static android.security.metrics.KeystoreAtomPayload crashStats(android.security.metrics.CrashStats p0) { return null; }
    public android.security.metrics.CrashStats getCrashStats() { return null; }
    public void setCrashStats(android.security.metrics.CrashStats p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int storageStats = 0;
        public static final int keyCreationWithGeneralInfo = 1;
        public static final int keyCreationWithAuthInfo = 2;
        public static final int keyCreationWithPurposeAndModesInfo = 3;
        public static final int keystore2AtomWithOverflow = 4;
        public static final int keyOperationWithPurposeAndModesInfo = 5;
        public static final int keyOperationWithGeneralInfo = 6;
        public static final int rkpErrorStats = 7;
        public static final int crashStats = 8;
    }
}
