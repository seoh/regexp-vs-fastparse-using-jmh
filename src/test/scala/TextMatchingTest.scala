import utest._

object TextMatchingTest extends TestSuite {

  val string = "school=11,name=22,code=33,address=44,major=55,grade=66"

  val tests = Tests {

    'regexp - {
      val result = methods.RegExp.test(string)
      assert(result.length == 6)
    }

    'fastparse - {
      val result = methods.FastParse.test(string)
      assert(result.length == 6)
    }
  }
}
