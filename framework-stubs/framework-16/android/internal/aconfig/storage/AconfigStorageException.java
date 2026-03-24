package android.internal.aconfig.storage;

public class AconfigStorageException extends java.lang.RuntimeException {
    public static final int ERROR_GENERIC = 0;
    public static final int ERROR_STORAGE_SYSTEM_NOT_FOUND = 1;
    public static final int ERROR_PACKAGE_NOT_FOUND = 2;
    public static final int ERROR_CONTAINER_NOT_FOUND = 3;
    public static final int ERROR_CANNOT_READ_STORAGE_FILE = 4;
    public static final int ERROR_FILE_FINGERPRINT_MISMATCH = 5;
    public AconfigStorageException(java.lang.String p0) { super(); }
    public AconfigStorageException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    public AconfigStorageException(int p0, java.lang.String p1) { super(); }
    public AconfigStorageException(int p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    public int getErrorCode() { return 0; }
    public java.lang.String getMessage() { return null; }
}
