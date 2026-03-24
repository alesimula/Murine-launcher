package android.adservices.ondevicepersonalization;

public abstract class IsolatedService extends android.app.Service {
    public IsolatedService() { super(); }
    @android.annotation.NonNull
    public final android.adservices.ondevicepersonalization.EventUrlProvider getEventUrlProvider(android.adservices.ondevicepersonalization.RequestToken p0) { return null; }
    @android.annotation.NonNull
    public final android.adservices.ondevicepersonalization.FederatedComputeScheduler getFederatedComputeScheduler(android.adservices.ondevicepersonalization.RequestToken p0) { return null; }
    @android.annotation.NonNull
    public final android.adservices.ondevicepersonalization.MutableKeyValueStore getLocalData(android.adservices.ondevicepersonalization.RequestToken p0) { return null; }
    @android.annotation.NonNull
    public final android.adservices.ondevicepersonalization.LogReader getLogReader(android.adservices.ondevicepersonalization.RequestToken p0) { return null; }
    @android.annotation.NonNull
    public final android.adservices.ondevicepersonalization.ModelManager getModelManager(android.adservices.ondevicepersonalization.RequestToken p0) { return null; }
    @android.annotation.NonNull
    public final android.adservices.ondevicepersonalization.KeyValueStore getRemoteData(android.adservices.ondevicepersonalization.RequestToken p0) { return null; }
    @android.annotation.Nullable
    public final android.adservices.ondevicepersonalization.UserData getUserData(android.adservices.ondevicepersonalization.RequestToken p0) { return null; }
    @android.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.NonNull
    public abstract android.adservices.ondevicepersonalization.IsolatedWorker onRequest(android.adservices.ondevicepersonalization.RequestToken p0);
}
