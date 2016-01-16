package all.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co_name.model.Coname;
import co_name.model.ConameHibernateDAO;

public class init {

	public static void main(String[] args) throws IOException {
		// 存成coname表
		String co_name = "co_name.csv";
		BufferedReader br = null;
		String line = "";
		ConameHibernateDAO init_co_name = new ConameHibernateDAO();
		try {
			br = new BufferedReader(new FileReader(co_name));
			while ((line = br.readLine()) != null) {
				//處理bom
				if (line.startsWith(String.valueOf('\ufeff'))
						|| line.startsWith(String.valueOf('\ufffe'))) {
					line = line.substring(1);
				}
				// List<String> list = new ArrayList<String>();
				String[] array = line.split(",");
				// list.add(array[1]);
				// list.add(array[2]);
				String aa = array[0];
				System.out.println("array[0]是" + array[0]);
				for (int x = 0; x < aa.length(); x++) {
					System.out
							.println(aa.charAt(x) + "  " + (int) aa.charAt(x));
				}

				Long co = Long.parseLong(aa);
				Coname Coname = new Coname(1, array[1]);
				init_co_name.save(Coname);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
