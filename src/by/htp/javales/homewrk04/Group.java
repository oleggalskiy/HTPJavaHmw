package by.htp.javales.homewrk04;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private int idGroup;
	private List<Student> stdGroup = new ArrayList<Student>();
	private double ratingGroup;

	public Group() {
		idGroup = 0;
		stdGroup = null;
		ratingGroup = 0;
	}

	public Group(int idGroup) {

		this.idGroup = idGroup;
		this.ratingGroup = 0;
	}

	public int getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public List<Student> getStdGroup() {
		return stdGroup;
	}

	public void setStdGroup(List<Student> stdGroup) {
		this.stdGroup = stdGroup;
	}

	public void addToGroup(Student stud) {
		stdGroup.add(stud);
	}

	public double getRatingGroup() {
		return ratingGroup;
	}

	public void setRatingGroup(double ratingGroup) {
		this.ratingGroup = ratingGroup;
	}

	public double findRating() {						// метод который вычисляет средник бал студентов группы
		double tmpRatingGroup = 0;

		for (Student tmpStd : stdGroup) {

			tmpRatingGroup = tmpRatingGroup + tmpStd.getSesRating();
		}

		ratingGroup = tmpRatingGroup / stdGroup.size();
		return ratingGroup;
	}

	public void printGroup() {			// метод выводящий список всех студентов входящих в группу
		System.out.println();
		System.out.println("Список группы: "+ this.idGroup);
		for (Student tmpStd : stdGroup) {
			tmpStd.printStudent(tmpStd);
		}
	}

	public void findHonorStuds() {  // метод который ищет количество отличников и двоечников группы
		int count = 0;
		int count1 = 0;
		for (Student tmpStd : stdGroup) {
			if (tmpStd.getSesRating() == 5.0) {
				count++;
			}
			if (tmpStd.getSesRating() == 2.0) {
				count1++;
			}

		}
		System.out.println("Количество отличников в группе "+this.getIdGroup()+" := "+ count);
		System.out.println("Количество студентов имеющих 2 в группе "+this.getIdGroup()+" := "+ count1);
		System.out.println();
	}
}
