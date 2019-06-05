package zoku.sample.spring;

import java.util.Date;

public interface SampleBeanInterface {

	public abstract Date getDate();

	public abstract String getMessage();

	public abstract void setMessage(String message);

}