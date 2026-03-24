package android.security.keystore;

public class KeyInfo implements java.security.spec.KeySpec {
    private final java.lang.String mKeystoreAlias = null;
    private final int mKeySize = 0;
    private final boolean mInsideSecureHardware = false;
    private final int mOrigin = 0;
    private final java.util.Date mKeyValidityStart = null;
    private final java.util.Date mKeyValidityForOriginationEnd = null;
    private final java.util.Date mKeyValidityForConsumptionEnd = null;
    private final int mPurposes = 0;
    private final java.lang.String[] mEncryptionPaddings = null;
    private final java.lang.String[] mSignaturePaddings = null;
    private final java.lang.String[] mDigests = null;
    private final java.lang.String[] mBlockModes = null;
    private final boolean mUserAuthenticationRequired = false;
    private final int mUserAuthenticationValidityDurationSeconds = 0;
    private final int mUserAuthenticationType = 0;
    private final boolean mUserAuthenticationRequirementEnforcedBySecureHardware = false;
    private final boolean mUserAuthenticationValidWhileOnBody = false;
    private final boolean mTrustedUserPresenceRequired = false;
    private final boolean mInvalidatedByBiometricEnrollment = false;
    private final boolean mUserConfirmationRequired = false;
    public KeyInfo(java.lang.String p0, boolean p1, int p2, int p3, java.util.Date p4, java.util.Date p5, java.util.Date p6, int p7, java.lang.String[] p8, java.lang.String[] p9, java.lang.String[] p10, java.lang.String[] p11, boolean p12, int p13, int p14, boolean p15, boolean p16, boolean p17, boolean p18, boolean p19) {}
    public java.lang.String getKeystoreAlias() { return null; }
    public boolean isInsideSecureHardware() { return false; }
    public int getOrigin() { return 0; }
    public int getKeySize() { return 0; }
    public java.util.Date getKeyValidityStart() { return null; }
    public java.util.Date getKeyValidityForConsumptionEnd() { return null; }
    public java.util.Date getKeyValidityForOriginationEnd() { return null; }
    public int getPurposes() { return 0; }
    public java.lang.String[] getBlockModes() { return null; }
    public java.lang.String[] getEncryptionPaddings() { return null; }
    public java.lang.String[] getSignaturePaddings() { return null; }
    public java.lang.String[] getDigests() { return null; }
    public boolean isUserAuthenticationRequired() { return false; }
    public boolean isUserConfirmationRequired() { return false; }
    public int getUserAuthenticationValidityDurationSeconds() { return 0; }
    public int getUserAuthenticationType() { return 0; }
    public boolean isUserAuthenticationRequirementEnforcedBySecureHardware() { return false; }
    public boolean isUserAuthenticationValidWhileOnBody() { return false; }
    public boolean isInvalidatedByBiometricEnrollment() { return false; }
    public boolean isTrustedUserPresenceRequired() { return false; }
}
