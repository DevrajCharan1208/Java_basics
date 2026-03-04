class circle{
    double pi = 3.14;
    double radius;

    circle(double r){
        radius = r;
    }
    double area(){
        return pi*(radius*radius)*2;
    }
}

class square{
    double side;

    square(double s){
        side = s;
    }
    
    double area(){
        return side*side;
    }
}

class rectangle{
    double length;
    double width;

    rectangle(double l, double w){
        length = l;
        width = w;
    }

    double area(){
        return length*width;
    }
}

class cone{
    double pi = 3.14;
    double radius;
    double slantHeight;

    cone(double r, double l){
        radius = r;
        slantHeight = l;
    }

    double area(){
        return pi * radius * (radius + slantHeight);
    }
}

class triangle{
    double base;
    double height;

    triangle(double b, double h){
        base = b;
        height = h;
    }

    double area(){
        return 0.5 * base * height;
    }
}

class Assignment_2{
    public static void main(String args[]){
        circle c = new circle(10);
        double area;
        area = c.area();
        System.out.println("area of the circle is " + area);

        square s = new square(4);
        area = s.area();
        System.out.println("area of the square is " + area);

        rectangle r = new rectangle(5, 10);
        area = r.area();
        System.out.println("area of the rectangle is " + area);

        cone co = new cone(3, 5);
        area = co.area();
        System.out.println("area of the cone is " + area);

        triangle t = new triangle(10, 5);
        area = t.area();
        System.out.println("area of the triangle is " + area);
    }
}