package all.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class End {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		File file = new File("votefinal.csv");
		try {
			BufferedReader br = new BufferedReader(
									new InputStreamReader(
										new FileInputStream(file),"BIG5"));
			String line = null;
			int count = 0;
			Map<String,List<String>> map = new LinkedHashMap<>(); 
			while ((line=br.readLine()) != null) {
				count++;
				String split[] = line.split(",");
				List<String> target = map.get(split[4]);
				if (target == null) {
					List<String> nl = new ArrayList<>();
					nl.add(split[1]);
					nl.add(split[5]);
					map.put(split[4],nl);
				} else {
					target.add(split[1]);
					target.add(split[5]);
				}
			}
			System.out.println("全部讀取完畢，讀入筆數="  + count);
			File ofile = new File("C:\\Users\\tim\\Desktop\\voteOut.csv");
			PrintWriter out = new PrintWriter(
					            new OutputStreamWriter(
					               new FileOutputStream(ofile), "BIG5"));
			StringBuilder sb = new StringBuilder();
			double avg = 0,sum = 0;
			int ct85 = 0;
			out.println("計畫名稱,評審A,評審B,評審C,平均分數,總分,超過85分以上的有幾個");
			Set<String> set= map.keySet();
			for (String name : set) {
				List<String> ls= map.get(name);
				sb.setLength(0);
				sb.append(name+",");
				sb.append(ls.get(1)+"("+ls.get(0)+"),"+ls.get(3)+"("+ls.get(2)+"),"+ls.get(5)+"("+ls.get(4)+"),");
				sum = (Integer.parseInt(ls.get(1))+Integer.parseInt(ls.get(3))+Integer.parseInt(ls.get(5)));
				avg = sum/3;
				sb.append(avg+",");
				sb.append(sum+",");
				if (Integer.parseInt(ls.get(1)) > 85) {
					ct85++;
				}
				if (Integer.parseInt(ls.get(3)) > 85) {
					ct85++;
				}
				if (Integer.parseInt(ls.get(5)) > 85) {
					ct85++;
				}
				sb.append(ct85+",");
				ct85 = 0;
				avg = 0;
				sum = 0;
				System.out.println(sb);
				out.println(sb.toString());				
			}
			out.close();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		

	}

}
