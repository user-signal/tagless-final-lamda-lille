package net.sigusr.it2

class MulExpSpec extends org.specs2.Specification {

  def is = s2"""
MulSym expressions when interpreted with the 'Int' evaluator
   mul(lit(7), ExpSymSamples.tf1) must be 35 $e2
MulSym expressions when interpreted with the 'String' evaluator
   mul(lit(7), ExpSymSamples.tf1) must be "(7 * (8 + (-(1 + 2))))" $e4
"""

  private def e2 = {
    import ExpSymInt.expSymInt
    import MulSymInt.mulSymInt
    MulSymSamples.tf2.unR must_== 35
  }

  private def e4 = {
    import ExpSymString.expSymString
    import MulSymString.mulSymString
    MulSymSamples.tf2.unS must_== "(7 * (8 + (-(1 + 2))))"
  }
}
