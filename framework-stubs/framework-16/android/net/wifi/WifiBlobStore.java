package android.net.wifi;

public class WifiBlobStore extends com.android.internal.net.ConnectivityBlobStore {
    WifiBlobStore() { super((java.lang.String)null); }
    public static boolean supplicantCanAccessBlobstore() { return false; }
    public static android.net.wifi.WifiBlobStore getInstance() { return null; }
    public static android.security.legacykeystore.ILegacyKeystore getLegacyKeystore() { return null; }
}
