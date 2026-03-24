package com.android.internal.os;

class AppZygoteInit {
    public static final java.lang.String TAG = "AppZygoteInit";
    private static com.android.internal.os.ZygoteServer sServer;
    AppZygoteInit() {}
    public static void main(java.lang.String[] p0) {}

    private static class AppZygoteServer extends com.android.internal.os.ZygoteServer {
        private AppZygoteServer() { super(); }
        protected com.android.internal.os.ZygoteConnection createNewConnection(android.net.LocalSocket p0, java.lang.String p1) throws java.io.IOException { return null; }
    }

    private static class AppZygoteConnection extends com.android.internal.os.ZygoteConnection {
        AppZygoteConnection(android.net.LocalSocket p0, java.lang.String p1) throws java.io.IOException { super(null, null); }
        protected void preload() {}
        protected boolean isPreloadComplete() { return false; }
        protected boolean canPreloadApp() { return false; }
        protected void handlePreloadApp(android.content.pm.ApplicationInfo p0) {}
    }
}
