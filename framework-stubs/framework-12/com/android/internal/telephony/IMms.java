package com.android.internal.telephony;

public interface IMms extends android.os.IInterface {
    public void sendMessage(int p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.os.Bundle p4, android.app.PendingIntent p5, long p6) throws android.os.RemoteException;
    public void downloadMessage(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, android.os.Bundle p4, android.app.PendingIntent p5, long p6) throws android.os.RemoteException;
    public android.net.Uri importTextMessage(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, long p4, boolean p5, boolean p6) throws android.os.RemoteException;
    public android.net.Uri importMultimediaMessage(java.lang.String p0, android.net.Uri p1, java.lang.String p2, long p3, boolean p4, boolean p5) throws android.os.RemoteException;
    public boolean deleteStoredMessage(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException;
    public boolean deleteStoredConversation(java.lang.String p0, long p1) throws android.os.RemoteException;
    public boolean updateStoredMessageStatus(java.lang.String p0, android.net.Uri p1, android.content.ContentValues p2) throws android.os.RemoteException;
    public boolean archiveStoredConversation(java.lang.String p0, long p1, boolean p2) throws android.os.RemoteException;
    public android.net.Uri addTextMessageDraft(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public android.net.Uri addMultimediaMessageDraft(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException;
    public void sendStoredMessage(int p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3, android.app.PendingIntent p4) throws android.os.RemoteException;
    public void setAutoPersisting(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public boolean getAutoPersisting() throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.IMms {
        public Default() {}
        public void sendMessage(int p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.os.Bundle p4, android.app.PendingIntent p5, long p6) throws android.os.RemoteException {}
        public void downloadMessage(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, android.os.Bundle p4, android.app.PendingIntent p5, long p6) throws android.os.RemoteException {}
        public android.net.Uri importTextMessage(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, long p4, boolean p5, boolean p6) throws android.os.RemoteException { return null; }
        public android.net.Uri importMultimediaMessage(java.lang.String p0, android.net.Uri p1, java.lang.String p2, long p3, boolean p4, boolean p5) throws android.os.RemoteException { return null; }
        public boolean deleteStoredMessage(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException { return false; }
        public boolean deleteStoredConversation(java.lang.String p0, long p1) throws android.os.RemoteException { return false; }
        public boolean updateStoredMessageStatus(java.lang.String p0, android.net.Uri p1, android.content.ContentValues p2) throws android.os.RemoteException { return false; }
        public boolean archiveStoredConversation(java.lang.String p0, long p1, boolean p2) throws android.os.RemoteException { return false; }
        public android.net.Uri addTextMessageDraft(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.net.Uri addMultimediaMessageDraft(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException { return null; }
        public void sendStoredMessage(int p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3, android.app.PendingIntent p4) throws android.os.RemoteException {}
        public void setAutoPersisting(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public boolean getAutoPersisting() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IMms {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IMms";
        static final int TRANSACTION_sendMessage = 1;
        static final int TRANSACTION_downloadMessage = 2;
        static final int TRANSACTION_importTextMessage = 3;
        static final int TRANSACTION_importMultimediaMessage = 4;
        static final int TRANSACTION_deleteStoredMessage = 5;
        static final int TRANSACTION_deleteStoredConversation = 6;
        static final int TRANSACTION_updateStoredMessageStatus = 7;
        static final int TRANSACTION_archiveStoredConversation = 8;
        static final int TRANSACTION_addTextMessageDraft = 9;
        static final int TRANSACTION_addMultimediaMessageDraft = 10;
        static final int TRANSACTION_sendStoredMessage = 11;
        static final int TRANSACTION_setAutoPersisting = 12;
        static final int TRANSACTION_getAutoPersisting = 13;
        public Stub() { super(); }
        public static com.android.internal.telephony.IMms asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telephony.IMms p0) { return false; }
        public static com.android.internal.telephony.IMms getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telephony.IMms {
            private android.os.IBinder mRemote;
            public static com.android.internal.telephony.IMms sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void sendMessage(int p0, java.lang.String p1, android.net.Uri p2, java.lang.String p3, android.os.Bundle p4, android.app.PendingIntent p5, long p6) throws android.os.RemoteException {}
            public void downloadMessage(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, android.os.Bundle p4, android.app.PendingIntent p5, long p6) throws android.os.RemoteException {}
            public android.net.Uri importTextMessage(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, long p4, boolean p5, boolean p6) throws android.os.RemoteException { return null; }
            public android.net.Uri importMultimediaMessage(java.lang.String p0, android.net.Uri p1, java.lang.String p2, long p3, boolean p4, boolean p5) throws android.os.RemoteException { return null; }
            public boolean deleteStoredMessage(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException { return false; }
            public boolean deleteStoredConversation(java.lang.String p0, long p1) throws android.os.RemoteException { return false; }
            public boolean updateStoredMessageStatus(java.lang.String p0, android.net.Uri p1, android.content.ContentValues p2) throws android.os.RemoteException { return false; }
            public boolean archiveStoredConversation(java.lang.String p0, long p1, boolean p2) throws android.os.RemoteException { return false; }
            public android.net.Uri addTextMessageDraft(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.net.Uri addMultimediaMessageDraft(java.lang.String p0, android.net.Uri p1) throws android.os.RemoteException { return null; }
            public void sendStoredMessage(int p0, java.lang.String p1, android.net.Uri p2, android.os.Bundle p3, android.app.PendingIntent p4) throws android.os.RemoteException {}
            public void setAutoPersisting(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public boolean getAutoPersisting() throws android.os.RemoteException { return false; }
        }
    }
}
