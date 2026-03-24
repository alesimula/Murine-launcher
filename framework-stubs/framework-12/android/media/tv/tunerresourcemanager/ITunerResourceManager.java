package android.media.tv.tunerresourcemanager;

public interface ITunerResourceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public void registerClientProfile(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.IResourcesReclaimListener p1, int[] p2) throws android.os.RemoteException;
    public void unregisterClientProfile(int p0) throws android.os.RemoteException;
    public boolean updateClientPriority(int p0, int p1, int p2) throws android.os.RemoteException;
    public void setFrontendInfoList(android.media.tv.tuner.TunerFrontendInfo[] p0) throws android.os.RemoteException;
    public void updateCasInfo(int p0, int p1) throws android.os.RemoteException;
    public void setLnbInfoList(int[] p0) throws android.os.RemoteException;
    public boolean requestFrontend(android.media.tv.tunerresourcemanager.TunerFrontendRequest p0, int[] p1) throws android.os.RemoteException;
    public void shareFrontend(int p0, int p1) throws android.os.RemoteException;
    public boolean requestDemux(android.media.tv.tunerresourcemanager.TunerDemuxRequest p0, int[] p1) throws android.os.RemoteException;
    public boolean requestDescrambler(android.media.tv.tunerresourcemanager.TunerDescramblerRequest p0, int[] p1) throws android.os.RemoteException;
    public boolean requestCasSession(android.media.tv.tunerresourcemanager.CasSessionRequest p0, int[] p1) throws android.os.RemoteException;
    public boolean requestCiCam(android.media.tv.tunerresourcemanager.TunerCiCamRequest p0, int[] p1) throws android.os.RemoteException;
    public boolean requestLnb(android.media.tv.tunerresourcemanager.TunerLnbRequest p0, int[] p1) throws android.os.RemoteException;
    public void releaseFrontend(int p0, int p1) throws android.os.RemoteException;
    public void releaseDemux(int p0, int p1) throws android.os.RemoteException;
    public void releaseDescrambler(int p0, int p1) throws android.os.RemoteException;
    public void releaseCasSession(int p0, int p1) throws android.os.RemoteException;
    public void releaseCiCam(int p0, int p1) throws android.os.RemoteException;
    public void releaseLnb(int p0, int p1) throws android.os.RemoteException;
    public boolean isHigherPriority(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.ResourceClientProfile p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.tunerresourcemanager.ITunerResourceManager {
        public Default() {}
        public void registerClientProfile(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.IResourcesReclaimListener p1, int[] p2) throws android.os.RemoteException {}
        public void unregisterClientProfile(int p0) throws android.os.RemoteException {}
        public boolean updateClientPriority(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public void setFrontendInfoList(android.media.tv.tuner.TunerFrontendInfo[] p0) throws android.os.RemoteException {}
        public void updateCasInfo(int p0, int p1) throws android.os.RemoteException {}
        public void setLnbInfoList(int[] p0) throws android.os.RemoteException {}
        public boolean requestFrontend(android.media.tv.tunerresourcemanager.TunerFrontendRequest p0, int[] p1) throws android.os.RemoteException { return false; }
        public void shareFrontend(int p0, int p1) throws android.os.RemoteException {}
        public boolean requestDemux(android.media.tv.tunerresourcemanager.TunerDemuxRequest p0, int[] p1) throws android.os.RemoteException { return false; }
        public boolean requestDescrambler(android.media.tv.tunerresourcemanager.TunerDescramblerRequest p0, int[] p1) throws android.os.RemoteException { return false; }
        public boolean requestCasSession(android.media.tv.tunerresourcemanager.CasSessionRequest p0, int[] p1) throws android.os.RemoteException { return false; }
        public boolean requestCiCam(android.media.tv.tunerresourcemanager.TunerCiCamRequest p0, int[] p1) throws android.os.RemoteException { return false; }
        public boolean requestLnb(android.media.tv.tunerresourcemanager.TunerLnbRequest p0, int[] p1) throws android.os.RemoteException { return false; }
        public void releaseFrontend(int p0, int p1) throws android.os.RemoteException {}
        public void releaseDemux(int p0, int p1) throws android.os.RemoteException {}
        public void releaseDescrambler(int p0, int p1) throws android.os.RemoteException {}
        public void releaseCasSession(int p0, int p1) throws android.os.RemoteException {}
        public void releaseCiCam(int p0, int p1) throws android.os.RemoteException {}
        public void releaseLnb(int p0, int p1) throws android.os.RemoteException {}
        public boolean isHigherPriority(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.ResourceClientProfile p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.tunerresourcemanager.ITunerResourceManager {
        static final int TRANSACTION_registerClientProfile = 1;
        static final int TRANSACTION_unregisterClientProfile = 2;
        static final int TRANSACTION_updateClientPriority = 3;
        static final int TRANSACTION_setFrontendInfoList = 4;
        static final int TRANSACTION_updateCasInfo = 5;
        static final int TRANSACTION_setLnbInfoList = 6;
        static final int TRANSACTION_requestFrontend = 7;
        static final int TRANSACTION_shareFrontend = 8;
        static final int TRANSACTION_requestDemux = 9;
        static final int TRANSACTION_requestDescrambler = 10;
        static final int TRANSACTION_requestCasSession = 11;
        static final int TRANSACTION_requestCiCam = 12;
        static final int TRANSACTION_requestLnb = 13;
        static final int TRANSACTION_releaseFrontend = 14;
        static final int TRANSACTION_releaseDemux = 15;
        static final int TRANSACTION_releaseDescrambler = 16;
        static final int TRANSACTION_releaseCasSession = 17;
        static final int TRANSACTION_releaseCiCam = 18;
        static final int TRANSACTION_releaseLnb = 19;
        static final int TRANSACTION_isHigherPriority = 20;
        public Stub() { super(); }
        public static android.media.tv.tunerresourcemanager.ITunerResourceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.tv.tunerresourcemanager.ITunerResourceManager p0) { return false; }
        public static android.media.tv.tunerresourcemanager.ITunerResourceManager getDefaultImpl() { return null; }

        private static class Proxy implements android.media.tv.tunerresourcemanager.ITunerResourceManager {
            private android.os.IBinder mRemote;
            public static android.media.tv.tunerresourcemanager.ITunerResourceManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerClientProfile(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.IResourcesReclaimListener p1, int[] p2) throws android.os.RemoteException {}
            public void unregisterClientProfile(int p0) throws android.os.RemoteException {}
            public boolean updateClientPriority(int p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public void setFrontendInfoList(android.media.tv.tuner.TunerFrontendInfo[] p0) throws android.os.RemoteException {}
            public void updateCasInfo(int p0, int p1) throws android.os.RemoteException {}
            public void setLnbInfoList(int[] p0) throws android.os.RemoteException {}
            public boolean requestFrontend(android.media.tv.tunerresourcemanager.TunerFrontendRequest p0, int[] p1) throws android.os.RemoteException { return false; }
            public void shareFrontend(int p0, int p1) throws android.os.RemoteException {}
            public boolean requestDemux(android.media.tv.tunerresourcemanager.TunerDemuxRequest p0, int[] p1) throws android.os.RemoteException { return false; }
            public boolean requestDescrambler(android.media.tv.tunerresourcemanager.TunerDescramblerRequest p0, int[] p1) throws android.os.RemoteException { return false; }
            public boolean requestCasSession(android.media.tv.tunerresourcemanager.CasSessionRequest p0, int[] p1) throws android.os.RemoteException { return false; }
            public boolean requestCiCam(android.media.tv.tunerresourcemanager.TunerCiCamRequest p0, int[] p1) throws android.os.RemoteException { return false; }
            public boolean requestLnb(android.media.tv.tunerresourcemanager.TunerLnbRequest p0, int[] p1) throws android.os.RemoteException { return false; }
            public void releaseFrontend(int p0, int p1) throws android.os.RemoteException {}
            public void releaseDemux(int p0, int p1) throws android.os.RemoteException {}
            public void releaseDescrambler(int p0, int p1) throws android.os.RemoteException {}
            public void releaseCasSession(int p0, int p1) throws android.os.RemoteException {}
            public void releaseCiCam(int p0, int p1) throws android.os.RemoteException {}
            public void releaseLnb(int p0, int p1) throws android.os.RemoteException {}
            public boolean isHigherPriority(android.media.tv.tunerresourcemanager.ResourceClientProfile p0, android.media.tv.tunerresourcemanager.ResourceClientProfile p1) throws android.os.RemoteException { return false; }
        }
    }
}
