package malaka.cse.maven;

import org.joda.time.*;

public class NICProp {
	DateTime dateTime = new DateTime();
	String gender = "";
	boolean isVoter ;
        int year;
	
	public NICProp(DateTime date, String Gender, Boolean IsVoter, int Year) {
		super();
		dateTime = date;
		gender += Gender;
		isVoter = IsVoter;
                year = Year;
	}

	public String getDate() {
		String birthDay = year +"-"+dateTime.getMonthOfYear()+"-"+dateTime.getDayOfMonth();
		return birthDay;
	}

	public String getGender() {
		return gender;
	}
	
	public String isVoter(){
            if (isVoter)
		return "Yes";
            else
                return "No";
	}
	
}
