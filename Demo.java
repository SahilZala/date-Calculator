class DateCalc{
	int day,month,year;
	
	public void dateCalc(int d,int m,int y)
	{
//		String months[] = {
//				"jan",
//				"feb",
//				"mar",
//				"apr",
//				"may",
//				"jun",
//				"jul",
//				"aug",
//				"sep",
//				"oct",
//				"nov",
//				"dec"
//		};
//		
		int count[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		

		int temp = 0;
		int dd = 0;

		temp = count[m-1] - d;
		dd = 21 - temp;
		
		if(dd>0)
		{
			this.day = dd;
			int mm = m + 1;
			if(mm>12)
			{
				y++;
				this.month = 1;
				this.year = y;
			}
			else
			{
				this.month = mm;
				this.year = y;
			
			}
		}
		else
		{
			this.day = 21+d;
			this.year = y;
			this.month = m;
		}
		
		System.out.println("d="+this.day);
		System.out.println("m="+this.month);
		System.out.println("y="+this.year);
	}
	
	int getDay()
	{
		return day;
	}
	int getMonth()
	{
		return month;
	}
	int getYear()
	{
		return year;
	}
}

class Demo{
	public static void main(String args[])
	{
		DateCalc dc = new DateCalc();
		dc.dateCalc(11, 12, 2020);
	}
}