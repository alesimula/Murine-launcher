package android.security.keystore;

public class KeyInfo implements java.security.spec.KeySpec {
    public KeyInfo(java.lang.String p0, boolean p1, int p2, int p3, java.util.Date p4, java.util.Date p5, java.util.Date p6, int p7, java.lang.String[] p8, java.lang.String[] p9, java.lang.String[] p10, java.lang.String[] p11, boolean p12, int p13, int p14, boolean p15, boolean p16, boolean p17, boolean p18, boolean p19, boolean p20, int p21, int p22) {}
    public java.lang.String getKeystoreAlias() { return null; }
    @java.lang.Deprecated
    public boolean isInsideSecureHardware() { return false; }
    public int getOrigin() { return 0; }
    public int getKeySize() { return 0; }
    @android.annotation.Nullable
    public java.util.Date getKeyValidityStart() { return null; }
    @android.annotation.Nullable
    public java.util.Date getKeyValidityForConsumptionEnd() { return null; }
    @android.annotation.Nullable
    public java.util.Date getKeyValidityForOriginationEnd() { return null; }
    public int getPurposes() { return 0; }
    @android.annotation.NonNull
    public java.lang.String[] getBlockModes() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getEncryptionPaddings() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getSignaturePaddings() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getDigests() { return null; }
    public boolean isUserAuthenticationRequired() { return false; }
    @android.annotation.FlaggedApi("android.security.keyinfo_unlocked_device_required")
    public boolean isUnlockedDeviceRequired() { return false; }
    public boolean isUserConfirmationRequired() { return false; }
    public int getUserAuthenticationValidityDurationSeconds() { return 0; }
    public int getUserAuthenticationType() { return 0; }
    public boolean isUserAuthenticationRequirementEnforcedBySecureHardware() { return false; }
    public boolean isUserAuthenticationValidWhileOnBody() { return false; }
    public boolean isInvalidatedByBiometricEnrollment() { return false; }
    public boolean isTrustedUserPresenceRequired() { return false; }
    public int getSecurityLevel() { return 0; }
    public int getRemainingUsageCount() { return 0; }
}
