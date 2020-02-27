public class SimplePackage implements Package{

    final private double width;
    final private double height;
    final private double deep;

    public SimplePackage(double width, double height, double deep) {
        this.width = width;
        this.height = height;
        this.deep = deep;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDeep() {
        return deep;
    }
}
