package android.app.wallpapereffectsgeneration;

public interface IWallpaperEffectsGenerationManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.wallpapereffectsgeneration.IWallpaperEffectsGenerationManager";
    public void generateCinematicEffect(android.app.wallpapereffectsgeneration.CinematicEffectRequest p0, android.app.wallpapereffectsgeneration.ICinematicEffectListener p1) throws android.os.RemoteException;
    public void returnCinematicEffectResponse(android.app.wallpapereffectsgeneration.CinematicEffectResponse p0) throws android.os.RemoteException;

    public static class Default implements android.app.wallpapereffectsgeneration.IWallpaperEffectsGenerationManager {
        public Default() {}
        public void generateCinematicEffect(android.app.wallpapereffectsgeneration.CinematicEffectRequest p0, android.app.wallpapereffectsgeneration.ICinematicEffectListener p1) throws android.os.RemoteException {}
        public void returnCinematicEffectResponse(android.app.wallpapereffectsgeneration.CinematicEffectResponse p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.wallpapereffectsgeneration.IWallpaperEffectsGenerationManager {
        static final int TRANSACTION_generateCinematicEffect = 1;
        static final int TRANSACTION_returnCinematicEffectResponse = 2;
        public Stub() { super(); }
        public static android.app.wallpapereffectsgeneration.IWallpaperEffectsGenerationManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.wallpapereffectsgeneration.IWallpaperEffectsGenerationManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void generateCinematicEffect(android.app.wallpapereffectsgeneration.CinematicEffectRequest p0, android.app.wallpapereffectsgeneration.ICinematicEffectListener p1) throws android.os.RemoteException {}
            public void returnCinematicEffectResponse(android.app.wallpapereffectsgeneration.CinematicEffectResponse p0) throws android.os.RemoteException {}
        }
    }
}
