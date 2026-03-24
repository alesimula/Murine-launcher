package android.security.net.config;

public class RootTrustManagerFactorySpi extends javax.net.ssl.TrustManagerFactorySpi {
    public RootTrustManagerFactorySpi() { super(); }
    public void engineInit(javax.net.ssl.ManagerFactoryParameters p0) throws java.security.InvalidAlgorithmParameterException {}
    public void engineInit(java.security.KeyStore p0) throws java.security.KeyStoreException {}
    public javax.net.ssl.TrustManager[] engineGetTrustManagers() { return null; }

    public static final class ApplicationConfigParameters implements javax.net.ssl.ManagerFactoryParameters {
        public final android.security.net.config.ApplicationConfig config = null;
        public ApplicationConfigParameters(android.security.net.config.ApplicationConfig p0) {}
    }
}
