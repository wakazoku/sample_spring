package zoku.sample.spring;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SampleBean {
	private List<String> messages = new ArrayList<String>();

	public SampleBean() {
		super();
		messages.add("this is Bean sample");
	}

	public void addMessage(String message) {
		messages.add(message);
	}

	public String getMessage(int n) {
		return messages.get(n);
	}

	public void setMessage(int n, String message) {
		messages.set(n, message);
	}

	public List<String> getMessage() {
		return messages;
	}

	public void setMessage(List<String> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		String result = "SampleBean [\n";
		for (String message : messages) {
			result += "\t" + message + "\n";
		}
		result += "]";
		return result;
	}

}
