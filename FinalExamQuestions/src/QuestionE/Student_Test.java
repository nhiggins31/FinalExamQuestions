package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Nicole", "Alexandra", "Higgins", dBirthDate, "107 Smyth Court", "123-456-7890", "nhiggins@udel.edu","MIS");
		Student stu3 = new Student("Erin", "Elizabeth", "Hagan", dBirthDate, "123 Royal Court", "612-458-1689", "ehagan@udel.edu","MIS");
		Student stu4 = new Student("Raquel", "Marie", "McLean", dBirthDate, "78 Steers Lane", "782-983-0064", "rmclean@udel.edu","MIS");
		Student stu5 = new Student("Samantha", "Ann", "Davis", dBirthDate, "42 RoundAbout Circle", "302-444-7911", "sdavis@udel.edu","MIS");
		assertTrue(5==5);
	}

}
