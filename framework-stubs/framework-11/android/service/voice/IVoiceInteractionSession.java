package android.service.voice;

public interface IVoiceInteractionSession extends android.os.IInterface {
    public void show(android.os.Bundle p0, int p1, com.android.internal.app.IVoiceInteractionSessionShowCallback p2) throws android.os.RemoteException;
    public void hide() throws android.os.RemoteException;
    public void handleAssist(int p0, android.os.IBinder p1, android.os.Bundle p2, android.app.assist.AssistStructure p3, android.app.assist.AssistContent p4, int p5, int p6) throws android.os.RemoteException;
    public void handleScreenshot(android.graphics.Bitmap p0) throws android.os.RemoteException;
    public void taskStarted(android.content.Intent p0, int p1) throws android.os.RemoteException;
    public void taskFinished(android.content.Intent p0, int p1) throws android.os.RemoteException;
    public void closeSystemDialogs() throws android.os.RemoteException;
    public void onLockscreenShown() throws android.os.RemoteException;
    public void destroy() throws android.os.RemoteException;

    public static class Default implements android.service.voice.IVoiceInteractionSession {
        public Default() {}
        public void show(android.os.Bundle p0, int p1, com.android.internal.app.IVoiceInteractionSessionShowCallback p2) throws android.os.RemoteException {}
        public void hide() throws android.os.RemoteException {}
        public void handleAssist(int p0, android.os.IBinder p1, android.os.Bundle p2, android.app.assist.AssistStructure p3, android.app.assist.AssistContent p4, int p5, int p6) throws android.os.RemoteException {}
        public void handleScreenshot(android.graphics.Bitmap p0) throws android.os.RemoteException {}
        public void taskStarted(android.content.Intent p0, int p1) throws android.os.RemoteException {}
        public void taskFinished(android.content.Intent p0, int p1) throws android.os.RemoteException {}
        public void closeSystemDialogs() throws android.os.RemoteException {}
        public void onLockscreenShown() throws android.os.RemoteException {}
        public void destroy() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.voice.IVoiceInteractionSession {
        private static final java.lang.String DESCRIPTOR = "android.service.voice.IVoiceInteractionSession";
        static final int TRANSACTION_show = 1;
        static final int TRANSACTION_hide = 2;
        static final int TRANSACTION_handleAssist = 3;
        static final int TRANSACTION_handleScreenshot = 4;
        static final int TRANSACTION_taskStarted = 5;
        static final int TRANSACTION_taskFinished = 6;
        static final int TRANSACTION_closeSystemDialogs = 7;
        static final int TRANSACTION_onLockscreenShown = 8;
        static final int TRANSACTION_destroy = 9;
        public Stub() { super(); }
        public static android.service.voice.IVoiceInteractionSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.voice.IVoiceInteractionSession p0) { return false; }
        public static android.service.voice.IVoiceInteractionSession getDefaultImpl() { return null; }

        private static class Proxy implements android.service.voice.IVoiceInteractionSession {
            private android.os.IBinder mRemote;
            public static android.service.voice.IVoiceInteractionSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void show(android.os.Bundle p0, int p1, com.android.internal.app.IVoiceInteractionSessionShowCallback p2) throws android.os.RemoteException {}
            public void hide() throws android.os.RemoteException {}
            public void handleAssist(int p0, android.os.IBinder p1, android.os.Bundle p2, android.app.assist.AssistStructure p3, android.app.assist.AssistContent p4, int p5, int p6) throws android.os.RemoteException {}
            public void handleScreenshot(android.graphics.Bitmap p0) throws android.os.RemoteException {}
            public void taskStarted(android.content.Intent p0, int p1) throws android.os.RemoteException {}
            public void taskFinished(android.content.Intent p0, int p1) throws android.os.RemoteException {}
            public void closeSystemDialogs() throws android.os.RemoteException {}
            public void onLockscreenShown() throws android.os.RemoteException {}
            public void destroy() throws android.os.RemoteException {}
        }
    }
}
