package android.gsi;

public interface IImageService extends android.os.IInterface {
    public static final int CREATE_IMAGE_DEFAULT = 0;
    public static final int CREATE_IMAGE_READONLY = 1;
    public static final int CREATE_IMAGE_ZERO_FILL = 2;
    public static final int IMAGE_OK = 0;
    public static final int IMAGE_ERROR = 1;
    public void createBackingImage(java.lang.String p0, long p1, int p2, android.gsi.IProgressCallback p3) throws android.os.RemoteException;
    public void deleteBackingImage(java.lang.String p0) throws android.os.RemoteException;
    public void mapImageDevice(java.lang.String p0, int p1, android.gsi.MappedImage p2) throws android.os.RemoteException;
    public void unmapImageDevice(java.lang.String p0) throws android.os.RemoteException;
    public boolean backingImageExists(java.lang.String p0) throws android.os.RemoteException;
    public boolean isImageMapped(java.lang.String p0) throws android.os.RemoteException;
    public int getAvbPublicKey(java.lang.String p0, android.gsi.AvbPublicKey p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllBackingImages() throws android.os.RemoteException;
    public void zeroFillNewImage(java.lang.String p0, long p1) throws android.os.RemoteException;
    public void removeAllImages() throws android.os.RemoteException;
    public void removeDisabledImages() throws android.os.RemoteException;
    public java.lang.String getMappedImageDevice(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.gsi.IImageService {
        public Default() {}
        public void createBackingImage(java.lang.String p0, long p1, int p2, android.gsi.IProgressCallback p3) throws android.os.RemoteException {}
        public void deleteBackingImage(java.lang.String p0) throws android.os.RemoteException {}
        public void mapImageDevice(java.lang.String p0, int p1, android.gsi.MappedImage p2) throws android.os.RemoteException {}
        public void unmapImageDevice(java.lang.String p0) throws android.os.RemoteException {}
        public boolean backingImageExists(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isImageMapped(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getAvbPublicKey(java.lang.String p0, android.gsi.AvbPublicKey p1) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getAllBackingImages() throws android.os.RemoteException { return null; }
        public void zeroFillNewImage(java.lang.String p0, long p1) throws android.os.RemoteException {}
        public void removeAllImages() throws android.os.RemoteException {}
        public void removeDisabledImages() throws android.os.RemoteException {}
        public java.lang.String getMappedImageDevice(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.gsi.IImageService {
        private static final java.lang.String DESCRIPTOR = "android.gsi.IImageService";
        static final int TRANSACTION_createBackingImage = 1;
        static final int TRANSACTION_deleteBackingImage = 2;
        static final int TRANSACTION_mapImageDevice = 3;
        static final int TRANSACTION_unmapImageDevice = 4;
        static final int TRANSACTION_backingImageExists = 5;
        static final int TRANSACTION_isImageMapped = 6;
        static final int TRANSACTION_getAvbPublicKey = 7;
        static final int TRANSACTION_getAllBackingImages = 8;
        static final int TRANSACTION_zeroFillNewImage = 9;
        static final int TRANSACTION_removeAllImages = 10;
        static final int TRANSACTION_removeDisabledImages = 11;
        static final int TRANSACTION_getMappedImageDevice = 12;
        public Stub() { super(); }
        public static android.gsi.IImageService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.gsi.IImageService p0) { return false; }
        public static android.gsi.IImageService getDefaultImpl() { return null; }

        private static class Proxy implements android.gsi.IImageService {
            private android.os.IBinder mRemote;
            public static android.gsi.IImageService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createBackingImage(java.lang.String p0, long p1, int p2, android.gsi.IProgressCallback p3) throws android.os.RemoteException {}
            public void deleteBackingImage(java.lang.String p0) throws android.os.RemoteException {}
            public void mapImageDevice(java.lang.String p0, int p1, android.gsi.MappedImage p2) throws android.os.RemoteException {}
            public void unmapImageDevice(java.lang.String p0) throws android.os.RemoteException {}
            public boolean backingImageExists(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isImageMapped(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getAvbPublicKey(java.lang.String p0, android.gsi.AvbPublicKey p1) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getAllBackingImages() throws android.os.RemoteException { return null; }
            public void zeroFillNewImage(java.lang.String p0, long p1) throws android.os.RemoteException {}
            public void removeAllImages() throws android.os.RemoteException {}
            public void removeDisabledImages() throws android.os.RemoteException {}
            public java.lang.String getMappedImageDevice(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
