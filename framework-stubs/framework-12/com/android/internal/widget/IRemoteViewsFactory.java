package com.android.internal.widget;

public interface IRemoteViewsFactory extends android.os.IInterface {
    public void onDataSetChanged() throws android.os.RemoteException;
    public void onDataSetChangedAsync() throws android.os.RemoteException;
    public void onDestroy(android.content.Intent p0) throws android.os.RemoteException;
    public int getCount() throws android.os.RemoteException;
    public android.widget.RemoteViews getViewAt(int p0) throws android.os.RemoteException;
    public android.widget.RemoteViews getLoadingView() throws android.os.RemoteException;
    public int getViewTypeCount() throws android.os.RemoteException;
    public long getItemId(int p0) throws android.os.RemoteException;
    public boolean hasStableIds() throws android.os.RemoteException;
    public boolean isCreated() throws android.os.RemoteException;

    public static class Default implements com.android.internal.widget.IRemoteViewsFactory {
        public Default() {}
        public void onDataSetChanged() throws android.os.RemoteException {}
        public void onDataSetChangedAsync() throws android.os.RemoteException {}
        public void onDestroy(android.content.Intent p0) throws android.os.RemoteException {}
        public int getCount() throws android.os.RemoteException { return 0; }
        public android.widget.RemoteViews getViewAt(int p0) throws android.os.RemoteException { return null; }
        public android.widget.RemoteViews getLoadingView() throws android.os.RemoteException { return null; }
        public int getViewTypeCount() throws android.os.RemoteException { return 0; }
        public long getItemId(int p0) throws android.os.RemoteException { return 0L; }
        public boolean hasStableIds() throws android.os.RemoteException { return false; }
        public boolean isCreated() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.widget.IRemoteViewsFactory {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.widget.IRemoteViewsFactory";
        static final int TRANSACTION_onDataSetChanged = 1;
        static final int TRANSACTION_onDataSetChangedAsync = 2;
        static final int TRANSACTION_onDestroy = 3;
        static final int TRANSACTION_getCount = 4;
        static final int TRANSACTION_getViewAt = 5;
        static final int TRANSACTION_getLoadingView = 6;
        static final int TRANSACTION_getViewTypeCount = 7;
        static final int TRANSACTION_getItemId = 8;
        static final int TRANSACTION_hasStableIds = 9;
        static final int TRANSACTION_isCreated = 10;
        public Stub() { super(); }
        public static com.android.internal.widget.IRemoteViewsFactory asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.widget.IRemoteViewsFactory p0) { return false; }
        public static com.android.internal.widget.IRemoteViewsFactory getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.widget.IRemoteViewsFactory {
            private android.os.IBinder mRemote;
            public static com.android.internal.widget.IRemoteViewsFactory sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDataSetChanged() throws android.os.RemoteException {}
            public void onDataSetChangedAsync() throws android.os.RemoteException {}
            public void onDestroy(android.content.Intent p0) throws android.os.RemoteException {}
            public int getCount() throws android.os.RemoteException { return 0; }
            public android.widget.RemoteViews getViewAt(int p0) throws android.os.RemoteException { return null; }
            public android.widget.RemoteViews getLoadingView() throws android.os.RemoteException { return null; }
            public int getViewTypeCount() throws android.os.RemoteException { return 0; }
            public long getItemId(int p0) throws android.os.RemoteException { return 0L; }
            public boolean hasStableIds() throws android.os.RemoteException { return false; }
            public boolean isCreated() throws android.os.RemoteException { return false; }
        }
    }
}
