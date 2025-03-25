package de.bso.java.examples.visibility.apackage;

public class ClassWithVariable {

    private int privateAttribute = 0;
    protected int protectedAttribute = 0;
    int packagedAttribute = 0;
    public int publicAttribute = 0;

    public static void main(String[] args) {
        ClassWithVariable classWithVariable = new ClassWithVariable();

        int i = classWithVariable.publicAttribute; // accessible
        i = classWithVariable.protectedAttribute;  // not accessible
        i = classWithVariable.packagedAttribute; // not accessible
        i = classWithVariable.privateAttribute; // not accessible

        //An accessor in the same Class can access each variable
    }
}
