package cl.uchile.dcc.scrabble.model.ast.interfaces;

import cl.uchile.dcc.scrabble.model.ast.wrapped_types.WType;
import cl.uchile.dcc.scrabble.model.types.interface_types.SType;

/**
 * Interface that provides the transformation to a Wrapped Type. This functionality allows mapping
 * {@code SType} to {@code WType} in the {@code HiddenAST}.
 *
 * @author Francisco Muñoz Guajardo
 * @create 2021/06/14 8:53
 * @see SType
 * @see WType
 * @see HiddenAST
 */
public interface HiddenASTTransformation {

    /**
     * Transform a {@code SType} into its equivalent {@code WType}. If the argument is a {@code
     * WType} or an {@code HiddenAST}, it does nothing.
     *
     * @return a transformation
     */
    HiddenAST toHiddenAST();
}