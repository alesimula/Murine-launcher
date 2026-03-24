package android.service.ondeviceintelligence;

public interface IRemoteStorageService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.ondeviceintelligence.IRemoteStorageService";
    public void getReadOnlyFileDescriptor(java.lang.String p0, com.android.internal.infra.AndroidFuture<android.os.ParcelFileDescriptor> p1) throws android.os.RemoteException;
    public void getReadOnlyFeatureFileDescriptorMap(android.app.ondeviceintelligence.Feature p0, android.os.RemoteCallback p1) throws android.os.RemoteException;

    public static class Default implements android.service.ondeviceintelligence.IRemoteStorageService {
        public Default() {}
        public void getReadOnlyFileDescriptor(java.lang.String p0, com.android.internal.infra.AndroidFuture<android.os.ParcelFileDescriptor> p1) throws android.os.RemoteException {}
        public void getReadOnlyFeatureFileDescriptorMap(android.app.ondeviceintelligence.Feature p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.ondeviceintelligence.IRemoteStorageService {
        static final int TRANSACTION_getReadOnlyFileDescriptor = 1;
        static final int TRANSACTION_getReadOnlyFeatureFileDescriptorMap = 2;
        public Stub() { super(); }
        public static android.service.ondeviceintelligence.IRemoteStorageService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.ondeviceintelligence.IRemoteStorageService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getReadOnlyFileDescriptor(java.lang.String p0, com.android.internal.infra.AndroidFuture<android.os.ParcelFileDescriptor> p1) throws android.os.RemoteException {}
            public void getReadOnlyFeatureFileDescriptorMap(android.app.ondeviceintelligence.Feature p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        }
    }
}
