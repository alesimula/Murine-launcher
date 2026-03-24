package android.icu.text;

public final class AlphabeticIndex<V extends java.lang.Object> implements java.lang.Iterable<android.icu.text.AlphabeticIndex.Bucket<V>> {
    public AlphabeticIndex(android.icu.util.ULocale p0) {}
    public AlphabeticIndex(java.util.Locale p0) {}
    public AlphabeticIndex(android.icu.text.RuleBasedCollator p0) {}
    public android.icu.text.AlphabeticIndex<V> addLabels(android.icu.text.UnicodeSet p0) { return null; }
    public android.icu.text.AlphabeticIndex<V> addLabels(android.icu.util.ULocale... p0) { return null; }
    public android.icu.text.AlphabeticIndex<V> addLabels(java.util.Locale... p0) { return null; }
    public android.icu.text.AlphabeticIndex<V> setOverflowLabel(java.lang.String p0) { return null; }
    public java.lang.String getUnderflowLabel() { return null; }
    public android.icu.text.AlphabeticIndex<V> setUnderflowLabel(java.lang.String p0) { return null; }
    public java.lang.String getOverflowLabel() { return null; }
    public android.icu.text.AlphabeticIndex<V> setInflowLabel(java.lang.String p0) { return null; }
    public java.lang.String getInflowLabel() { return null; }
    public int getMaxLabelCount() { return 0; }
    public android.icu.text.AlphabeticIndex<V> setMaxLabelCount(int p0) { return null; }
    public android.icu.text.AlphabeticIndex.ImmutableIndex<V> buildImmutableIndex() { return null; }
    public java.util.List<java.lang.String> getBucketLabels() { return null; }
    public android.icu.text.RuleBasedCollator getCollator() { return null; }
    public android.icu.text.AlphabeticIndex<V> addRecord(java.lang.CharSequence p0, V p1) { return null; }
    public int getBucketIndex(java.lang.CharSequence p0) { return 0; }
    public android.icu.text.AlphabeticIndex<V> clearRecords() { return null; }
    public int getBucketCount() { return 0; }
    public int getRecordCount() { return 0; }
    public java.util.Iterator<android.icu.text.AlphabeticIndex.Bucket<V>> iterator() { return null; }

    public static class Bucket<V extends java.lang.Object> implements java.lang.Iterable<android.icu.text.AlphabeticIndex.Record<V>> {
        private Bucket() {}
        public java.lang.String getLabel() { return null; }
        public android.icu.text.AlphabeticIndex.Bucket.LabelType getLabelType() { return null; }
        public int size() { return 0; }
        public java.util.Iterator<android.icu.text.AlphabeticIndex.Record<V>> iterator() { return null; }
        public java.lang.String toString() { return null; }

        public static enum LabelType {
            NORMAL,
            UNDERFLOW,
            INFLOW,
            OVERFLOW;
            private LabelType() {}
        }
    }

    public static final class ImmutableIndex<V extends java.lang.Object> implements java.lang.Iterable<android.icu.text.AlphabeticIndex.Bucket<V>> {
        private ImmutableIndex() {}
        public int getBucketCount() { return 0; }
        public int getBucketIndex(java.lang.CharSequence p0) { return 0; }
        public android.icu.text.AlphabeticIndex.Bucket<V> getBucket(int p0) { return null; }
        public java.util.Iterator<android.icu.text.AlphabeticIndex.Bucket<V>> iterator() { return null; }
    }

    public static class Record<V extends java.lang.Object> {
        private Record() {}
        public java.lang.CharSequence getName() { return null; }
        public V getData() { return null; }
        public java.lang.String toString() { return null; }
    }
}
