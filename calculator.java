class Calculator{
          public int add(int a,int b){
                    int c=a+b;
                    return c;
          }
          public int sub(int d,int e){
                    int f=d-e;
                    return f;
          }
          public int multiply(int x,int y){
                    int z=x*y;
                    return z;
          }
          public int divide(int g,int h){
                    int i=g/h;
                    return i;
          }
}
class Result{
          public static void main(String[] args){
                    Calculator ans=new Calculator();
                    Scanner sc=new Scanner(System.in);
                    System.out.print("Give me two integers : ");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("Press 1 for 'Addition'\n Press 2 for 'Subtraction'\n Press 3 for 'multiplication' \n Press 4 for 'Division' ");
                    int result1=ans.add(a, b);
                    int result2=ans.sub(a, b);
                    int result3=ans.multiply(a, b);
                    int result4=ans.divide(a, b);
                    int can;
                    can=sc.nextInt();
                    switch(can){
                              case 1:
                              System.out.print("Addition :");
                              System.out.println(result1);
                              break;
                              case 2:
                              System.out.print("Subtractions : ");
                              System.out.println(result2);
                              break;
                              case 3:
                              System.out.print("Multiplication : ");
                              System.out.println(result3);
                              break;
                              case 4:
                              System.out.print("Division : ");
                              System.out.println(result4);
                              break;
                              default:
                              System.out.println("There is no such case.");
                              break;
                    }
          }
}
