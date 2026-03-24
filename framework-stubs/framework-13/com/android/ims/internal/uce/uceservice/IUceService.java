package com.android.ims.internal.uce.uceservice;

public interface IUceService extends android.os.IInterface {
    public boolean startService(com.android.ims.internal.uce.uceservice.IUceListener p0) throws android.os.RemoteException;
    public boolean stopService() throws android.os.RemoteException;
    public boolean isServiceStarted() throws android.os.RemoteException;
    @java.lang.Deprecated
    public int createOptionsService(com.android.ims.internal.uce.options.IOptionsListener p0, com.android.ims.internal.uce.common.UceLong p1) throws android.os.RemoteException;
    public int createOptionsServiceForSubscription(com.android.ims.internal.uce.options.IOptionsListener p0, com.android.ims.internal.uce.common.UceLong p1, java.lang.String p2) throws android.os.RemoteException;
    public void destroyOptionsService(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public int createPresenceService(com.android.ims.internal.uce.presence.IPresenceListener p0, com.android.ims.internal.uce.common.UceLong p1) throws android.os.RemoteException;
    public int createPresenceServiceForSubscription(com.android.ims.internal.uce.presence.IPresenceListener p0, com.android.ims.internal.uce.common.UceLong p1, java.lang.String p2) throws android.os.RemoteException;
    public void destroyPresenceService(int p0) throws android.os.RemoteException;
    public boolean getServiceStatus() throws android.os.RemoteException;
    @java.lang.Deprecated
    public com.android.ims.internal.uce.presence.IPresenceService getPresenceService() throws android.os.RemoteException;
    public com.android.ims.internal.uce.presence.IPresenceService getPresenceServiceForSubscription(java.lang.String p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public com.android.ims.internal.uce.options.IOptionsService getOptionsService() throws android.os.RemoteException;
    public com.android.ims.internal.uce.options.IOptionsService getOptionsServiceForSubscription(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.uce.uceservice.IUceService {
        public Default() {}
        public boolean startService(com.android.ims.internal.uce.uceservice.IUceListener p0) throws android.os.RemoteException { return false; }
        public boolean stopService() throws android.os.RemoteException { return false; }
        public boolean isServiceStarted() throws android.os.RemoteException { return false; }
        public int createOptionsService(com.android.ims.internal.uce.options.IOptionsListener p0, com.android.ims.internal.uce.common.UceLong p1) throws android.os.RemoteException { return 0; }
        public int createOptionsServiceForSubscription(com.android.ims.internal.uce.options.IOptionsListener p0, com.android.ims.internal.uce.common.UceLong p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void destroyOptionsService(int p0) throws android.os.RemoteException {}
        public int createPresenceService(com.android.ims.internal.uce.presence.IPresenceListener p0, com.android.ims.internal.uce.common.UceLong p1) throws android.os.RemoteException { return 0; }
        public int createPresenceServiceForSubscription(com.android.ims.internal.uce.presence.IPresenceListener p0, com.android.ims.internal.uce.common.UceLong p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public void destroyPresenceService(int p0) throws android.os.RemoteException {}
        public boolean getServiceStatus() throws android.os.RemoteException { return false; }
        public com.android.ims.internal.uce.presence.IPresenceService getPresenceService() throws android.os.RemoteException { return null; }
        public com.android.ims.internal.uce.presence.IPresenceService getPresenceServiceForSubscription(java.lang.String p0) throws android.os.RemoteException { return null; }
        public com.android.ims.internal.uce.options.IOptionsService getOptionsService() throws android.os.RemoteException { return null; }
        public com.android.ims.internal.uce.options.IOptionsService getOptionsServiceForSubscription(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.uce.uceservice.IUceService {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.uce.uceservice.IUceService";
        static final int TRANSACTION_startService = 1;
        static final int TRANSACTION_stopService = 2;
        static final int TRANSACTION_isServiceStarted = 3;
        static final int TRANSACTION_createOptionsService = 4;
        static final int TRANSACTION_createOptionsServiceForSubscription = 5;
        static final int TRANSACTION_destroyOptionsService = 6;
        static final int TRANSACTION_createPresenceService = 7;
        static final int TRANSACTION_createPresenceServiceForSubscription = 8;
        static final int TRANSACTION_destroyPresenceService = 9;
        static final int TRANSACTION_getServiceStatus = 10;
        static final int TRANSACTION_getPresenceService = 11;
        static final int TRANSACTION_getPresenceServiceForSubscription = 12;
        static final int TRANSACTION_getOptionsService = 13;
        static final int TRANSACTION_getOptionsServiceForSubscription = 14;
        public Stub() { super(); }
        public static com.android.ims.internal.uce.uceservice.IUceService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.ims.internal.uce.uceservice.IUceService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean startService(com.android.ims.internal.uce.uceservice.IUceListener p0) throws android.os.RemoteException { return false; }
            public boolean stopService() throws android.os.RemoteException { return false; }
            public boolean isServiceStarted() throws android.os.RemoteException { return false; }
            public int createOptionsService(com.android.ims.internal.uce.options.IOptionsListener p0, com.android.ims.internal.uce.common.UceLong p1) throws android.os.RemoteException { return 0; }
            public int createOptionsServiceForSubscription(com.android.ims.internal.uce.options.IOptionsListener p0, com.android.ims.internal.uce.common.UceLong p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void destroyOptionsService(int p0) throws android.os.RemoteException {}
            public int createPresenceService(com.android.ims.internal.uce.presence.IPresenceListener p0, com.android.ims.internal.uce.common.UceLong p1) throws android.os.RemoteException { return 0; }
            public int createPresenceServiceForSubscription(com.android.ims.internal.uce.presence.IPresenceListener p0, com.android.ims.internal.uce.common.UceLong p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public void destroyPresenceService(int p0) throws android.os.RemoteException {}
            public boolean getServiceStatus() throws android.os.RemoteException { return false; }
            public com.android.ims.internal.uce.presence.IPresenceService getPresenceService() throws android.os.RemoteException { return null; }
            public com.android.ims.internal.uce.presence.IPresenceService getPresenceServiceForSubscription(java.lang.String p0) throws android.os.RemoteException { return null; }
            public com.android.ims.internal.uce.options.IOptionsService getOptionsService() throws android.os.RemoteException { return null; }
            public com.android.ims.internal.uce.options.IOptionsService getOptionsServiceForSubscription(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
