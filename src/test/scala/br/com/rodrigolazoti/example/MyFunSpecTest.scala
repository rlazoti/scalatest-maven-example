package br.com.rodrigolazoti.example

import org.scalatest.FunSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MyFunSpecTest extends FunSpec {

  describe("My dog's name") {

    it("should be 'Thunder'") {
      val myDog = Dog("Thunder")
      assert(myDog.name === "Thunder")
    }

  }

  describe("My cat's name") {

    it("should be 'Taz'") {
      val myCat = new Cat("Taz")
      assert(myCat.getName === "Taz")
    }

  }

  describe("An unimplemented test") {
    
    it("should be skipped") (pending)

  }

}