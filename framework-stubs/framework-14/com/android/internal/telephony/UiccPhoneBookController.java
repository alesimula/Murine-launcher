package com.android.internal.telephony;

public class UiccPhoneBookController extends com.android.internal.telephony.IIccPhoneBook.Stub {
    public UiccPhoneBookController() { super(); }
    public boolean updateAdnRecordsInEfBySearch(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws android.os.RemoteException { return false; }
    public boolean updateAdnRecordsInEfByIndexForSubscriber(int p0, int p1, android.content.ContentValues p2, int p3, java.lang.String p4) throws android.os.RemoteException { return false; }
    public int[] getAdnRecordsSize(int p0) throws android.os.RemoteException { return null; }
    public int[] getAdnRecordsSizeForSubscriber(int p0, int p1) throws android.os.RemoteException { return null; }
    public java.util.List<com.android.internal.telephony.uicc.AdnRecord> getAdnRecordsInEf(int p0) throws android.os.RemoteException { return null; }
    public java.util.List<com.android.internal.telephony.uicc.AdnRecord> getAdnRecordsInEfForSubscriber(int p0, int p1) throws android.os.RemoteException { return null; }
    public com.android.internal.telephony.uicc.AdnCapacity getAdnRecordsCapacityForSubscriber(int p0) throws android.os.RemoteException { return null; }
    public boolean updateAdnRecordsInEfBySearchForSubscriber(int p0, int p1, android.content.ContentValues p2, java.lang.String p3) throws android.os.RemoteException { return false; }
}
