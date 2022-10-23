package fix

import scala.meta._
import scalafix.testkit._
import org.scalatest.FunSuiteLike

class RuleSuite extends AbstractSemanticRuleSuite(
    new TestkitProperties(
      Classpath(AbsolutePath(BuildInfo.inputClassdirectory)),
      List(AbsolutePath(BuildInfo.inputSourceroot)),
      List(AbsolutePath(BuildInfo.outputSourceroot)),
      AbsolutePath(BuildInfo.inputBaseDirectory),
      "2.13.10",
      Nil
    )
) with FunSuiteLike {
  runAllTests()
}
