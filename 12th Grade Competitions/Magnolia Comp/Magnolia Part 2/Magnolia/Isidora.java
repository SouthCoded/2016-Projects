import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Isidora {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Isidora.dat"));
		while(Sf.hasNext()){
			String in = Sf.next();
			int number = Sf.nextInt();
			
			String[] input = in.split("-");
			
			int changeNum = Integer.parseInt(input[1]);
			
			ArrayList<String> list = new ArrayList<String>();
			
			String binNum = Integer.toBinaryString(number);
			
			for(int x =0 ; x < binNum.length();x++){
				list.add(binNum.substring(x,x+1));
			}			
			
			if(input[0].equals("RS")){
				if(list.size() - changeNum < 0){
					System.out.println("0");
				}
				else{
					int change = list.size()-changeNum;

					for(int y = 0;y<change;y++){
						System.out.print(list.get(y));
					}
					System.out.println("");
				}
			}
			if(input[0].equals("LS")){
			
				for(int z = changeNum; z > 0;z--){
						list.add("0");
				}
				for(String y:list){
						System.out.print(y);
				}
					System.out.println("");
				
				
			}			
			if(input[0].equals("RC")){
				
				if(changeNum > list.size()){
					changeNum = changeNum % list.size();
				}
				
				ArrayList<String> otherlist = new ArrayList();
				
				int tots = list.size();
				for(int x =0; x<changeNum;x++){
					int random = list.size()-x-1;
					otherlist.add(list.get(random));
				}
				
				for(int o = 0; o<otherlist.size();o++){
					list.add(0,otherlist.get(o));
				}
				
				for(int p = 0; p<tots;p++){
					System.out.print(list.get(p));
				}
				System.out.println("");
				
			}
			if(input[0].equals("LC")){
				
				if(changeNum > list.size()){
					changeNum = changeNum % list.size();
				}
				ArrayList<String> otherlist = new ArrayList();
				
				int tots = list.size();
				for(int x =0;x<changeNum;x++){
					otherlist.add(list.get(x));
				}
				
				for(int o = 0; o<otherlist.size();o++){
					list.add(otherlist.get(o));
				}
				
				for(int p = changeNum; p<list.size();p++){
					System.out.print(list.get(p));
				}
				System.out.println("");
			}
		}
		
	}


}