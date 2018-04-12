import java.util.Scanner;

public class TriangleExample {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public TriangleExample() {
    }

    public TriangleExample(double edgeA, double edgeB, double edgeC) throws TriangleException{
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        edgeTriangleNagative();
        compareEdgeTriangle();
    }

    @Override
    public String toString() {
        return "TriangleExample{" +
                "edgeA = " + edgeA +
                ", edgeB = " + edgeB +
                ", edgeC = " + edgeC +
                '}';
    }

    public boolean isEdgeNagative(double edgeA, double edgeB, double edgeC){
        return  (edgeA > 0 && edgeB > 0 && edgeC > 0);
    }

    public boolean compareSumTwoEdgeWithOther(double edgeA, double edgeB, double edgeC){
        return ((edgeA + edgeC > edgeB) && (edgeA + edgeB > edgeC) && (edgeC + edgeB > edgeA));
    }

    public void edgeTriangleNagative() throws TriangleException{
        if (!isEdgeNagative(edgeA, edgeB, edgeC)){
            throw new TriangleException(edgeA, edgeB, edgeC);
        }
    }
    public void compareEdgeTriangle() throws TriangleException{
        if (!compareSumTwoEdgeWithOther(edgeA, edgeB, edgeC))
            throw new TriangleException(edgeA, edgeB, edgeC);
    }

    public double getedgeA() {
        return edgeA;
    }

    public void setedgeA(double edgeA) throws TriangleException{
        this.edgeA = edgeA;
    }

    public double getedgeC() {
        return edgeC;
    }

    public void setedgeC(double edgeC) throws TriangleException{
        this.edgeC = edgeC;
    }

    public double getedgeB() {
        return edgeB;
    }

    public void setedgeB(double edgeB) throws TriangleException{
        this.edgeB = edgeB;
    }

    public static void main(String[] args) {
        TriangleExample triangleExample;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter edge A: ");
            double edgeA = input.nextDouble();
            System.out.println("Enter edge B: ");
            double edgeB = input.nextDouble();
            System.out.println("Enter edge C: ");
            double edgeC = input.nextDouble();

            triangleExample = new TriangleExample(edgeA, edgeC, edgeB);

            System.out.println("Triangle ABC have edge A = " + edgeA +
                    ", edge B = " + edgeB + ", edge C = " + edgeC);

        }catch (TriangleException e){
            e.printStackTrace();
        }
    }
}
