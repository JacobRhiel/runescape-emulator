package rs.emulator.model.widget

import io.netty.channel.Channel
import rs.emulator.cache.definition.widget.WidgetDefinition
import rs.emulator.packet.network.message.impl.IfOpenSubMessage

/**
 *
 * @author Chk
 */
abstract class Widget(val interfaceId: Int)
{

    lateinit var definition: WidgetDefinition

}