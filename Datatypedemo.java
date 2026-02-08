class Datatypedemo{

    public static void main(String[] args) {
        
        // ... primitive Datatype .... //

// Byte

/*  The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127: */

byte Num = 100;
System.out.println("num ="+Num);



// Short
// The short data type can store whole numbers from -32768 to 32767:
short myNum = -32765;
System.out.println("value ="+myNum);


//long : long is a 64-bit data type used to store very large integer values , long range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807



/*Because Java treats numbers as int by default, and this number is too large for int.
 L tells Java: “This number is a long literal” */
 
long Num1 = 15000000000L;
System.out.println("num ="+Num1);

    }




}