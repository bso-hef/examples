package de.bso.java.examples.visibility.apackage;

public class AccessorSamePackage {

    public static void main(String[] args) {
        ClassWithVariable classWithVariable = new ClassWithVariable();

        int i = classWithVariable.publicAttribute; // accessible
        i = classWithVariable.protectedAttribute;  // accessible
        i = classWithVariable.packagedAttribute; // accessible
//        i = classWithVariable.privateAttribute; // not accessible

        //An accessor inside the package can access
        //- public
        //- protected
        //- package
    }
}
