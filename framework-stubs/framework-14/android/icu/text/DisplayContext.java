package android.icu.text;

public enum DisplayContext {
    STANDARD_NAMES,
    DIALECT_NAMES,
    CAPITALIZATION_NONE,
    CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE,
    CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE,
    CAPITALIZATION_FOR_UI_LIST_OR_MENU,
    CAPITALIZATION_FOR_STANDALONE,
    LENGTH_FULL,
    LENGTH_SHORT,
    SUBSTITUTE,
    NO_SUBSTITUTE;
    private DisplayContext() {}
    public android.icu.text.DisplayContext.Type type() { return null; }
    public int value() { return 0; }

    public static enum Type {
        DIALECT_HANDLING,
        CAPITALIZATION,
        DISPLAY_LENGTH,
        SUBSTITUTE_HANDLING;
        private Type() {}
    }
}
