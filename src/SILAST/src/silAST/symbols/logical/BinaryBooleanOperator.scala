package silAST.symbols.logical

import silAST.ASTNode
import scala.collection.Seq
import silAST.source.SourceLocation

abstract class BinaryBooleanOperator(sl : SourceLocation) extends ASTNode(sl) {

  def subNodes(): Seq[ASTNode] = { Nil }

}