import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Sandbox {
  public static void main(String[] args) throws ParseException {

    System.out.println("My name is Amigo");
    System.out.println();
    text();
    System.out.println();
    System.out.println("Kiss my shiny metal ass!");
    for (int i = 0; i < 7; i++)
      text2();

    System.out.println(min(12, 33));
    System.out.println( min(1,2,3) );
    System.out.println( min(-20, -10, -30, -40) );
    System.out.println( min(-20, -10, -30, 40) );
    print3("window");
    print3(" file");

   /* Write a program that displays your date of birth as follows: MAY 1 2012*/

   /* Calendar birthday = Calendar.getInstance();
    birthday.set(1987, 6, 25);
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy");
    System.out.println(dateFormat.format(birthday.getTime()).toUpperCase());*/

    /* Write a program that displays your date of birth as follows: MAY 1 2012* Input from keyboard*/
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
    Scanner sc = new Scanner(System.in);
    System.out.println("Example: 12-25-2103");
    System.out.print("Enter date: ");
    String str = sc.nextLine();

    try {
      java.util.Date date = dateFormat.parse(str);
      dateFormat = new SimpleDateFormat("MMMM d yyyy");
      System.out.println(dateFormat.format(date.getTime()).toUpperCase());
    } catch (ParseException e) {
      System.out.println("Parse Exception");
    }





  }



  public static void text() {
    String[] year = {"first", "second", "third", "fourth", "fifth"};
    int[] salary = new int[5];
    salary[0] = 60000;
    for (int i = 1; i < 5; i++) salary[i] = salary[i - 1] + 20000;
    for (int i = 0; i < 5; i++)
      System.out.println("My salary for the " + year[i] + " year will be $" + salary[i]);
  }

  public static void text2(){
    System.out.println("It's kind of fun to do the impossible.");
  }

  public static int min(int a, int b){
    int min;
    if (a <= b)
      min = a;
    else min = b;
    return min;

  }

  public static int min(int a, int b, int c){
    int min;
    if (a <= b)
      min = a;
    else min = b;
    if (min <= c)
      min = min;
    else min = c;
    return min;
  }

  public static int min(int a, int b, int c, int d){
    int min;
    if (min(a,b) <= c)
      min = min(a,b);
    else min = c;
    if (min <= d)
      min = min;
    else min = d;
    return min;
  }

  public static int max(int a, int b){
    int max;
    if (a >= b)
      max = a;
    else max = b;
    return max;

  }
  /* Text display
  Write a function that displays the passed string (word) three times in the same line.
      Words must be separated by a space and don’t have to merge into one.
  */
  public static void print3(String s)
  {
    for (int i = 0; i < 2; i++) {
      s = s.trim(); //удаляет пустые символы в начале/конце строки
      System.out.print(s + " ");
    }
    System.out.println(s);

  }

}



