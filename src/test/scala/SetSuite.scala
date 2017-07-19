import NumExercise.bigNum
import org.scalatest.FunSuite

class SetSuite extends FunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test( "a _ case should return testing an invalid number") {
    assert(bigNum(1) === "invalid input")
  }

  test(" a bigNum greater than 1000 but less than 1000000 will return somenumber xxx thousand xxx and then translate ") {
    assert(bigNum(1222) === "English: 1 thousand 222, French: 1 mille 222")
  }

  test(" a bigNum greater than 1000000 but less than 1000000000 will return some number xxx million xxx thousand xxx and then translate ") {
    assert(bigNum(111222333) === "English: 111 million 222 thousand 333, French: 111 million 222 mille 333")
  }

  test(" a bigNum greater than 1000000000 but less than 1000000000000 will return some number xxx billion xxx million xxx thousand xxx and then translate ") {
    assert(bigNum(111222333444L) === "English: 111 billion 222 million 333 thousand 444, French: 111 milliard 222 million 333 mille 444")
  }

  test(" a bigNum greater than 1000000000000 but less than 1000000000000000 will return some number xxx trillion xxx billion xxx million xxx thousand xxx and then translate ") {
    assert(bigNum(111222333444555L) === "English: 111 trillion 222 billion 333 million 444 thousand 555, French: 111 billion 222 milliard 333 million 444 mille 555")
  }

  test(" a bigNum greater than 1000000000000000 but less than 1000000000000000000 will return some number xxx quadrillion xxx trillion xxx billion xxx million xxx thousand xxx and then translate ") {
    assert(bigNum(111222333444555666L) === "English: 111 quadrillion 222 trillion 333 billion 444 million 555 thousand 666, French: 111 billiard 222 billion 333 milliard 444 million 555 mille 666")
  }

  test(" a bigNum greater than 1000000000000000000 but less than 1000000000000000000000 will return some number xxx quintillion xxx quadrillion xxx trillion xxx billion xxx million xxx thousand xxx and then translate ") {
    assert(bigNum(1112223334445556667L) === "English: 1 quintillion 112 quadrillion 223 trillion 334 billion 445 million 556 thousand 667, French: 1 trillion 112 billiard 223 billion 334 milliard 445 million 556 mille 667")
  }

}
