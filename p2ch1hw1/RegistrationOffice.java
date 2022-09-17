package p2ch1hw1;

import java.util.Date;

public class RegistrationOffice {

	public Student getAStudent() {
		Student student = null;
		int a = (int) (6 * Math.random());

		switch (a) {
		case 0:
			student = new Student(120715, "Betül", 2015, new Date(), "Mathematics");
			break;
		case 1:
			student = new UnderGraduateStudent(789522, "Serdar", 2015, new Date(), "History", " ");
			break;
		case 2:
			student = new VocationalStudent(355688, "Derya", 2010, new Date(), "Sociology");
			break;
		case 3:
			student = new GraduateStudent(756954, "Volkan", 2014, "Data Science", new Date(), "Data Mining", "Prof. ilik");
			break;
		case 4:
			student = new PhdStudent(965741, "Özge", 2009, new Date(),"Industrial Engineering", "Prof. Özcan", " ", false);
			break;
		case 5:
			student = new MasterStudent(185269, "Buse", 2019, "Economics", new Date(), "Prof. Demirtaş", "Word Country");
			break;
		}

		return student;

	}

	public void registerStudent(Student student) {

		if (student instanceof PhdStudent) {
			PhdStudent phdStudent = (PhdStudent) student;
			if (phdStudent.qualifyingExamTaken) {
				phdStudent.register();
				phdStudent.study();
				phdStudent.meetWithAdvisor();
				phdStudent.writeThesis();
				phdStudent.writePaper();

			} else {
				System.out.println("Registration is not completed for PHD student " + phdStudent.getName()
						+ " because  s/he couldn't complete the 'Qualifying Exam' successfully. ");
			}
		}

		else if (student instanceof MasterStudent) {
			MasterStudent masterStudent = (MasterStudent) student;
			masterStudent.register();
			masterStudent.study();
			masterStudent.meetWithAdvisor();
			masterStudent.writeThesis();

		} else if (student instanceof GraduateStudent) {
			GraduateStudent graduateStudent = (GraduateStudent) student;
			graduateStudent.register();
			graduateStudent.study();
			graduateStudent.meetWithAdvisor();
			graduateStudent.writeThesis();

		} else if (student instanceof UnderGraduateStudent) {
			UnderGraduateStudent underGraduate = (UnderGraduateStudent) student;

			underGraduate.register();
			underGraduate.study();
			
		} else if (student instanceof VocationalStudent) {
			VocationalStudent vocationalStudent = (VocationalStudent) student;

			vocationalStudent.register();
			vocationalStudent.study();
			
		} else if (student instanceof Student) {
			student.register();
			student.study();

		}
}
}