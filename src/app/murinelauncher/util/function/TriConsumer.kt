package app.murinelauncher.util.function

fun interface TriConsumer<A, B, C> {
    fun accept(a: A, b: B, c: C)
}