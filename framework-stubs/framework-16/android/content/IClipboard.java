package android.content;

public interface IClipboard extends android.os.IInterface {
    public void setPrimaryClip(android.content.ClipData p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.SET_CLIP_SOURCE")
    public void setPrimaryClipAsPackage(android.content.ClipData p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5) throws android.os.RemoteException;
    public void clearPrimaryClip(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.ClipData getPrimaryClip(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public android.content.ClipDescription getPrimaryClipDescription(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public boolean hasPrimaryClip(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public void addPrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public void removePrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public boolean hasClipboardText(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.SET_CLIP_SOURCE")
    public java.lang.String getPrimaryClipSource(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public boolean areClipboardAccessNotificationsEnabledForUser(int p0) throws android.os.RemoteException;
    public void setClipboardAccessNotificationsEnabledForUser(boolean p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.content.IClipboard {
        public Default() {}
        public void setPrimaryClip(android.content.ClipData p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
        public void setPrimaryClipAsPackage(android.content.ClipData p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
        public void clearPrimaryClip(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
        public android.content.ClipData getPrimaryClip(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public android.content.ClipDescription getPrimaryClipDescription(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public boolean hasPrimaryClip(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public void addPrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
        public void removePrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
        public boolean hasClipboardText(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public java.lang.String getPrimaryClipSource(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
        public boolean areClipboardAccessNotificationsEnabledForUser(int p0) throws android.os.RemoteException { return false; }
        public void setClipboardAccessNotificationsEnabledForUser(boolean p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.IClipboard {
        public static final java.lang.String DESCRIPTOR = "android.content.IClipboard";
        static final int TRANSACTION_setPrimaryClip = 1;
        static final int TRANSACTION_setPrimaryClipAsPackage = 2;
        static final int TRANSACTION_clearPrimaryClip = 3;
        static final int TRANSACTION_getPrimaryClip = 4;
        static final int TRANSACTION_getPrimaryClipDescription = 5;
        static final int TRANSACTION_hasPrimaryClip = 6;
        static final int TRANSACTION_addPrimaryClipChangedListener = 7;
        static final int TRANSACTION_removePrimaryClipChangedListener = 8;
        static final int TRANSACTION_hasClipboardText = 9;
        static final int TRANSACTION_getPrimaryClipSource = 10;
        static final int TRANSACTION_areClipboardAccessNotificationsEnabledForUser = 11;
        static final int TRANSACTION_setClipboardAccessNotificationsEnabledForUser = 12;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.content.IClipboard asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setPrimaryClipAsPackage_enforcePermission() throws java.lang.SecurityException {}
        protected void getPrimaryClipSource_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.IClipboard {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setPrimaryClip(android.content.ClipData p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
            public void setPrimaryClipAsPackage(android.content.ClipData p0, java.lang.String p1, java.lang.String p2, int p3, int p4, java.lang.String p5) throws android.os.RemoteException {}
            public void clearPrimaryClip(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException {}
            public android.content.ClipData getPrimaryClip(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public android.content.ClipDescription getPrimaryClipDescription(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public boolean hasPrimaryClip(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public void addPrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
            public void removePrimaryClipChangedListener(android.content.IOnPrimaryClipChangedListener p0, java.lang.String p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException {}
            public boolean hasClipboardText(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public java.lang.String getPrimaryClipSource(java.lang.String p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return null; }
            public boolean areClipboardAccessNotificationsEnabledForUser(int p0) throws android.os.RemoteException { return false; }
            public void setClipboardAccessNotificationsEnabledForUser(boolean p0, int p1) throws android.os.RemoteException {}
        }
    }
}
