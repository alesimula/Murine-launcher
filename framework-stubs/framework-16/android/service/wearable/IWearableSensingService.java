package android.service.wearable;

public interface IWearableSensingService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.wearable.IWearableSensingService";
    public void provideSecureConnection(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void provideConcurrentSecureConnection(android.os.ParcelFileDescriptor p0, android.os.PersistableBundle p1, android.app.wearable.IWearableSensingCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void provideReadOnlyParcelFileDescriptor(android.os.ParcelFileDescriptor p0, android.os.PersistableBundle p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void provideDataStream(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void registerDataRequestObserver(int p0, android.os.RemoteCallback p1, int p2, java.lang.String p3, android.os.RemoteCallback p4) throws android.os.RemoteException;
    public void unregisterDataRequestObserver(int p0, int p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void startHotwordRecognition(android.os.RemoteCallback p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    public void stopHotwordRecognition(android.os.RemoteCallback p0) throws android.os.RemoteException;
    public void onValidatedByHotwordDetectionService() throws android.os.RemoteException;
    public void stopActiveHotwordAudio() throws android.os.RemoteException;
    public void startDetection(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException;
    public void stopDetection(java.lang.String p0) throws android.os.RemoteException;
    public void queryServiceStatus(int[] p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException;
    public void killProcess() throws android.os.RemoteException;

    public static class Default implements android.service.wearable.IWearableSensingService {
        public Default() {}
        public void provideSecureConnection(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void provideConcurrentSecureConnection(android.os.ParcelFileDescriptor p0, android.os.PersistableBundle p1, android.app.wearable.IWearableSensingCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void provideReadOnlyParcelFileDescriptor(android.os.ParcelFileDescriptor p0, android.os.PersistableBundle p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void provideDataStream(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void registerDataRequestObserver(int p0, android.os.RemoteCallback p1, int p2, java.lang.String p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
        public void unregisterDataRequestObserver(int p0, int p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void startHotwordRecognition(android.os.RemoteCallback p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void stopHotwordRecognition(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void onValidatedByHotwordDetectionService() throws android.os.RemoteException {}
        public void stopActiveHotwordAudio() throws android.os.RemoteException {}
        public void startDetection(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
        public void stopDetection(java.lang.String p0) throws android.os.RemoteException {}
        public void queryServiceStatus(int[] p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        public void killProcess() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.wearable.IWearableSensingService {
        static final int TRANSACTION_provideSecureConnection = 1;
        static final int TRANSACTION_provideConcurrentSecureConnection = 2;
        static final int TRANSACTION_provideReadOnlyParcelFileDescriptor = 3;
        static final int TRANSACTION_provideDataStream = 4;
        static final int TRANSACTION_provideData = 5;
        static final int TRANSACTION_registerDataRequestObserver = 6;
        static final int TRANSACTION_unregisterDataRequestObserver = 7;
        static final int TRANSACTION_startHotwordRecognition = 8;
        static final int TRANSACTION_stopHotwordRecognition = 9;
        static final int TRANSACTION_onValidatedByHotwordDetectionService = 10;
        static final int TRANSACTION_stopActiveHotwordAudio = 11;
        static final int TRANSACTION_startDetection = 12;
        static final int TRANSACTION_stopDetection = 13;
        static final int TRANSACTION_queryServiceStatus = 14;
        static final int TRANSACTION_killProcess = 15;
        public Stub() { super(); }
        public static android.service.wearable.IWearableSensingService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.wearable.IWearableSensingService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void provideSecureConnection(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void provideConcurrentSecureConnection(android.os.ParcelFileDescriptor p0, android.os.PersistableBundle p1, android.app.wearable.IWearableSensingCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void provideReadOnlyParcelFileDescriptor(android.os.ParcelFileDescriptor p0, android.os.PersistableBundle p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void provideDataStream(android.os.ParcelFileDescriptor p0, android.app.wearable.IWearableSensingCallback p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void provideData(android.os.PersistableBundle p0, android.os.SharedMemory p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void registerDataRequestObserver(int p0, android.os.RemoteCallback p1, int p2, java.lang.String p3, android.os.RemoteCallback p4) throws android.os.RemoteException {}
            public void unregisterDataRequestObserver(int p0, int p1, java.lang.String p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void startHotwordRecognition(android.os.RemoteCallback p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void stopHotwordRecognition(android.os.RemoteCallback p0) throws android.os.RemoteException {}
            public void onValidatedByHotwordDetectionService() throws android.os.RemoteException {}
            public void stopActiveHotwordAudio() throws android.os.RemoteException {}
            public void startDetection(android.app.ambientcontext.AmbientContextEventRequest p0, java.lang.String p1, android.os.RemoteCallback p2, android.os.RemoteCallback p3) throws android.os.RemoteException {}
            public void stopDetection(java.lang.String p0) throws android.os.RemoteException {}
            public void queryServiceStatus(int[] p0, java.lang.String p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
            public void killProcess() throws android.os.RemoteException {}
        }
    }
}
