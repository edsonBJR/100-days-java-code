package br.com.edsonbjr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertingDataTypesPrimitesToWrapperTest {

    @Test
    public void shouldConvertbyteToByte() {
        byte value = 42;
        Byte result = ConvertingDataTypesPrimitesToWrapper.convertbyteToByte(value);
        assertEquals(Byte.valueOf(value), result);
    }

    @Test
    public void shouldConvertIntToInteger() {
        int value = 42;
        Integer result = ConvertingDataTypesPrimitesToWrapper.convertIntToInteger(value);
        assertEquals(Integer.valueOf(value), result);
    }

    @Test
    public void shouldConvertshortToShort() {
        short value = 'A';
        Short result = ConvertingDataTypesPrimitesToWrapper.convertshortToShort(value);
        assertEquals(Short.valueOf(value), result);
    }

    @Test
    public void shouldConvertlongToLong() {
        long value = 10000L;
        Long result = ConvertingDataTypesPrimitesToWrapper.convertlongToLong(value);
        assertEquals(Long.valueOf(value), result);
    }

    @Test
    public void shoulConvertfloatToFloat() {
        float value = 1.1234F;
        Float result = ConvertingDataTypesPrimitesToWrapper.convertfloatToFloat(value);
        assertEquals(Float.valueOf(value), result);
    }

    @Test
    public void shouldConvertdoubleToDouble() {
        double value = 1.9876;
        Double result = ConvertingDataTypesPrimitesToWrapper.convertdoubleToDouble(value);
        assertEquals(Double.valueOf(value), result);
    }

    @Test
    public void shouldConvertbooleanToBoolean() {
        boolean value = false;
        Boolean result = ConvertingDataTypesPrimitesToWrapper.convertbooleanToBoolean(value);
        assertEquals(Boolean.valueOf(value), result);
    }

    @Test
    public void shouldConvertCharToCharacter() {
        char value = 42;
        Character result = ConvertingDataTypesPrimitesToWrapper.convertCharToCharacter(value);
        assertEquals(Character.valueOf(value), result);
    }

}
