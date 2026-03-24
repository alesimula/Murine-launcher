package android.service.credentials;

public final class CredentialProviderInfoFactory {
    public CredentialProviderInfoFactory() {}
    public static android.credentials.CredentialProviderInfo create(android.content.Context p0, android.content.ComponentName p1, int p2, boolean p3, boolean p4) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.NullPointerException { return null; }
    public static android.credentials.CredentialProviderInfo create(android.content.Context p0, android.content.pm.ServiceInfo p1, boolean p2, boolean p3, boolean p4, boolean p5) throws java.lang.SecurityException, java.lang.NullPointerException { return null; }
    public static android.credentials.CredentialProviderInfo createForTests(android.content.pm.ServiceInfo p0, java.lang.CharSequence p1, boolean p2, boolean p3, java.util.List<java.lang.String> p4) { return null; }
    @android.annotation.NonNull
    public static java.util.List<android.credentials.CredentialProviderInfo> getAvailableSystemServices(android.content.Context p0, int p1, boolean p2, java.util.Set<android.content.ComponentName> p3) { return null; }
    @android.annotation.NonNull
    public static java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServices(android.content.Context p0, int p1, int p2, java.util.Set<android.content.ComponentName> p3, java.util.Set<android.content.ComponentName> p4) { return null; }
    @android.annotation.NonNull
    public static java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServicesForTesting(android.content.Context p0, int p1, int p2, java.util.Set<android.content.ComponentName> p3, java.util.Set<android.content.ComponentName> p4) { return null; }

    private static class ProviderGenerator {
        ProviderGenerator(android.content.Context p0, android.app.admin.PackagePolicy p1, boolean p2, int p3) {}
        public java.util.List<android.credentials.CredentialProviderInfo> getProviders() { return null; }
        public void addUserProviders(java.util.List<android.credentials.CredentialProviderInfo> p0) {}
        public void addSystemProviders(java.util.List<android.credentials.CredentialProviderInfo> p0) {}
    }
}
