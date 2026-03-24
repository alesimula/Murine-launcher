package android.credentials;

public final class PrepareGetCredentialResponse {
    @android.annotation.RequiresPermission("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public boolean hasCredentialResults(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public boolean hasAuthenticationResults() { return false; }
    @android.annotation.RequiresPermission("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public boolean hasRemoteResults() { return false; }
    @android.annotation.NonNull
    public android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle getPendingGetCredentialHandle() { return null; }
    protected PrepareGetCredentialResponse(android.credentials.PrepareGetCredentialResponseInternal p0, android.credentials.CredentialManager.GetCredentialTransportPendingUseCase p1) {}

    protected static interface GetPendingCredentialInternalCallback {
        public void onPendingIntent(android.app.PendingIntent p0);
        public void onResponse(android.credentials.GetCredentialResponse p0);
        public void onError(java.lang.String p0, java.lang.String p1);
    }

    public static final class PendingGetCredentialHandle {
        PendingGetCredentialHandle(android.credentials.CredentialManager.GetCredentialTransportPendingUseCase p0, android.app.PendingIntent p1) {}
        void show(android.content.Context p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p3) {}
    }
}
