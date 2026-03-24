package android.content.pm;

public interface IPinItemRequest extends android.os.IInterface {
    public boolean isValid() throws android.os.RemoteException;
    public boolean accept(android.os.Bundle p0) throws android.os.RemoteException;
    public android.content.pm.ShortcutInfo getShortcutInfo() throws android.os.RemoteException;
    public android.appwidget.AppWidgetProviderInfo getAppWidgetProviderInfo() throws android.os.RemoteException;
    public android.os.Bundle getExtras() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPinItemRequest {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IPinItemRequest";
        static final int TRANSACTION_isValid = 1;
        static final int TRANSACTION_accept = 2;
        static final int TRANSACTION_getShortcutInfo = 3;
        static final int TRANSACTION_getAppWidgetProviderInfo = 4;
        static final int TRANSACTION_getExtras = 5;
        public Stub() { super(); }
        public static android.content.pm.IPinItemRequest asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IPinItemRequest p0) { return false; }
        public static android.content.pm.IPinItemRequest getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IPinItemRequest {
            private android.os.IBinder mRemote;
            public static android.content.pm.IPinItemRequest sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isValid() throws android.os.RemoteException { return false; }
            public boolean accept(android.os.Bundle p0) throws android.os.RemoteException { return false; }
            public android.content.pm.ShortcutInfo getShortcutInfo() throws android.os.RemoteException { return null; }
            public android.appwidget.AppWidgetProviderInfo getAppWidgetProviderInfo() throws android.os.RemoteException { return null; }
            public android.os.Bundle getExtras() throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.content.pm.IPinItemRequest {
        public Default() {}
        public boolean isValid() throws android.os.RemoteException { return false; }
        public boolean accept(android.os.Bundle p0) throws android.os.RemoteException { return false; }
        public android.content.pm.ShortcutInfo getShortcutInfo() throws android.os.RemoteException { return null; }
        public android.appwidget.AppWidgetProviderInfo getAppWidgetProviderInfo() throws android.os.RemoteException { return null; }
        public android.os.Bundle getExtras() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
