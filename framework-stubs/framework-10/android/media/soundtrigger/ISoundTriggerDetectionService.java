package android.media.soundtrigger;

public interface ISoundTriggerDetectionService extends android.os.IInterface {
    public void setClient(android.os.ParcelUuid p0, android.os.Bundle p1, android.media.soundtrigger.ISoundTriggerDetectionServiceClient p2) throws android.os.RemoteException;
    public void removeClient(android.os.ParcelUuid p0) throws android.os.RemoteException;
    public void onGenericRecognitionEvent(android.os.ParcelUuid p0, int p1, android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p2) throws android.os.RemoteException;
    public void onError(android.os.ParcelUuid p0, int p1, int p2) throws android.os.RemoteException;
    public void onStopOperation(android.os.ParcelUuid p0, int p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger.ISoundTriggerDetectionService {
        private static final java.lang.String DESCRIPTOR = "android.media.soundtrigger.ISoundTriggerDetectionService";
        static final int TRANSACTION_setClient = 1;
        static final int TRANSACTION_removeClient = 2;
        static final int TRANSACTION_onGenericRecognitionEvent = 3;
        static final int TRANSACTION_onError = 4;
        static final int TRANSACTION_onStopOperation = 5;
        public Stub() { super(); }
        public static android.media.soundtrigger.ISoundTriggerDetectionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.soundtrigger.ISoundTriggerDetectionService p0) { return false; }
        public static android.media.soundtrigger.ISoundTriggerDetectionService getDefaultImpl() { return null; }

        private static class Proxy implements android.media.soundtrigger.ISoundTriggerDetectionService {
            private android.os.IBinder mRemote;
            public static android.media.soundtrigger.ISoundTriggerDetectionService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setClient(android.os.ParcelUuid p0, android.os.Bundle p1, android.media.soundtrigger.ISoundTriggerDetectionServiceClient p2) throws android.os.RemoteException {}
            public void removeClient(android.os.ParcelUuid p0) throws android.os.RemoteException {}
            public void onGenericRecognitionEvent(android.os.ParcelUuid p0, int p1, android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p2) throws android.os.RemoteException {}
            public void onError(android.os.ParcelUuid p0, int p1, int p2) throws android.os.RemoteException {}
            public void onStopOperation(android.os.ParcelUuid p0, int p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.soundtrigger.ISoundTriggerDetectionService {
        public Default() {}
        public void setClient(android.os.ParcelUuid p0, android.os.Bundle p1, android.media.soundtrigger.ISoundTriggerDetectionServiceClient p2) throws android.os.RemoteException {}
        public void removeClient(android.os.ParcelUuid p0) throws android.os.RemoteException {}
        public void onGenericRecognitionEvent(android.os.ParcelUuid p0, int p1, android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p2) throws android.os.RemoteException {}
        public void onError(android.os.ParcelUuid p0, int p1, int p2) throws android.os.RemoteException {}
        public void onStopOperation(android.os.ParcelUuid p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
