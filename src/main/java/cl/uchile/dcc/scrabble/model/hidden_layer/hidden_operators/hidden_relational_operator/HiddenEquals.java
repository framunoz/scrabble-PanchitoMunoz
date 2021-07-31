package cl.uchile.dcc.scrabble.model.hidden_layer.hidden_operators.hidden_relational_operator;

import cl.uchile.dcc.scrabble.model.hidden_layer.HiddenASTComponent;
import cl.uchile.dcc.scrabble.model.hidden_layer.hidden_operators.abstract_classes.AbstractHiddenRelationalOperator;
import cl.uchile.dcc.scrabble.model.hidden_layer.hidden_types.HType;

/**
 * todo: doc
 *
 * @author Francisco Muñoz Guajardo
 * @create 2021/07/26 0:37
 */
public class HiddenEquals extends AbstractHiddenRelationalOperator {

    /**
     * Default constructor. It can receive an {@code HiddenOperator} or a {@code HType}.
     *
     * @param leftValue  left value, it can be an {@code HiddenOperator} or a {@code HType}.
     * @param rightValue right value, it can be an {@code HiddenOperator} or a {@code HType}.
     */
    public HiddenEquals(
        HiddenASTComponent leftValue,
        HiddenASTComponent rightValue) {
        super(leftValue, rightValue, "Equals", "==");
    }

    /**
     * Compute the operation between 2 {@code HType} and returns its operation. To use template
     * pattern in {@code calculate}.
     *
     * @param value1 the value at the left
     * @param value2 the value at the right
     * @return the value computed
     */
    @Override
    protected HType mainOperation(HType value1, HType value2) {
        return value1.equalsTo(value2);
    }
}
