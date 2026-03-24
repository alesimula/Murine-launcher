package android.service.quickaccesswallet;

public interface IQuickAccessWalletServiceCallbacks extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks";
    public void onGetWalletCardsSuccess(android.service.quickaccesswallet.GetWalletCardsResponse p0) throws android.os.RemoteException;
    public void onGetWalletCardsFailure(android.service.quickaccesswallet.GetWalletCardsError p0) throws android.os.RemoteException;
    public void onWalletServiceEvent(android.service.quickaccesswallet.WalletServiceEvent p0) throws android.os.RemoteException;
    public void onTargetActivityPendingIntentReceived(android.app.PendingIntent p0) throws android.os.RemoteException;

    public static class Default implements android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks {
        public Default() {}
        public void onGetWalletCardsSuccess(android.service.quickaccesswallet.GetWalletCardsResponse p0) throws android.os.RemoteException {}
        public void onGetWalletCardsFailure(android.service.quickaccesswallet.GetWalletCardsError p0) throws android.os.RemoteException {}
        public void onWalletServiceEvent(android.service.quickaccesswallet.WalletServiceEvent p0) throws android.os.RemoteException {}
        public void onTargetActivityPendingIntentReceived(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks {
        static final int TRANSACTION_onGetWalletCardsSuccess = 1;
        static final int TRANSACTION_onGetWalletCardsFailure = 2;
        static final int TRANSACTION_onWalletServiceEvent = 3;
        static final int TRANSACTION_onTargetActivityPendingIntentReceived = 4;
        public Stub() { super(); }
        public static android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGetWalletCardsSuccess(android.service.quickaccesswallet.GetWalletCardsResponse p0) throws android.os.RemoteException {}
            public void onGetWalletCardsFailure(android.service.quickaccesswallet.GetWalletCardsError p0) throws android.os.RemoteException {}
            public void onWalletServiceEvent(android.service.quickaccesswallet.WalletServiceEvent p0) throws android.os.RemoteException {}
            public void onTargetActivityPendingIntentReceived(android.app.PendingIntent p0) throws android.os.RemoteException {}
        }
    }
}
