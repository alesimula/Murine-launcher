package com.android.internal.appwidget;

public interface IAppWidgetService extends android.os.IInterface {
    public android.content.pm.ParceledListSlice startListening(com.android.internal.appwidget.IAppWidgetHost p0, java.lang.String p1, int p2, int[] p3) throws android.os.RemoteException;
    public void stopListening(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int allocateAppWidgetId(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void deleteAppWidgetId(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void deleteHost(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void deleteAllHosts() throws android.os.RemoteException;
    public android.widget.RemoteViews getAppWidgetViews(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int[] getAppWidgetIdsForHost(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setAppWidgetHidden(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.IntentSender createAppWidgetConfigIntentSender(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void updateAppWidgetIds(java.lang.String p0, int[] p1, android.widget.RemoteViews p2) throws android.os.RemoteException;
    public void updateAppWidgetOptions(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public android.os.Bundle getAppWidgetOptions(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void partiallyUpdateAppWidgetIds(java.lang.String p0, int[] p1, android.widget.RemoteViews p2) throws android.os.RemoteException;
    public void updateAppWidgetProvider(android.content.ComponentName p0, android.widget.RemoteViews p1) throws android.os.RemoteException;
    public void updateAppWidgetProviderInfo(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException;
    public void notifyAppWidgetViewDataChanged(java.lang.String p0, int[] p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getInstalledProvidersForProfile(int p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.appwidget.AppWidgetProviderInfo getAppWidgetInfo(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasBindAppWidgetPermission(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setBindAppWidgetPermission(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException;
    public boolean bindAppWidgetId(java.lang.String p0, int p1, int p2, android.content.ComponentName p3, android.os.Bundle p4) throws android.os.RemoteException;
    public boolean bindRemoteViewsService(java.lang.String p0, int p1, android.content.Intent p2, android.app.IApplicationThread p3, android.os.IBinder p4, android.app.IServiceConnection p5, long p6) throws android.os.RemoteException;
    public void notifyProviderInheritance(android.content.ComponentName[] p0) throws android.os.RemoteException;
    public int getMaxBitmapMemory() throws android.os.RemoteException;
    public int[] getAppWidgetIds(android.content.ComponentName p0) throws android.os.RemoteException;
    public boolean isBoundWidgetPackage(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean requestPinAppWidget(java.lang.String p0, android.content.ComponentName p1, android.os.Bundle p2, android.content.IntentSender p3) throws android.os.RemoteException;
    public boolean isRequestPinAppWidgetSupported() throws android.os.RemoteException;
    public void noteAppWidgetTapped(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setWidgetPreview(android.content.ComponentName p0, int p1, android.widget.RemoteViews p2) throws android.os.RemoteException;
    public android.widget.RemoteViews getWidgetPreview(java.lang.String p0, android.content.ComponentName p1, int p2, int p3) throws android.os.RemoteException;
    public void removeWidgetPreview(android.content.ComponentName p0, int p1) throws android.os.RemoteException;
    public void reportWidgetEvents(java.lang.String p0, android.appwidget.AppWidgetEvent[] p1) throws android.os.RemoteException;
    public boolean isFirstConfigActivityPending(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setConfigActivityComplete(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.appwidget.IAppWidgetService {
        public Default() {}
        public android.content.pm.ParceledListSlice startListening(com.android.internal.appwidget.IAppWidgetHost p0, java.lang.String p1, int p2, int[] p3) throws android.os.RemoteException { return null; }
        public void stopListening(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public int allocateAppWidgetId(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public void deleteAppWidgetId(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void deleteHost(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void deleteAllHosts() throws android.os.RemoteException {}
        public android.widget.RemoteViews getAppWidgetViews(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int[] getAppWidgetIdsForHost(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setAppWidgetHidden(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.content.IntentSender createAppWidgetConfigIntentSender(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public void updateAppWidgetIds(java.lang.String p0, int[] p1, android.widget.RemoteViews p2) throws android.os.RemoteException {}
        public void updateAppWidgetOptions(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public android.os.Bundle getAppWidgetOptions(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void partiallyUpdateAppWidgetIds(java.lang.String p0, int[] p1, android.widget.RemoteViews p2) throws android.os.RemoteException {}
        public void updateAppWidgetProvider(android.content.ComponentName p0, android.widget.RemoteViews p1) throws android.os.RemoteException {}
        public void updateAppWidgetProviderInfo(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
        public void notifyAppWidgetViewDataChanged(java.lang.String p0, int[] p1, int p2) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getInstalledProvidersForProfile(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.appwidget.AppWidgetProviderInfo getAppWidgetInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean hasBindAppWidgetPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setBindAppWidgetPermission(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
        public boolean bindAppWidgetId(java.lang.String p0, int p1, int p2, android.content.ComponentName p3, android.os.Bundle p4) throws android.os.RemoteException { return false; }
        public boolean bindRemoteViewsService(java.lang.String p0, int p1, android.content.Intent p2, android.app.IApplicationThread p3, android.os.IBinder p4, android.app.IServiceConnection p5, long p6) throws android.os.RemoteException { return false; }
        public void notifyProviderInheritance(android.content.ComponentName[] p0) throws android.os.RemoteException {}
        public int getMaxBitmapMemory() throws android.os.RemoteException { return 0; }
        public int[] getAppWidgetIds(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
        public boolean isBoundWidgetPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean requestPinAppWidget(java.lang.String p0, android.content.ComponentName p1, android.os.Bundle p2, android.content.IntentSender p3) throws android.os.RemoteException { return false; }
        public boolean isRequestPinAppWidgetSupported() throws android.os.RemoteException { return false; }
        public void noteAppWidgetTapped(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean setWidgetPreview(android.content.ComponentName p0, int p1, android.widget.RemoteViews p2) throws android.os.RemoteException { return false; }
        public android.widget.RemoteViews getWidgetPreview(java.lang.String p0, android.content.ComponentName p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public void removeWidgetPreview(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
        public void reportWidgetEvents(java.lang.String p0, android.appwidget.AppWidgetEvent[] p1) throws android.os.RemoteException {}
        public boolean isFirstConfigActivityPending(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setConfigActivityComplete(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.appwidget.IAppWidgetService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.appwidget.IAppWidgetService";
        static final int TRANSACTION_startListening = 1;
        static final int TRANSACTION_stopListening = 2;
        static final int TRANSACTION_allocateAppWidgetId = 3;
        static final int TRANSACTION_deleteAppWidgetId = 4;
        static final int TRANSACTION_deleteHost = 5;
        static final int TRANSACTION_deleteAllHosts = 6;
        static final int TRANSACTION_getAppWidgetViews = 7;
        static final int TRANSACTION_getAppWidgetIdsForHost = 8;
        static final int TRANSACTION_setAppWidgetHidden = 9;
        static final int TRANSACTION_createAppWidgetConfigIntentSender = 10;
        static final int TRANSACTION_updateAppWidgetIds = 11;
        static final int TRANSACTION_updateAppWidgetOptions = 12;
        static final int TRANSACTION_getAppWidgetOptions = 13;
        static final int TRANSACTION_partiallyUpdateAppWidgetIds = 14;
        static final int TRANSACTION_updateAppWidgetProvider = 15;
        static final int TRANSACTION_updateAppWidgetProviderInfo = 16;
        static final int TRANSACTION_notifyAppWidgetViewDataChanged = 17;
        static final int TRANSACTION_getInstalledProvidersForProfile = 18;
        static final int TRANSACTION_getAppWidgetInfo = 19;
        static final int TRANSACTION_hasBindAppWidgetPermission = 20;
        static final int TRANSACTION_setBindAppWidgetPermission = 21;
        static final int TRANSACTION_bindAppWidgetId = 22;
        static final int TRANSACTION_bindRemoteViewsService = 23;
        static final int TRANSACTION_notifyProviderInheritance = 24;
        static final int TRANSACTION_getMaxBitmapMemory = 25;
        static final int TRANSACTION_getAppWidgetIds = 26;
        static final int TRANSACTION_isBoundWidgetPackage = 27;
        static final int TRANSACTION_requestPinAppWidget = 28;
        static final int TRANSACTION_isRequestPinAppWidgetSupported = 29;
        static final int TRANSACTION_noteAppWidgetTapped = 30;
        static final int TRANSACTION_setWidgetPreview = 31;
        static final int TRANSACTION_getWidgetPreview = 32;
        static final int TRANSACTION_removeWidgetPreview = 33;
        static final int TRANSACTION_reportWidgetEvents = 34;
        static final int TRANSACTION_isFirstConfigActivityPending = 35;
        static final int TRANSACTION_setConfigActivityComplete = 36;
        public Stub() { super(); }
        public static com.android.internal.appwidget.IAppWidgetService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.appwidget.IAppWidgetService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.pm.ParceledListSlice startListening(com.android.internal.appwidget.IAppWidgetHost p0, java.lang.String p1, int p2, int[] p3) throws android.os.RemoteException { return null; }
            public void stopListening(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public int allocateAppWidgetId(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public void deleteAppWidgetId(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void deleteHost(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void deleteAllHosts() throws android.os.RemoteException {}
            public android.widget.RemoteViews getAppWidgetViews(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int[] getAppWidgetIdsForHost(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setAppWidgetHidden(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public android.content.IntentSender createAppWidgetConfigIntentSender(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public void updateAppWidgetIds(java.lang.String p0, int[] p1, android.widget.RemoteViews p2) throws android.os.RemoteException {}
            public void updateAppWidgetOptions(java.lang.String p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public android.os.Bundle getAppWidgetOptions(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void partiallyUpdateAppWidgetIds(java.lang.String p0, int[] p1, android.widget.RemoteViews p2) throws android.os.RemoteException {}
            public void updateAppWidgetProvider(android.content.ComponentName p0, android.widget.RemoteViews p1) throws android.os.RemoteException {}
            public void updateAppWidgetProviderInfo(android.content.ComponentName p0, java.lang.String p1) throws android.os.RemoteException {}
            public void notifyAppWidgetViewDataChanged(java.lang.String p0, int[] p1, int p2) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getInstalledProvidersForProfile(int p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.appwidget.AppWidgetProviderInfo getAppWidgetInfo(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean hasBindAppWidgetPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setBindAppWidgetPermission(java.lang.String p0, int p1, boolean p2) throws android.os.RemoteException {}
            public boolean bindAppWidgetId(java.lang.String p0, int p1, int p2, android.content.ComponentName p3, android.os.Bundle p4) throws android.os.RemoteException { return false; }
            public boolean bindRemoteViewsService(java.lang.String p0, int p1, android.content.Intent p2, android.app.IApplicationThread p3, android.os.IBinder p4, android.app.IServiceConnection p5, long p6) throws android.os.RemoteException { return false; }
            public void notifyProviderInheritance(android.content.ComponentName[] p0) throws android.os.RemoteException {}
            public int getMaxBitmapMemory() throws android.os.RemoteException { return 0; }
            public int[] getAppWidgetIds(android.content.ComponentName p0) throws android.os.RemoteException { return null; }
            public boolean isBoundWidgetPackage(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean requestPinAppWidget(java.lang.String p0, android.content.ComponentName p1, android.os.Bundle p2, android.content.IntentSender p3) throws android.os.RemoteException { return false; }
            public boolean isRequestPinAppWidgetSupported() throws android.os.RemoteException { return false; }
            public void noteAppWidgetTapped(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean setWidgetPreview(android.content.ComponentName p0, int p1, android.widget.RemoteViews p2) throws android.os.RemoteException { return false; }
            public android.widget.RemoteViews getWidgetPreview(java.lang.String p0, android.content.ComponentName p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public void removeWidgetPreview(android.content.ComponentName p0, int p1) throws android.os.RemoteException {}
            public void reportWidgetEvents(java.lang.String p0, android.appwidget.AppWidgetEvent[] p1) throws android.os.RemoteException {}
            public boolean isFirstConfigActivityPending(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setConfigActivityComplete(int p0) throws android.os.RemoteException {}
        }
    }
}
