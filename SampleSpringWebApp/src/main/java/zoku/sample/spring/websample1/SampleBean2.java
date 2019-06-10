package zoku.sample.spring.websample1;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleBean2 {
	@Autowired
	private SampleBean bean;
	private Date date;

	public SampleBean2() {
		super();
		date = Calendar.getInstance().getTime();
	}

	public SampleBean getBean() {
		return bean;
	}

	public void setBean(SampleBean bean) {
		this.bean = bean;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "SampleBean2 (" + date + ");\n" + bean + "\n--end";
	}

}
