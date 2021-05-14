package cl.uchile.dcc.scrabble.model.types.abstract_types;

import cl.uchile.dcc.scrabble.model.operations.IOpp;
import cl.uchile.dcc.scrabble.model.operations.add.IAddWithFloat;
import cl.uchile.dcc.scrabble.model.operations.add.IAddWithInt;
import cl.uchile.dcc.scrabble.model.operations.multiplication.IMultWithFloat;
import cl.uchile.dcc.scrabble.model.operations.multiplication.IMultWithInt;
import cl.uchile.dcc.scrabble.model.operations.subtraction.ISubWithFloat;
import cl.uchile.dcc.scrabble.model.operations.subtraction.ISubWithInt;
import cl.uchile.dcc.scrabble.model.types.interface_types.SNumber;
import cl.uchile.dcc.scrabble.model.types.TypeFloat;

/**
 * An abstract class for the general numbers used.
 * @author Francisco Muñoz Guajardo
 */
public abstract class AbstractNumber extends AbstractType
        implements SNumber, IOpp, IAddWithFloat, IAddWithInt, ISubWithFloat,  ISubWithInt, IMultWithFloat, IMultWithInt {
    /**
     * Transforms the current type to a TypeFloat.
     *
     * @return TypeFloat with a value equivalent to the current type.
     */
    abstract public TypeFloat toTypeFloat();
}