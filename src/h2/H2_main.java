package h2;


public class H2_main {
    public static void main(String[] args){
        boolean x=false;
        boolean y=false;
        boolean a=false;
        boolean b=false;
        boolean c=false;
        int input=10;
        switch(input){
            case 1:
                y=true;
                break;
            case 10:
                x=true;
                break;
            case 11:
                x=true;
                y=true;
                break;
            default:
                x=false;
                y=false;
                break;
        }
        if(x==true && y==true){
            a=true;
        }
        else{
            a=false;
        }
        if(x==true||y!=x){
            b=true;
        }
        else{
            b=false;

        }
        if(x==true&&y==false||x==false&&y==false){
            c=true;
        }
        else{
            c=false;
        }
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

