package android.service.appprediction;

@android.annotation.SystemApi
public abstract class AppPredictionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.appprediction.AppPredictionService";
    public AppPredictionService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onAppTargetEvent(android.app.prediction.AppPredictionSessionId p0, android.app.prediction.AppTargetEvent p1);
    public abstract void onLaunchLocationShown(android.app.prediction.AppPredictionSessionId p0, java.lang.String p1, java.util.List<android.app.prediction.AppTargetId> p2);
    public void onCreatePredictionSession(android.app.prediction.AppPredictionContext p0, android.app.prediction.AppPredictionSessionId p1) {}
    public abstract void onSortAppTargets(android.app.prediction.AppPredictionSessionId p0, java.util.List<android.app.prediction.AppTarget> p1, android.os.CancellationSignal p2, java.util.function.Consumer<java.util.List<android.app.prediction.AppTarget>> p3);
    public void onStartPredictionUpdates() {}
    public void onStopPredictionUpdates() {}
    public abstract void onRequestPredictionUpdate(android.app.prediction.AppPredictionSessionId p0);
    public void onDestroyPredictionSession(android.app.prediction.AppPredictionSessionId p0) {}
    public final void updatePredictions(android.app.prediction.AppPredictionSessionId p0, java.util.List<android.app.prediction.AppTarget> p1) {}

    private static final class CallbackWrapper implements java.util.function.Consumer<java.util.List<android.app.prediction.AppTarget>>, android.os.IBinder.DeathRecipient {
        CallbackWrapper(android.app.prediction.IPredictionCallback p0, java.util.function.Consumer<android.service.appprediction.AppPredictionService.CallbackWrapper> p1) {}
        public boolean isCallback(android.app.prediction.IPredictionCallback p0) { return false; }
        public void destroy() {}
        public void accept(java.util.List<android.app.prediction.AppTarget> p0) {}
        public void binderDied() {}
    }
}
