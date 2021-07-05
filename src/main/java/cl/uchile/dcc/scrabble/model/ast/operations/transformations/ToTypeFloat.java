package cl.uchile.dcc.scrabble.model.ast.operations.transformations;

import cl.uchile.dcc.scrabble.model.hidden_ast.hidden_operations.transformations.ToHiddenFloat;
import cl.uchile.dcc.scrabble.model.ast.AST;
import cl.uchile.dcc.scrabble.model.ast.operations.abstract_operations.AbstractTransformation;

/**
 * A class that works as a decorator for an {@code Operation}. Allows float transformation.
 *
 * @author Francisco Muñoz Guajardo
 * @create 2021/06/22 23:58
 */
public class ToTypeFloat extends AbstractTransformation {

    /**
     * Constructor.
     *
     * @param value an AST. It can be an {@code Operation} or a {@code SType}.
     */
    public ToTypeFloat(AST value) {
        super(new ToHiddenFloat(value.toHiddenAST()));
    }
}
