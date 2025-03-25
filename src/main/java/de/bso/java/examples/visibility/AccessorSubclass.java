package de.bso.java.examples.visibility;

import de.bso.java.examples.visibility.apackage.ClassWithVariable;

public class AccessorSubclass extends ClassWithVariable {

    public static void main(String[] args) {
        ClassWithVariable classWithVariable = new ClassWithVariable();
        AccessorSubclass accessorExtendsBProtected = new AccessorSubclass();

        int i = classWithVariable.publicAttribute; // accessible
        i = accessorExtendsBProtected.protectedAttribute;  // not accessible
//        i = classWithVariable.packagedAttribute; // not accessible
//        i = classWithVariable.privateAttribute; // not accessible

        //An accessor in the inheritance tree can access
        //-public
        //-protected
    }
}
