package android.service.ondeviceintelligence;

public interface IOnDeviceSandboxedInferenceService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.ondeviceintelligence.IOnDeviceSandboxedInferenceService";
    public void registerRemoteStorageService(android.service.ondeviceintelligence.IRemoteStorageService p0, android.os.IRemoteCallback p1) throws android.os.RemoteException;
    public void requestTokenInfo(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, com.android.internal.infra.AndroidFuture p3, android.app.ondeviceintelligence.ITokenInfoCallback p4) throws android.os.RemoteException;
    public void processRequest(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, int p3, com.android.internal.infra.AndroidFuture p4, com.android.internal.infra.AndroidFuture p5, android.app.ondeviceintelligence.IResponseCallback p6) throws android.os.RemoteException;
    public void processRequestStreaming(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, int p3, com.android.internal.infra.AndroidFuture p4, com.android.internal.infra.AndroidFuture p5, android.app.ondeviceintelligence.IStreamingResponseCallback p6) throws android.os.RemoteException;
    public void updateProcessingState(android.os.Bundle p0, android.service.ondeviceintelligence.IProcessingUpdateStatusCallback p1) throws android.os.RemoteException;

    public static class Default implements android.service.ondeviceintelligence.IOnDeviceSandboxedInferenceService {
        public Default() {}
        public void registerRemoteStorageService(android.service.ondeviceintelligence.IRemoteStorageService p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
        public void requestTokenInfo(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, com.android.internal.infra.AndroidFuture p3, android.app.ondeviceintelligence.ITokenInfoCallback p4) throws android.os.RemoteException {}
        public void processRequest(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, int p3, com.android.internal.infra.AndroidFuture p4, com.android.internal.infra.AndroidFuture p5, android.app.ondeviceintelligence.IResponseCallback p6) throws android.os.RemoteException {}
        public void processRequestStreaming(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, int p3, com.android.internal.infra.AndroidFuture p4, com.android.internal.infra.AndroidFuture p5, android.app.ondeviceintelligence.IStreamingResponseCallback p6) throws android.os.RemoteException {}
        public void updateProcessingState(android.os.Bundle p0, android.service.ondeviceintelligence.IProcessingUpdateStatusCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.ondeviceintelligence.IOnDeviceSandboxedInferenceService {
        static final int TRANSACTION_registerRemoteStorageService = 1;
        static final int TRANSACTION_requestTokenInfo = 2;
        static final int TRANSACTION_processRequest = 3;
        static final int TRANSACTION_processRequestStreaming = 4;
        static final int TRANSACTION_updateProcessingState = 5;
        public Stub() { super(); }
        public static android.service.ondeviceintelligence.IOnDeviceSandboxedInferenceService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.ondeviceintelligence.IOnDeviceSandboxedInferenceService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerRemoteStorageService(android.service.ondeviceintelligence.IRemoteStorageService p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
            public void requestTokenInfo(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, com.android.internal.infra.AndroidFuture p3, android.app.ondeviceintelligence.ITokenInfoCallback p4) throws android.os.RemoteException {}
            public void processRequest(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, int p3, com.android.internal.infra.AndroidFuture p4, com.android.internal.infra.AndroidFuture p5, android.app.ondeviceintelligence.IResponseCallback p6) throws android.os.RemoteException {}
            public void processRequestStreaming(int p0, android.app.ondeviceintelligence.Feature p1, android.os.Bundle p2, int p3, com.android.internal.infra.AndroidFuture p4, com.android.internal.infra.AndroidFuture p5, android.app.ondeviceintelligence.IStreamingResponseCallback p6) throws android.os.RemoteException {}
            public void updateProcessingState(android.os.Bundle p0, android.service.ondeviceintelligence.IProcessingUpdateStatusCallback p1) throws android.os.RemoteException {}
        }
    }
}
