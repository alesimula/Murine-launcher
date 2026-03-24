package android.webkit;

public abstract class ClientCertRequest {
    public ClientCertRequest() {}
    public abstract java.lang.String[] getKeyTypes();
    public abstract java.security.Principal[] getPrincipals();
    public abstract java.lang.String getHost();
    public abstract int getPort();
    public abstract void proceed(java.security.PrivateKey p0, java.security.cert.X509Certificate[] p1);
    public abstract void ignore();
    public abstract void cancel();
}
