import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class PackageUtilsTest {

    static Box smallBox;
    static Box bigBox;
    static Box correctBox;
    static Package testPackage;
    static PackageUtils packageUtils;

    static double boxWallThickness = 5;
    static double packageWidth = 50;
    static double packageHeight = 50;
    static double packageDeep = 100;

    @BeforeClass
    static public void setup(){
        testPackage = new SimplePackage(packageWidth, packageHeight, packageDeep);
        correctBox = new SimpleBox(packageWidth+ boxWallThickness *2, packageHeight+ boxWallThickness *2, packageDeep+ boxWallThickness *2, boxWallThickness);
        smallBox = new SimpleBox(packageWidth, packageHeight, packageDeep, boxWallThickness);
        bigBox = new SimpleBox(packageWidth*2, packageHeight*2, packageDeep*2, boxWallThickness);

        packageUtils = new PackageUtils();
    }

    @Test
    public void testCorrectBox(){
        assertTrue(packageUtils.isPackageFitInBox(testPackage, correctBox));
    }

    @Test
    public void testSmallBox(){
        assertFalse(packageUtils.isPackageFitInBox(testPackage, smallBox));
    }

    @Test
    public void testBigBox(){
        assertTrue(packageUtils.isPackageFitInBox(testPackage, bigBox));
    }

}