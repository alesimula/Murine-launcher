package android.webkit;

public abstract class WebMessagePort {
    @android.annotation.SystemApi
    public WebMessagePort() {}
    public abstract void postMessage(android.webkit.WebMessage p0);
    public abstract void close();
    public abstract void setWebMessageCallback(android.webkit.WebMessagePort.WebMessageCallback p0);
    public abstract void setWebMessageCallback(android.webkit.WebMessagePort.WebMessageCallback p0, android.os.Handler p1);

    public static abstract class WebMessageCallback {
        public WebMessageCallback() {}
        public void onMessage(android.webkit.WebMessagePort p0, android.webkit.WebMessage p1) {}
    }
}
