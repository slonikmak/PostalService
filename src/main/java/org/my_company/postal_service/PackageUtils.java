package org.my_company.postal_service;

public class PackageUtils {

    public boolean isPackageFitInBox(Package testingPackage, Box box){
        return box.getInnerWidth() >= testingPackage.getWidth()
                && box.getInnerHeight() >= testingPackage.getHeight()
                && box.getInnerDeep() >= testingPackage.getDeep();
    }

}
