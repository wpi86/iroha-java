package jp.co.soramitsu.iroha2

import jp.co.soramitsu.iroha2.generated.datamodel.Value
import jp.co.soramitsu.iroha2.generated.datamodel.expression.Add
import jp.co.soramitsu.iroha2.generated.datamodel.expression.EvaluatesTo
import jp.co.soramitsu.iroha2.generated.datamodel.expression.Expression
import jp.co.soramitsu.iroha2.generated.datamodel.expression.Less
import jp.co.soramitsu.iroha2.generated.datamodel.isi.FailBox
import jp.co.soramitsu.iroha2.generated.datamodel.isi.If
import jp.co.soramitsu.iroha2.generated.datamodel.isi.Instruction
import org.junit.jupiter.api.Test

class Foo {
    @Test
    fun test() {
        Instruction.If(
            If(
                // condition = EvaluatesTo(
                //     Expression.Less(
                //         Less(
                //             left = EvaluatesTo(Expression.Raw(Value.U32(0))),
                //             right = EvaluatesTo(Expression.Raw(Value.U32(0))),
                //         )
                //     )
                // ),
                condition = EvaluatesTo(
                    Expression.Add(
                        Add(
                            left = EvaluatesTo(Expression.Raw(Value.U32(0))),
                            right = EvaluatesTo(Expression.Raw(Value.U32(0))),
                        )
                    )
                ),
                then = Instruction.Fail(FailBox("on then")),
                otherwise =  Instruction.Fail(FailBox("on otherwise")),
            )
        )
    }
}

