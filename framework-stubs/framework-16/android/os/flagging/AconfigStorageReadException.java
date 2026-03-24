package android.os.flagging;

@android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
public class AconfigStorageReadException extends java.lang.RuntimeException {
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public static final int ERROR_CANNOT_READ_STORAGE_FILE = 4;
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public static final int ERROR_CONTAINER_NOT_FOUND = 3;
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public static final int ERROR_GENERIC = 0;
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public static final int ERROR_PACKAGE_NOT_FOUND = 2;
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public static final int ERROR_STORAGE_SYSTEM_NOT_FOUND = 1;
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public AconfigStorageReadException(int p0, java.lang.String p1) { super(); }
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public AconfigStorageReadException(int p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public AconfigStorageReadException(int p0, java.lang.Throwable p1) { super(); }
    @android.annotation.FlaggedApi("android.provider.flags.new_storage_public_api")
    public int getErrorCode() { return 0; }
}
