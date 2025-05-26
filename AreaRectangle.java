class AreaRectangle{
    double length;
    double breadth;
    double area(){
        return length*breadth;
    }
    double parameter(){
        return 2*(length+breadth);
    }
    public static void main(String[] args) {
        AreaRectangle ar=new AreaRectangle();
        ar.length=10;
        ar.breadth=5;
        System.out.println("Area is :"+ar.area()+"parameter is"+ar.parameter());;
    }
}