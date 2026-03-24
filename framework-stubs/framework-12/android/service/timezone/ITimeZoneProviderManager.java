package android.service.timezone;

public interface ITimeZoneProviderManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.timezone.ITimeZoneProviderManager";
    public void onTimeZoneProviderSuggestion(android.service.timezone.TimeZoneProviderSuggestion p0) throws android.os.RemoteException;
    public void onTimeZoneProviderUncertain() throws android.os.RemoteException;
    public void onTimeZoneProviderPermanentFailure(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.service.timezone.ITimeZoneProviderManager {
        public Default() {}
        public void onTimeZoneProviderSuggestion(android.service.timezone.TimeZoneProviderSuggestion p0) throws android.os.RemoteException {}
        public void onTimeZoneProviderUncertain() throws android.os.RemoteException {}
        public void onTimeZoneProviderPermanentFailure(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.timezone.ITimeZoneProviderManager {
        static final int TRANSACTION_onTimeZoneProviderSuggestion = 1;
        static final int TRANSACTION_onTimeZoneProviderUncertain = 2;
        static final int TRANSACTION_onTimeZoneProviderPermanentFailure = 3;
        public Stub() { super(); }
        public static android.service.timezone.ITimeZoneProviderManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.timezone.ITimeZoneProviderManager p0) { return false; }
        public static android.service.timezone.ITimeZoneProviderManager getDefaultImpl() { return null; }

        private static class Proxy implements android.service.timezone.ITimeZoneProviderManager {
            private android.os.IBinder mRemote;
            public static android.service.timezone.ITimeZoneProviderManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTimeZoneProviderSuggestion(android.service.timezone.TimeZoneProviderSuggestion p0) throws android.os.RemoteException {}
            public void onTimeZoneProviderUncertain() throws android.os.RemoteException {}
            public void onTimeZoneProviderPermanentFailure(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
