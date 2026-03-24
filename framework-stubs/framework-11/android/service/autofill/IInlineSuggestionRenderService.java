package android.service.autofill;

public interface IInlineSuggestionRenderService extends android.os.IInterface {
    public void renderSuggestion(android.service.autofill.IInlineSuggestionUiCallback p0, android.service.autofill.InlinePresentation p1, int p2, int p3, android.os.IBinder p4, int p5, int p6, int p7) throws android.os.RemoteException;
    public void getInlineSuggestionsRendererInfo(android.os.RemoteCallback p0) throws android.os.RemoteException;
    public void destroySuggestionViews(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.service.autofill.IInlineSuggestionRenderService {
        public Default() {}
        public void renderSuggestion(android.service.autofill.IInlineSuggestionUiCallback p0, android.service.autofill.InlinePresentation p1, int p2, int p3, android.os.IBinder p4, int p5, int p6, int p7) throws android.os.RemoteException {}
        public void getInlineSuggestionsRendererInfo(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public void destroySuggestionViews(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.IInlineSuggestionRenderService {
        private static final java.lang.String DESCRIPTOR = "android.service.autofill.IInlineSuggestionRenderService";
        static final int TRANSACTION_renderSuggestion = 1;
        static final int TRANSACTION_getInlineSuggestionsRendererInfo = 2;
        static final int TRANSACTION_destroySuggestionViews = 3;
        public Stub() { super(); }
        public static android.service.autofill.IInlineSuggestionRenderService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.autofill.IInlineSuggestionRenderService p0) { return false; }
        public static android.service.autofill.IInlineSuggestionRenderService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.autofill.IInlineSuggestionRenderService {
            private android.os.IBinder mRemote;
            public static android.service.autofill.IInlineSuggestionRenderService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void renderSuggestion(android.service.autofill.IInlineSuggestionUiCallback p0, android.service.autofill.InlinePresentation p1, int p2, int p3, android.os.IBinder p4, int p5, int p6, int p7) throws android.os.RemoteException {}
            public void getInlineSuggestionsRendererInfo(android.os.RemoteCallback p0) throws android.os.RemoteException {}
            public void destroySuggestionViews(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
