/**
 * Copyright (c) 2010-2011 Graham Edgecombe
 * Copyright (c) 2011-2016 Major <major.emrs@gmail.com> and other apollo contributors
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package rs.emulator.buffer.packet

import com.google.common.base.MoreObjects
import io.netty.buffer.ByteBuf

/**
 * Represents a single packet used in the in-game protocol.
 *
 * @author Graham
 */
class GamePacket(val opcode: Int, val type: PacketType, val payload: ByteBuf) {

    /**
     * Gets the payload length.
     *
     * @return The payload length.
     */
    val length: Int = payload.readableBytes()

    override fun toString(): String = MoreObjects.toStringHelper(this).add("opcode", opcode).add("type", type).add("length", length).toString()
}