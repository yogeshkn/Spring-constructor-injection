import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	
	
	public static void main(String[] args) {
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory  = new XmlBeanFactory(res);
		
		Object o = factory.getBean("id1");
		Demobean db = (Demobean) o;
		db.show();
		
		
		
	}

}
