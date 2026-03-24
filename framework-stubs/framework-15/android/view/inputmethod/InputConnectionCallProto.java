package android.view.inputmethod;

public final class InputConnectionCallProto {
    public static final long GET_TEXT_BEFORE_CURSOR = 1146756268033L;
    public static final long GET_TEXT_AFTER_CURSOR = 1146756268034L;
    public static final long GET_SELECTED_TEXT = 1146756268035L;
    public static final long GET_SURROUNDING_TEXT = 1146756268036L;
    public static final long GET_CURSOR_CAPS_MODE = 1146756268037L;
    public static final long GET_EXTRACTED_TEXT = 1146756268038L;
    public InputConnectionCallProto() {}

    public final class GetCursorCapsMode {
        public static final long REQ_MODES = 1120986464257L;
        public static final long RESULT = 1120986464258L;
        public GetCursorCapsMode(android.view.inputmethod.InputConnectionCallProto p0) {}
    }

    public final class GetExtractedText {
        public static final long REQUEST = 1146756268033L;
        public static final long FLAGS = 1120986464258L;
        public GetExtractedText(android.view.inputmethod.InputConnectionCallProto p0) {}

        public final class ExtractedTextRequest {
            public static final long TOKEN = 1120986464257L;
            public static final long FLAGS = 1120986464258L;
            public static final long HINT_MAX_LINES = 1120986464259L;
            public static final long HINT_MAX_CHARS = 1120986464260L;
            public ExtractedTextRequest(android.view.inputmethod.InputConnectionCallProto.GetExtractedText p0) {}
        }
    }

    public final class GetSelectedText {
        public static final long FLAGS = 1120986464257L;
        public GetSelectedText(android.view.inputmethod.InputConnectionCallProto p0) {}
    }

    public final class GetSurroundingText {
        public static final long BEFORE_LENGTH = 1120986464257L;
        public static final long AFTER_LENGTH = 1120986464258L;
        public static final long FLAGS = 1120986464259L;
        public static final long RESULT = 1146756268036L;
        public GetSurroundingText(android.view.inputmethod.InputConnectionCallProto p0) {}

        public final class SurroundingText {
            public static final long SELECTION_START = 1120986464258L;
            public static final long SELECTION_END = 1120986464259L;
            public static final long OFFSET = 1120986464260L;
            public SurroundingText(android.view.inputmethod.InputConnectionCallProto.GetSurroundingText p0) {}
        }
    }

    public final class GetTextAfterCursor {
        public static final long LENGTH = 1120986464257L;
        public static final long FLAGS = 1120986464258L;
        public GetTextAfterCursor(android.view.inputmethod.InputConnectionCallProto p0) {}
    }

    public final class GetTextBeforeCursor {
        public static final long LENGTH = 1120986464257L;
        public static final long FLAGS = 1120986464258L;
        public GetTextBeforeCursor(android.view.inputmethod.InputConnectionCallProto p0) {}
    }
}
