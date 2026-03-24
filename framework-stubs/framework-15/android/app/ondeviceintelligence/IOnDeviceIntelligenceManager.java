package android.app.ondeviceintelligence;

public interface IOnDeviceIntelligenceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.ondeviceintelligence.IOnDeviceIntelligenceManager";
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void getVersion(android.os.RemoteCallback p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void getFeature(int p0, android.app.ondeviceintelligence.IFeatureCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void listFeatures(android.app.ondeviceintelligence.IListFeaturesCallback p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void getFeatureDetails(android.app.ondeviceintelligence.Feature p0, android.app.ondeviceintelligence.IFeatureDetailsCallback p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void requestFeatureDownload(android.app.ondeviceintelligence.Feature p0, com.android.internal.infra.AndroidFuture p1, android.app.ondeviceintelligence.IDownloadCallback p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void requestTokenInfo(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, com.android.internal.infra.AndroidFuture p2, android.app.ondeviceintelligence.ITokenInfoCallback p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void processRequest(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, int p2, com.android.internal.infra.AndroidFuture p3, com.android.internal.infra.AndroidFuture p4, android.app.ondeviceintelligence.IResponseCallback p5) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.USE_ON_DEVICE_INTELLIGENCE")
    public void processRequestStreaming(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, int p2, com.android.internal.infra.AndroidFuture p3, com.android.internal.infra.AndroidFuture p4, android.app.ondeviceintelligence.IStreamingResponseCallback p5) throws android.os.RemoteException;
    public java.lang.String getRemoteServicePackageName() throws android.os.RemoteException;
    public java.util.List<android.app.ondeviceintelligence.InferenceInfo> getLatestInferenceInfo(long p0) throws android.os.RemoteException;

    public static class Default implements android.app.ondeviceintelligence.IOnDeviceIntelligenceManager {
        public Default() {}
        public void getVersion(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void getFeature(int p0, android.app.ondeviceintelligence.IFeatureCallback p1) throws android.os.RemoteException {}
        public void listFeatures(android.app.ondeviceintelligence.IListFeaturesCallback p0) throws android.os.RemoteException {}
        public void getFeatureDetails(android.app.ondeviceintelligence.Feature p0, android.app.ondeviceintelligence.IFeatureDetailsCallback p1) throws android.os.RemoteException {}
        public void requestFeatureDownload(android.app.ondeviceintelligence.Feature p0, com.android.internal.infra.AndroidFuture p1, android.app.ondeviceintelligence.IDownloadCallback p2) throws android.os.RemoteException {}
        public void requestTokenInfo(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, com.android.internal.infra.AndroidFuture p2, android.app.ondeviceintelligence.ITokenInfoCallback p3) throws android.os.RemoteException {}
        public void processRequest(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, int p2, com.android.internal.infra.AndroidFuture p3, com.android.internal.infra.AndroidFuture p4, android.app.ondeviceintelligence.IResponseCallback p5) throws android.os.RemoteException {}
        public void processRequestStreaming(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, int p2, com.android.internal.infra.AndroidFuture p3, com.android.internal.infra.AndroidFuture p4, android.app.ondeviceintelligence.IStreamingResponseCallback p5) throws android.os.RemoteException {}
        public java.lang.String getRemoteServicePackageName() throws android.os.RemoteException { return null; }
        public java.util.List<android.app.ondeviceintelligence.InferenceInfo> getLatestInferenceInfo(long p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ondeviceintelligence.IOnDeviceIntelligenceManager {
        static final int TRANSACTION_getVersion = 2;
        static final int TRANSACTION_getFeature = 3;
        static final int TRANSACTION_listFeatures = 4;
        static final int TRANSACTION_getFeatureDetails = 5;
        static final int TRANSACTION_requestFeatureDownload = 6;
        static final int TRANSACTION_requestTokenInfo = 7;
        static final int TRANSACTION_processRequest = 8;
        static final int TRANSACTION_processRequestStreaming = 9;
        static final int TRANSACTION_getRemoteServicePackageName = 10;
        static final int TRANSACTION_getLatestInferenceInfo = 11;
        public Stub() { super(); }
        public static android.app.ondeviceintelligence.IOnDeviceIntelligenceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.ondeviceintelligence.IOnDeviceIntelligenceManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getVersion(android.os.RemoteCallback p0) throws android.os.RemoteException {}
            public void getFeature(int p0, android.app.ondeviceintelligence.IFeatureCallback p1) throws android.os.RemoteException {}
            public void listFeatures(android.app.ondeviceintelligence.IListFeaturesCallback p0) throws android.os.RemoteException {}
            public void getFeatureDetails(android.app.ondeviceintelligence.Feature p0, android.app.ondeviceintelligence.IFeatureDetailsCallback p1) throws android.os.RemoteException {}
            public void requestFeatureDownload(android.app.ondeviceintelligence.Feature p0, com.android.internal.infra.AndroidFuture p1, android.app.ondeviceintelligence.IDownloadCallback p2) throws android.os.RemoteException {}
            public void requestTokenInfo(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, com.android.internal.infra.AndroidFuture p2, android.app.ondeviceintelligence.ITokenInfoCallback p3) throws android.os.RemoteException {}
            public void processRequest(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, int p2, com.android.internal.infra.AndroidFuture p3, com.android.internal.infra.AndroidFuture p4, android.app.ondeviceintelligence.IResponseCallback p5) throws android.os.RemoteException {}
            public void processRequestStreaming(android.app.ondeviceintelligence.Feature p0, android.os.Bundle p1, int p2, com.android.internal.infra.AndroidFuture p3, com.android.internal.infra.AndroidFuture p4, android.app.ondeviceintelligence.IStreamingResponseCallback p5) throws android.os.RemoteException {}
            public java.lang.String getRemoteServicePackageName() throws android.os.RemoteException { return null; }
            public java.util.List<android.app.ondeviceintelligence.InferenceInfo> getLatestInferenceInfo(long p0) throws android.os.RemoteException { return null; }
        }
    }
}
