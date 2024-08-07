package Observerpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		YoutubeChannel channel=new YoutubeChannel();
		
		 Subscriber amrit=new Subscriber("amrit");
		 Subscriber kishore=new Subscriber("kishore");
			
		 channel.subscribe(amrit);
		 channel.subscribe(kishore);
		 
		 channel.notifyChnages("new vd uploaded");
		 channel.notifyChnages("new ang video ");
		 
		 BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		 while(true) {
			 System.out.println("Press 1 to upload video");
			 System.out.println("Press 2 to create new subscriber");
			 System.out.println("Press 3 to exit");
			 
			 int c=Integer.parseInt(bufferedReader.readLine());
			 
			 if(c==1) {
				 //new video upload
				 System.out.println("Enter video title ::");
				 String videotitle=bufferedReader.readLine();
				 channel.notifyChnages(videotitle);
			 }
			 else if(c==2) {
				 //create new subs
				 System.out.println("Enter subs name ::");
				 String subname=bufferedReader.readLine();
				 Subscriber sub = new Subscriber(subname);
				 channel.subscribe(sub);;
			 }
			 else if(c==3){
				 //exit
				 System.out.println("Thankyou for using our App ::");
                 break;
			 }
			 else {
				 System.out.println(" Wrong input ");
			 }
		 }
	}
}
