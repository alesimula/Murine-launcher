package android.print;

public abstract class PrintDocumentAdapter {
    public static final java.lang.String EXTRA_PRINT_PREVIEW = "EXTRA_PRINT_PREVIEW";
    public PrintDocumentAdapter() {}
    public void onStart() {}
    public abstract void onLayout(android.print.PrintAttributes p0, android.print.PrintAttributes p1, android.os.CancellationSignal p2, android.print.PrintDocumentAdapter.LayoutResultCallback p3, android.os.Bundle p4);
    public abstract void onWrite(android.print.PageRange[] p0, android.os.ParcelFileDescriptor p1, android.os.CancellationSignal p2, android.print.PrintDocumentAdapter.WriteResultCallback p3);
    public void onFinish() {}

    public static abstract class WriteResultCallback {
        @android.annotation.UnsupportedAppUsage
        public WriteResultCallback() {}
        public void onWriteFinished(android.print.PageRange[] p0) {}
        public void onWriteFailed(java.lang.CharSequence p0) {}
        public void onWriteCancelled() {}
    }

    public static abstract class LayoutResultCallback {
        @android.annotation.UnsupportedAppUsage
        public LayoutResultCallback() {}
        public void onLayoutFinished(android.print.PrintDocumentInfo p0, boolean p1) {}
        public void onLayoutFailed(java.lang.CharSequence p0) {}
        public void onLayoutCancelled() {}
    }
}
