package src.OPPS;


    class A{
        int a;
        A(){
            System.out.println("class A constructor: ");
        }
        void display(){
            System.out.println("class A display: ");
        }
    }
    class B extends A {
        //super.display(); error use super only in method and constructor
        B(int b){
            super.a=b;
            System.out.println("class B constructor: ");
        }

        void display(){

            System.out.println("class B display: "+a);

        }
    }
    class Constructor{
        public static void main(String[] args){
            B b = new B(5);
            b.display();
        }
    }

