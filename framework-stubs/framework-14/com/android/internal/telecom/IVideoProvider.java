package com.android.internal.telecom;

public interface IVideoProvider extends android.os.IInterface {
    public void addVideoCallback(android.os.IBinder p0) throws android.os.RemoteException;
    public void removeVideoCallback(android.os.IBinder p0) throws android.os.RemoteException;
    public void setCamera(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setPreviewSurface(android.view.Surface p0) throws android.os.RemoteException;
    public void setDisplaySurface(android.view.Surface p0) throws android.os.RemoteException;
    public void setDeviceOrientation(int p0) throws android.os.RemoteException;
    public void setZoom(float p0) throws android.os.RemoteException;
    public void sendSessionModifyRequest(android.telecom.VideoProfile p0, android.telecom.VideoProfile p1) throws android.os.RemoteException;
    public void sendSessionModifyResponse(android.telecom.VideoProfile p0) throws android.os.RemoteException;
    public void requestCameraCapabilities() throws android.os.RemoteException;
    public void requestCallDataUsage() throws android.os.RemoteException;
    public void setPauseImage(android.net.Uri p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.IVideoProvider {
        public Default() {}
        public void addVideoCallback(android.os.IBinder p0) throws android.os.RemoteException {}
        public void removeVideoCallback(android.os.IBinder p0) throws android.os.RemoteException {}
        public void setCamera(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
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

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IVideoProvider {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IVideoProvider";
        static final int TRANSACTION_addVideoCallback = 1;
        static final int TRANSACTION_removeVideoCallback = 2;
        static final int TRANSACTION_setCamera = 3;
        static final int TRANSACTION_setPreviewSurface = 4;
        static final int TRANSACTION_setDisplaySurface = 5;
        static final int TRANSACTION_setDeviceOrientation = 6;
        static final int TRANSACTION_setZoom = 7;
        static final int TRANSACTION_sendSessionModifyRequest = 8;
        static final int TRANSACTION_sendSessionModifyResponse = 9;
        static final int TRANSACTION_requestCameraCapabilities = 10;
        static final int TRANSACTION_requestCallDataUsage = 11;
        static final int TRANSACTION_setPauseImage = 12;
        public Stub() { super(); }
        public static com.android.internal.telecom.IVideoProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telecom.IVideoProvider {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addVideoCallback(android.os.IBinder p0) throws android.os.RemoteException {}
            public void removeVideoCallback(android.os.IBinder p0) throws android.os.RemoteException {}
            public void setCamera(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
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
