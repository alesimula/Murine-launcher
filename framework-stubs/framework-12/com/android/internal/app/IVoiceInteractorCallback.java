package com.android.internal.app;

public interface IVoiceInteractorCallback extends android.os.IInterface {
    public void deliverConfirmationResult(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void deliverPickOptionResult(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1, android.app.VoiceInteractor.PickOptionRequest.Option[] p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void deliverCompleteVoiceResult(com.android.internal.app.IVoiceInteractorRequest p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void deliverAbortVoiceResult(com.android.internal.app.IVoiceInteractorRequest p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void deliverCommandResult(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void deliverCancel(com.android.internal.app.IVoiceInteractorRequest p0) throws android.os.RemoteException;
    public void destroy() throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IVoiceInteractorCallback {
        public Default() {}
        public void deliverConfirmationResult(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void deliverPickOptionResult(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1, android.app.VoiceInteractor.PickOptionRequest.Option[] p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void deliverCompleteVoiceResult(com.android.internal.app.IVoiceInteractorRequest p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void deliverAbortVoiceResult(com.android.internal.app.IVoiceInteractorRequest p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void deliverCommandResult(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void deliverCancel(com.android.internal.app.IVoiceInteractorRequest p0) throws android.os.RemoteException {}
        public void destroy() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractorCallback {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractorCallback";
        static final int TRANSACTION_deliverConfirmationResult = 1;
        static final int TRANSACTION_deliverPickOptionResult = 2;
        static final int TRANSACTION_deliverCompleteVoiceResult = 3;
        static final int TRANSACTION_deliverAbortVoiceResult = 4;
        static final int TRANSACTION_deliverCommandResult = 5;
        static final int TRANSACTION_deliverCancel = 6;
        static final int TRANSACTION_destroy = 7;
        public Stub() { super(); }
        public static com.android.internal.app.IVoiceInteractorCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.IVoiceInteractorCallback p0) { return false; }
        public static com.android.internal.app.IVoiceInteractorCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.IVoiceInteractorCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.IVoiceInteractorCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void deliverConfirmationResult(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void deliverPickOptionResult(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1, android.app.VoiceInteractor.PickOptionRequest.Option[] p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void deliverCompleteVoiceResult(com.android.internal.app.IVoiceInteractorRequest p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void deliverAbortVoiceResult(com.android.internal.app.IVoiceInteractorRequest p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void deliverCommandResult(com.android.internal.app.IVoiceInteractorRequest p0, boolean p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void deliverCancel(com.android.internal.app.IVoiceInteractorRequest p0) throws android.os.RemoteException {}
            public void destroy() throws android.os.RemoteException {}
        }
    }
}
