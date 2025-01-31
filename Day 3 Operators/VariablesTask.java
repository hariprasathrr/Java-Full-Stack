public class VariablesTask{

public static void main(String args[]){

String name = "Hariprasath"; //Local Variables //Initialization
System.out.println("Local Variable:" + name);

//create object to access the age
//syntax classname obj=new classname();
VariablesTask obj =new VariablesTask();
System.out.println("Instance Variable:" +obj.age);
System.out.println("Instance Variable:" +obj.subjectMark);
System.out.println("Instance Variable:" +obj.course);

//static var

       System.out.println("Static variable:" + VariablesTask.firstAlphabet);
        System.out.println("Static variable:" + firstAlphabet);
      System.out.println("Static variable:" + obj.firstAlphabet);

//Final Keyword
   System.out.println("Final keyword:" + obj.percent);
   }
byte age=25; //Instance or Global or Non Static
float subjectMark=50.5f;
String course="Java Full Stack";

static char firstAlphabet='A';   //class level var

final byte percent=100;   //constant


int c = 10;
System.out.println("Tenary : " + ((c < 5) ? "C: not less than 5" : ((c >=10) ? "c: equal to or great than 10" : "No condition")));
}


