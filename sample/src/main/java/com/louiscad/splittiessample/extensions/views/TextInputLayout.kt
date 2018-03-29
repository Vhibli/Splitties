/*
 * Copyright (c) 2018. Louis Cognault Ayeva Derman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.louiscad.splittiessample.extensions.views

import android.support.design.widget.TextInputLayout
import android.widget.EditText
import splitties.exceptions.illegal

var TextInputLayout.text: CharSequence?
    get() = editTextNow.text
    set(value) = editTextNow.setText(text)

val TextInputLayout.string: String
    get() = editTextNow.text.toString()

private inline val TextInputLayout.editTextNow: EditText
    get() = editText ?: illegal("No EditText found! Make sure it has been added first.")
