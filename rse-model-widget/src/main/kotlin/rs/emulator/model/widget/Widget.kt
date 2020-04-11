package rs.emulator.model.widget

import rs.emulator.cache.definition.widget.WidgetDefinition

/**
 *
 * @author Chk
 */
abstract class Widget(val interfaceId: Int)
{

    lateinit var definition: WidgetDefinition

}