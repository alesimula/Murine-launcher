package android.webkit;

public interface IWebViewUpdateService extends android.os.IInterface {
    public void notifyRelroCreationCompleted() throws android.os.RemoteException;
    public android.webkit.WebViewProviderResponse waitForAndGetProvider() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public java.lang.String changeProviderAndSetting(java.lang.String p0) throws android.os.RemoteException;
    public android.webkit.WebViewProviderInfo[] getValidWebViewPackages() throws android.os.RemoteException;
    public android.webkit.WebViewProviderInfo[] getAllWebViewPackages() throws android.os.RemoteException;
    public java.lang.String getCurrentWebViewPackageName() throws android.os.RemoteException;
    public android.content.pm.PackageInfo getCurrentWebViewPackage() throws android.os.RemoteException;
    public boolean isMultiProcessEnabled() throws android.os.RemoteException;
    public void enableMultiProcess(boolean p0) throws android.os.RemoteException;
    public android.webkit.WebViewProviderInfo getDefaultWebViewPackage() throws android.os.RemoteException;

    public static class Default implements android.webkit.IWebViewUpdateService {
        public Default() {}
        public void notifyRelroCreationCompleted() throws android.os.RemoteException {}
        public android.webkit.WebViewProviderResponse waitForAndGetProvider() throws android.os.RemoteException { return null; }
        public java.lang.String changeProviderAndSetting(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.webkit.WebViewProviderInfo[] getValidWebViewPackages() throws android.os.RemoteException { return null; }
        public android.webkit.WebViewProviderInfo[] getAllWebViewPackages() throws android.os.RemoteException { return null; }
        public java.lang.String getCurrentWebViewPackageName() throws android.os.RemoteException { return null; }
        public android.content.pm.PackageInfo getCurrentWebViewPackage() throws android.os.RemoteException { return null; }
        public boolean isMultiProcessEnabled() throws android.os.RemoteException { return false; }
        public void enableMultiProcess(boolean p0) throws android.os.RemoteException {}
        public android.webkit.WebViewProviderInfo getDefaultWebViewPackage() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.webkit.IWebViewUpdateService {
        public static final java.lang.String DESCRIPTOR = "android.webkit.IWebViewUpdateService";
        static final int TRANSACTION_notifyRelroCreationCompleted = 1;
        static final int TRANSACTION_waitForAndGetProvider = 2;
        static final int TRANSACTION_changeProviderAndSetting = 3;
        static final int TRANSACTION_getValidWebViewPackages = 4;
        static final int TRANSACTION_getAllWebViewPackages = 5;
        static final int TRANSACTION_getCurrentWebViewPackageName = 6;
        static final int TRANSACTION_getCurrentWebViewPackage = 7;
        static final int TRANSACTION_isMultiProcessEnabled = 8;
        static final int TRANSACTION_enableMultiProcess = 9;
        static final int TRANSACTION_getDefaultWebViewPackage = 10;
        public Stub() { super(); }
        public static android.webkit.IWebViewUpdateService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.webkit.IWebViewUpdateService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyRelroCreationCompleted() throws android.os.RemoteException {}
            public android.webkit.WebViewProviderResponse waitForAndGetProvider() throws android.os.RemoteException { return null; }
            public java.lang.String changeProviderAndSetting(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.webkit.WebViewProviderInfo[] getValidWebViewPackages() throws android.os.RemoteException { return null; }
            public android.webkit.WebViewProviderInfo[] getAllWebViewPackages() throws android.os.RemoteException { return null; }
            public java.lang.String getCurrentWebViewPackageName() throws android.os.RemoteException { return null; }
            public android.content.pm.PackageInfo getCurrentWebViewPackage() throws android.os.RemoteException { return null; }
            public boolean isMultiProcessEnabled() throws android.os.RemoteException { return false; }
            public void enableMultiProcess(boolean p0) throws android.os.RemoteException {}
            public android.webkit.WebViewProviderInfo getDefaultWebViewPackage() throws android.os.RemoteException { return null; }
        }
    }
}
