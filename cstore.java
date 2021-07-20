import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
abstract class q{
String s="welcome to RIYAZ sopping mall";
abstract void display();
abstract void glossary();
String r="item added in ur chat";
int noofjewllery=0,nooflipstick=0,count=0,amount=0,noofchain=0,noofring=0,noofglossary=0,noofwatch=0;

 void jewllery()
{
//String s="this is jewllery show room";
//System.out.println(s);

System.out.println("#######"+s+"#######");
System.out.println("\n1.ring\n2.chain\n\n");
Scanner f=new Scanner(System.in);
			System.out.println("\nenter your choice\n");
			int i=f.nextInt();
			
switch(i)
{
case 1:
System.out.println(r);
noofring++;
amount=amount+1000;
count++;
break;
case 2:
System.out.println(r);
noofchain++;
amount=amount+2000;
count++;
break;
}
}}
class r extends q{
String x;

void jewllery()
{
String s="this is jewllery show room";

System.out.println(super.s);

System.out.println("#######"+s+"#######");
System.out.println("\nwelcome to jewllery show room\n");
System.out.println("\n1.ring\n2.chain\n\n");
Scanner f=new Scanner(System.in);
			System.out.println("\nenter your choice\n");
			int i=f.nextInt();
			
switch(i)
{
case 1:
System.out.println(super.r);
noofring++;
amount=amount+2000;
count++;
break;
case 2:
System.out.println(super.r);
noofchain++;
amount=amount+8000;
count++;
break;

}
}


  void glossary()
{
System.out.println(super.s);
System.out.println("\nwelcome to glossary show room\n");
System.out.println("\n1.lipstick\n2.watch\n\n");
Scanner f=new Scanner(System.in);
			System.out.println("\nenter your choice\n");
			int i=f.nextInt();
			
switch(i)
{
case 1:
System.out.println(super.r);
nooflipstick++;
amount=amount+50;
count++;
break;
case 2:
System.out.println(super.r);
noofwatch++;
amount=amount+1500;
count++;
break;
}}
void review()
{
Random r=new Random();
int p=(int) (5*r.nextDouble());
if(p==1)
System.out.println("feedback is ::bad");
else if(p==2)

System.out.println("feedback is ::ok");
else if(p==3)

System.out.println("feedback is ::satisfaction");
else if(p==4)

System.out.println("feedback is ::good");
else if(p==5)

System.out.println("feedback is ::excellent");
else if(p==0)

System.out.println("improve more");

}
  void display()
{
int z=0;
System.out.println("## jewllery items ##");
System.out.println("\nno of ring items are"+noofring);
System.out.println("\nno of chain items are"+noofchain);
System.out.println();
System.out.println("## glossary items ##");
System.out.println("\nno of lipstick items are"+nooflipstick);
System.out.println("\nno of watch items are"+noofwatch);
System.out.println("\ntotal no ofitems are"+count);
System.out.println("\ntotal amount gain is"+amount);
Scanner f=new Scanner(System.in);
System.out.println("\nthe amount paid by the customer is\n");
int t=f.nextInt();
if(t<amount)
System.out.println("\n please pay ur correct amount\n");
else
 z=t-amount;

System.out.println("\nreturn amount is\n"+z);
}
void display(String i)
{
x=i;
System.out.println("the upcoming item is"+x);
}
void m()
{
int y;

			
do
{
			System.out.println("\n1.jewllery showroom\n");
			System.out.println("\n2.glossary showroom\n");
			System.out.println("\n3.display\n");
			System.out.println("\n4.display the new upcoming items\n");
			System.out.println("\n5.review\n");
			System.out.println("\npress greater than 4 to exit\n");
			Scanner ch=new Scanner(System.in);
			System.out.println("\nenter your choice\n");
			int a=ch.nextInt();
			switch(a)
			{
			case 1:
			jewllery();
			break;
			case 2:
			glossary();
			break;
			case 3:
			display();
			break;
			case 4:
			display("perfume");
			case 5:
			review();
			break;
			default:
				System.out.println("invalid");
			}
Scanner r=new Scanner(System.in);
System.out.println("\n if you want to contiunue press 4\n");
y=r.nextInt();
}
while(y==4);

}}
class a extends Thread{
 void det()
{
System.out.println("1.ring");
System.out.println("2.chain");
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
public void run()
{
det();
}
}
class b extends Thread{
 void show()
{
System.out.println("1.lipstick");
System.out.println("2.watch");
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
public void run()
{
show();
}
} 
class d
{
public static void main(String[] arg)
{
FileInputStream instream = null;
FileOutputStream outstream = null;
try{
File infile =new File("D:\\NHCE\\filein.txt");
File outfile =new File("D:\\NHCE\\fileout.txt");
instream = new FileInputStream(infile);
outstream = new FileOutputStream(outfile);
byte[] buffer = new byte[1024];
int len;
while((len= instream.read(buffer))>0)
{
outstream.write(buffer,0,len);
}
instream.close();
outstream.close();
System.out.println("done");
}
catch(IOException ioe)
{
ioe.printStackTrace();
}
a t1=new a();
b t2=new b();
t1.start();
t2.start();
r obj=new r();
obj.m();
}
}