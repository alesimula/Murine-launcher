package com.android.internal.graphics.fonts;

public interface IFontManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.graphics.fonts.IFontManager";
    public android.text.FontConfig getFontConfig() throws android.os.RemoteException;
    public int updateFontFamily(java.util.List<android.graphics.fonts.FontUpdateRequest> p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.graphics.fonts.IFontManager {
        public Default() {}
        public android.text.FontConfig getFontConfig() throws android.os.RemoteException { return null; }
        public int updateFontFamily(java.util.List<android.graphics.fonts.FontUpdateRequest> p0, int p1) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.graphics.fonts.IFontManager {
        static final int TRANSACTION_getFontConfig = 1;
        static final int TRANSACTION_updateFontFamily = 2;
        public Stub() { super(); }
        public static com.android.internal.graphics.fonts.IFontManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.graphics.fonts.IFontManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.text.FontConfig getFontConfig() throws android.os.RemoteException { return null; }
            public int updateFontFamily(java.util.List<android.graphics.fonts.FontUpdateRequest> p0, int p1) throws android.os.RemoteException { return 0; }
        }
    }
}
