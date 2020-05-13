package rs.emulator.plugin

/**
 *
 * @author Chk
 */
interface WidgetPlugin : Plugin
{

    fun on_load()

    fun on_button(interfaceId: Int, component: Int)

    fun on_close()

}