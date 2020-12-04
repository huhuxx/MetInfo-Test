package listener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import utils.MailUtil;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class JavaMailTestListener extends TestListenerAdapter {
	@Override
	public void onFinish(ITestContext t) {
		// 1������freeMarker����ʵ��
		String path = "D:\\eclipse\\practical\\src\\fm";
		String name ="";
		String result= "";
		Configuration configuration = new Configuration();
		try {
			// 2,��ȡģ��·��
			configuration.setDirectoryForTemplateLoading(new File(path));
			// 3,����ģ���ļ�
			Template template = configuration.getTemplate("/freemarker.ftl");
			// 4,��������
			// ��ӡ�����еĲ���������Ŀ
			ITestNGMethod[] methods = this.getAllTestMethods();
			int num1=methods.length;
			System.out.println("һ��ִ���ˣ�" + methods.length);
			List<Map> maps=new ArrayList<Map>();
			// ʧ�ܵĲ����������ƺ���Ŀ
			List<ITestResult> failList = this.getFailedTests();
			int len = failList.size();
			System.out.println("ʧ�ܵĲ���������" + len);
			for (int i = 0; i < len; i++) {
				ITestResult tr = failList.get(i);
				name=tr.getName();
				result="false";
				Map<String, String> p1=new HashMap<String, String>();
				p1.put("name", name);
				p1.put("result",result);
				maps.add(p1);
			}
			// �ɹ��Ĳ����������ƺ���Ŀ
			List<ITestResult> passList = this.getPassedTests();
			int len1 = passList.size();
			System.out.println("�ɹ��Ĳ���������" + len1);
			for (int i = 0; i < len1; i++) {
				ITestResult tr1 = passList.get(i);
				name=tr1.getName();
				result="true";
				Map<String, String> p2=new HashMap<String, String>();
				p2.put("name", name);
				p2.put("result",result);
				maps.add(p2);
			}
			Map<String, Object> context=new HashMap<String, Object>();
			context.put("num1", num1);
			context.put("len",len);
			context.put("len1",len1);
			context.put("maps", maps);
	    	context.put("cur_time",new Date().toString());
	    	context.put("ceshi", "�����");
			// 5���������
			Writer out = new FileWriter(path + "/freemarker.html");
			template.process(context, out);
			System.out.println("ת���ɹ�");
			try {
				MailUtil.Mail();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
