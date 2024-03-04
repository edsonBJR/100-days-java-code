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

}
