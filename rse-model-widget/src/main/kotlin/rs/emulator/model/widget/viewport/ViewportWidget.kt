package rs.emulator.model.widget.viewport

import io.netty.channel.Channel
import rs.emulator.model.widget.Widget
import rs.emulator.packet.network.message.impl.IfOpenTopMessage

/**
 *
 * @author Chk
 */
class ViewportWidget(type: ViewportWidgetType) : Widget(type.interfaceId)
{

    fun display(channel: Channel)
    {
        channel.write(IfOpenTopMessage(interfaceId))
    }

}