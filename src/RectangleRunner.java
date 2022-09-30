public class RectangleRunner {
    public static void main(String[] args){
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        System.out.println("plot1 Length: " + plot1.getLength());
        System.out.println("plot1 Width: " + plot1.getWidth());
        System.out.println("plot1 Area: " + plot1.calculateArea());
        System.out.println();
        System.out.println("plot2 Length: " + plot2.getLength());
        System.out.println("plot2 Width: " + plot2.getWidth());
        System.out.println("plot2 Area: " + plot2.calculateArea());
        System.out.println();
        System.out.println("plot3 Length: " + plot3.getLength());
        System.out.println("plot3 Width: " + plot3.getWidth());
        System.out.println("plot3 Area: " + plot3.calculateArea());
        System.out.println();

        plot1.setWidth(75);
        plot2.setLength(75);
        plot2.setWidth(75);
        plot3.setWidth(75);

        System.out.println("plot1 Length: " + plot1.getLength());
        System.out.println("plot1 Width: " + plot1.getWidth());
        System.out.println("plot1 Area: " + plot1.calculateArea());
        System.out.println();
        System.out.println("plot2 Length: " + plot2.getLength());
        System.out.println("plot2 Width: " + plot2.getWidth());
        System.out.println("plot2 Area: " + plot2.calculateArea());
        System.out.println();
        System.out.println("plot3 Length: " + plot3.getLength());
        System.out.println("plot3 Width: " + plot3.getWidth());
        System.out.println("plot3 Area: " + plot3.calculateArea());
        System.out.println();

        int totalArea = plot1.calculateArea() + plot2.calculateArea() + plot3.calculateArea();
        System.out.println("These three plots requires " + totalArea + " square feet of sand");
    }
}
