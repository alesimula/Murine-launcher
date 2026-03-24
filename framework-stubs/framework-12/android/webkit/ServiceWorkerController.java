package android.webkit;

public abstract class ServiceWorkerController {
    @java.lang.Deprecated
    public ServiceWorkerController() {}
    public static android.webkit.ServiceWorkerController getInstance() { return null; }
    public abstract android.webkit.ServiceWorkerWebSettings getServiceWorkerWebSettings();
    public abstract void setServiceWorkerClient(android.webkit.ServiceWorkerClient p0);
}
