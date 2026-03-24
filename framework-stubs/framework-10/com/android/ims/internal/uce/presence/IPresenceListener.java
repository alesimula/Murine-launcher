package com.android.ims.internal.uce.presence;

public interface IPresenceListener extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void getVersionCb(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void serviceAvailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void serviceUnAvailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void publishTriggering(com.android.ims.internal.uce.presence.PresPublishTriggerType p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void cmdStatus(com.android.ims.internal.uce.presence.PresCmdStatus p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void sipResponseReceived(com.android.ims.internal.uce.presence.PresSipResponse p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void capInfoReceived(java.lang.String p0, com.android.ims.internal.uce.presence.PresTupleInfo[] p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void listCapInfoReceived(com.android.ims.internal.uce.presence.PresRlmiInfo p0, com.android.ims.internal.uce.presence.PresResInfo[] p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void unpublishMessageSent() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.uce.presence.IPresenceListener {
        private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.uce.presence.IPresenceListener";
        static final int TRANSACTION_getVersionCb = 1;
        static final int TRANSACTION_serviceAvailable = 2;
        static final int TRANSACTION_serviceUnAvailable = 3;
        static final int TRANSACTION_publishTriggering = 4;
        static final int TRANSACTION_cmdStatus = 5;
        static final int TRANSACTION_sipResponseReceived = 6;
        static final int TRANSACTION_capInfoReceived = 7;
        static final int TRANSACTION_listCapInfoReceived = 8;
        static final int TRANSACTION_unpublishMessageSent = 9;
        public Stub() { super(); }
        public static com.android.ims.internal.uce.presence.IPresenceListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.uce.presence.IPresenceListener p0) { return false; }
        public static com.android.ims.internal.uce.presence.IPresenceListener getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.uce.presence.IPresenceListener {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.uce.presence.IPresenceListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getVersionCb(java.lang.String p0) throws android.os.RemoteException {}
            public void serviceAvailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException {}
            public void serviceUnAvailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException {}
            public void publishTriggering(com.android.ims.internal.uce.presence.PresPublishTriggerType p0) throws android.os.RemoteException {}
            public void cmdStatus(com.android.ims.internal.uce.presence.PresCmdStatus p0) throws android.os.RemoteException {}
            public void sipResponseReceived(com.android.ims.internal.uce.presence.PresSipResponse p0) throws android.os.RemoteException {}
            public void capInfoReceived(java.lang.String p0, com.android.ims.internal.uce.presence.PresTupleInfo[] p1) throws android.os.RemoteException {}
            public void listCapInfoReceived(com.android.ims.internal.uce.presence.PresRlmiInfo p0, com.android.ims.internal.uce.presence.PresResInfo[] p1) throws android.os.RemoteException {}
            public void unpublishMessageSent() throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.ims.internal.uce.presence.IPresenceListener {
        public Default() {}
        public void getVersionCb(java.lang.String p0) throws android.os.RemoteException {}
        public void serviceAvailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException {}
        public void serviceUnAvailable(com.android.ims.internal.uce.common.StatusCode p0) throws android.os.RemoteException {}
        public void publishTriggering(com.android.ims.internal.uce.presence.PresPublishTriggerType p0) throws android.os.RemoteException {}
        public void cmdStatus(com.android.ims.internal.uce.presence.PresCmdStatus p0) throws android.os.RemoteException {}
        public void sipResponseReceived(com.android.ims.internal.uce.presence.PresSipResponse p0) throws android.os.RemoteException {}
        public void capInfoReceived(java.lang.String p0, com.android.ims.internal.uce.presence.PresTupleInfo[] p1) throws android.os.RemoteException {}
        public void listCapInfoReceived(com.android.ims.internal.uce.presence.PresRlmiInfo p0, com.android.ims.internal.uce.presence.PresResInfo[] p1) throws android.os.RemoteException {}
        public void unpublishMessageSent() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
