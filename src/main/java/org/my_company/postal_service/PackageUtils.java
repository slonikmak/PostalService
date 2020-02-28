package org.my_company.postal_service;

import java.util.Arrays;

public class PackageUtils {

    public boolean isPackageFitInBox(Package testingPackage, Box box){

        double[] packageSizes = {testingPackage.getWidth(), testingPackage.getHeight(), testingPackage.getDeep()};
        double[] boxSizes = {box.getInnerWidth(), box.getInnerHeight(), box.getInnerDeep()};
        Arrays.sort(packageSizes);
        Arrays.sort(boxSizes);

        return boxSizes[0] >= packageSizes[0]
                && boxSizes[1] >= packageSizes[1]
                && boxSizes[2] >= packageSizes[2];

    }

}
