class Areacircle
{
      public static void main(String[] args){
      double r=20.5;
      double area = 22/7*r*r;
       System.out.println("area of circle::"+area);
       double circum = area3(13.5);
       System.out.println("the circumence ::"+circum);
       boolean b = oddEven(13);
       System.out.println("odd or even ::"+b);
      double f = fact(7);
      System.out.println("The factorial of num ::"+f);

       
     
}
static double area3(double r){
         double d = 2*3.14*r;
         return d;

      }

     static boolean oddEven(int n){
      if (n%2 == 0)
{
return true;
}else{
return false;
}
}
    static double fact(double f){
      double result = 1;
       for (int i = 1; i <= f; i++) {
           result = result * i;
           return result;
       }
}


}
}