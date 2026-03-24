package android.net;

public abstract class PlatformVpnProfile {
    public static final int TYPE_IKEV2_IPSEC_USER_PASS = 6;
    public static final int TYPE_IKEV2_IPSEC_PSK = 7;
    public static final int TYPE_IKEV2_IPSEC_RSA = 8;
    public static final int MAX_MTU_DEFAULT = 1360;
    protected final int mType = 0;
    PlatformVpnProfile(int p0) {}
    public final int getType() { return 0; }
    public final java.lang.String getTypeString() { return null; }
    public abstract com.android.internal.net.VpnProfile toVpnProfile() throws java.io.IOException, java.security.GeneralSecurityException;
    public static android.net.PlatformVpnProfile fromVpnProfile(com.android.internal.net.VpnProfile p0) throws java.io.IOException, java.security.GeneralSecurityException { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlatformVpnType {
    }
}
