package cl.uchile.dcc.scrabble.model.hidden_layer.hidden_types;

import cl.uchile.dcc.scrabble.model.hidden_layer.hidden_types.abstract_types.AbstractHiddenInteger;
import cl.uchile.dcc.scrabble.model.hidden_layer.hidden_types.abstract_types.AbstractHiddenType;
import cl.uchile.dcc.scrabble.model.factories.hidden_factories.HTypeFactory;
import cl.uchile.dcc.scrabble.model.factories.types_factories.STypeFactory;
import cl.uchile.dcc.scrabble.model.hidden_layer.hidden_types.operation_visitor.HiddenOperationVisitor;
import cl.uchile.dcc.scrabble.model.types.TypeBinary;
import cl.uchile.dcc.scrabble.model.types.TypeFloat;
import cl.uchile.dcc.scrabble.model.types.TypeInt;
import cl.uchile.dcc.scrabble.model.types.TypeString;

// TODO: trasladar la lógica de las operaciones aquí y dejar SType como un adaptador
/**
 * A class to wrap a {@code TypeInt}. To use adapter pattern.
 *
 * @author Francisco Muñoz Guajardo
 * @create 2021/06/13 0:02
 * @see TypeInt
 */
public class HiddenInt extends AbstractHiddenInteger {

    private final TypeInt typeInt;

    /**
     * Constructor.
     *
     * @param typeInt a type int
     */
    public HiddenInt(TypeInt typeInt) {
        super(typeInt);
        this.typeInt = STypeFactory.createTypeInt(typeInt);
    }

    /**
     * Constructor.
     *
     * @param value an int
     */
    public HiddenInt(int value) {
        this(STypeFactory.createTypeInt(value));
    }

    /**
     * Accept method to use visitor pattern.
     *
     * @param visitor a {@code HiddenOperationVisitor}
     * @return a {@code HType} operated
     */
    @Override
    public HType operateWith(HiddenOperationVisitor visitor) {
        return visitor.operateWithInt(this);
    }

    /**
     * Gets the current instance in the wrapper
     *
     * @return the instance in the wrapper
     */
    @Override
    public TypeInt asSType() {
        return STypeFactory.createTypeInt(typeInt);
    }

    @Override
    public String toString() {
        return "HiddenInt{" +
            "value=" + typeInt.getValue() +
            '}';
    }

    /**
     * Transform the current instance to a {@code HiddenBinary}.
     *
     * @return a {@code HiddenBinary} equivalent
     */
    @Override
    public HType toHiddenBinary() {
        TypeBinary computed = this.typeInt.toTypeBinary();
        return HTypeFactory.createHiddenBinary(computed);
    }

    /**
     * Transform the current instance to a {@code HiddenFloat}.
     *
     * @return a {@code HiddenFloat} equivalent
     */
    @Override
    public HType toHiddenFloat() {
        TypeFloat computed = this.typeInt.toTypeFloat();
        return HTypeFactory.createHiddenFloat(computed);
    }

    /**
     * Transform the current instance to a {@code HiddenInt}.
     *
     * @return a {@code HiddenInt} equivalent
     */
    @Override
    public HType toHiddenInt() {
        TypeInt computed = this.typeInt.toTypeInt();
        return HTypeFactory.createHiddenInt(computed);
    }

    /**
     * Transform the current instance to a {@code HiddenString}.
     *
     * @return a {@code HiddenString} equivalent
     */
    @Override
    public HType toHiddenString() {
        TypeString computed = this.typeInt.toTypeString();
        return HTypeFactory.createHiddenString(computed);
    }

    /**
     * Returns the sum
     *
     * @param hType other type to sum
     * @return the sum
     */
    @Override
    public HType add(HType hType) {
        return hType.addWithInt(this);
    }

    /**
     * Returns the division between numbers
     *
     * @param hType another number
     * @return the division
     */
    @Override
    public HType div(HType hType) {
        return hType.divWithInt(this);
    }

    /**
     * Returns the multiplication between numbers
     *
     * @param hType another number
     * @return the multiplication
     */
    @Override
    public HType mult(HType hType) {
        return hType.multWithInt(this);
    }

    /**
     * Returns the subtraction between numbers
     *
     * @param hType another number
     * @return the subtraction
     */
    @Override
    public HType sub(HType hType) {
        return hType.subWithInt(this);
    }

