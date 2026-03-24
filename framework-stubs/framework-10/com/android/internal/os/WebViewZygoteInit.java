package com.android.internal.os;

class WebViewZygoteInit {
    public static final java.lang.String TAG = "WebViewZygoteInit";
    WebViewZygoteInit() {}
    public static void main(java.lang.String[] p0) {}

    private static class WebViewZygoteServer extends com.android.internal.os.ZygoteServer {
        private WebViewZygoteServer() { super(); }
        protected com.android.internal.os.ZygoteConnection createNewConnection(android.net.LocalSocket p0, java.lang.String p1) throws java.io.IOException { return null; }
    }

    private static class WebViewZygoteConnection extends com.android.internal.os.ZygoteConnection {
        WebViewZygoteConnection(android.net.LocalSocket p0, java.lang.String p1) throws java.io.IOException { super(null, null); }
        protected void preload() {}
        protected boolean isPreloadComplete() { return false; }
        protected boolean canPreloadApp() { return false; }
        protected void handlePreloadApp(android.content.pm.ApplicationInfo p0) {}
        protected void handlePreloadPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
        private void doPreload(java.lang.ClassLoader p0, java.lang.String p1) {}
    }
}
