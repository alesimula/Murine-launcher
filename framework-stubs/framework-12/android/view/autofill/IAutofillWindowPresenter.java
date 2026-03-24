package android.view.autofill;

public interface IAutofillWindowPresenter extends android.os.IInterface {
    public void show(android.view.WindowManager.LayoutParams p0, android.graphics.Rect p1, boolean p2, int p3) throws android.os.RemoteException;
    public void hide(android.graphics.Rect p0) throws android.os.RemoteException;

    public static class Default implements android.view.autofill.IAutofillWindowPresenter {
        public Default() {}
        public void show(android.view.WindowManager.LayoutParams p0, android.graphics.Rect p1, boolean p2, int p3) throws android.os.RemoteException {}
        public void hide(android.graphics.Rect p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.autofill.IAutofillWindowPresenter {
        public static final java.lang.String DESCRIPTOR = "android.view.autofill.IAutofillWindowPresenter";
        static final int TRANSACTION_show = 1;
        static final int TRANSACTION_hide = 2;
        public Stub() { super(); }
        public static android.view.autofill.IAutofillWindowPresenter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.autofill.IAutofillWindowPresenter p0) { return false; }
        public static android.view.autofill.IAutofillWindowPresenter getDefaultImpl() { return null; }

        private static class Proxy implements android.view.autofill.IAutofillWindowPresenter {
            private android.os.IBinder mRemote;
            public static android.view.autofill.IAutofillWindowPresenter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void show(android.view.WindowManager.LayoutParams p0, android.graphics.Rect p1, boolean p2, int p3) throws android.os.RemoteException {}
            public void hide(android.graphics.Rect p0) throws android.os.RemoteException {}
        }
    }
}
