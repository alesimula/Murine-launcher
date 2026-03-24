package android.media.audiopolicy;

public interface IAudioPolicyCallback extends android.os.IInterface {
    public void notifyAudioFocusGrant(android.media.AudioFocusInfo p0, int p1) throws android.os.RemoteException;
    public void notifyAudioFocusLoss(android.media.AudioFocusInfo p0, boolean p1) throws android.os.RemoteException;
    public void notifyAudioFocusRequest(android.media.AudioFocusInfo p0, int p1) throws android.os.RemoteException;
    public void notifyAudioFocusAbandon(android.media.AudioFocusInfo p0) throws android.os.RemoteException;
    public void notifyMixStateUpdate(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void notifyVolumeAdjust(int p0) throws android.os.RemoteException;
    public void notifyUnregistration() throws android.os.RemoteException;

    public static class Default implements android.media.audiopolicy.IAudioPolicyCallback {
        public Default() {}
        public void notifyAudioFocusGrant(android.media.AudioFocusInfo p0, int p1) throws android.os.RemoteException {}
        public void notifyAudioFocusLoss(android.media.AudioFocusInfo p0, boolean p1) throws android.os.RemoteException {}
        public void notifyAudioFocusRequest(android.media.AudioFocusInfo p0, int p1) throws android.os.RemoteException {}
        public void notifyAudioFocusAbandon(android.media.AudioFocusInfo p0) throws android.os.RemoteException {}
        public void notifyMixStateUpdate(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void notifyVolumeAdjust(int p0) throws android.os.RemoteException {}
        public void notifyUnregistration() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.audiopolicy.IAudioPolicyCallback {
        private static final java.lang.String DESCRIPTOR = "android.media.audiopolicy.IAudioPolicyCallback";
        static final int TRANSACTION_notifyAudioFocusGrant = 1;
        static final int TRANSACTION_notifyAudioFocusLoss = 2;
        static final int TRANSACTION_notifyAudioFocusRequest = 3;
        static final int TRANSACTION_notifyAudioFocusAbandon = 4;
        static final int TRANSACTION_notifyMixStateUpdate = 5;
        static final int TRANSACTION_notifyVolumeAdjust = 6;
        static final int TRANSACTION_notifyUnregistration = 7;
        public Stub() { super(); }
        public static android.media.audiopolicy.IAudioPolicyCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.audiopolicy.IAudioPolicyCallback p0) { return false; }
        public static android.media.audiopolicy.IAudioPolicyCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.audiopolicy.IAudioPolicyCallback {
            private android.os.IBinder mRemote;
            public static android.media.audiopolicy.IAudioPolicyCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyAudioFocusGrant(android.media.AudioFocusInfo p0, int p1) throws android.os.RemoteException {}
            public void notifyAudioFocusLoss(android.media.AudioFocusInfo p0, boolean p1) throws android.os.RemoteException {}
            public void notifyAudioFocusRequest(android.media.AudioFocusInfo p0, int p1) throws android.os.RemoteException {}
            public void notifyAudioFocusAbandon(android.media.AudioFocusInfo p0) throws android.os.RemoteException {}
            public void notifyMixStateUpdate(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void notifyVolumeAdjust(int p0) throws android.os.RemoteException {}
            public void notifyUnregistration() throws android.os.RemoteException {}
        }
    }
}
