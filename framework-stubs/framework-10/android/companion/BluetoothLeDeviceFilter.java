package android.companion;

public final class BluetoothLeDeviceFilter implements android.companion.DeviceFilter<android.bluetooth.le.ScanResult> {
    private static final boolean DEBUG = false;
    private static final java.lang.String LOG_TAG = "BluetoothLeDeviceFilter";
    private static final int RENAME_PREFIX_LENGTH_LIMIT = 10;
    private final java.util.regex.Pattern mNamePattern = null;
    private final android.bluetooth.le.ScanFilter mScanFilter = null;
    private final byte[] mRawDataFilter = null;
    private final byte[] mRawDataFilterMask = null;
    private final java.lang.String mRenamePrefix = null;
    private final java.lang.String mRenameSuffix = null;
    private final int mRenameBytesFrom = 0;
    private final int mRenameBytesLength = 0;
    private final int mRenameNameFrom = 0;
    private final int mRenameNameLength = 0;
    private final boolean mRenameBytesReverseOrder = false;
    public static final android.os.Parcelable.Creator<android.companion.BluetoothLeDeviceFilter> CREATOR = null;
    private BluetoothLeDeviceFilter(java.util.regex.Pattern p0, android.bluetooth.le.ScanFilter p1, byte[] p2, byte[] p3, java.lang.String p4, java.lang.String p5, int p6, int p7, int p8, int p9, boolean p10) {}
    public java.util.regex.Pattern getNamePattern() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.bluetooth.le.ScanFilter getScanFilter() { return null; }
    public byte[] getRawDataFilter() { return null; }
    public byte[] getRawDataFilterMask() { return null; }
    public java.lang.String getRenamePrefix() { return null; }
    public java.lang.String getRenameSuffix() { return null; }
    public int getRenameBytesFrom() { return 0; }
    public int getRenameBytesLength() { return 0; }
    public boolean isRenameBytesReverseOrder() { return false; }
    public java.lang.String getDeviceDisplayName(android.bluetooth.le.ScanResult p0) { return null; }
    public boolean matches(android.bluetooth.le.ScanResult p0) { return false; }
    private boolean matches(android.bluetooth.BluetoothDevice p0) { return false; }
    public int getMediumType() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public static int getRenamePrefixLengthLimit() { return 0; }

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.BluetoothLeDeviceFilter> {
        private android.bluetooth.le.ScanFilter mScanFilter;
        private java.util.regex.Pattern mNamePattern;
        private byte[] mRawDataFilter;
        private byte[] mRawDataFilterMask;
        private java.lang.String mRenamePrefix;
        private java.lang.String mRenameSuffix;
        private int mRenameBytesFrom;
        private int mRenameBytesLength;
        private int mRenameNameFrom;
        private int mRenameNameLength;
        private boolean mRenameBytesReverseOrder;
        public Builder() { super(); }
        public android.companion.BluetoothLeDeviceFilter.Builder setNamePattern(java.util.regex.Pattern p0) { return null; }
        public android.companion.BluetoothLeDeviceFilter.Builder setScanFilter(android.bluetooth.le.ScanFilter p0) { return null; }
        public android.companion.BluetoothLeDeviceFilter.Builder setRawDataFilter(byte[] p0, byte[] p1) { return null; }
        public android.companion.BluetoothLeDeviceFilter.Builder setRenameFromBytes(java.lang.String p0, java.lang.String p1, int p2, int p3, java.nio.ByteOrder p4) { return null; }
        public android.companion.BluetoothLeDeviceFilter.Builder setRenameFromName(java.lang.String p0, java.lang.String p1, int p2, int p3) { return null; }
        private void checkRenameNotSet() {}
        private void checkRangeNotEmpty(int p0) {}
        private android.companion.BluetoothLeDeviceFilter.Builder setRename(java.lang.String p0, java.lang.String p1) { return null; }
        public android.companion.BluetoothLeDeviceFilter build() { return null; }
    }
}
