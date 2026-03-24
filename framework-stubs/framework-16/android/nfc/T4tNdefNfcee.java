package android.nfc;

@android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
public final class T4tNdefNfcee {
    public static final int CLEAR_DATA_FAILED_DEVICE_BUSY = -1;
    public static final int CLEAR_DATA_FAILED_INTERNAL = 0;
    public static final int CLEAR_DATA_SUCCESS = 1;
    public static final int WRITE_DATA_ERROR_CONNECTION_FAILED = -6;
    public static final int WRITE_DATA_ERROR_DEVICE_BUSY = -9;
    public static final int WRITE_DATA_ERROR_EMPTY_PAYLOAD = -7;
    public static final int WRITE_DATA_ERROR_INTERNAL = -1;
    public static final int WRITE_DATA_ERROR_INVALID_FILE_ID = -4;
    public static final int WRITE_DATA_ERROR_INVALID_LENGTH = -5;
    public static final int WRITE_DATA_ERROR_NDEF_VALIDATION_FAILED = -8;
    public static final int WRITE_DATA_ERROR_NFC_NOT_ON = -3;
    public static final int WRITE_DATA_ERROR_RF_ACTIVATED = -2;
    public static final int WRITE_DATA_SUCCESS = 0;
    T4tNdefNfcee() {}
    public int clearData() { return 0; }
    public boolean isOperationOngoing() { return false; }
    public boolean isSupported() { return false; }
    @android.annotation.Nullable
    public android.nfc.T4tNdefNfceeCcFileInfo readCcfile() { return null; }
    @android.annotation.NonNull
    public byte[] readData(int p0) { return null; }
    public int writeData(int p0, byte[] p1) { return 0; }
}
