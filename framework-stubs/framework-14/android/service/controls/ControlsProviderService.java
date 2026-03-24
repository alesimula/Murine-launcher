package android.service.controls;

public abstract class ControlsProviderService extends android.app.Service {
    public static final java.lang.String SERVICE_CONTROLS = "android.service.controls.ControlsProviderService";
    public static final java.lang.String META_DATA_PANEL_ACTIVITY = "android.service.controls.META_DATA_PANEL_ACTIVITY";
    public static final java.lang.String EXTRA_LOCKSCREEN_ALLOW_TRIVIAL_CONTROLS = "android.service.controls.extra.LOCKSCREEN_ALLOW_TRIVIAL_CONTROLS";
    public static final java.lang.String ACTION_ADD_CONTROL = "android.service.controls.action.ADD_CONTROL";
    public static final java.lang.String EXTRA_CONTROL = "android.service.controls.extra.CONTROL";
    public static final java.lang.String CALLBACK_BUNDLE = "CALLBACK_BUNDLE";
    public static final java.lang.String CALLBACK_TOKEN = "CALLBACK_TOKEN";
    public static final java.lang.String TAG = "ControlsProviderService";
    public ControlsProviderService() { super(); }
    public abstract java.util.concurrent.Flow.Publisher<android.service.controls.Control> createPublisherForAllAvailable();
    public java.util.concurrent.Flow.Publisher<android.service.controls.Control> createPublisherForSuggested() { return null; }
    public abstract java.util.concurrent.Flow.Publisher<android.service.controls.Control> createPublisherFor(java.util.List<java.lang.String> p0);
    public abstract void performControlAction(java.lang.String p0, android.service.controls.actions.ControlAction p1, java.util.function.Consumer<java.lang.Integer> p2);
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final boolean onUnbind(android.content.Intent p0) { return false; }
    public static void requestAddControl(android.content.Context p0, android.content.ComponentName p1, android.service.controls.Control p2) {}

    private static class ActionMessage {
        final java.lang.String mControlId = null;
        final android.service.controls.actions.ControlAction mAction = null;
        final android.service.controls.IControlsActionCallback mCb = null;
        ActionMessage(java.lang.String p0, android.service.controls.actions.ControlAction p1, android.service.controls.IControlsActionCallback p2) {}
    }

    private class RequestHandler extends android.os.Handler {
        RequestHandler(android.service.controls.ControlsProviderService p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private static class SubscribeMessage {
        final java.util.List<java.lang.String> mControlIds = null;
        final android.service.controls.IControlsSubscriber mSubscriber = null;
        SubscribeMessage(java.util.List<java.lang.String> p0, android.service.controls.IControlsSubscriber p1) {}
    }

    private static class SubscriberProxy implements java.util.concurrent.Flow.Subscriber<android.service.controls.Control> {
        SubscriberProxy(boolean p0, android.os.IBinder p1, android.service.controls.IControlsSubscriber p2) {}
        SubscriberProxy(android.content.Context p0, boolean p1, android.os.IBinder p2, android.service.controls.IControlsSubscriber p3) {}
        public void onSubscribe(java.util.concurrent.Flow.Subscription p0) {}
        public void onNext(android.service.controls.Control p0) {}
        public void onError(java.lang.Throwable p0) {}
        public void onComplete() {}
    }

    private static class SubscriptionAdapter extends android.service.controls.IControlsSubscription.Stub {
        final java.util.concurrent.Flow.Subscription mSubscription = null;
        SubscriptionAdapter(java.util.concurrent.Flow.Subscription p0) { super(); }
        public void request(long p0) {}
        public void cancel() {}
    }
}
