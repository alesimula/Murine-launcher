package android.service.quickaccesswallet;

public interface IQuickAccessWalletService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.quickaccesswallet.IQuickAccessWalletService";
    public void onWalletCardsRequested(android.service.quickaccesswallet.GetWalletCardsRequest p0, android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p1) throws android.os.RemoteException;
    public void onWalletCardSelected(android.service.quickaccesswallet.SelectWalletCardRequest p0) throws android.os.RemoteException;
    public void onWalletDismissed() throws android.os.RemoteException;
    public void registerWalletServiceEventListener(android.service.quickaccesswallet.WalletServiceEventListenerRequest p0, android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p1) throws android.os.RemoteException;
    public void unregisterWalletServiceEventListener(android.service.quickaccesswallet.WalletServiceEventListenerRequest p0) throws android.os.RemoteException;
    public void onTargetActivityIntentRequested(android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p0) throws android.os.RemoteException;
    public void onGestureTargetActivityIntentRequested(android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p0) throws android.os.RemoteException;

    public static class Default implements android.service.quickaccesswallet.IQuickAccessWalletService {
        public Default() {}
        public void onWalletCardsRequested(android.service.quickaccesswallet.GetWalletCardsRequest p0, android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p1) throws android.os.RemoteException {}
        public void onWalletCardSelected(android.service.quickaccesswallet.SelectWalletCardRequest p0) throws android.os.RemoteException {}
        public void onWalletDismissed() throws android.os.RemoteException {}
        public void registerWalletServiceEventListener(android.service.quickaccesswallet.WalletServiceEventListenerRequest p0, android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p1) throws android.os.RemoteException {}
        public void unregisterWalletServiceEventListener(android.service.quickaccesswallet.WalletServiceEventListenerRequest p0) throws android.os.RemoteException {}
        public void onTargetActivityIntentRequested(android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p0) throws android.os.RemoteException {}
        public void onGestureTargetActivityIntentRequested(android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.quickaccesswallet.IQuickAccessWalletService {
        static final int TRANSACTION_onWalletCardsRequested = 1;
        static final int TRANSACTION_onWalletCardSelected = 2;
        static final int TRANSACTION_onWalletDismissed = 3;
        static final int TRANSACTION_registerWalletServiceEventListener = 4;
        static final int TRANSACTION_unregisterWalletServiceEventListener = 5;
        static final int TRANSACTION_onTargetActivityIntentRequested = 6;
        static final int TRANSACTION_onGestureTargetActivityIntentRequested = 7;
        public Stub() { super(); }
        public static android.service.quickaccesswallet.IQuickAccessWalletService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.quickaccesswallet.IQuickAccessWalletService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onWalletCardsRequested(android.service.quickaccesswallet.GetWalletCardsRequest p0, android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p1) throws android.os.RemoteException {}
            public void onWalletCardSelected(android.service.quickaccesswallet.SelectWalletCardRequest p0) throws android.os.RemoteException {}
            public void onWalletDismissed() throws android.os.RemoteException {}
            public void registerWalletServiceEventListener(android.service.quickaccesswallet.WalletServiceEventListenerRequest p0, android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p1) throws android.os.RemoteException {}
            public void unregisterWalletServiceEventListener(android.service.quickaccesswallet.WalletServiceEventListenerRequest p0) throws android.os.RemoteException {}
            public void onTargetActivityIntentRequested(android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p0) throws android.os.RemoteException {}
            public void onGestureTargetActivityIntentRequested(android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p0) throws android.os.RemoteException {}
        }
    }
}
