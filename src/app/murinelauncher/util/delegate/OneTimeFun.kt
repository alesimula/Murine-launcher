package app.murinelauncher.util.delegate

import kotlin.reflect.KProperty

/**
 * Delegate function that gets calculated only once, no matter the parameters passed to it.
 */
class OneTimeFun<F>(private val f: () -> F) {
    companion object {
        fun <P, R> with(f: (P) -> R) = OneTimeFun { { x: P -> f(x) } }
        fun <A, B, R> with(f: (A, B) -> R) = OneTimeFun { { a: A, b: B -> f(a, b) } }
        fun <A, B, C, R> with(f: (A, B, C) -> R) = OneTimeFun { { a: A, b: B, c: C -> f(a, b, c) } }
        fun <A, B, C, D, R> with(f: (A, B, C, D) -> R) = OneTimeFun { { a: A, b: B, c: C, d: D -> f(a, b, c, d) } }
        fun <A, B, C, D, E, R> with(f: (A, B, C, D, E) -> R) = OneTimeFun { { a: A, b: B, c: C, d: D, e: E -> f(a, b, c, d, e) } }
    }

    private var lazy: Lazy<F>? = null

    private fun getOrInit(init: () -> F): F {
        val l = lazy
        if (l != null) return l.value
        return synchronized(this) {
            lazy?.value ?: kotlin.lazy(init).also { lazy = it }.value
        }
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): F {
        return getOrInit { f() }
    }
}