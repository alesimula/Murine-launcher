package android.app.prediction;

@android.annotation.SystemApi
public final class AppPredictor {
    AppPredictor(android.content.Context p0, android.app.prediction.AppPredictionContext p1) {}
    public void notifyAppTargetEvent(android.app.prediction.AppTargetEvent p0) {}
    public void notifyLaunchLocationShown(java.lang.String p0, java.util.List<android.app.prediction.AppTargetId> p1) {}
    public void registerPredictionUpdates(java.util.concurrent.Executor p0, android.app.prediction.AppPredictor.Callback p1) {}
    public void unregisterPredictionUpdates(android.app.prediction.AppPredictor.Callback p0) {}
    public void requestPredictionUpdate() {}
    public void sortTargets(java.util.List<android.app.prediction.AppTarget> p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.util.List<android.app.prediction.AppTarget>> p2) {}
    public void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    public android.app.prediction.AppPredictionSessionId getSessionId() { return null; }

    public static interface Callback {
        public void onTargetsAvailable(java.util.List<android.app.prediction.AppTarget> p0);
    }

    static class CallbackWrapper extends android.app.prediction.IPredictionCallback.Stub {
        CallbackWrapper(java.util.concurrent.Executor p0, java.util.function.Consumer<java.util.List<android.app.prediction.AppTarget>> p1) { super(); }
        public void onResult(android.content.pm.ParceledListSlice p0) {}
    }

    private static class Token {
        static final android.os.IBinder sBinder = null;
    }
}
