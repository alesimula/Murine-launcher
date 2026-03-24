package android.print;

public class PrintFileDocumentAdapter extends android.print.PrintDocumentAdapter {
    public PrintFileDocumentAdapter(android.content.Context p0, java.io.File p1, android.print.PrintDocumentInfo p2) { super(); }
    public void onLayout(android.print.PrintAttributes p0, android.print.PrintAttributes p1, android.os.CancellationSignal p2, android.print.PrintDocumentAdapter.LayoutResultCallback p3, android.os.Bundle p4) {}
    public void onWrite(android.print.PageRange[] p0, android.os.ParcelFileDescriptor p1, android.os.CancellationSignal p2, android.print.PrintDocumentAdapter.WriteResultCallback p3) {}

    private final class WriteFileAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        public WriteFileAsyncTask(android.print.PrintFileDocumentAdapter p0, android.os.ParcelFileDescriptor p1, android.os.CancellationSignal p2, android.print.PrintDocumentAdapter.WriteResultCallback p3) { super(); }
        protected java.lang.Void doInBackground(java.lang.Void... p0) { return null; }
        protected void onPostExecute(java.lang.Void p0) {}
        protected void onCancelled(java.lang.Void p0) {}
    }
}
