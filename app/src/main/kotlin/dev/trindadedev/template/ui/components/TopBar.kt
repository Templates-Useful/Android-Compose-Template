package dev.trindadedev.template.ui.components

/*
 * Copyright 2025 Template.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable

/*
 * A Basic small TopAppBar
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
  title: @Composable () -> Unit,
  scrollBehavior: TopAppBarScrollBehavior,
  navigationIcon: @Composable (() -> Unit)? = null,
  actions: @Composable RowScope.() -> Unit = {},
  isLarge: Boolean = false,
) {
  if (!isLarge) {
    TopAppBar(
      title = title,
      navigationIcon = { navigationIcon?.let { it() } },
      actions = actions,
      scrollBehavior = scrollBehavior,
    )
  } else {
    LargeTopAppBar(
      title = title,
      navigationIcon = { navigationIcon?.let { it() } },
      actions = actions,
      scrollBehavior = scrollBehavior,
    )
  }
}
