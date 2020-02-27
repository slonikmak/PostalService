package org.my_company.postal_service;

public class PackageUtils {

    /**
     * @param testingPackage package to test
     * @param box box to test
     * @return does the package fit in the box
     */
    public boolean isPackageFitInBox(Package testingPackage, Box box){
        return box.getInnerWidth() >= testingPackage.getWidth()
                && box.getInnerHeight() >= testingPackage.getHeight()
                && box.getInnerDeep() >= testingPackage.getDeep();
    }

}
