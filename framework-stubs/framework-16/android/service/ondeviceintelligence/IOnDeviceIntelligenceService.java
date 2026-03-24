package android.service.ondeviceintelligence;

public interface IOnDeviceIntelligenceService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.ondeviceintelligence.IOnDeviceIntelligenceService";
    public void getVersion(android.os.RemoteCallback p0) throws android.os.RemoteException;
    public void getFeature(int p0, int p1, android.app.ondeviceintelligence.IFeatureCallback p2) throws android.os.RemoteException;
    public void listFeatures(int p0, android.app.ondeviceintelligence.IListFeaturesCallback p1) throws android.os.RemoteException;
    public void getFeatureDetails(int p0, android.app.ondeviceintelligence.Feature p1, android.app.ondeviceintelligence.IFeatureDetailsCallback p2) throws android.os.RemoteException;
    public void getReadOnlyFileDescriptor(java.lang.String p0, com.android.internal.infra.AndroidFuture<android.os.ParcelFileDescriptor> p1) throws android.os.RemoteException;
    public void getReadOnlyFeatureFileDescriptorMap(android.app.ondeviceintelligence.Feature p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    public void requestFeatureDownload(int p0, android.app.ondeviceintelligence.Feature p1, com.android.internal.infra.AndroidFuture p2, android.app.ondeviceintelligence.IDownloadCallback p3) throws android.os.RemoteException;
    public void registerRemoteServices(android.service.ondeviceintelligence.IRemoteProcessingService p0) throws android.os.RemoteException;
    public void notifyInferenceServiceConnected() throws android.os.RemoteException;
    public void notifyInferenceServiceDisconnected() throws android.os.RemoteException;
    public void ready() throws android.os.RemoteException;

    public static class Default implements android.service.ondeviceintelligence.IOnDeviceIntelligenceService {
        public Default() {}
        public void getVersion(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void getFeature(int p0, int p1, android.app.ondeviceintelligence.IFeatureCallback p2) throws android.os.RemoteException {}
        public void listFeatures(int p0, android.app.ondeviceintelligence.IListFeaturesCallback p1) throws android.os.RemoteException {}
        public void getFeatureDetails(int p0, android.app.ondeviceintelligence.Feature p1, android.app.ondeviceintelligence.IFeatureDetailsCallback p2) throws android.os.RemoteException {}
        public void getReadOnlyFileDescriptor(java.lang.String p0, com.android.internal.infra.AndroidFuture<android.os.ParcelFileDescriptor> p1) throws android.os.RemoteException {}
        public void getReadOnlyFeatureFileDescriptorMap(android.app.ondeviceintelligence.Feature p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void requestFeatureDownload(int p0, android.app.ondeviceintelligence.Feature p1, com.android.internal.infra.AndroidFuture p2, android.app.ondeviceintelligence.IDownloadCallback p3) throws android.os.RemoteException {}
        public void registerRemoteServices(android.service.ondeviceintelligence.IRemoteProcessingService p0) throws android.os.RemoteException {}
        public void notifyInferenceServiceConnected() throws android.os.RemoteException {}
        public void notifyInferenceServiceDisconnected() throws android.os.RemoteException {}
        public void ready() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.ondeviceintelligence.IOnDeviceIntelligenceService {
        static final int TRANSACTION_getVersion = 1;
        static final int TRANSACTION_getFeature = 2;
        static final int TRANSACTION_listFeatures = 3;
        static final int TRANSACTION_getFeatureDetails = 4;
        static final int TRANSACTION_getReadOnlyFileDescriptor = 5;
        static final int TRANSACTION_getReadOnlyFeatureFileDescriptorMap = 6;
        static final int TRANSACTION_requestFeatureDownload = 7;
        static final int TRANSACTION_registerRemoteServices = 8;
        static final int TRANSACTION_notifyInferenceServiceConnected = 9;
        static final int TRANSACTION_notifyInferenceServiceDisconnected = 10;
        static final int TRANSACTION_ready = 11;
        public Stub() { super(); }
        public static android.service.ondeviceintelligence.IOnDeviceIntelligenceService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.ondeviceintelligence.IOnDeviceIntelligenceService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getVersion(android.os.RemoteCallback p0) throws android.os.RemoteException {}
            public void getFeature(int p0, int p1, android.app.ondeviceintelligence.IFeatureCallback p2) throws android.os.RemoteException {}
            public void listFeatures(int p0, android.app.ondeviceintelligence.IListFeaturesCallback p1) throws android.os.RemoteException {}
            public void getFeatureDetails(int p0, android.app.ondeviceintelligence.Feature p1, android.app.ondeviceintelligence.IFeatureDetailsCallback p2) throws android.os.RemoteException {}
            public void getReadOnlyFileDescriptor(java.lang.String p0, com.android.internal.infra.AndroidFuture<android.os.ParcelFileDescriptor> p1) throws android.os.RemoteException {}
            public void getReadOnlyFeatureFileDescriptorMap(android.app.ondeviceintelligence.Feature p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void requestFeatureDownload(int p0, android.app.ondeviceintelligence.Feature p1, com.android.internal.infra.AndroidFuture p2, android.app.ondeviceintelligence.IDownloadCallback p3) throws android.os.RemoteException {}
            public void registerRemoteServices(android.service.ondeviceintelligence.IRemoteProcessingService p0) throws android.os.RemoteException {}
            public void notifyInferenceServiceConnected() throws android.os.RemoteException {}
            public void notifyInferenceServiceDisconnected() throws android.os.RemoteException {}
            public void ready() throws android.os.RemoteException {}
        }
    }
}
