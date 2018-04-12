public class TriangleException extends IllegalArgumentException {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public TriangleException() {
    }

    public TriangleException(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public double getEdgeA() {
        return edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }
}