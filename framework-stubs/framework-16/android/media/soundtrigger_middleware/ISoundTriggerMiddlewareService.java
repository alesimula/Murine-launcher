package android.media.soundtrigger_middleware;

public interface ISoundTriggerMiddlewareService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService";
    public android.media.soundtrigger_middleware.SoundTriggerModuleDescriptor[] listModulesAsOriginator(android.media.permission.Identity p0) throws android.os.RemoteException;
    public android.media.soundtrigger_middleware.SoundTriggerModuleDescriptor[] listModulesAsMiddleman(android.media.permission.Identity p0, android.media.permission.Identity p1) throws android.os.RemoteException;
    public android.media.soundtrigger_middleware.ISoundTriggerModule attachAsOriginator(int p0, android.media.permission.Identity p1, android.media.soundtrigger_middleware.ISoundTriggerCallback p2) throws android.os.RemoteException;
    public android.media.soundtrigger_middleware.ISoundTriggerModule attachAsMiddleman(int p0, android.media.permission.Identity p1, android.media.permission.Identity p2, android.media.soundtrigger_middleware.ISoundTriggerCallback p3, boolean p4) throws android.os.RemoteException;
    public void attachFakeHalInjection(android.media.soundtrigger_middleware.ISoundTriggerInjection p0) throws android.os.RemoteException;

    public static class Default implements android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService {
        public Default() {}
        public android.media.soundtrigger_middleware.SoundTriggerModuleDescriptor[] listModulesAsOriginator(android.media.permission.Identity p0) throws android.os.RemoteException { return null; }
        public android.media.soundtrigger_middleware.SoundTriggerModuleDescriptor[] listModulesAsMiddleman(android.media.permission.Identity p0, android.media.permission.Identity p1) throws android.os.RemoteException { return null; }
        public android.media.soundtrigger_middleware.ISoundTriggerModule attachAsOriginator(int p0, android.media.permission.Identity p1, android.media.soundtrigger_middleware.ISoundTriggerCallback p2) throws android.os.RemoteException { return null; }
        public android.media.soundtrigger_middleware.ISoundTriggerModule attachAsMiddleman(int p0, android.media.permission.Identity p1, android.media.permission.Identity p2, android.media.soundtrigger_middleware.ISoundTriggerCallback p3, boolean p4) throws android.os.RemoteException { return null; }
        public void attachFakeHalInjection(android.media.soundtrigger_middleware.ISoundTriggerInjection p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService {
        static final int TRANSACTION_listModulesAsOriginator = 1;
        static final int TRANSACTION_listModulesAsMiddleman = 2;
        static final int TRANSACTION_attachAsOriginator = 3;
        static final int TRANSACTION_attachAsMiddleman = 4;
        static final int TRANSACTION_attachFakeHalInjection = 5;
        public Stub() { super(); }
        public static android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.media.soundtrigger_middleware.SoundTriggerModuleDescriptor[] listModulesAsOriginator(android.media.permission.Identity p0) throws android.os.RemoteException { return null; }
            public android.media.soundtrigger_middleware.SoundTriggerModuleDescriptor[] listModulesAsMiddleman(android.media.permission.Identity p0, android.media.permission.Identity p1) throws android.os.RemoteException { return null; }
            public android.media.soundtrigger_middleware.ISoundTriggerModule attachAsOriginator(int p0, android.media.permission.Identity p1, android.media.soundtrigger_middleware.ISoundTriggerCallback p2) throws android.os.RemoteException { return null; }
            public android.media.soundtrigger_middleware.ISoundTriggerModule attachAsMiddleman(int p0, android.media.permission.Identity p1, android.media.permission.Identity p2, android.media.soundtrigger_middleware.ISoundTriggerCallback p3, boolean p4) throws android.os.RemoteException { return null; }
            public void attachFakeHalInjection(android.media.soundtrigger_middleware.ISoundTriggerInjection p0) throws android.os.RemoteException {}
        }
    }
}
