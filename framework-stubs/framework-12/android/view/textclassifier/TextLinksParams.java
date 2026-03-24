package android.view.textclassifier;

public final class TextLinksParams {
    private static final java.util.function.Function<android.view.textclassifier.TextLinks.TextLink, android.view.textclassifier.TextLinks.TextLinkSpan> DEFAULT_SPAN_FACTORY = null;
    private final int mApplyStrategy = 0;
    private final java.util.function.Function<android.view.textclassifier.TextLinks.TextLink, android.view.textclassifier.TextLinks.TextLinkSpan> mSpanFactory = null;
    private final android.view.textclassifier.TextClassifier.EntityConfig mEntityConfig = null;
    private TextLinksParams(int p0, java.util.function.Function<android.view.textclassifier.TextLinks.TextLink, android.view.textclassifier.TextLinks.TextLinkSpan> p1) {}
    public static android.view.textclassifier.TextLinksParams fromLinkMask(int p0) { return null; }
    public android.view.textclassifier.TextClassifier.EntityConfig getEntityConfig() { return null; }
    public int apply(android.text.Spannable p0, android.view.textclassifier.TextLinks p1) { return 0; }
    private static int checkApplyStrategy(int p0) { return 0; }

    public static final class Builder {
        private int mApplyStrategy;
        private java.util.function.Function<android.view.textclassifier.TextLinks.TextLink, android.view.textclassifier.TextLinks.TextLinkSpan> mSpanFactory;
        public Builder() {}
        public android.view.textclassifier.TextLinksParams.Builder setApplyStrategy(int p0) { return null; }
        public android.view.textclassifier.TextLinksParams.Builder setSpanFactory(java.util.function.Function<android.view.textclassifier.TextLinks.TextLink, android.view.textclassifier.TextLinks.TextLinkSpan> p0) { return null; }
        public android.view.textclassifier.TextLinksParams.Builder setEntityConfig(android.view.textclassifier.TextClassifier.EntityConfig p0) { return null; }
        public android.view.textclassifier.TextLinksParams build() { return null; }
    }
}
