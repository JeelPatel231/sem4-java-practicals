class Circle {
    
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        System.out.printf("Area of circle1 = %f\n",circle1.area());
    }
}
