package com.android.internal.telephony;

public interface IIccPhoneBook extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IIccPhoneBook";
    public java.util.List<com.android.internal.telephony.uicc.AdnRecord> getAdnRecordsInEf(int p0) throws android.os.RemoteException;
    public java.util.List<com.android.internal.telephony.uicc.AdnRecord> getAdnRecordsInEfForSubscriber(int p0, int p1) throws android.os.RemoteException;
    public boolean updateAdnRecordsInEfBySearch(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException;
    public boolean updateAdnRecordsInEfBySearchForSubscriber(int p0, int p1, android.content.ContentValues p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean updateAdnRecordsInEfByIndexForSubscriber(int p0, int p1, android.content.ContentValues p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public int[] getAdnRecordsSize(int p0) throws android.os.RemoteException;
    public int[] getAdnRecordsSizeForSubscriber(int p0, int p1) throws android.os.RemoteException;
    public com.android.internal.telephony.uicc.AdnCapacity getAdnRecordsCapacityForSubscriber(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.IIccPhoneBook {
        public Default() {}
        public java.util.List<com.android.internal.telephony.uicc.AdnRecord> getAdnRecordsInEf(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<com.android.internal.telephony.uicc.AdnRecord> getAdnRecordsInEfForSubscriber(int p0, int p1) throws android.os.RemoteException { return null; }
        public boolean updateAdnRecordsInEfBySearch(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return false; }
        public boolean updateAdnRecordsInEfBySearchForSubscriber(int p0, int p1, android.content.ContentValues p2, java.lang.String p3) throws android.os.RemoteException { return false; }
        public boolean updateAdnRecordsInEfByIndexForSubscriber(int p0, int p1, android.content.ContentValues p2, int p3, java.lang.String p4) throws android.os.RemoteException { return false; }
        public int[] getAdnRecordsSize(int p0) throws android.os.RemoteException { return null; }
        public int[] getAdnRecordsSizeForSubscriber(int p0, int p1) throws android.os.RemoteException { return null; }
        public com.android.internal.telephony.uicc.AdnCapacity getAdnRecordsCapacityForSubscriber(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IIccPhoneBook {
        static final int TRANSACTION_getAdnRecordsInEf = 1;
        static final int TRANSACTION_getAdnRecordsInEfForSubscriber = 2;
        static final int TRANSACTION_updateAdnRecordsInEfBySearch = 3;
        static final int TRANSACTION_updateAdnRecordsInEfBySearchForSubscriber = 4;
        static final int TRANSACTION_updateAdnRecordsInEfByIndexForSubscriber = 5;
        static final int TRANSACTION_getAdnRecordsSize = 6;
        static final int TRANSACTION_getAdnRecordsSizeForSubscriber = 7;
        static final int TRANSACTION_getAdnRecordsCapacityForSubscriber = 8;
        public Stub() { super(); }
        public static com.android.internal.telephony.IIccPhoneBook asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements com.android.internal.telephony.IIccPhoneBook {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<com.android.internal.telephony.uicc.AdnRecord> getAdnRecordsInEf(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<com.android.internal.telephony.uicc.AdnRecord> getAdnRecordsInEfForSubscriber(int p0, int p1) throws android.os.RemoteException { return null; }
            public boolean updateAdnRecordsInEfBySearch(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return false; }
            public boolean updateAdnRecordsInEfBySearchForSubscriber(int p0, int p1, android.content.ContentValues p2, java.lang.String p3) throws android.os.RemoteException { return false; }
            public boolean updateAdnRecordsInEfByIndexForSubscriber(int p0, int p1, android.content.ContentValues p2, int p3, java.lang.String p4) throws android.os.RemoteException { return false; }
            public int[] getAdnRecordsSize(int p0) throws android.os.RemoteException { return null; }
            public int[] getAdnRecordsSizeForSubscriber(int p0, int p1) throws android.os.RemoteException { return null; }
            public com.android.internal.telephony.uicc.AdnCapacity getAdnRecordsCapacityForSubscriber(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
