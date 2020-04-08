package rs.emulator.model.widget

import gg.rsmod.game.message.Message
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
import rs.emulator.model.widget.overlay.RootOverlayWidget
import rs.emulator.model.widget.viewport.ViewportWidget
import rs.emulator.model.widget.viewport.ViewportWidgetType
import rs.emulator.packet.network.message.impl.IfOpenSubMessage
import rs.emulator.packet.network.message.impl.IfOpenTopMessage

/**
 *
 * @author Chk
 */
class WidgetSet
{

    lateinit var viewportWidget: ViewportWidget

    private val rootWidgets = Int2ObjectArrayMap<RootOverlayWidget>()

    private val overlayWidgets = Int2ObjectArrayMap<RootOverlayWidget>()

    fun constructViewport(type: ViewportWidgetType) = apply { viewportWidget = ViewportWidget(type) }

    fun createViewportRequest() = IfOpenTopMessage(viewportWidget.interfaceId)

    fun createDisplayRequest(parent: Int, child: Int, interfaceId: Int, type: Int = 0) : Message = IfOpenSubMessage(parent, child, interfaceId, type)

}