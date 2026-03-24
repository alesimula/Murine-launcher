package android.service.settings.preferences;

public interface ISettingsPreferenceService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.settings.preferences.ISettingsPreferenceService";
    @android.annotation.EnforcePermission("android.permission.READ_SYSTEM_PREFERENCES")
    public void getAllPreferenceMetadata(android.service.settings.preferences.MetadataRequest p0, android.service.settings.preferences.IMetadataCallback p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.READ_SYSTEM_PREFERENCES")
    public void getPreferenceValue(android.service.settings.preferences.GetValueRequest p0, android.service.settings.preferences.IGetValueCallback p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.READ_SYSTEM_PREFERENCES", "android.permission.WRITE_SYSTEM_PREFERENCES"})
    public void setPreferenceValue(android.service.settings.preferences.SetValueRequest p0, android.service.settings.preferences.ISetValueCallback p1) throws android.os.RemoteException;

    public static class Default implements android.service.settings.preferences.ISettingsPreferenceService {
        public Default() {}
        public void getAllPreferenceMetadata(android.service.settings.preferences.MetadataRequest p0, android.service.settings.preferences.IMetadataCallback p1) throws android.os.RemoteException {}
        public void getPreferenceValue(android.service.settings.preferences.GetValueRequest p0, android.service.settings.preferences.IGetValueCallback p1) throws android.os.RemoteException {}
        public void setPreferenceValue(android.service.settings.preferences.SetValueRequest p0, android.service.settings.preferences.ISetValueCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.settings.preferences.ISettingsPreferenceService {
        static final int TRANSACTION_getAllPreferenceMetadata = 2;
        static final int TRANSACTION_getPreferenceValue = 3;
        static final int TRANSACTION_setPreferenceValue = 4;
        static final java.lang.String[] PERMISSIONS_setPreferenceValue = null;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.service.settings.preferences.ISettingsPreferenceService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void getAllPreferenceMetadata_enforcePermission() throws java.lang.SecurityException {}
        protected void getPreferenceValue_enforcePermission() throws java.lang.SecurityException {}
        protected void setPreferenceValue_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.settings.preferences.ISettingsPreferenceService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getAllPreferenceMetadata(android.service.settings.preferences.MetadataRequest p0, android.service.settings.preferences.IMetadataCallback p1) throws android.os.RemoteException {}
            public void getPreferenceValue(android.service.settings.preferences.GetValueRequest p0, android.service.settings.preferences.IGetValueCallback p1) throws android.os.RemoteException {}
            public void setPreferenceValue(android.service.settings.preferences.SetValueRequest p0, android.service.settings.preferences.ISetValueCallback p1) throws android.os.RemoteException {}
        }
    }
}
