package android.security.keystore;

public interface UserAuthArgs {
    public boolean isUserAuthenticationRequired();
    public int getUserAuthenticationValidityDurationSeconds();
    public int getUserAuthenticationType();
    public boolean isUserAuthenticationValidWhileOnBody();
    public boolean isInvalidatedByBiometricEnrollment();
    public boolean isUserConfirmationRequired();
    public long getBoundToSpecificSecureUserId();
    public boolean isUserPresenceRequired();
    public boolean isUnlockedDeviceRequired();
}
