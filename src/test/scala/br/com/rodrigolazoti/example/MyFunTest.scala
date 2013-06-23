package br.com.rodrigolazoti.example

import org.scalatest.{FunSuite, BeforeAndAfter}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MyFunTest extends FunSuite with BeforeAndAfter {

  var myDog:Dog = null 
  var myCat:Cat = null

  before {
    myDog = Dog("Thunder")
    myCat = new Cat("Taz")
  }

  test("My dog's name is Thunder") {
    assert(myDog != null)
    assert(myDog.name === "Thunder")
  }

  test("My cat's name is Taz") {
    assert(myCat != null)
    assert(myCat.getName === "Taz")
  }

}