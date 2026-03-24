package com.android.ims.internal;

public interface IImsVideoCallProvider extends android.os.IInterface {
    public void setCallback(com.android.ims.internal.IImsVideoCallCallback p0) throws android.os.RemoteException;
    public void setCamera(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setPreviewSurface(android.view.Surface p0) throws android.os.RemoteException;
    public void setDisplaySurface(android.view.Surface p0) throws android.os.RemoteException;
    public void setDeviceOrientation(int p0) throws android.os.RemoteException;
    public void setZoom(float p0) throws android.os.RemoteException;
    public void sendSessionModifyRequest(android.telecom.VideoProfile p0, android.telecom.VideoProfile p1) throws android.os.RemoteException;
    public void sendSessionModifyResponse(android.telecom.VideoProfile p0) throws android.os.RemoteException;
    public void requestCameraCapabilities() throws android.os.RemoteException;
    public void requestCallDataUsage() throws android.os.RemoteException;
    public void setPauseImage(android.net.Uri p0) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsVideoCallProvider {
        public Default() {}
        public void setCallback(com.android.ims.internal.IImsVideoCallCallback p0) throws android.os.RemoteException {}
        public void setCamera(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setPreviewSurface(android.view.Surface p0) throws android.os.RemoteException {}
        public void setDisplaySurface(android.view.Surface p0) throws android.os.RemoteException {}
        public void setDeviceOrientation(int p0) throws android.os.RemoteException {}
        public void setZoom(float p0) throws android.os.RemoteException {}
        public void sendSessionModifyRequest(android.telecom.VideoProfile p0, android.telecom.VideoProfile p1) throws android.os.RemoteException {}
        public void sendSessionModifyResponse(android.telecom.VideoProfile p0) throws android.os.RemoteException {}
        public void requestCameraCapabilities() throws android.os.RemoteException {}
        public void requestCallDataUsage() throws android.os.RemoteException {}
        public void setPauseImage(android.net.Uri p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsVideoCallProvider {
        private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsVideoCallProvider";
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_setCamera = 2;
        static final int TRANSACTION_setPreviewSurface = 3;
        static final int TRANSACTION_setDisplaySurface = 4;
        static final int TRANSACTION_setDeviceOrientation = 5;
        static final int TRANSACTION_setZoom = 6;
        static final int TRANSACTION_sendSessionModifyRequest = 7;
        static final int TRANSACTION_sendSessionModifyResponse = 8;
        static final int TRANSACTION_requestCameraCapabilities = 9;
        static final int TRANSACTION_requestCallDataUsage = 10;
        static final int TRANSACTION_setPauseImage = 11;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsVideoCallProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsVideoCallProvider p0) { return false; }
        public static com.android.ims.internal.IImsVideoCallProvider getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsVideoCallProvider {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsVideoCallProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCallback(com.android.ims.internal.IImsVideoCallCallback p0) throws android.os.RemoteException {}
            public void setCamera(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setPreviewSurface(android.view.Surface p0) throws android.os.RemoteException {}
            public void setDisplaySurface(android.view.Surface p0) throws android.os.RemoteException {}
            public void setDeviceOrientation(int p0) throws android.os.RemoteException {}
            public void setZoom(float p0) throws android.os.RemoteException {}
            public void sendSessionModifyRequest(android.telecom.VideoProfile p0, android.telecom.VideoProfile p1) throws android.os.RemoteException {}
            public void sendSessionModifyResponse(android.telecom.VideoProfile p0) throws android.os.RemoteException {}
            public void requestCameraCapabilities() throws android.os.RemoteException {}
            public void requestCallDataUsage() throws android.os.RemoteException {}
            public void setPauseImage(android.net.Uri p0) throws android.os.RemoteException {}
        }
    }
}
