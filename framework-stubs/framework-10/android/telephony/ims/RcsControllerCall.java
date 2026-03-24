package android.telephony.ims;

class RcsControllerCall {
    private final android.content.Context mContext = null;
    RcsControllerCall(android.content.Context p0) {}
    <R extends java.lang.Object> R call(android.telephony.ims.RcsControllerCall.RcsServiceCall<R> p0) throws android.telephony.ims.RcsMessageStoreException { return null; }
    void callWithNoReturn(android.telephony.ims.RcsControllerCall.RcsServiceCallWithNoReturn p0) throws android.telephony.ims.RcsMessageStoreException {}

    static interface RcsServiceCallWithNoReturn {
        public void methodOnIRcs(android.telephony.ims.aidl.IRcs p0, java.lang.String p1) throws android.os.RemoteException;
    }

    static interface RcsServiceCall<R extends java.lang.Object> {
        public R methodOnIRcs(android.telephony.ims.aidl.IRcs p0, java.lang.String p1) throws android.os.RemoteException;
    }
}
