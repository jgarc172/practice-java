import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class addRunner{
	public static void main(String[] args) throws FileNotFoundException{
		//get the input file
		Scanner scan = new Scanner(new File("pair2.txt"));
		//number of runner add
		int addRunner = 0;
		//number of persons running now
		int currentRunner = 0;
		while(scan.hasNext()){
			//read the line and split the numbers
			String[] pair = scan.nextLine().split("\\s");

			//may need to check if not number, assume the input file is in the right format
			
			//if current runner is less then needed runners
			//then we need to add runners
			if(currentRunner < Integer.parseInt(pair[0])){

				addRunner += Integer.parseInt(pair[0]) - currentRunner;
				currentRunner = Integer.parseInt(pair[1])+ addRunner;
			}else{
				currentRunner += Integer.parseInt(pair[1]);
			}
		}
		System.out.println(addRunner);
	}
}