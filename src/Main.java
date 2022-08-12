
public class Main {

	public static void main(String[] args) {


		Student student1=new Student();
		student1.firstName="Yılmaz";
		student1.lastName="Bulut";
		student1.lessonsLearned="Java / React";
		
		Insructor instructor1=new Insructor();
		instructor1.firstName="Engin";
		instructor1.lastName="Demiroğ";
		instructor1.setLessonsTaught("C# / Angular");
		
		StudentManager studentManager1=new StudentManager();
		studentManager1.watchLesson(student1);
		studentManager1.signOut(student1);
		
		InsructorManager insructorManager1=new InsructorManager();
		insructorManager1.signOut(instructor1);
		insructorManager1.uploadLessons(instructor1);
		
		

		System.out.println("ogrenci adi: "+student1.firstName);
		System.out.println(instructor1.getLessonsTaught());
	}

}
