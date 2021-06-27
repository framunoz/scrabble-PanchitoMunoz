package cl.uchile.dcc.scrabble.model.ast.hidden_ast.hidden_operations;

import cl.uchile.dcc.scrabble.model.ast.hidden_ast.hidden_operations.transformations.ToHiddenBinary;
import cl.uchile.dcc.scrabble.model.ast.hidden_ast.hidden_operations.transformations.ToHiddenBool;
import cl.uchile.dcc.scrabble.model.ast.hidden_ast.hidden_operations.transformations.ToHiddenFloat;
import cl.uchile.dcc.scrabble.model.ast.hidden_ast.hidden_operations.transformations.ToHiddenInt;
import cl.uchile.dcc.scrabble.model.ast.hidden_ast.hidden_operations.transformations.ToHiddenString;
import cl.uchile.dcc.scrabble.model.ast.hidden_ast.HiddenAST;

/**
 * An interface to represent a general hidden operation in {@code HiddenAST}.
 * The classes that implement this interface will be adapted by the {@code Operation} classes.
 *
 * @author Francisco Muñoz Guajardo
 * @create 2021/06/21 17:14
 */
public interface HiddenOperation extends HiddenAST {

    /**
     * Transform the current instance into a {@code HiddenBinary}.
     *
     * @return a {@code HiddenBinary}
     */
    default HiddenOperation toHiddenBinary() {
        return new ToHiddenBinary(this);
    }

    /**
     * Transform the current instance into a {@code HiddenBool}.
     *
     * @return a {@code HiddenBool}
     */
    default HiddenOperation toHiddenBool() {
        return new ToHiddenBool(this);
    }

    /**
     * Transform the current instance into a {@code HiddenFloat}.
     *
     * @return a {@code HiddenFloat}
     */
    default HiddenOperation toHiddenFloat() {
        return new ToHiddenFloat(this);
    }

    /**
     * Transform the current instance into a {@code HiddenInt}.
     *
     * @return a {@code HiddenInt}
     */
    default HiddenOperation toHiddenInt() {
        return new ToHiddenInt(this);
    }

    /**
     * Transform the current instance into a {@code HiddenString}.
     *
     * @return a {@code HiddenString}
     */
    default HiddenOperation toHiddenString() {
        return new ToHiddenString(this);
    }
}
