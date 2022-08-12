
public class Insructor extends User{
	
	private String lessonsTaught;
	
	public Insructor() {
		
	}
	
	public Insructor(String lessonsTaught) {
		
		this.lessonsTaught = lessonsTaught;
	}
	
	public String getLessonsTaught() {
		return lessonsTaught;
	}

	public void setLessonsTaught(String lessonsTaught) {
		this.lessonsTaught = lessonsTaught;
	}

}
