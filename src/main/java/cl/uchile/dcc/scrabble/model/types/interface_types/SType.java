package cl.uchile.dcc.scrabble.model.types.interface_types;

import cl.uchile.dcc.scrabble.model.ast.AST;
import cl.uchile.dcc.scrabble.model.builders.interfaces.TypeASTBuilder;
import cl.uchile.dcc.scrabble.model.hidden_ast.hidden_types.HType;
import cl.uchile.dcc.scrabble.model.types.TypeString;
import cl.uchile.dcc.scrabble.model.types.operations.operations_type.ArithmeticOperationsWithString;

/**
 * An interface for the sole purpose of representing any type.
 *
 * @author Francisco Muñoz Guajardo
 */
public interface SType extends AST, ArithmeticOperationsWithString, TypeASTBuilder {

    /**
     * Returns the value as {@code String}.
     *
     * @return the current value as {@code String}
     */
    String getValueAsString();

    /**
     * Transforms the current type to a {@code TypeString}.
     *
     * @return {@code TypeString} with a value equivalent to the current type.
     */
    TypeString toTypeString();

    /**
     * Transform an {@code AST} into its equivalent {@code HiddenAST}.
     *
     * @return a transformation
     */
    @Override
    HType toHiddenAST();
}
