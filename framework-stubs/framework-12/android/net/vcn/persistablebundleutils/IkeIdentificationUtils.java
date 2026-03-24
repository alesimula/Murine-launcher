package android.net.vcn.persistablebundleutils;

public final class IkeIdentificationUtils {
    private static final java.lang.String ID_TYPE_KEY = "ID_TYPE_KEY";
    private static final java.lang.String DER_ASN1_DN_KEY = "DER_ASN1_DN_KEY";
    private static final java.lang.String FQDN_KEY = "FQDN_KEY";
    private static final java.lang.String KEY_ID_KEY = "KEY_ID_KEY";
    private static final java.lang.String IP4_ADDRESS_KEY = "IP4_ADDRESS_KEY";
    private static final java.lang.String IP6_ADDRESS_KEY = "IP6_ADDRESS_KEY";
    private static final java.lang.String RFC822_ADDRESS_KEY = "RFC822_ADDRESS_KEY";
    private static final int ID_TYPE_DER_ASN1_DN = 1;
    private static final int ID_TYPE_FQDN = 2;
    private static final int ID_TYPE_IPV4_ADDR = 3;
    private static final int ID_TYPE_IPV6_ADDR = 4;
    private static final int ID_TYPE_KEY_ID = 5;
    private static final int ID_TYPE_RFC822_ADDR = 6;
    public IkeIdentificationUtils() {}
    public static android.os.PersistableBundle toPersistableBundle(android.net.ipsec.ike.IkeIdentification p0) { return null; }
    private static android.os.PersistableBundle createPersistableBundle(int p0) { return null; }
    public static android.net.ipsec.ike.IkeIdentification fromPersistableBundle(android.os.PersistableBundle p0) { return null; }
}
