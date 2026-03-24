package android.service.autofill;

public interface IAutofillFieldClassificationService extends android.os.IInterface {
    public void calculateScores(android.os.RemoteCallback p0, java.util.List<android.view.autofill.AutofillValue> p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String p4, android.os.Bundle p5, java.util.Map p6, java.util.Map p7) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.IAutofillFieldClassificationService {
        private static final java.lang.String DESCRIPTOR = "android.service.autofill.IAutofillFieldClassificationService";
        static final int TRANSACTION_calculateScores = 1;
        public Stub() { super(); }
        public static android.service.autofill.IAutofillFieldClassificationService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.autofill.IAutofillFieldClassificationService p0) { return false; }
        public static android.service.autofill.IAutofillFieldClassificationService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.autofill.IAutofillFieldClassificationService {
            private android.os.IBinder mRemote;
            public static android.service.autofill.IAutofillFieldClassificationService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void calculateScores(android.os.RemoteCallback p0, java.util.List<android.view.autofill.AutofillValue> p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String p4, android.os.Bundle p5, java.util.Map p6, java.util.Map p7) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.autofill.IAutofillFieldClassificationService {
        public Default() {}
        public void calculateScores(android.os.RemoteCallback p0, java.util.List<android.view.autofill.AutofillValue> p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String p4, android.os.Bundle p5, java.util.Map p6, java.util.Map p7) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
