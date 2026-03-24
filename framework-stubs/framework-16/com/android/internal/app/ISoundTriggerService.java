package com.android.internal.app;

public interface ISoundTriggerService extends android.os.IInterface {
    public com.android.internal.app.ISoundTriggerSession attachAsOriginator(android.media.permission.Identity p0, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p1, android.os.IBinder p2) throws android.os.RemoteException;
    public com.android.internal.app.ISoundTriggerSession attachAsMiddleman(android.media.permission.Identity p0, android.media.permission.Identity p1, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p2, android.os.IBinder p3) throws android.os.RemoteException;
    public java.util.List<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> listModuleProperties(android.media.permission.Identity p0) throws android.os.RemoteException;
    public void attachInjection(android.media.soundtrigger_middleware.ISoundTriggerInjection p0) throws android.os.RemoteException;
    public void setInPhoneCallState(boolean p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.ISoundTriggerService {
        public Default() {}
        public com.android.internal.app.ISoundTriggerSession attachAsOriginator(android.media.permission.Identity p0, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
        public com.android.internal.app.ISoundTriggerSession attachAsMiddleman(android.media.permission.Identity p0, android.media.permission.Identity p1, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p2, android.os.IBinder p3) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> listModuleProperties(android.media.permission.Identity p0) throws android.os.RemoteException { return null; }
        public void attachInjection(android.media.soundtrigger_middleware.ISoundTriggerInjection p0) throws android.os.RemoteException {}
        public void setInPhoneCallState(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.ISoundTriggerService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.app.ISoundTriggerService";
        static final int TRANSACTION_attachAsOriginator = 1;
        static final int TRANSACTION_attachAsMiddleman = 2;
        static final int TRANSACTION_listModuleProperties = 3;
        static final int TRANSACTION_attachInjection = 4;
        static final int TRANSACTION_setInPhoneCallState = 5;
        public Stub() { super(); }
        public static com.android.internal.app.ISoundTriggerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.app.ISoundTriggerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public com.android.internal.app.ISoundTriggerSession attachAsOriginator(android.media.permission.Identity p0, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
            public com.android.internal.app.ISoundTriggerSession attachAsMiddleman(android.media.permission.Identity p0, android.media.permission.Identity p1, android.hardware.soundtrigger.SoundTrigger.ModuleProperties p2, android.os.IBinder p3) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.soundtrigger.SoundTrigger.ModuleProperties> listModuleProperties(android.media.permission.Identity p0) throws android.os.RemoteException { return null; }
            public void attachInjection(android.media.soundtrigger_middleware.ISoundTriggerInjection p0) throws android.os.RemoteException {}
            public void setInPhoneCallState(boolean p0) throws android.os.RemoteException {}
        }
    }
}
