package entities;

public class Rettangolo {
    private int width;
    private int height;
    private int perimeter;
    private int area;
    public Rettangolo(int width, int height){
        this.width = width;
        this.height= height;
   this.area = this.width*this.height;
   this.perimeter =2*this.width+2*this.height;

    }


    /*SETTER*/
    public void setWidth(int width){
        if(width>0){

        this.width = width;
        }else {
            System.out.println("il rettangolo deve avere una larghezza maggiore di 0");
        }
    }public void setHeight(int height){
        if(height>0){

            this.height = height;
        }else {
            System.out.println("il rettangolo deve avere una larghezza maggiore di 0");
        }
    }
    /*
    public int setPerimeter()
    {
        return  2*this.width+2*this.height;
    }
    public int setArea()
    {
       return this.width*this.height;
    }
    */

    /*GETTER*/
    public int getArea(){return this.area;};
    public int getPerimeter(){return this.perimeter;};
}
