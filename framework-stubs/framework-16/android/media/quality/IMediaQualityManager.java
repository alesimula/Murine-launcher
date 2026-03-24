package android.media.quality;

public interface IMediaQualityManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.quality.IMediaQualityManager";
    public void createPictureProfile(android.media.quality.PictureProfile p0, int p1) throws android.os.RemoteException;
    public void updatePictureProfile(java.lang.String p0, android.media.quality.PictureProfile p1, int p2) throws android.os.RemoteException;
    public void removePictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.media.quality.PictureProfile getDefaultPictureProfile() throws android.os.RemoteException;
    public boolean setDefaultPictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.media.quality.PictureProfile getPictureProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException;
    public java.util.List<android.media.quality.PictureProfile> getPictureProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.media.quality.PictureProfile> getAvailablePictureProfiles(boolean p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPictureProfilePackageNames(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPictureProfileAllowList(int p0) throws android.os.RemoteException;
    public void setPictureProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.media.quality.PictureProfileHandle> getPictureProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void changeStreamStatus(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public long getPictureProfileHandleValue(java.lang.String p0, int p1) throws android.os.RemoteException;
    public long getDefaultPictureProfileHandleValue(int p0) throws android.os.RemoteException;
    public void notifyPictureProfileHandleSelection(long p0, int p1) throws android.os.RemoteException;
    public long getPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.media.quality.PictureProfile getCurrentPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.media.quality.PictureProfile> getAllPictureProfilesForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void createSoundProfile(android.media.quality.SoundProfile p0, int p1) throws android.os.RemoteException;
    public void updateSoundProfile(java.lang.String p0, android.media.quality.SoundProfile p1, int p2) throws android.os.RemoteException;
    public void removeSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean setDefaultSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.media.quality.SoundProfile getSoundProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException;
    public java.util.List<android.media.quality.SoundProfile> getSoundProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.media.quality.SoundProfile> getAvailableSoundProfiles(boolean p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getSoundProfilePackageNames(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getSoundProfileAllowList(int p0) throws android.os.RemoteException;
    public void setSoundProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.media.quality.SoundProfileHandle> getSoundProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException;
    public void registerPictureProfileCallback(android.media.quality.IPictureProfileCallback p0) throws android.os.RemoteException;
    public void registerSoundProfileCallback(android.media.quality.ISoundProfileCallback p0) throws android.os.RemoteException;
    public void registerAmbientBacklightCallback(android.media.quality.IAmbientBacklightCallback p0) throws android.os.RemoteException;
    public void registerActiveProcessingPictureListener(android.media.quality.IActiveProcessingPictureListener p0) throws android.os.RemoteException;
    public java.util.List<android.media.quality.ParameterCapability> getParameterCapabilities(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException;
    public boolean isSupported(int p0) throws android.os.RemoteException;
    public void setAutoPictureQualityEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public boolean isAutoPictureQualityEnabled(int p0) throws android.os.RemoteException;
    public void setSuperResolutionEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public boolean isSuperResolutionEnabled(int p0) throws android.os.RemoteException;
    public void setAutoSoundQualityEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public boolean isAutoSoundQualityEnabled(int p0) throws android.os.RemoteException;
    public void setAmbientBacklightSettings(android.media.quality.AmbientBacklightSettings p0, int p1) throws android.os.RemoteException;
    public void setAmbientBacklightEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public boolean isAmbientBacklightEnabled(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.quality.IMediaQualityManager {
        public Default() {}
        public void createPictureProfile(android.media.quality.PictureProfile p0, int p1) throws android.os.RemoteException {}
        public void updatePictureProfile(java.lang.String p0, android.media.quality.PictureProfile p1, int p2) throws android.os.RemoteException {}
        public void removePictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.media.quality.PictureProfile getDefaultPictureProfile() throws android.os.RemoteException { return null; }
        public boolean setDefaultPictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.media.quality.PictureProfile getPictureProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.PictureProfile> getPictureProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.PictureProfile> getAvailablePictureProfiles(boolean p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPictureProfilePackageNames(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPictureProfileAllowList(int p0) throws android.os.RemoteException { return null; }
        public void setPictureProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
        public java.util.List<android.media.quality.PictureProfileHandle> getPictureProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
        public void changeStreamStatus(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public long getPictureProfileHandleValue(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
        public long getDefaultPictureProfileHandleValue(int p0) throws android.os.RemoteException { return 0L; }
        public void notifyPictureProfileHandleSelection(long p0, int p1) throws android.os.RemoteException {}
        public long getPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
        public android.media.quality.PictureProfile getCurrentPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.PictureProfile> getAllPictureProfilesForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void createSoundProfile(android.media.quality.SoundProfile p0, int p1) throws android.os.RemoteException {}
        public void updateSoundProfile(java.lang.String p0, android.media.quality.SoundProfile p1, int p2) throws android.os.RemoteException {}
        public void removeSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean setDefaultSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.media.quality.SoundProfile getSoundProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.SoundProfile> getSoundProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
        public java.util.List<android.media.quality.SoundProfile> getAvailableSoundProfiles(boolean p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getSoundProfilePackageNames(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getSoundProfileAllowList(int p0) throws android.os.RemoteException { return null; }
        public void setSoundProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
        public java.util.List<android.media.quality.SoundProfileHandle> getSoundProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
        public void registerPictureProfileCallback(android.media.quality.IPictureProfileCallback p0) throws android.os.RemoteException {}
        public void registerSoundProfileCallback(android.media.quality.ISoundProfileCallback p0) throws android.os.RemoteException {}
        public void registerAmbientBacklightCallback(android.media.quality.IAmbientBacklightCallback p0) throws android.os.RemoteException {}
        public void registerActiveProcessingPictureListener(android.media.quality.IActiveProcessingPictureListener p0) throws android.os.RemoteException {}
        public java.util.List<android.media.quality.ParameterCapability> getParameterCapabilities(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException { return null; }
        public boolean isSupported(int p0) throws android.os.RemoteException { return false; }
        public void setAutoPictureQualityEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean isAutoPictureQualityEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setSuperResolutionEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean isSuperResolutionEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setAutoSoundQualityEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean isAutoSoundQualityEnabled(int p0) throws android.os.RemoteException { return false; }
        public void setAmbientBacklightSettings(android.media.quality.AmbientBacklightSettings p0, int p1) throws android.os.RemoteException {}
        public void setAmbientBacklightEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public boolean isAmbientBacklightEnabled(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.quality.IMediaQualityManager {
        static final int TRANSACTION_createPictureProfile = 1;
        static final int TRANSACTION_updatePictureProfile = 2;
        static final int TRANSACTION_removePictureProfile = 3;
        static final int TRANSACTION_getDefaultPictureProfile = 4;
        static final int TRANSACTION_setDefaultPictureProfile = 5;
        static final int TRANSACTION_getPictureProfile = 6;
        static final int TRANSACTION_getPictureProfilesByPackage = 7;
        static final int TRANSACTION_getAvailablePictureProfiles = 8;
        static final int TRANSACTION_getPictureProfilePackageNames = 9;
        static final int TRANSACTION_getPictureProfileAllowList = 10;
        static final int TRANSACTION_setPictureProfileAllowList = 11;
        static final int TRANSACTION_getPictureProfileHandle = 12;
        static final int TRANSACTION_changeStreamStatus = 13;
        static final int TRANSACTION_getPictureProfileHandleValue = 14;
        static final int TRANSACTION_getDefaultPictureProfileHandleValue = 15;
        static final int TRANSACTION_notifyPictureProfileHandleSelection = 16;
        static final int TRANSACTION_getPictureProfileForTvInput = 17;
        static final int TRANSACTION_getCurrentPictureProfileForTvInput = 18;
        static final int TRANSACTION_getAllPictureProfilesForTvInput = 19;
        static final int TRANSACTION_createSoundProfile = 20;
        static final int TRANSACTION_updateSoundProfile = 21;
        static final int TRANSACTION_removeSoundProfile = 22;
        static final int TRANSACTION_setDefaultSoundProfile = 23;
        static final int TRANSACTION_getSoundProfile = 24;
        static final int TRANSACTION_getSoundProfilesByPackage = 25;
        static final int TRANSACTION_getAvailableSoundProfiles = 26;
        static final int TRANSACTION_getSoundProfilePackageNames = 27;
        static final int TRANSACTION_getSoundProfileAllowList = 28;
        static final int TRANSACTION_setSoundProfileAllowList = 29;
        static final int TRANSACTION_getSoundProfileHandle = 30;
        static final int TRANSACTION_registerPictureProfileCallback = 31;
        static final int TRANSACTION_registerSoundProfileCallback = 32;
        static final int TRANSACTION_registerAmbientBacklightCallback = 33;
        static final int TRANSACTION_registerActiveProcessingPictureListener = 34;
        static final int TRANSACTION_getParameterCapabilities = 35;
        static final int TRANSACTION_isSupported = 36;
        static final int TRANSACTION_setAutoPictureQualityEnabled = 37;
        static final int TRANSACTION_isAutoPictureQualityEnabled = 38;
        static final int TRANSACTION_setSuperResolutionEnabled = 39;
        static final int TRANSACTION_isSuperResolutionEnabled = 40;
        static final int TRANSACTION_setAutoSoundQualityEnabled = 41;
        static final int TRANSACTION_isAutoSoundQualityEnabled = 42;
        static final int TRANSACTION_setAmbientBacklightSettings = 43;
        static final int TRANSACTION_setAmbientBacklightEnabled = 44;
        static final int TRANSACTION_isAmbientBacklightEnabled = 45;
        public Stub() { super(); }
        public static android.media.quality.IMediaQualityManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.quality.IMediaQualityManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createPictureProfile(android.media.quality.PictureProfile p0, int p1) throws android.os.RemoteException {}
            public void updatePictureProfile(java.lang.String p0, android.media.quality.PictureProfile p1, int p2) throws android.os.RemoteException {}
            public void removePictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public android.media.quality.PictureProfile getDefaultPictureProfile() throws android.os.RemoteException { return null; }
            public boolean setDefaultPictureProfile(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.media.quality.PictureProfile getPictureProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.PictureProfile> getPictureProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.PictureProfile> getAvailablePictureProfiles(boolean p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPictureProfilePackageNames(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPictureProfileAllowList(int p0) throws android.os.RemoteException { return null; }
            public void setPictureProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
            public java.util.List<android.media.quality.PictureProfileHandle> getPictureProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
            public void changeStreamStatus(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public long getPictureProfileHandleValue(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
            public long getDefaultPictureProfileHandleValue(int p0) throws android.os.RemoteException { return 0L; }
            public void notifyPictureProfileHandleSelection(long p0, int p1) throws android.os.RemoteException {}
            public long getPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
            public android.media.quality.PictureProfile getCurrentPictureProfileForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.PictureProfile> getAllPictureProfilesForTvInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void createSoundProfile(android.media.quality.SoundProfile p0, int p1) throws android.os.RemoteException {}
            public void updateSoundProfile(java.lang.String p0, android.media.quality.SoundProfile p1, int p2) throws android.os.RemoteException {}
            public void removeSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean setDefaultSoundProfile(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.media.quality.SoundProfile getSoundProfile(int p0, java.lang.String p1, boolean p2, int p3) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.SoundProfile> getSoundProfilesByPackage(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
            public java.util.List<android.media.quality.SoundProfile> getAvailableSoundProfiles(boolean p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getSoundProfilePackageNames(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getSoundProfileAllowList(int p0) throws android.os.RemoteException { return null; }
            public void setSoundProfileAllowList(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException {}
            public java.util.List<android.media.quality.SoundProfileHandle> getSoundProfileHandle(java.lang.String[] p0, int p1) throws android.os.RemoteException { return null; }
            public void registerPictureProfileCallback(android.media.quality.IPictureProfileCallback p0) throws android.os.RemoteException {}
            public void registerSoundProfileCallback(android.media.quality.ISoundProfileCallback p0) throws android.os.RemoteException {}
            public void registerAmbientBacklightCallback(android.media.quality.IAmbientBacklightCallback p0) throws android.os.RemoteException {}
            public void registerActiveProcessingPictureListener(android.media.quality.IActiveProcessingPictureListener p0) throws android.os.RemoteException {}
            public java.util.List<android.media.quality.ParameterCapability> getParameterCapabilities(java.util.List<java.lang.String> p0, int p1) throws android.os.RemoteException { return null; }
            public boolean isSupported(int p0) throws android.os.RemoteException { return false; }
            public void setAutoPictureQualityEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean isAutoPictureQualityEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setSuperResolutionEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean isSuperResolutionEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setAutoSoundQualityEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean isAutoSoundQualityEnabled(int p0) throws android.os.RemoteException { return false; }
            public void setAmbientBacklightSettings(android.media.quality.AmbientBacklightSettings p0, int p1) throws android.os.RemoteException {}
            public void setAmbientBacklightEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public boolean isAmbientBacklightEnabled(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
