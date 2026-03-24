package android.os;

public class CancellationSignalBeamer {
    static final java.lang.ref.Cleaner sCleaner = null;
    public CancellationSignalBeamer() {}

    public static class Receiver implements android.os.IBinder.DeathRecipient {
        public Receiver(boolean p0) {}
        @android.annotation.SuppressLint("VisiblySynchronized")
        public android.os.CancellationSignal unbeam(android.os.IBinder p0) { return null; }
        @android.annotation.SuppressLint("VisiblySynchronized")
        public void forget(android.os.IBinder p0) {}
        @android.annotation.SuppressLint("VisiblySynchronized")
        public void cancel(android.os.IBinder p0) {}
        public void binderDied(android.os.IBinder p0) {}
        public void binderDied() {}
    }

    public static abstract class Sender {
        public Sender() {}
        public android.os.CancellationSignalBeamer.Sender.CloseableToken beam(android.os.CancellationSignal p0) { return null; }
        public abstract void onCancel(android.os.IBinder p0);
        public abstract void onForget(android.os.IBinder p0);
        public android.os.CancellationSignalBeamer.Sender.MustClose beamScopeIfNeeded(android.view.inputmethod.HandwritingGesture p0) { return null; }
        public static android.os.IBinder beamFromScope(android.os.CancellationSignal p0) { return null; }

        public static interface CloseableToken extends android.os.IBinder, android.os.CancellationSignalBeamer.Sender.MustClose {
            public void close();
        }

        public static interface MustClose extends java.lang.AutoCloseable {
            public void close();
        }

        private static class Token extends android.os.Binder implements android.os.CancellationSignalBeamer.Sender.CloseableToken, java.lang.Runnable {
            public void close() {}
            public void run() {}

            private static class Preparer implements android.os.CancellationSignal.OnCancelListener {
                void setup() {}
                public void onCancel() {}
            }
        }
    }
}
