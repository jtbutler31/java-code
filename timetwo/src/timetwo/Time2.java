package timetwo;

public class Time2 {
	/*private int hour;
	private int minute;
	private int second;*/
	private int totalSeconds;
	
	
	public Time2() {this(0, 0, 0);}
	public Time2(int hour) {this(hour, 0, 0);}
	public Time2(int hour, int minute) {this(hour, minute, 0);}
	
	// Time2 constructor: hour, minute and second supplied
	public Time2(int hour, int minute, int second) {
		if(hour<0||hour>=24)
			throw new IllegalArgumentException("hour must be 0-23");
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
			
		}
	
	
	//public Time2(Time2 time) {this(time.getHour(), time.getMinute(), time.getSecond());}
	

public void setHour(int hour) {
	if (hour < 0 || hour >= 24)
		throw new IllegalArgumentException("hour must be 0-23");
	
	this.totalSeconds = hour*3600 + totalSeconds;
	}

public void setMinute(int minute) {
	if (minute < 0 || minute >= 60)
		throw new IllegalArgumentException("minute must be 0-59");
	
	this.totalSeconds = minute *60 + totalSeconds;
	}

public void setSecond(int second) {
	if (second < 0 || second >= 60)
		throw new IllegalArgumentException("second must be 0-59");
	
	this.totalSeconds = second + totalSeconds;
	}


public int getTotalSeconds() {return totalSeconds;}

/*public int getHour() {return hour;}

public int getMinute() {return minute;}

public int getSecond() {return second;}*/

public String toString() {
	
	return String.format("%d", getTotalSeconds());
}

}

