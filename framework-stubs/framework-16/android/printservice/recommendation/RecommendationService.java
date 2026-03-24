package android.printservice.recommendation;

@android.annotation.SystemApi
public abstract class RecommendationService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.printservice.recommendation.RecommendationService";
    public RecommendationService() { super(); }
    protected void attachBaseContext(android.content.Context p0) {}
    public final void updateRecommendations(java.util.List<android.printservice.recommendation.RecommendationInfo> p0) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onConnected();
    public abstract void onDisconnected();

    private class MyHandler extends android.os.Handler {
        static final int MSG_CONNECT = 1;
        static final int MSG_DISCONNECT = 2;
        static final int MSG_UPDATE = 3;
        MyHandler(android.printservice.recommendation.RecommendationService p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
