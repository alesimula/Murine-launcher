package android.print;

public interface IPrintDocumentAdapter extends android.os.IInterface {
    public void setObserver(android.print.IPrintDocumentAdapterObserver p0) throws android.os.RemoteException;
    public void start() throws android.os.RemoteException;
    public void layout(android.print.PrintAttributes p0, android.print.PrintAttributes p1, android.print.ILayoutResultCallback p2, android.os.Bundle p3, int p4) throws android.os.RemoteException;
    public void write(android.print.PageRange[] p0, android.os.ParcelFileDescriptor p1, android.print.IWriteResultCallback p2, int p3) throws android.os.RemoteException;
    public void finish() throws android.os.RemoteException;
    public void kill(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.print.IPrintDocumentAdapter {
        public Default() {}
        public void setObserver(android.print.IPrintDocumentAdapterObserver p0) throws android.os.RemoteException {}
        public void start() throws android.os.RemoteException {}
        public void layout(android.print.PrintAttributes p0, android.print.PrintAttributes p1, android.print.ILayoutResultCallback p2, android.os.Bundle p3, int p4) throws android.os.RemoteException {}
        public void write(android.print.PageRange[] p0, android.os.ParcelFileDescriptor p1, android.print.IWriteResultCallback p2, int p3) throws android.os.RemoteException {}
        public void finish() throws android.os.RemoteException {}
        public void kill(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.print.IPrintDocumentAdapter {
        public static final java.lang.String DESCRIPTOR = "android.print.IPrintDocumentAdapter";
        static final int TRANSACTION_setObserver = 1;
        static final int TRANSACTION_start = 2;
        static final int TRANSACTION_layout = 3;
        static final int TRANSACTION_write = 4;
        static final int TRANSACTION_finish = 5;
        static final int TRANSACTION_kill = 6;
        public Stub() { super(); }
        public static android.print.IPrintDocumentAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.print.IPrintDocumentAdapter p0) { return false; }
        public static android.print.IPrintDocumentAdapter getDefaultImpl() { return null; }

        private static class Proxy implements android.print.IPrintDocumentAdapter {
            private android.os.IBinder mRemote;
            public static android.print.IPrintDocumentAdapter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setObserver(android.print.IPrintDocumentAdapterObserver p0) throws android.os.RemoteException {}
            public void start() throws android.os.RemoteException {}
            public void layout(android.print.PrintAttributes p0, android.print.PrintAttributes p1, android.print.ILayoutResultCallback p2, android.os.Bundle p3, int p4) throws android.os.RemoteException {}
            public void write(android.print.PageRange[] p0, android.os.ParcelFileDescriptor p1, android.print.IWriteResultCallback p2, int p3) throws android.os.RemoteException {}
            public void finish() throws android.os.RemoteException {}
            public void kill(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
