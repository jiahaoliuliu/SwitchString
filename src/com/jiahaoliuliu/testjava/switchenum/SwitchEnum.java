package com.jiahaoliuliu.testjava.switchenum;

public class SwitchEnum {

	public enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, NOVALUE;
		
		public static Day toDay(String str) {
			try {
				return valueOf(str);
			} catch (Exception ex) {
				return NOVALUE;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String today = "wednesday";
		switch (Day.toDay(today.toUpperCase())) {
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;
		case THURSDAY:
			System.out.println("Thursday");
			break;
		case FRIDAY:
			System.out.println("Friday");
			break;
		case SATURDAY:
			System.out.println("Saturday");
			break;
		case SUNDAY:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Not an earch day " + today);
			break;
		}
	}
}
