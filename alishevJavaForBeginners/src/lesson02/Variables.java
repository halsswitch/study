package lesson02;

public class Variables {
    public static void main(String[] args) {
        byte myByte = 2;        // 1 byte. Stores whole numbers from -128 to 127
        short myShort = 22;     // 2 bytes. Stores whole numbers from -32,768 to 32,767
        int myInt = 222;        // 4 bytes. Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long myLong = 2222L;    // 8 bytes. Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloat = 3.3F;   // 4 bytes. Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double myDouble = 3.33; // 8 bytes. Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean myBool = true;  // 1 bit. Stores true or false values
        char myChar = 'A';      // 2 bytes. Stores a single character/letter or ASCII values

        System.out.println("Primitive Data Types " + myByte + " " + myShort + " " + myInt + " " + myLong + " " +
                myFloat + " " + myDouble + " " + myBool + " " + myChar);
    }
}
