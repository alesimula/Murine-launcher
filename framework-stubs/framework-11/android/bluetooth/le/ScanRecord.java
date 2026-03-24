package android.bluetooth.le;

public final class ScanRecord {
    private static final java.lang.String TAG = "ScanRecord";
    private static final int DATA_TYPE_FLAGS = 1;
    private static final int DATA_TYPE_SERVICE_UUIDS_16_BIT_PARTIAL = 2;
    private static final int DATA_TYPE_SERVICE_UUIDS_16_BIT_COMPLETE = 3;
    private static final int DATA_TYPE_SERVICE_UUIDS_32_BIT_PARTIAL = 4;
    private static final int DATA_TYPE_SERVICE_UUIDS_32_BIT_COMPLETE = 5;
    private static final int DATA_TYPE_SERVICE_UUIDS_128_BIT_PARTIAL = 6;
    private static final int DATA_TYPE_SERVICE_UUIDS_128_BIT_COMPLETE = 7;
    private static final int DATA_TYPE_LOCAL_NAME_SHORT = 8;
    private static final int DATA_TYPE_LOCAL_NAME_COMPLETE = 9;
    private static final int DATA_TYPE_TX_POWER_LEVEL = 10;
    private static final int DATA_TYPE_SERVICE_DATA_16_BIT = 22;
    private static final int DATA_TYPE_SERVICE_DATA_32_BIT = 32;
    private static final int DATA_TYPE_SERVICE_DATA_128_BIT = 33;
    private static final int DATA_TYPE_SERVICE_SOLICITATION_UUIDS_16_BIT = 20;
    private static final int DATA_TYPE_SERVICE_SOLICITATION_UUIDS_32_BIT = 31;
    private static final int DATA_TYPE_SERVICE_SOLICITATION_UUIDS_128_BIT = 21;
    private static final int DATA_TYPE_MANUFACTURER_SPECIFIC_DATA = 255;
    private final int mAdvertiseFlags = 0;
    private final java.util.List<android.os.ParcelUuid> mServiceUuids = null;
    private final java.util.List<android.os.ParcelUuid> mServiceSolicitationUuids = null;
    private final android.util.SparseArray<byte[]> mManufacturerSpecificData = null;
    private final java.util.Map<android.os.ParcelUuid, byte[]> mServiceData = null;
    private final int mTxPowerLevel = 0;
    private final java.lang.String mDeviceName = null;
    private final byte[] mBytes = null;
    public int getAdvertiseFlags() { return 0; }
    public java.util.List<android.os.ParcelUuid> getServiceUuids() { return null; }
    public java.util.List<android.os.ParcelUuid> getServiceSolicitationUuids() { return null; }
    public android.util.SparseArray<byte[]> getManufacturerSpecificData() { return null; }
    public byte[] getManufacturerSpecificData(int p0) { return null; }
    public java.util.Map<android.os.ParcelUuid, byte[]> getServiceData() { return null; }
    public byte[] getServiceData(android.os.ParcelUuid p0) { return null; }
    public int getTxPowerLevel() { return 0; }
    public java.lang.String getDeviceName() { return null; }
    public byte[] getBytes() { return null; }
    private ScanRecord(java.util.List<android.os.ParcelUuid> p0, java.util.List<android.os.ParcelUuid> p1, android.util.SparseArray<byte[]> p2, java.util.Map<android.os.ParcelUuid, byte[]> p3, int p4, int p5, java.lang.String p6, byte[] p7) {}
    public static android.bluetooth.le.ScanRecord parseFromBytes(byte[] p0) { return null; }
    public java.lang.String toString() { return null; }
    private static int parseServiceUuid(byte[] p0, int p1, int p2, int p3, java.util.List<android.os.ParcelUuid> p4) { return 0; }
    private static int parseServiceSolicitationUuid(byte[] p0, int p1, int p2, int p3, java.util.List<android.os.ParcelUuid> p4) { return 0; }
    private static byte[] extractBytes(byte[] p0, int p1, int p2) { return null; }
}
