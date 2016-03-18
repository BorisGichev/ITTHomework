package Task_01;

public class Demo {

	public static void main(String[] args) {
		Person[] room = new Person[10];

		Person kein = new Person("Kein", 18, true);
		Person moriz = new Person("Moriz", 17, true);

		Student boris = new Student("Boris", 26, true, 5.0);
		Student olga = new Student("Olga", 21, false, 5.5);

		Employee geran = new Employee("Geran", 31, true, 80.0);
		Employee pena = new Employee("Pena", 15, false, 60);

		room[0] = kein;
		room[1] = moriz;
		room[2] = boris;
		room[3] = olga;
		room[4] = geran;
		room[5] = pena;

		for (int person = 0; person < room.length; person++) {
			if (room[person] == null) {
				continue;
			}
			
			String className = room[person].getClass().toString();
			
			//I can use temp objects to access the methods
			if (className.contains("Person")) {
				room[person].showPersonInfo();

			}
			if (className.contains("Student")) {
				Student temp=(Student) room[person];
				temp.showStudentInfo();

			}
			if (className.contains("Employee")) {
				Employee temp=(Employee) room[person];
				temp.showEmployeeInfo();

			}
			
			// Or just use the override method of the class Person
						room[person].showPersonInfo();

		}

		for (int person = 0; person < room.length; person++) {
			if (room[person] == null) {
				continue;
			}

			String className = room[person].getClass().toString();

			// Here i use temp object so that i can access the methods of employee
			if (className.contains("Employee")) {
				Employee temp=(Employee) room[person];
				System.out.println(temp.getName()+" has worked overtime and he must me paid "+temp.calclateOvertime(2));

			}

		}

	}

}
