package android.content.pm;

public interface ICrossProfileApps extends android.os.IInterface {
    public void startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.ComponentName p3, int p4, boolean p5) throws android.os.RemoteException;
    public void startActivityAsUserByIntent(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, int p4, android.os.IBinder p5, android.os.Bundle p6) throws android.os.RemoteException;
    public java.util.List<android.os.UserHandle> getTargetUserProfiles(java.lang.String p0) throws android.os.RemoteException;
    public boolean canInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException;
    public boolean canRequestInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException;
    public void setInteractAcrossProfilesAppOp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean canConfigureInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException;
    public boolean canUserAttemptToConfigureInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException;
    public void resetInteractAcrossProfilesAppOps(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void clearInteractAcrossProfilesAppOps() throws android.os.RemoteException;

    public static class Default implements android.content.pm.ICrossProfileApps {
        public Default() {}
        public void startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.ComponentName p3, int p4, boolean p5) throws android.os.RemoteException {}
        public void startActivityAsUserByIntent(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, int p4, android.os.IBinder p5, android.os.Bundle p6) throws android.os.RemoteException {}
        public java.util.List<android.os.UserHandle> getTargetUserProfiles(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean canInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean canRequestInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setInteractAcrossProfilesAppOp(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean canConfigureInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean canUserAttemptToConfigureInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void resetInteractAcrossProfilesAppOps(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void clearInteractAcrossProfilesAppOps() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.ICrossProfileApps {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.ICrossProfileApps";
        static final int TRANSACTION_startActivityAsUser = 1;
        static final int TRANSACTION_startActivityAsUserByIntent = 2;
        static final int TRANSACTION_getTargetUserProfiles = 3;
        static final int TRANSACTION_canInteractAcrossProfiles = 4;
        static final int TRANSACTION_canRequestInteractAcrossProfiles = 5;
        static final int TRANSACTION_setInteractAcrossProfilesAppOp = 6;
        static final int TRANSACTION_canConfigureInteractAcrossProfiles = 7;
        static final int TRANSACTION_canUserAttemptToConfigureInteractAcrossProfiles = 8;
        static final int TRANSACTION_resetInteractAcrossProfilesAppOps = 9;
        static final int TRANSACTION_clearInteractAcrossProfilesAppOps = 10;
        public Stub() { super(); }
        public static android.content.pm.ICrossProfileApps asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.ICrossProfileApps p0) { return false; }
        public static android.content.pm.ICrossProfileApps getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.ICrossProfileApps {
            private android.os.IBinder mRemote;
            public static android.content.pm.ICrossProfileApps sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startActivityAsUser(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.ComponentName p3, int p4, boolean p5) throws android.os.RemoteException {}
            public void startActivityAsUserByIntent(android.app.IApplicationThread p0, java.lang.String p1, java.lang.String p2, android.content.Intent p3, int p4, android.os.IBinder p5, android.os.Bundle p6) throws android.os.RemoteException {}
            public java.util.List<android.os.UserHandle> getTargetUserProfiles(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean canInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean canRequestInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setInteractAcrossProfilesAppOp(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean canConfigureInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean canUserAttemptToConfigureInteractAcrossProfiles(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void resetInteractAcrossProfilesAppOps(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void clearInteractAcrossProfilesAppOps() throws android.os.RemoteException {}
        }
    }
}
