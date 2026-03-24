package android.service.notification;

@java.lang.Deprecated
public abstract class ConditionProviderService extends android.app.Service {
    boolean mIsConnected;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.notification.ConditionProviderService";
    @java.lang.Deprecated
    public static final java.lang.String META_DATA_RULE_TYPE = "android.service.zen.automatic.ruleType";
    @java.lang.Deprecated
    public static final java.lang.String META_DATA_CONFIGURATION_ACTIVITY = "android.service.zen.automatic.configurationActivity";
    @java.lang.Deprecated
    public static final java.lang.String META_DATA_RULE_INSTANCE_LIMIT = "android.service.zen.automatic.ruleInstanceLimit";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_RULE_ID = "android.service.notification.extra.RULE_ID";
    public ConditionProviderService() { super(); }
    public abstract void onConnected();
    public void onRequestConditions(int p0) {}
    public abstract void onSubscribe(android.net.Uri p0);
    public abstract void onUnsubscribe(android.net.Uri p0);
    public static final void requestRebind(android.content.ComponentName p0) {}
    public final void requestUnbind() {}
    @java.lang.Deprecated
    public final void notifyCondition(android.service.notification.Condition p0) {}
    @java.lang.Deprecated
    public final void notifyConditions(android.service.notification.Condition... p0) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean isBound() { return false; }

    private final class H extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
    }

    private final class Provider extends android.service.notification.IConditionProvider.Stub {
        public void onConnected() {}
        public void onSubscribe(android.net.Uri p0) {}
        public void onUnsubscribe(android.net.Uri p0) {}
    }
}
