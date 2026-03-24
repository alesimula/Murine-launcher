package com.android.internal.app;

public interface IVoiceInteractor extends android.os.IInterface {
    public com.android.internal.app.IVoiceInteractorRequest startConfirmation(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.os.Bundle p3) throws android.os.RemoteException;
    public com.android.internal.app.IVoiceInteractorRequest startPickOption(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.app.VoiceInteractor.PickOptionRequest.Option[] p3, android.os.Bundle p4) throws android.os.RemoteException;
    public com.android.internal.app.IVoiceInteractorRequest startCompleteVoice(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.os.Bundle p3) throws android.os.RemoteException;
    public com.android.internal.app.IVoiceInteractorRequest startAbortVoice(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.os.Bundle p3) throws android.os.RemoteException;
    public com.android.internal.app.IVoiceInteractorRequest startCommand(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;
    public boolean[] supportsCommands(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void notifyDirectActionsChanged(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void setKillCallback(android.os.ICancellationSignal p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IVoiceInteractor {
        public Default() {}
        public com.android.internal.app.IVoiceInteractorRequest startConfirmation(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
        public com.android.internal.app.IVoiceInteractorRequest startPickOption(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.app.VoiceInteractor.PickOptionRequest.Option[] p3, android.os.Bundle p4) throws android.os.RemoteException { return null; }
        public com.android.internal.app.IVoiceInteractorRequest startCompleteVoice(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
        public com.android.internal.app.IVoiceInteractorRequest startAbortVoice(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
        public com.android.internal.app.IVoiceInteractorRequest startCommand(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
        public boolean[] supportsCommands(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public void notifyDirectActionsChanged(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void setKillCallback(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractor {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractor";
        static final int TRANSACTION_startConfirmation = 1;
        static final int TRANSACTION_startPickOption = 2;
        static final int TRANSACTION_startCompleteVoice = 3;
        static final int TRANSACTION_startAbortVoice = 4;
        static final int TRANSACTION_startCommand = 5;
        static final int TRANSACTION_supportsCommands = 6;
        static final int TRANSACTION_notifyDirectActionsChanged = 7;
        static final int TRANSACTION_setKillCallback = 8;
        public Stub() { super(); }
        public static com.android.internal.app.IVoiceInteractor asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.IVoiceInteractor p0) { return false; }
        public static com.android.internal.app.IVoiceInteractor getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.IVoiceInteractor {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.IVoiceInteractor sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public com.android.internal.app.IVoiceInteractorRequest startConfirmation(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
            public com.android.internal.app.IVoiceInteractorRequest startPickOption(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.app.VoiceInteractor.PickOptionRequest.Option[] p3, android.os.Bundle p4) throws android.os.RemoteException { return null; }
            public com.android.internal.app.IVoiceInteractorRequest startCompleteVoice(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
            public com.android.internal.app.IVoiceInteractorRequest startAbortVoice(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, android.app.VoiceInteractor.Prompt p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
            public com.android.internal.app.IVoiceInteractorRequest startCommand(java.lang.String p0, com.android.internal.app.IVoiceInteractorCallback p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException { return null; }
            public boolean[] supportsCommands(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
            public void notifyDirectActionsChanged(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void setKillCallback(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
        }
    }
}
