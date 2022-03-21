class Rectangle{
    double width;
    double height;

    // default no-arg constructor
    Rectangle(){
        this.width = 10;
        this.height = 10;
    }

    // constructors with parameters
    Rectangle(double height, double width){
        this.width = width;
        this.height = height;
    }

    double getArea(){
        return this.width*this.height;
    }

    double getPerimeter(){
        return 2*(this.height+this.width);
    }

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        System.out.printf("area of rect1 = %f\n",rect1.getArea());
        System.out.printf("perimeter of rect1 = %f\n", rect1.getPerimeter());
        
        Rectangle rect2 = new Rectangle(30,50);
        System.out.printf("area of rect2 = %f\n",rect2.getArea());
        System.out.printf("area of rect2 = %f\n",rect2.getPerimeter());
        
    }

}