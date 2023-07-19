  import java.util.Scanner;

  abstract class Arithmetic
  {
    int a,b,c;

    Scanner sc=new Scanner(System.in);

    void get_ab()
    {
      System.out.print("enter the value for a = ");
      a=sc.nextInt();
            System.out.print("enter the value for b = ");
      b=sc.nextInt();
    }
          abstract int calc(int a,int b);
    void display_c()
    {
            System.out.println("c="+c);
    }
  }

  class Addition extends Arithmetic
  {
      int calc(int a,int b)
      {
        System.out.println("Addition of a and b");
        c=a+b;
        return c;
      }
  }
  class Subtraction extends Arithmetic
  { 
      int calc(int a,int b)
      {
        System.out.println("Subtraction of a and b");
        c=a-b;
        return c;
      }
  }
  class Multiplication extends Arithmetic
  {
      int calc(int a,int b)
      {
      System.out.println("Multiplication of a and b");
        c=a*b;
        return c;
      }
  }
  class Division extends Arithmetic
  {
    int calc(int a,int b)
      {
        System.out.println("Division of a and b");
        c=a/b;
        return c;
      }
  }

  class Main
  {
    public static void main(String args[])
    {
      Arithmetic ar;

      Addition a= new Addition();
      ar=a;
      ar.get_ab();
      ar.calc(ar.a,ar.b); 
      ar.display_c();


      /*a.get_ab();
      a.calc(ar.a,ar.b); 
      a.display_c();*/

      Subtraction s= new Subtraction();
      ar=s;
      ar.get_ab();
      ar.calc(ar.a,ar.b); 
      ar.display_c();

      /*s.get_ab(); 
      s.calc(s.a,s.b);
      s.display_c();*/

      Multiplication m= new Multiplication();
      ar=m;
      ar.get_ab();
      ar.calc(ar.a,ar.b); 
      ar.display_c();


      /*m.get_ab(); 
      m.calc(m.a,m.b);
      m.display_c();*/


      Division d= new Division();
      ar=d;
      ar.get_ab();
      ar.calc(ar.a,ar.b); 
      ar.display_c();


      /*d.get_ab(); 
      d.calc(d.a,d.b);
      d.display_c();*/

      
    }
  }
