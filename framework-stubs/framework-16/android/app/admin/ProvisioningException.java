package android.app.admin;

@android.annotation.SystemApi
public class ProvisioningException extends android.util.AndroidException {
    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_PRE_CONDITION_FAILED = 1;
    public static final int ERROR_PROFILE_CREATION_FAILED = 2;
    public static final int ERROR_ADMIN_PACKAGE_INSTALLATION_FAILED = 3;
    public static final int ERROR_SETTING_PROFILE_OWNER_FAILED = 4;
    public static final int ERROR_STARTING_PROFILE_FAILED = 5;
    public static final int ERROR_REMOVE_NON_REQUIRED_APPS_FAILED = 6;
    public static final int ERROR_SET_DEVICE_OWNER_FAILED = 7;
    public ProvisioningException(java.lang.Exception p0, int p1) { super(); }
    public ProvisioningException(java.lang.Exception p0, int p1, java.lang.String p2) { super(); }
    public int getProvisioningError() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProvisioningError {
    }
}
