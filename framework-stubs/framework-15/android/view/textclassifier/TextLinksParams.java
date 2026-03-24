package android.view.textclassifier;

public final class TextLinksParams {
    @android.annotation.NonNull
    public static android.view.textclassifier.TextLinksParams fromLinkMask(int p0) { return null; }
    @android.annotation.NonNull
    public android.view.textclassifier.TextClassifier.EntityConfig getEntityConfig() { return null; }
    public int apply(android.text.Spannable p0, android.view.textclassifier.TextLinks p1) { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.view.textclassifier.TextLinksParams.Builder setApplyStrategy(int p0) { return null; }
        public android.view.textclassifier.TextLinksParams.Builder setSpanFactory(java.util.function.Function<android.view.textclassifier.TextLinks.TextLink, android.view.textclassifier.TextLinks.TextLinkSpan> p0) { return null; }
        public android.view.textclassifier.TextLinksParams.Builder setEntityConfig(android.view.textclassifier.TextClassifier.EntityConfig p0) { return null; }
        public android.view.textclassifier.TextLinksParams build() { return null; }
    }
}
