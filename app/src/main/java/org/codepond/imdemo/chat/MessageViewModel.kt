/*
 * Copyright 2017 Nimrod Dayan CodePond.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codepond.imdemo.chat

import org.codepond.imdemo.model.ChatMessage
import java.text.SimpleDateFormat

data class MessageViewModel(private val chatMessage: ChatMessage, val position: Int) {
    val author = chatMessage.from
    val timestamp: String? = SimpleDateFormat.getTimeInstance().format(chatMessage.createdDate ?: System.currentTimeMillis())
    val text = chatMessage.text
}
