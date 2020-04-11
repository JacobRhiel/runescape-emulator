package rs.emulator.utilities.hash

/**
 * An implementation of the `djb2` hash function.
 *
 * @author Graham
 * @author `Discardedx2
 */
object Djb2
{

    /**
     * An implementation of Dan Bernstein's `djb2` hash function which
     * is slightly modified. Instead of the initial hash being 5381, it is
     * zero.
     *
     * @param str The string to hash.
     * @return The hash code.
     */
    fun hash(str: String): Int
    {
        var hash = 0
        for (element in str)
            hash = element.toInt() + ((hash shl 5) - hash)
        return hash
    }
}