/*
Copyright 2018 EconomicSL

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package org.economicsl.matching


/** A mixin trait that uses a boolean function to express preferences over a particular `T`. */
trait Predicate[-T] {

  /** Boolean function used to determine whether some `T` is acceptable.
    *
    * @return a boolean function that returns `true` if the `T` is acceptable and `false` otherwise.
    */
  def isAcceptable: T => Boolean

}
