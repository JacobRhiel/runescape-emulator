package rs.emulator.model.viewport

/**
 *
 * @author Chk
 */
class Viewport
{

    companion object
    {

        //8 being chunk size, 13 being chunks per region
        //refer to rse-world-map -> RegionChunk and Region for const val's.
        const val MAX_VIEWPORT = 8 * 13

    }

}