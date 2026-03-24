package android.telecom;

public class AuthenticatorService extends android.app.Service {
    private static android.telecom.AuthenticatorService.Authenticator mAuthenticator;
    public AuthenticatorService() { super(); }
    public void onCreate() {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }

    public class Authenticator extends android.accounts.AbstractAccountAuthenticator {
        public Authenticator(android.telecom.AuthenticatorService p0, android.content.Context p1) { super(null); }
        public android.os.Bundle editProperties(android.accounts.AccountAuthenticatorResponse p0, java.lang.String p1) { return null; }
        public android.os.Bundle addAccount(android.accounts.AccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4) throws android.accounts.NetworkErrorException { return null; }
        public android.os.Bundle confirmCredentials(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2) throws android.accounts.NetworkErrorException { return null; }
        public android.os.Bundle getAuthToken(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.accounts.NetworkErrorException { return null; }
        public java.lang.String getAuthTokenLabel(java.lang.String p0) { return null; }
        public android.os.Bundle updateCredentials(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3) throws android.accounts.NetworkErrorException { return null; }
        public android.os.Bundle hasFeatures(android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String[] p2) throws android.accounts.NetworkErrorException { return null; }
    }
}
