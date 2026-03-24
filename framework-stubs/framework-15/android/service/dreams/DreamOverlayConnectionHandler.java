package android.service.dreams;

public final class DreamOverlayConnectionHandler {
    DreamOverlayConnectionHandler(android.content.Context p0, android.os.Looper p1, android.content.Intent p2, int p3, int p4, int p5) {}
    public DreamOverlayConnectionHandler(android.content.Context p0, android.os.Looper p1, android.content.Intent p2, int p3, int p4, int p5, android.service.dreams.DreamOverlayConnectionHandler.Injector p6) {}
    public boolean bind() { return false; }
    public void unbind() {}
    public void addConsumer(java.util.function.Consumer<android.service.dreams.IDreamOverlayClient> p0) {}
    public void removeConsumer(java.util.function.Consumer<android.service.dreams.IDreamOverlayClient> p0) {}

    public static class Injector {
        public Injector() {}
        public com.android.internal.util.PersistentServiceConnection<android.service.dreams.IDreamOverlay> buildConnection(android.content.Context p0, android.os.Handler p1, android.content.Intent p2, int p3, int p4, int p5) { return null; }
    }

    private final class OverlayConnectionCallback implements com.android.internal.util.ObservableServiceConnection.Callback<android.service.dreams.IDreamOverlay> {
        public void onConnected(com.android.internal.util.ObservableServiceConnection<android.service.dreams.IDreamOverlay> p0, android.service.dreams.IDreamOverlay p1) {}
        public void onDisconnected(com.android.internal.util.ObservableServiceConnection<android.service.dreams.IDreamOverlay> p0, int p1) {}
    }

    private final class OverlayHandlerCallback implements android.os.Handler.Callback {
        public boolean handleMessage(android.os.Message p0) { return false; }
    }
}
