package DualTask_week4.task;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
/*import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;*/
import java.io.PrintStream;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	//BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
    	//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	@SuppressWarnings("resource")
		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    	Scanner in =new Scanner(System.in);
    	//myout.print("\n1 opion one to claculate Interest\n2 option to calculate the cost for buliding a buliding\n 3 option to exit");
        while(true) {
        	myout.print("\n1 opion one to claculate Interest\n2 option to calculate the cost for buliding a buliding\n3 option to exit\n");
        	myout.print("Enter option ");
        	int option = in.nextInt();
        	switch(option) {
        	case 1:
        		myout.print("enter principal amount ");
        		double p=in.nextDouble();
        		myout.print("enter time period ");
        		double t= in.nextDouble();
        		myout.print("Enter rate of interest ");
        		double r=in.nextDouble();
        		Interest i=new Interest(p,t,r);
        		myout.print("\noption 1- calculate simple interest\nOption 2- Calculates the compound interest\nEnter option ");
        		int  op=in.nextInt();
        		if(op==1) {
        			myout.print("Simple Interest is "+i.getSimpleinterest());
        		}
        		else {
        			myout.print("Compound Interest is "+i.getCompoundInterest());
        		}
        		break;
        	case 2:
        		myout.print("• Option 1-standard materials\n• Option 2-use above standard materials\n• Option 3-high standard material\n• Option 4-high standard material and fully automated home\n Enter the type material requried for type of constuction of buliding ");
        		int op2=in.nextInt();
        		myout.print("Enter the area of the land to estimate the cost of buliding ");
        		double area=in.nextDouble();
        		Building b=new Building(area,op2);
        		myout.print("Cost for construction of buliding is "+b.getCostOfBuilding());
        		break;
        	case 3:
        		//bw.close();
        		in.close();
        		return;
        		
        	}
        }

    }
}