package simple_formal_project_11;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> hashMap = new HashMap<>();
		for(Student student: students){
			hashMap.put(new Key(student.getFirstName(), student.getLastName()), student);
		}
		//implement
		return hashMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		double averageGpa = 0;
		for(Map.Entry<Key, Student> entry: maps.entrySet()){
			averageGpa += entry.getValue().getGpa();
		}
		return averageGpa/maps.size();
}
}
