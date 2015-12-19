package QuestionE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	
	HashMap<String, Student> students = new HashMap<String, Student>();
	Student s1 = new Student("Bert", "Biology", 19);
	Student s2 = new Student("Brian", "Chemistry", 20);
	Student s3 = new Student("Tom", "Biology", 20);

	//Get student from name (key)
	public Student getFromKey(String key) {
	    return students.get(key);
	}
}
