package quan.dev;

import quan.dev.models.Person;

public class MainApp {
	public static void main(String[] args) {
		final String arrName[] = {"Quan" , "Quann", "Quannn", "Quannnn"};
		final int arrAge [] = {16, 17, 18, 19};
		
		Person arrPerson[] = new Person[arrName.length];
		for(int i=0; i <  arrPerson.length ; i++) {
			Person p =new Person (arrName[i], arrAge[i]);
			arrPerson[i]=p;
		}
			for (int i=0; i < arrPerson.length;i++) {
			  arrPerson[i].show();
	}
}
}
