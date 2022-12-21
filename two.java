package Java111Q2;
import java.io.*;
public class two {

	public static void main(String[] args)throws IOException {
		String str;
    	int storage;
    	int i = 1;
    	BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\rand.txt"));
    	while((i++)<=1000) {
    		storage = (int)(Math.random()*100000)+1; //強制轉型可以改成 a.intValue()
    		if (storage == 100000) {
    			i--;
    			continue;
    		}
    		bw.write(Integer.toString(storage));
    		bw.newLine();
    	}
    	bw.flush();
    	bw.close();
	}
}
