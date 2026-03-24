package com.android.internal.appwidget;

public interface IAppWidgetHost extends android.os.IInterface {
    public void updateAppWidget(int p0, android.widget.RemoteViews p1) throws android.os.RemoteException;
    public void providerChanged(int p0, android.appwidget.AppWidgetProviderInfo p1) throws android.os.RemoteException;
    public void providersChanged() throws android.os.RemoteException;
    public void viewDataChanged(int p0, int p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.appwidget.IAppWidgetHost {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.appwidget.IAppWidgetHost";
        static final int TRANSACTION_updateAppWidget = 1;
        static final int TRANSACTION_providerChanged = 2;
        static final int TRANSACTION_providersChanged = 3;
        static final int TRANSACTION_viewDataChanged = 4;
        public Stub() { super(); }
        public static com.android.internal.appwidget.IAppWidgetHost asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.appwidget.IAppWidgetHost p0) { return false; }
        public static com.android.internal.appwidget.IAppWidgetHost getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.appwidget.IAppWidgetHost {
            private android.os.IBinder mRemote;
            public static com.android.internal.appwidget.IAppWidgetHost sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void updateAppWidget(int p0, android.widget.RemoteViews p1) throws android.os.RemoteException {}
            public void providerChanged(int p0, android.appwidget.AppWidgetProviderInfo p1) throws android.os.RemoteException {}
            public void providersChanged() throws android.os.RemoteException {}
            public void viewDataChanged(int p0, int p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.appwidget.IAppWidgetHost {
        public Default() {}
        public void updateAppWidget(int p0, android.widget.RemoteViews p1) throws android.os.RemoteException {}
        public void providerChanged(int p0, android.appwidget.AppWidgetProviderInfo p1) throws android.os.RemoteException {}
        public void providersChanged() throws android.os.RemoteException {}
        public void viewDataChanged(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
