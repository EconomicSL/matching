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
package org.economicsl.matching.manytoone

import java.util.UUID

import org.economicsl.matching.{Predicate, Preferences}


case class School(uuid: UUID, quality: Double, quota: Int, isAcceptable: (Student) => Boolean, ordering: Ordering[Student])
  extends Predicate[Student] with Preferences[Student] with Quota


object School {

  implicit val studentByGPA: Ordering[Student] = Ordering.by(student => student.gpa)

  val anyStudentIsAcceptable: (Student) => Boolean = {
    _ => true
  }

  def gpaGreaterThan(threshold: Double)(student: Student): Boolean = {
    student.gpa >= threshold
  }

}