package android.view.inputmethod;

public final class InputConnectionInspector {
    private static final java.util.Map<java.lang.Class, java.lang.Integer> sMissingMethodsMap = null;
    public InputConnectionInspector() {}
    public static int getMissingMethodFlags(android.view.inputmethod.InputConnection p0) { return 0; }
    public static int getMissingMethodFlagsInternal(java.lang.Class p0) { return 0; }
    private static boolean hasGetSelectedText(java.lang.Class p0) { return false; }
    private static boolean hasSetComposingRegion(java.lang.Class p0) { return false; }
    private static boolean hasCommitCorrection(java.lang.Class p0) { return false; }
    private static boolean hasRequestCursorUpdate(java.lang.Class p0) { return false; }
    private static boolean hasDeleteSurroundingTextInCodePoints(java.lang.Class p0) { return false; }
    private static boolean hasGetHandler(java.lang.Class p0) { return false; }
    private static boolean hasCloseConnection(java.lang.Class p0) { return false; }
    private static boolean hasCommitContent(java.lang.Class p0) { return false; }
    public static java.lang.String getMissingMethodFlagsAsString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MissingMethodFlags {
        public static final int GET_SELECTED_TEXT = 1;
        public static final int SET_COMPOSING_REGION = 2;
        public static final int COMMIT_CORRECTION = 4;
        public static final int REQUEST_CURSOR_UPDATES = 8;
        public static final int DELETE_SURROUNDING_TEXT_IN_CODE_POINTS = 16;
        public static final int GET_HANDLER = 32;
        public static final int CLOSE_CONNECTION = 64;
        public static final int COMMIT_CONTENT = 128;
    }
}
