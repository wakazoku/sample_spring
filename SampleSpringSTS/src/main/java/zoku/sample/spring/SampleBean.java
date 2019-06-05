package zoku.sample.spring;

import java.util.Calendar;
import java.util.Date;

public class SampleBean implements SampleBeanInterface {
	private Date date;
	private String message;

	public SampleBean() {
		super();
		this.date = Calendar.getInstance().getTime();
	}

	public SampleBean(String message) {
		this();
		this.message = message;
	}

	@Override
	public Date getDate() {
		return date;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SampleBeans [ messsage " + message + ", date " + date + "]";
	}

}
