package com.android.internal.telecom;

public interface IVideoCallback extends android.os.IInterface {
    public void receiveSessionModifyRequest(android.telecom.VideoProfile p0) throws android.os.RemoteException;
    public void receiveSessionModifyResponse(int p0, android.telecom.VideoProfile p1, android.telecom.VideoProfile p2) throws android.os.RemoteException;
    public void handleCallSessionEvent(int p0) throws android.os.RemoteException;
    public void changePeerDimensions(int p0, int p1) throws android.os.RemoteException;
    public void changeCallDataUsage(long p0) throws android.os.RemoteException;
    public void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities p0) throws android.os.RemoteException;
    public void changeVideoQuality(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IVideoCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IVideoCallback";
        static final int TRANSACTION_receiveSessionModifyRequest = 1;
        static final int TRANSACTION_receiveSessionModifyResponse = 2;
        static final int TRANSACTION_handleCallSessionEvent = 3;
        static final int TRANSACTION_changePeerDimensions = 4;
        static final int TRANSACTION_changeCallDataUsage = 5;
        static final int TRANSACTION_changeCameraCapabilities = 6;
        static final int TRANSACTION_changeVideoQuality = 7;
        public Stub() { super(); }
        public static com.android.internal.telecom.IVideoCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.IVideoCallback p0) { return false; }
        public static com.android.internal.telecom.IVideoCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.IVideoCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.IVideoCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void receiveSessionModifyRequest(android.telecom.VideoProfile p0) throws android.os.RemoteException {}
            public void receiveSessionModifyResponse(int p0, android.telecom.VideoProfile p1, android.telecom.VideoProfile p2) throws android.os.RemoteException {}
            public void handleCallSessionEvent(int p0) throws android.os.RemoteException {}
            public void changePeerDimensions(int p0, int p1) throws android.os.RemoteException {}
            public void changeCallDataUsage(long p0) throws android.os.RemoteException {}
            public void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities p0) throws android.os.RemoteException {}
            public void changeVideoQuality(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.telecom.IVideoCallback {
        public Default() {}
        public void receiveSessionModifyRequest(android.telecom.VideoProfile p0) throws android.os.RemoteException {}
        public void receiveSessionModifyResponse(int p0, android.telecom.VideoProfile p1, android.telecom.VideoProfile p2) throws android.os.RemoteException {}
        public void handleCallSessionEvent(int p0) throws android.os.RemoteException {}
        public void changePeerDimensions(int p0, int p1) throws android.os.RemoteException {}
        public void changeCallDataUsage(long p0) throws android.os.RemoteException {}
        public void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities p0) throws android.os.RemoteException {}
        public void changeVideoQuality(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
