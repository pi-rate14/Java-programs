package com.apoorva;
import java.util.Random;


class vote
{
    public static int c1,c2,c3;
    public static int arr[]=new int[240];
    public void random()
    {
        Random r=new Random();

        for (int i=0;i<240;i++)
        {


            int  a=r.nextInt(3);
            arr[i]=a+1;

        }
    }


}
class thread1 extends Thread
{
    public void run()
    {



        for(int i=0;i<60;i++)
        {
            if(vote.arr[i]==1)
            {
                vote.c1=vote.c1+1;

            }
            else if(vote.arr[i]==2)
            {
                vote.c2=vote.c2+1;
            }
            else{
                vote.c3=vote.c3+1;
            }
        }

    }
}
class thread2 extends Thread
{
    public void run()
    {

        for(int i=60;i<120;i++)
        {
            if(vote.arr[i]==1)
            {
                vote.c1=vote.c1+1;

            }
            else if(vote.arr[i]==2)
            {
                vote.c2=vote.c2+1;
            }
            else{
                vote.c3=vote.c3+1;
            }
        }
    }
}

class thread3 extends Thread
{
    public void run()
    {

        for(int i=120;i<180;i++)
        {
            if(vote.arr[i]==1)
            {
                vote.c1=vote.c1+1;

            }
            else if(vote.arr[i]==2)
            {
                vote.c2=vote.c2+1;
            }
            else{
                vote.c3=vote.c3+1;
            }
        }
    }
}

class thread4 extends Thread
{
    public void run()
    {

        for(int i=180;i<240;i++)
        {
            if(vote.arr[i]==1)
            {
                vote.c1=vote.c1+1;

            }
            else if(vote.arr[i]==2)
            {
                vote.c2=vote.c2+1;
            }
            else{
                vote.c3=vote.c3+1;
            }
        }
    }

}
public class Q3
{
    public static void main(String[] args) throws InterruptedException{

        vote a=new vote();
        a.random();
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        thread3 t3=new thread3();
        thread4 t4 =new thread4();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        System.out.println(vote.c1 +" "+ vote.c2 +" " +vote.c3);
        if(vote.c1>= vote.c2 && vote.c1>=vote.c3)
        {
            if (vote.c1==vote.c2 )
            {
                System .out.println("A and B got same vote ");
            }
            else if(vote.c1==vote.c3)
            {
                System .out.println("A and C got same vote ");
            }
            else
            {


                System.out.println("A won the election");
            }
        }
        else if(vote.c2>=vote.c1 && vote.c2>=vote.c3)
        {
            if(vote.c2==vote.c1  )
            {
                System.out.println("B and C ");
            }
            else if(vote.c2==vote.c3)
            {
                System.out.println("A and B ");
            }
            else

                System.out.println("B won the election");
        }
        else if(vote.c3>=vote.c1 && vote.c3>=vote.c2)
        {
            if(vote.c3==vote.c2)
            {
                System.out.println("A and B are equal");
            }
            else if (vote.c3==vote.c1)
            {
                System.out.println("A and C have same vote");
            }
            else

                System.out.println("C won the election");
        }

    }
}