package de.bso.java.examples.visibility;

import de.bso.java.examples.visibility.apackage.ClassWithVariable;

public class AccessorWorld {

    public static void main(String[] args) {
        ClassWithVariable classWithVariable = new ClassWithVariable();

        int i = classWithVariable.publicAttribute; // accessible
//        i = classWithVariable.protectedAttribute;  // not accessible
//        i = classWithVariable.packagedAttribute; // not accessible
//        i = classWithVariable.privateAttribute; // not accessible

        //An accessor in anywhere can access only public
    }
}
