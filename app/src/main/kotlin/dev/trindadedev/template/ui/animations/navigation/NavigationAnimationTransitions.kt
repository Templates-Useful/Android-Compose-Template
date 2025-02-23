package dev.trindadedev.template.ui.animations.navigation

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

import soup.compose.material.motion.animation.materialSharedAxisYIn
import soup.compose.material.motion.animation.materialSharedAxisYOut

object NavigationAnimationTransitions {

  val enterTransition =
    materialSharedAxisYIn(
      forward = true,
      slideDistance = NavigationAnimationValues.SlideDistance,
      durationMillis = NavigationAnimationValues.SlideDuration,
    )

  val exitTransition =
    materialSharedAxisYOut(
      forward = true,
      slideDistance = NavigationAnimationValues.SlideDistance,
      durationMillis = NavigationAnimationValues.SlideDuration,
    )

  val popEnterTransition =
    materialSharedAxisYIn(
      forward = false,
      slideDistance = NavigationAnimationValues.SlideDistance,
      durationMillis = NavigationAnimationValues.SlideDuration,
    )

  val popExitTransition =
    materialSharedAxisYOut(
      forward = false,
      slideDistance = NavigationAnimationValues.SlideDistance,
      durationMillis = NavigationAnimationValues.SlideDuration,
    )
}
