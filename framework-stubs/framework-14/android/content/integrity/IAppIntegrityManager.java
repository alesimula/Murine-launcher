package android.content.integrity;

public interface IAppIntegrityManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.integrity.IAppIntegrityManager";
    public void updateRuleSet(java.lang.String p0, android.content.pm.ParceledListSlice<android.content.integrity.Rule> p1, android.content.IntentSender p2) throws android.os.RemoteException;
    public java.lang.String getCurrentRuleSetVersion() throws android.os.RemoteException;
    public java.lang.String getCurrentRuleSetProvider() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.content.integrity.Rule> getCurrentRules() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getWhitelistedRuleProviders() throws android.os.RemoteException;

    public static class Default implements android.content.integrity.IAppIntegrityManager {
        public Default() {}
        public void updateRuleSet(java.lang.String p0, android.content.pm.ParceledListSlice<android.content.integrity.Rule> p1, android.content.IntentSender p2) throws android.os.RemoteException {}
        public java.lang.String getCurrentRuleSetVersion() throws android.os.RemoteException { return null; }
        public java.lang.String getCurrentRuleSetProvider() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.content.integrity.Rule> getCurrentRules() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getWhitelistedRuleProviders() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.integrity.IAppIntegrityManager {
        static final int TRANSACTION_updateRuleSet = 1;
        static final int TRANSACTION_getCurrentRuleSetVersion = 2;
        static final int TRANSACTION_getCurrentRuleSetProvider = 3;
        static final int TRANSACTION_getCurrentRules = 4;
        static final int TRANSACTION_getWhitelistedRuleProviders = 5;
        public Stub() { super(); }
        public static android.content.integrity.IAppIntegrityManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.integrity.IAppIntegrityManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void updateRuleSet(java.lang.String p0, android.content.pm.ParceledListSlice<android.content.integrity.Rule> p1, android.content.IntentSender p2) throws android.os.RemoteException {}
            public java.lang.String getCurrentRuleSetVersion() throws android.os.RemoteException { return null; }
            public java.lang.String getCurrentRuleSetProvider() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.content.integrity.Rule> getCurrentRules() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getWhitelistedRuleProviders() throws android.os.RemoteException { return null; }
        }
    }
}
