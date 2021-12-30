public class Patient {
private String first_name, last_name, password, tc_number, date_of_birth, gender, city;

public Patient() {
	this.date_of_birth = null;
	this.first_name = null;
	this.last_name = null;
	this.tc_number = null;
}

public Patient(String new_first_name, String new_last_name, String new_tc_number,
		String new_date_of_birth, String new_password, String new_gender, String new_city) {
	this.first_name = new_first_name;
	this.last_name = new_last_name;
	this.tc_number = new_tc_number;
	this.date_of_birth = new_date_of_birth;
	this.password = new_password;
	this.gender = new_gender;
	this.city = new_city;
}

public int getAge() {//DD-MM-YYYY
	String yearOfBirthString = date_of_birth.substring(6, 10);
	int yearOfBirthInt = Integer.parseInt(yearOfBirthString);
	return 2021 - yearOfBirthInt;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getTc_number() {
	return tc_number;
}

public void setTc_number(String tc_number) {
	this.tc_number = tc_number;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public String getNational_idendity_number() {
	return tc_number;
}

public void setNational_idendity_number(String national_idendity_number) {
	this.tc_number = national_idendity_number;
}

public String getDate_of_birth() {
	return date_of_birth;
}

public void setDate_of_birth(String date_of_birth) {
	this.date_of_birth = date_of_birth;
}

public String toString() {
		return this.first_name + " " + this.last_name + " - TC NO: " + this.tc_number +
			   " - D.O.B: " + this.date_of_birth + " - Gender: " + this.gender + " - City: " + this.city
			   + "\n";
	}
}
