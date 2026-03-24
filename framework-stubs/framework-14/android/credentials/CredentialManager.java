package android.credentials;

public final class CredentialManager {
    public static final int PROVIDER_FILTER_ALL_PROVIDERS = 0;
    public static final int PROVIDER_FILTER_SYSTEM_PROVIDERS_ONLY = 1;
    public static final int PROVIDER_FILTER_USER_PROVIDERS_ONLY = 2;
    public static final java.lang.String DEVICE_CONFIG_ENABLE_CREDENTIAL_MANAGER = "enable_credential_manager";
    public CredentialManager(android.content.Context p0, android.credentials.ICredentialManager p1) {}
    public void getCredential(android.content.Context p0, android.credentials.GetCredentialRequest p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p4) {}
    public void getCredential(android.content.Context p0, android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p4) {}
    public void prepareGetCredential(android.credentials.GetCredentialRequest p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.credentials.PrepareGetCredentialResponse, android.credentials.GetCredentialException> p3) {}
    public void createCredential(android.content.Context p0, android.credentials.CreateCredentialRequest p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.credentials.CreateCredentialResponse, android.credentials.CreateCredentialException> p4) {}
    public void clearCredentialState(android.credentials.ClearCredentialStateRequest p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Void, android.credentials.ClearCredentialStateException> p3) {}
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setEnabledProviders(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, int p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<java.lang.Void, android.credentials.SetEnabledProvidersException> p4) {}
    public boolean isEnabledCredentialProviderService(android.content.ComponentName p0) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.QUERY_ALL_PACKAGES", "android.permission.LIST_ENABLED_CREDENTIAL_PROVIDERS"})
    public java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServicesForTesting(int p0) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.QUERY_ALL_PACKAGES", "android.permission.LIST_ENABLED_CREDENTIAL_PROVIDERS"})
    public java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServices(int p0, int p1) { return null; }
    public static boolean isServiceEnabled(android.content.Context p0) { return false; }
    public static boolean isCredentialDescriptionApiEnabled(android.content.Context p0) { return false; }
    public void registerCredentialDescription(android.credentials.RegisterCredentialDescriptionRequest p0) {}
    public void unregisterCredentialDescription(android.credentials.UnregisterCredentialDescriptionRequest p0) {}

    private static class ClearCredentialStateTransport extends android.credentials.IClearCredentialStateCallback.Stub {
        public void onSuccess() {}
        public void onError(java.lang.String p0, java.lang.String p1) {}
    }

    private static class CreateCredentialTransport extends android.credentials.ICreateCredentialCallback.Stub {
        public void onPendingIntent(android.app.PendingIntent p0) {}
        public void onResponse(android.credentials.CreateCredentialResponse p0) {}
        public void onError(java.lang.String p0, java.lang.String p1) {}
    }

    private static class GetCredentialTransport extends android.credentials.IGetCredentialCallback.Stub {
        public void onPendingIntent(android.app.PendingIntent p0) {}
        public void onResponse(android.credentials.GetCredentialResponse p0) {}
        public void onError(java.lang.String p0, java.lang.String p1) {}
    }

    protected static class GetCredentialTransportPendingUseCase extends android.credentials.IGetCredentialCallback.Stub {
        public void setCallback(android.credentials.PrepareGetCredentialResponse.GetPendingCredentialInternalCallback p0) {}
        public void onPendingIntent(android.app.PendingIntent p0) {}
        public void onResponse(android.credentials.GetCredentialResponse p0) {}
        public void onError(java.lang.String p0, java.lang.String p1) {}
    }

    private static class PrepareGetCredentialTransport extends android.credentials.IPrepareGetCredentialCallback.Stub {
        public void onResponse(android.credentials.PrepareGetCredentialResponseInternal p0) {}
        public void onError(java.lang.String p0, java.lang.String p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProviderFilter {
    }

    private static class SetEnabledProvidersTransport extends android.credentials.ISetEnabledProvidersCallback.Stub {
        public void onResponse(java.lang.Void p0) {}
        public void onResponse() {}
        public void onError(java.lang.String p0, java.lang.String p1) {}
    }
}
