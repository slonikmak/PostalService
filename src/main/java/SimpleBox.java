public class SimpleBox implements Box {

    final private double width;
    final private double height;
    final private double deep;
    final private double wallThickness;

    public SimpleBox(double width, double height, double deep, double wallThickness) {
        this.width = width;
        this.height = height;
        this.deep = deep;
        this.wallThickness = wallThickness;
    }

    public double getInnerWidth() {
        return width - 2 * wallThickness;
    }

    public double getInnerHeight() {
        return height - 2 * wallThickness;
    }

    public double getInnerDeep() {
        return deep - 2 * wallThickness;
    }
}
