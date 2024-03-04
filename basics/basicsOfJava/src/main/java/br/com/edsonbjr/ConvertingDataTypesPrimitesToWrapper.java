package br.com.edsonbjr;

public class ConvertingDataTypesPrimitesToWrapper {

    public static Byte convertbyteToByte(byte value) {
        return Byte.valueOf(value);
    }

    public static Integer convertIntToInteger(int value) {
        return Integer.valueOf(value);
    }

    public static Short convertshortToShort(short value) {
        return Short.valueOf(value);
    }

    public static Long convertlongToLong(long value) {
        return Long.valueOf(value);
    }

    public static Float convertfloatToFloat(float value) {
        return Float.valueOf(value);
    }

    public static Double convertdoubleToDouble(double value) {
        return Double.valueOf(value);
    }

    public static Boolean convertbooleanToBoolean(boolean value) {
        return Boolean.valueOf(value);
    }

    public static Character convertCharToCharacter(char value) {
        return Character.valueOf(value);
    }
}
