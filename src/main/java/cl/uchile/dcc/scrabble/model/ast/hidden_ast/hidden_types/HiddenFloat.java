package cl.uchile.dcc.scrabble.model.ast.hidden_ast.hidden_types;

import static cl.uchile.dcc.scrabble.model.factories.hidden_factories.HTypeFactory.createHiddenFloat;
import static cl.uchile.dcc.scrabble.model.factories.hidden_factories.HTypeFactory.createHiddenString;
import static cl.uchile.dcc.scrabble.model.factories.types_factories.STypeFactory.createFloat;

import cl.uchile.dcc.scrabble.model.ast.hidden_ast.hidden_types.abstract_types.AbstractHiddenType;
import cl.uchile.dcc.scrabble.model.ast.hidden_ast.interfaces.HType;
import cl.uchile.dcc.scrabble.model.types.TypeFloat;
import cl.uchile.dcc.scrabble.model.types.TypeString;

/**
 * A class to wrap a {@code TypeFloat}. To use adapter pattern.
 *
 * @author Francisco Muñoz Guajardo
 * @create 2021/06/13 0:02
 * @see TypeFloat
 */
public class HiddenFloat extends AbstractHiddenType {

    private final TypeFloat typeFloat;

    /**
     * Constructor.
     *
     * @param typeFloat a type float
     */
    public HiddenFloat(TypeFloat typeFloat) {
        this.typeFloat = createFloat(typeFloat);
    }

    /**
     * Constructor.
     *
     * @param value a double
     */
    public HiddenFloat(double value) {
        this(createFloat(value));
    }

    /**
     * Gets the current instance in the wrapper
     *
     * @return the instance in the wrapper
     */
    @Override
    public TypeFloat toSType() {
        return createFloat(typeFloat);
    }

    @Override
    public String toString() {
        return "HiddenFloat{" +
            "value=" + typeFloat.getValue() +
            '}';
    }

    /**
     * Transform the current instance to a {@code HiddenFloat}.
     *
     * @return a {@code HiddenFloat} equivalent
     */
    @Override
    public HiddenFloat toHiddenFloat() {
        TypeFloat computed = this.typeFloat.toTypeFloat();
        return createHiddenFloat(computed);
    }

    /**
     * Transform the current instance to a {@code HiddenString}.
     *
     * @return a {@code HiddenString} equivalent
     */
    @Override
    public HiddenString toHiddenString() {
        TypeString computed = this.typeFloat.toTypeString();
        return createHiddenString(computed);
    }

    /**
     * Returns the sum
     *
     * @param hType other type to sum
     * @return the sum
     */
    @Override
    public HType add(HType hType) {
        return hType.addWithFloat(this);
    }

    /**
     * Returns the division between numbers
     *
     * @param hType another number
     * @return the division
     */
    @Override
    public HType div(HType hType) {
        return hType.divWithFloat(this);
    }

    /**
     * Returns the multiplication between numbers
     *
     * @param hType another number
     * @return the multiplication
     */
    @Override
    public HType mult(HType hType) {
        return hType.multWithFloat(this);
    }

    /**
     * Returns the subtraction between numbers
     *
     * @param hType another number
     * @return the subtraction
     */
    @Override
    public HType sub(HType hType) {
        return hType.subWithFloat(this);
    }

    /**
     * Returns the disjunction between logicals
     *
     * @param hType another logical
     * @return the disjunction
     */
    @Override
    public HType and(HType hType) {
        return hType.andWithFloat(this);
    }

    /**
     * Returns the conjunction between logicals
     *
     * @param hType another logical
     * @return the conjunction
     */
    @Override
    public HType or(HType hType) {
        return hType.orWithFloat(this);
    }

    /**
     * To use double dispatch in {@code add}
     */
    @Override
    public HType addWithFloat(HiddenFloat wFloat) {
        TypeFloat computed = (TypeFloat) this.typeFloat.addWithFloat(wFloat.toSType());
        return createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code add}
     */
    @Override
    public HType addWithInt(HiddenInt wInt) {
        TypeFloat computed = (TypeFloat) this.typeFloat.addWithInt(wInt.toSType());
        return createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code sub}
     */
    @Override
    public HType subWithFloat(HiddenFloat wFloat) {
        TypeFloat computed = (TypeFloat) this.typeFloat.subWithFloat(wFloat.toSType());
        return createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code sub}
     *
     *
     */
    @Override
    public HType subWithInt(HiddenInt wInt) {
        TypeFloat computed = (TypeFloat) this.typeFloat.subWithInt(wInt.toSType());
        return createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code mult}
     *
     *
     */
    @Override
    public HType multWithFloat(HiddenFloat wFloat) {
        TypeFloat computed = (TypeFloat) this.typeFloat.multWithFloat(wFloat.toSType());
        return createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code mult}
     *
     *
     */
    @Override
    public HType multWithInt(HiddenInt wInt) {
        TypeFloat computed = (TypeFloat) this.typeFloat.multWithInt(wInt.toSType());
        return createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code div}
     *
     *
     */
    @Override
    public HType divWithFloat(HiddenFloat wFloat) {
        TypeFloat computed = (TypeFloat) this.typeFloat.divWithFloat(wFloat.toSType());
        return createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code div}
     *
     *
     */
    @Override
    public HType divWithInt(HiddenInt wInt) {
        TypeFloat computed = (TypeFloat) this.typeFloat.divWithInt(wInt.toSType());
        return createHiddenFloat(computed);
    }
}
