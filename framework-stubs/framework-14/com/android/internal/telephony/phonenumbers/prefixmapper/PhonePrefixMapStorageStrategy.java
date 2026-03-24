package com.android.internal.telephony.phonenumbers.prefixmapper;

abstract class PhonePrefixMapStorageStrategy {
    protected int numOfEntries;
    protected final java.util.TreeSet<java.lang.Integer> possibleLengths = null;
    PhonePrefixMapStorageStrategy() {}
    public abstract int getPrefix(int p0);
    public abstract java.lang.String getDescription(int p0);
    public abstract void readFromSortedMap(java.util.SortedMap<java.lang.Integer, java.lang.String> p0);
    public abstract void readExternal(java.io.ObjectInput p0) throws java.io.IOException;
    public abstract void writeExternal(java.io.ObjectOutput p0) throws java.io.IOException;
    public int getNumOfEntries() { return 0; }
    public java.util.TreeSet<java.lang.Integer> getPossibleLengths() { return null; }
    public java.lang.String toString() { return null; }
}
