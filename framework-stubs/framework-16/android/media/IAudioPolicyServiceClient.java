package android.media;

public interface IAudioPolicyServiceClient extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IAudioPolicyServiceClient";
    public void onAudioVolumeGroupChanged(int p0, int p1) throws android.os.RemoteException;
    public void onAudioPortListUpdate() throws android.os.RemoteException;
    public void onAudioPatchListUpdate() throws android.os.RemoteException;
    public void onDynamicPolicyMixStateUpdate(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onRecordingConfigurationUpdate(int p0, android.media.RecordClientInfo p1, android.media.audio.common.AudioConfigBase p2, android.media.EffectDescriptor[] p3, android.media.audio.common.AudioConfigBase p4, android.media.EffectDescriptor[] p5, int p6, int p7) throws android.os.RemoteException;
    public void onRoutingUpdated() throws android.os.RemoteException;
    public void onVolumeRangeInitRequest() throws android.os.RemoteException;

    public static class Default implements android.media.IAudioPolicyServiceClient {
        public Default() {}
        public void onAudioVolumeGroupChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onAudioPortListUpdate() throws android.os.RemoteException {}
        public void onAudioPatchListUpdate() throws android.os.RemoteException {}
        public void onDynamicPolicyMixStateUpdate(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onRecordingConfigurationUpdate(int p0, android.media.RecordClientInfo p1, android.media.audio.common.AudioConfigBase p2, android.media.EffectDescriptor[] p3, android.media.audio.common.AudioConfigBase p4, android.media.EffectDescriptor[] p5, int p6, int p7) throws android.os.RemoteException {}
        public void onRoutingUpdated() throws android.os.RemoteException {}
        public void onVolumeRangeInitRequest() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IAudioPolicyServiceClient {
        static final int TRANSACTION_onAudioVolumeGroupChanged = 1;
        static final int TRANSACTION_onAudioPortListUpdate = 2;
        static final int TRANSACTION_onAudioPatchListUpdate = 3;
        static final int TRANSACTION_onDynamicPolicyMixStateUpdate = 4;
        static final int TRANSACTION_onRecordingConfigurationUpdate = 5;
        static final int TRANSACTION_onRoutingUpdated = 6;
        static final int TRANSACTION_onVolumeRangeInitRequest = 7;
        public Stub() { super(); }
        public static android.media.IAudioPolicyServiceClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.IAudioPolicyServiceClient {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAudioVolumeGroupChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onAudioPortListUpdate() throws android.os.RemoteException {}
            public void onAudioPatchListUpdate() throws android.os.RemoteException {}
            public void onDynamicPolicyMixStateUpdate(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onRecordingConfigurationUpdate(int p0, android.media.RecordClientInfo p1, android.media.audio.common.AudioConfigBase p2, android.media.EffectDescriptor[] p3, android.media.audio.common.AudioConfigBase p4, android.media.EffectDescriptor[] p5, int p6, int p7) throws android.os.RemoteException {}
            public void onRoutingUpdated() throws android.os.RemoteException {}
            public void onVolumeRangeInitRequest() throws android.os.RemoteException {}
        }
    }
}
