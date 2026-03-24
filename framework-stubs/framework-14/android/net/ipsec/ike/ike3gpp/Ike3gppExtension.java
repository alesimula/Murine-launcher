package android.net.ipsec.ike.ike3gpp;

public final class Ike3gppExtension {
    public Ike3gppExtension(android.net.ipsec.ike.ike3gpp.Ike3gppParams p0, android.net.ipsec.ike.ike3gpp.Ike3gppExtension.Ike3gppDataListener p1) {}
    @android.annotation.NonNull
    public android.net.ipsec.ike.ike3gpp.Ike3gppExtension.Ike3gppDataListener getIke3gppDataListener() { return null; }
    @android.annotation.NonNull
    public android.net.ipsec.ike.ike3gpp.Ike3gppParams getIke3gppParams() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static interface Ike3gppDataListener {
        public void onIke3gppDataReceived(java.util.List<android.net.ipsec.ike.ike3gpp.Ike3gppData> p0);
    }
}
