package android.widget;

public class SelectionActionModeHelper {
    SelectionActionModeHelper(android.widget.Editor p0) {}
    public void startSelectionActionModeAsync(boolean p0) {}
    public void startLinkActionModeAsync(int p0, int p1) {}
    public void invalidateActionModeAsync() {}
    public void onSelectionAction(int p0, java.lang.String p1) {}
    public void onSelectionDrag() {}
    public void onTextChanged(int p0, int p1) {}
    public boolean resetSelection(int p0) { return false; }
    public android.view.textclassifier.TextClassification getTextClassification() { return null; }
    public void onDestroyActionMode() {}
    public void onDraw(android.graphics.Canvas p0) {}
    public boolean isDrawingHighlight() { return false; }
    public static <T extends java.lang.Object> void mergeRectangleIntoList(java.util.List<T> p0, android.graphics.RectF p1, java.util.function.Function<T, android.graphics.RectF> p2, java.util.function.Function<android.graphics.RectF, T> p3) {}
    public static <T extends java.lang.Object> android.graphics.PointF movePointInsideNearestRectangle(android.graphics.PointF p0, java.util.List<T> p1, java.util.function.Function<T, android.graphics.RectF> p2) { return null; }

    private static final class SelectionMetricsLogger {
        SelectionMetricsLogger(android.widget.TextView p0) {}
        public void logSelectionStarted(android.view.textclassifier.TextClassifier p0, android.view.textclassifier.TextClassificationContext p1, java.lang.CharSequence p2, int p3, int p4) {}
        public void logSelectionModified(int p0, int p1, android.view.textclassifier.TextClassification p2, android.view.textclassifier.TextSelection p3) {}
        public void logSelectionAction(int p0, int p1, int p2, java.lang.String p3, android.view.textclassifier.TextClassification p4) {}
        public boolean isEditTextLogger() { return false; }
        public void endTextClassificationSession() {}
    }

    private static final class SelectionResult {
        SelectionResult(int p0, int p1, android.view.textclassifier.TextClassification p2, android.view.textclassifier.TextSelection p3) {}
    }

    private static final class SelectionTracker {
        SelectionTracker(android.widget.TextView p0) {}
        public void onOriginalSelection(java.lang.CharSequence p0, int p1, int p2, boolean p3) {}
        public void onSmartSelection(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
        public void onLinkSelected(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
        public void onSelectionUpdated(int p0, int p1, android.view.textclassifier.TextClassification p2) {}
        public void onSelectionDestroyed() {}
        public void onSelectionAction(int p0, int p1, int p2, java.lang.String p3, android.view.textclassifier.TextClassification p4) {}
        public boolean resetSelection(int p0, android.widget.Editor p1) { return false; }
        public void onTextChanged(int p0, int p1, android.view.textclassifier.TextClassification p2) {}

        private final class LogAbandonRunnable implements java.lang.Runnable {
            void schedule(int p0) {}
            void flush() {}
            public void run() {}
        }
    }

    private static final class TextClassificationAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.widget.SelectionActionModeHelper.SelectionResult> {
        TextClassificationAsyncTask(android.widget.TextView p0, int p1, java.util.function.Supplier<android.widget.SelectionActionModeHelper.SelectionResult> p2, java.util.function.Consumer<android.widget.SelectionActionModeHelper.SelectionResult> p3, java.util.function.Supplier<android.widget.SelectionActionModeHelper.SelectionResult> p4) { super(); }
        protected android.widget.SelectionActionModeHelper.SelectionResult doInBackground(java.lang.Void... p0) { return null; }
        protected void onPostExecute(android.widget.SelectionActionModeHelper.SelectionResult p0) {}
    }

    private static final class TextClassificationHelper {
        TextClassificationHelper(android.content.Context p0, java.util.function.Supplier<android.view.textclassifier.TextClassifier> p1, java.lang.CharSequence p2, int p3, int p4, android.os.LocaleList p5) {}
        public void init(java.util.function.Supplier<android.view.textclassifier.TextClassifier> p0, java.lang.CharSequence p1, int p2, int p3, android.os.LocaleList p4) {}
        public android.widget.SelectionActionModeHelper.SelectionResult classifyText() { return null; }
        public android.widget.SelectionActionModeHelper.SelectionResult suggestSelection() { return null; }
        public android.widget.SelectionActionModeHelper.SelectionResult getOriginalSelection() { return null; }
        public int getTimeoutDuration() { return 0; }
    }
}
