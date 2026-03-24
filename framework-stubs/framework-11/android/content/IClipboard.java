package android.content;

public interface IClipboard extends android.os.IInterface {
    public void setPrimaryClip(android.content.ClipData p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void clearPrimaryClip(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.ClipData getPrimaryClip(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.ClipDescription getPrimaryClipDescription(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasPrimaryClip(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void addPrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void removePrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean hasClipboardText(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.content.IClipboard {
        public Default() {}
        public void setPrimaryClip(android.content.ClipData p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void clearPrimaryClip(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.content.ClipData getPrimaryClip(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.ClipDescription getPrimaryClipDescription(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean hasPrimaryClip(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void addPrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void removePrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public boolean hasClipboardText(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.IClipboard {
        private static final java.lang.String DESCRIPTOR = "android.content.IClipboard";
        static final int TRANSACTION_setPrimaryClip = 1;
        static final int TRANSACTION_clearPrimaryClip = 2;
        static final int TRANSACTION_getPrimaryClip = 3;
        static final int TRANSACTION_getPrimaryClipDescription = 4;
        static final int TRANSACTION_hasPrimaryClip = 5;
        static final int TRANSACTION_addPrimaryClipChangedListener = 6;
        static final int TRANSACTION_removePrimaryClipChangedListener = 7;
        static final int TRANSACTION_hasClipboardText = 8;
        public Stub() { super(); }
        public static android.content.IClipboard asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.IClipboard p0) { return false; }
        public static android.content.IClipboard getDefaultImpl() { return null; }

        private static class Proxy implements android.content.IClipboard {
            private android.os.IBinder mRemote;
            public static android.content.IClipboard sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setPrimaryClip(android.content.ClipData p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void clearPrimaryClip(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public android.content.ClipData getPrimaryClip(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.ClipDescription getPrimaryClipDescription(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean hasPrimaryClip(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void addPrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void removePrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public boolean hasClipboardText(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        }
    }
}
