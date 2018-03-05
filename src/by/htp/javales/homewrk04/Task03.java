package by.htp.javales.homewrk04;

public class Task03 {

	public static void main(String[] args) {
	NoteBook notebook1 = new NoteBook();
	
	notebook1.addNote(new Note(1, "Первая запись"));
	notebook1.addNote(new Note(2, "Вторая запись"));
	notebook1.addNote(new Note(3, "Hello world"));
	notebook1.addNote(new Note(4, "Hello World"));
	
	notebook1.findNote("Hello"); // ищем Note с определенным текстом и выводим в консоль
	notebook1.printNoteBook(); // выводим все записи в записной книжке

	}

}
