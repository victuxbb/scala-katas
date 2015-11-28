package org.ganger.microkata

/**
 * Created by arincon on 29/09/15.
 */
object MicroKata {
  case class Person(name: String, age: Int)
  def toUpper(input: Seq[String]): Seq[String] = input.map(_.toUpperCase())
  def lessThan(input: Seq[String], i: Int): Seq[String] = input.filter(_.length<i)
  def flat(input: Seq[Seq[Int]]): Any = ???
  def max(people: Seq[Person]): Person = ???
  def sum1(input: Seq[Int]) = ???
  def sum(input: Seq[Int]) = ???
  def kidsFrom(people: Seq[Person]): Seq[Person] = ???

}
