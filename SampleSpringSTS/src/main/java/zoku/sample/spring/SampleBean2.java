package zoku.sample.spring;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SampleBean2 implements SampleBeanInterface {
	private String message = "Hello!";
	private Date date = Calendar.getInstance().getTime();

	@Override
	public Date getDate() {
		// TODO 自動生成されたメソッド・スタブ
		return date;
	}

	@Override
	public String getMessage() {
		// TODO 自動生成されたメソッド・スタブ
		return message;
	}

	@Override
	public void setMessage(String message) {
		// TODO 自動生成されたメソッド・スタブ
		this.message = message;

	}

	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return "" + message + "'(" + format.format(date) + ")";

	}

}
