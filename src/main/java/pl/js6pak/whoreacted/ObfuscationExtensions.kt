/*
 * WhoReacted
 * Copyright (C) 2021 js6pak
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package pl.js6pak.whoreacted

import androidx.viewbinding.ViewBinding
import c.a.y.b0
import com.discord.api.message.reaction.MessageReaction
import com.discord.api.message.reaction.MessageReactionEmoji
import com.discord.databinding.WidgetChatListAdapterItemReactionsBinding
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.google.android.flexbox.FlexboxLayout
import java.lang.reflect.Field

val MessageReaction.count: Int
    get() = this.a()

val MessageReaction.emoji: MessageReactionEmoji
    get() = this.b()

val MessageReactionEmoji.id: String
    get() = this.c()

val WidgetChatListAdapterItemReactionsBinding.chatListItemReactions: FlexboxLayout
    get() = this.d

typealias ReactionView = b0

private val bindingField: Field =
        ReactionView::class.java.getDeclaredField("m")
        .apply { isAccessible = true }

val ReactionView.binding: ViewBinding
    get() = bindingField[this] as ViewBinding

typealias RoundingParams = c.f.g.f.c

var RoundingParams.mRoundAsCircle: Boolean
    get() = this.b
    set(value) {
        this.b = value
    }

fun GenericDraweeHierarchy.setRoundingParams(roundingParams: RoundingParams?) {
    this.s(roundingParams)
}