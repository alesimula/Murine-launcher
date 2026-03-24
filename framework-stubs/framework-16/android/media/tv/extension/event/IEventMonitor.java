package android.media.tv.extension.event;

public interface IEventMonitor extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.event.IEventMonitor";
    public android.os.Bundle getPresentEventInfo(long p0) throws android.os.RemoteException;
    public void addPresentEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException;
    public void removePresentEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException;
    public android.os.Bundle getFollowingEventInfo(long p0) throws android.os.RemoteException;
    public void addFollowingEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException;
    public void removeFollowingEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException;
    public android.os.Bundle getSdtGuidanceInfo(long p0) throws android.os.RemoteException;
    public void setBgmTuneChannelInfo(android.net.Uri[] p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.event.IEventMonitor {
        public Default() {}
        public android.os.Bundle getPresentEventInfo(long p0) throws android.os.RemoteException { return null; }
        public void addPresentEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException {}
        public void removePresentEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException {}
        public android.os.Bundle getFollowingEventInfo(long p0) throws android.os.RemoteException { return null; }
        public void addFollowingEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException {}
        public void removeFollowingEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException {}
        public android.os.Bundle getSdtGuidanceInfo(long p0) throws android.os.RemoteException { return null; }
        public void setBgmTuneChannelInfo(android.net.Uri[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.event.IEventMonitor {
        static final int TRANSACTION_getPresentEventInfo = 1;
        static final int TRANSACTION_addPresentEventInfoListener = 2;
        static final int TRANSACTION_removePresentEventInfoListener = 3;
        static final int TRANSACTION_getFollowingEventInfo = 4;
        static final int TRANSACTION_addFollowingEventInfoListener = 5;
        static final int TRANSACTION_removeFollowingEventInfoListener = 6;
        static final int TRANSACTION_getSdtGuidanceInfo = 7;
        static final int TRANSACTION_setBgmTuneChannelInfo = 8;
        public Stub() { super(); }
        public static android.media.tv.extension.event.IEventMonitor asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.event.IEventMonitor {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.Bundle getPresentEventInfo(long p0) throws android.os.RemoteException { return null; }
            public void addPresentEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException {}
            public void removePresentEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException {}
            public android.os.Bundle getFollowingEventInfo(long p0) throws android.os.RemoteException { return null; }
            public void addFollowingEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException {}
            public void removeFollowingEventInfoListener(android.media.tv.extension.event.IEventMonitorListener p0) throws android.os.RemoteException {}
            public android.os.Bundle getSdtGuidanceInfo(long p0) throws android.os.RemoteException { return null; }
            public void setBgmTuneChannelInfo(android.net.Uri[] p0) throws android.os.RemoteException {}
        }
    }
}
