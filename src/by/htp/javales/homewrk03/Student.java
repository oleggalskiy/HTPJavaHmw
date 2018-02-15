package by.htp.javales.homewrk03;


public class Student {

	public int id;
	private String secondName;
	private String name;
	private String patronymic;
	private String dateOfBirth;
	private String address;
	private String phoneNumb;
	private String faculty;
	private int course;

	public Student() {
	}

	public Student(int id, String name, String secondName, String patronymic, String dateOfBirth, String adress,
			String phoneNumb, String faculty, int course) {
		this.id = id;
		this.name = name;
		this.secondName = secondName;
		this.patronymic = patronymic;
		this.dateOfBirth = dateOfBirth;
		this.address = adress;
		this.phoneNumb = phoneNumb;
		this.faculty = faculty;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return address;
	}

	public void setAdress(String address) {
		this.address = address;
	}

	public String getPhoneNumb() {
		return phoneNumb;
	}

	public void setPhoneNumb(String phoneNumb) {
		this.phoneNumb = phoneNumb;
	}
	
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	

	public void show() {
		System.out.println("---------------------------------------");
		System.out.println("| ID: " + this.id);
		System.out.println("| Name: " + this.name);
		System.out.println("| Second Name: " + this.secondName);
		System.out.println("| Patronymic: " + this.patronymic);
		System.out.println("---------------------------------------");
		System.out.println("| DOB: " + this.dateOfBirth);
		System.out.println("| Address: " + this.address);
		System.out.println("| Phone Number: " + this.phoneNumb);
		System.out.println("| Faculty: " + this.faculty);
		System.out.println("| Course: " + this.course);
		System.out.println("---------------------------------------");
	}

}
