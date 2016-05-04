package all.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import regis.model.Votesystem;
import regis.model.dao.VotesystemHibernateDAO;

public class Init {

	public static void main(String[] args) throws IOException {
		File in = new File("voteFinal.csv");
		BufferedReader br = null;
		String line = "";
		int count = 0;
		VotesystemHibernateDAO init_votesystem = new VotesystemHibernateDAO();
		try {
			br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(in), "UTF8"));
			while ((line = br.readLine()) != null) {
				if (line.startsWith(String.valueOf('\ufeff'))
						|| line.startsWith(String.valueOf('\ufffe'))) {
					line = line.substring(1);
				}
				String[] array = line.split(",");
				String aa = array[0];
				Long co = Long.parseLong(aa);
				int foo = Integer.parseInt(array[5]);
				Votesystem Votesystem = new Votesystem(co,array[1],array[2],array[3],array[4],foo,array[6]);
				init_votesystem.save(Votesystem);
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
					System.out.println("搬移完畢！，共有"+count+"筆");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