    /**
     * To use double dispatch in {@code add}
     * @param hiddenBinary a {@code HiddenBinary}
     */
    @Override
    public HType addWithBinary(HiddenBinary hiddenBinary) {
        TypeBinary computed = this.typeInt.addWithBinary(hiddenBinary.asSType());
        return HTypeFactory.createHiddenBinary(computed);
    }

    /**
     * To use double dispatch in {@code add}
     * @param hiddenFloat a {@code HiddenFloat}
     */
    @Override
    public HType addWithFloat(HiddenFloat hiddenFloat) {
        TypeFloat computed = this.typeInt.addWithFloat(hiddenFloat.asSType());
        return HTypeFactory.createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code add}
     * @param hiddenInt a {@code HiddenInt}
     */
    @Override
    public HType addWithInt(HiddenInt hiddenInt) {
        TypeInt computed = this.typeInt.addWithInt(hiddenInt.asSType());
        return HTypeFactory.createHiddenInt(computed);
    }

    /**
     * To use double dispatch in {@code sub}
     * @param hiddenBinary a {@code HiddenBinary}
     */
    @Override
    public HType subWithBinary(HiddenBinary hiddenBinary) {
        TypeBinary computed = this.typeInt.subWithBinary(hiddenBinary.asSType());
        return HTypeFactory.createHiddenBinary(computed);
    }

    /**
     * To use double dispatch in {@code sub}
     *
     *
     * @param hiddenFloat a {@code HiddenFloat}
     */
    @Override
    public HType subWithFloat(HiddenFloat hiddenFloat) {
        TypeFloat computed = this.typeInt.subWithFloat(hiddenFloat.asSType());
        return HTypeFactory.createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code sub}
     *
     *
     * @param hiddenInt a {@code HiddenInt}
     */
    @Override
    public HType subWithInt(HiddenInt hiddenInt) {
        TypeInt computed = this.typeInt.subWithInt(hiddenInt.asSType());
        return HTypeFactory.createHiddenInt(computed);
    }

    /**
     * To use double dispatch in {@code mult}
     *
     *
     * @param hiddenBinary a {@code HiddenBinary}
     */
    @Override
    public HType multWithBinary(HiddenBinary hiddenBinary) {
        TypeBinary computed = this.typeInt.multWithBinary(hiddenBinary.asSType());
        return HTypeFactory.createHiddenBinary(computed);
    }

    /**
     * To use double dispatch in {@code mult}
     *
     *
     * @param hiddenFloat a {@code HiddenFloat}
     */
    @Override
    public HType multWithFloat(HiddenFloat hiddenFloat) {
        TypeFloat computed = this.typeInt.multWithFloat(hiddenFloat.asSType());
        return HTypeFactory.createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code mult}
     *
     *
     * @param hiddenInt a {@code HiddenInt}
     */
    @Override
    public HType multWithInt(HiddenInt hiddenInt) {
        TypeInt computed = this.typeInt.multWithInt(hiddenInt.asSType());
        return HTypeFactory.createHiddenInt(computed);
    }

    /**
     * To use double dispatch in {@code div}
     *
     *
     * @param hiddenBinary a {@code HiddenBinary}
     */
    @Override
    public HType divWithBinary(HiddenBinary hiddenBinary) {
        TypeBinary computed = this.typeInt.divWithBinary(hiddenBinary.asSType());
        return HTypeFactory.createHiddenBinary(computed);
    }

    /**
     * To use double dispatch in {@code div}
     *
     *
     * @param hiddenFloat a {@code HiddenFloat}
     */
    @Override
    public HType divWithFloat(HiddenFloat hiddenFloat) {
        TypeFloat computed = this.typeInt.divWithFloat(hiddenFloat.asSType());
        return HTypeFactory.createHiddenFloat(computed);
    }

    /**
     * To use double dispatch in {@code div}
     *
     *
     * @param hiddenInt a {@code HiddenInt}
     */
    @Override
    public HType divWithInt(HiddenInt hiddenInt) {
        TypeInt computed = this.typeInt.divWithInt(hiddenInt.asSType());
        return HTypeFactory.createHiddenInt(computed);
    }
}
