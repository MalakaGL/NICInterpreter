package malaka.cse.maven;
import malaka.cse.maven.exception.InvalidNICException;
import org.joda.time.*;

public class NICInterpreter {

	
	public static NICProp createNICProp(String nicNumber) throws InvalidNICException {
		String gender = "";
		boolean isVoter;
		DateTime today = new DateTime();
		int year,numOfDays;
		
		try {      
			year = 1900+Integer.parseInt(nicNumber.substring(0,2));
			numOfDays = Integer.parseInt(nicNumber.substring(2,5));
			
			if(numOfDays>=500){
				gender += "Female";
				numOfDays -= 500;
			}else{
				gender += "Male";
			}
			
			DateTime dateTime = new DateTime(2012,1,1,0,0,0);
			dateTime = dateTime.plusDays(numOfDays-1);
			int month=dateTime.getMonthOfYear();
			int day = dateTime.getDayOfMonth();
			DateTime birthDay = new DateTime(year,month,day,0,0,0);
			
			
			if ((birthDay.plusYears(18)).compareTo(today)<0){
				isVoter=true;
			}
			else{
				isVoter=false;
			}
			return new NICProp( birthDay , gender, isVoter ,year);
		} catch(Exception ex) {
			throw new InvalidNICException();
		}
	}
}
