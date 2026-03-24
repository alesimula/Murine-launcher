package android.app.role;

public interface IRoleManager extends android.os.IInterface {
    public boolean isRoleAvailable(java.lang.String p0) throws android.os.RemoteException;
    public boolean isRoleHeld(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getRoleHoldersAsUser(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void addRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.RemoteCallback p4) throws android.os.RemoteException;
    public void removeRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.RemoteCallback p4) throws android.os.RemoteException;
    public void clearRoleHoldersAsUser(java.lang.String p0, int p1, int p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void addOnRoleHoldersChangedListenerAsUser(android.app.role.IOnRoleHoldersChangedListener p0, int p1) throws android.os.RemoteException;
    public void removeOnRoleHoldersChangedListenerAsUser(android.app.role.IOnRoleHoldersChangedListener p0, int p1) throws android.os.RemoteException;
    public void setRoleNamesFromController(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public boolean addRoleHolderFromController(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean removeRoleHolderFromController(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getHeldRolesFromController(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getDefaultSmsPackage(int p0) throws android.os.RemoteException;
    public void getSmsMessagesForFinancialApp(java.lang.String p0, android.os.Bundle p1, android.telephony.IFinancialSmsCallback p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.role.IRoleManager {
        private static final java.lang.String DESCRIPTOR = "android.app.role.IRoleManager";
        static final int TRANSACTION_isRoleAvailable = 1;
        static final int TRANSACTION_isRoleHeld = 2;
        static final int TRANSACTION_getRoleHoldersAsUser = 3;
        static final int TRANSACTION_addRoleHolderAsUser = 4;
        static final int TRANSACTION_removeRoleHolderAsUser = 5;
        static final int TRANSACTION_clearRoleHoldersAsUser = 6;
        static final int TRANSACTION_addOnRoleHoldersChangedListenerAsUser = 7;
        static final int TRANSACTION_removeOnRoleHoldersChangedListenerAsUser = 8;
        static final int TRANSACTION_setRoleNamesFromController = 9;
        static final int TRANSACTION_addRoleHolderFromController = 10;
        static final int TRANSACTION_removeRoleHolderFromController = 11;
        static final int TRANSACTION_getHeldRolesFromController = 12;
        static final int TRANSACTION_getDefaultSmsPackage = 13;
        static final int TRANSACTION_getSmsMessagesForFinancialApp = 14;
        public Stub() { super(); }
        public static android.app.role.IRoleManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.role.IRoleManager p0) { return false; }
        public static android.app.role.IRoleManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.role.IRoleManager {
            private android.os.IBinder mRemote;
            public static android.app.role.IRoleManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isRoleAvailable(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isRoleHeld(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getRoleHoldersAsUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void addRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
            public void removeRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
            public void clearRoleHoldersAsUser(java.lang.String p0, int p1, int p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void addOnRoleHoldersChangedListenerAsUser(android.app.role.IOnRoleHoldersChangedListener p0, int p1) throws android.os.RemoteException {}
            public void removeOnRoleHoldersChangedListenerAsUser(android.app.role.IOnRoleHoldersChangedListener p0, int p1) throws android.os.RemoteException {}
            public void setRoleNamesFromController(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public boolean addRoleHolderFromController(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean removeRoleHolderFromController(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public java.util.List<java.lang.String> getHeldRolesFromController(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getDefaultSmsPackage(int p0) throws android.os.RemoteException { return null; }
            public void getSmsMessagesForFinancialApp(java.lang.String p0, android.os.Bundle p1, android.telephony.IFinancialSmsCallback p2) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.role.IRoleManager {
        public Default() {}
        public boolean isRoleAvailable(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isRoleHeld(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getRoleHoldersAsUser(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void addRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public void removeRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public void clearRoleHoldersAsUser(java.lang.String p0, int p1, int p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void addOnRoleHoldersChangedListenerAsUser(android.app.role.IOnRoleHoldersChangedListener p0, int p1) throws android.os.RemoteException {}
        public void removeOnRoleHoldersChangedListenerAsUser(android.app.role.IOnRoleHoldersChangedListener p0, int p1) throws android.os.RemoteException {}
        public void setRoleNamesFromController(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public boolean addRoleHolderFromController(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean removeRoleHolderFromController(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public java.util.List<java.lang.String> getHeldRolesFromController(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getDefaultSmsPackage(int p0) throws android.os.RemoteException { return null; }
        public void getSmsMessagesForFinancialApp(java.lang.String p0, android.os.Bundle p1, android.telephony.IFinancialSmsCallback p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
