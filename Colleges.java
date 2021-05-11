import java.util.*;
import java.io.*;
import java.io.FileWriter;  

/**
 *
 * @author Administrator
 */
 class Students {
    int s,i=0,p;
   int ii=0,ss=0;
   final int y=100,x=50,z=250;
   char a,b,c,d,e;
         
    String student[]= new String[1000];
     String id[]= new String[1000];
    String branch[]= new String[1000];
    String selected[]= new String[1000];
    String interview[]= new String[1000];
    int Score[]= new int[1000];
    float CGPA[]= new float[1000];
    String n="y",j;
     int syyyt[]= new int[60];
       
   
    Scanner sc= new Scanner(System.in);
    void idefault () throws IOException
            {
            String n;
                System.out.println(" ");
              System.out.println("Do u want to continue?");
            n=sc.next();
            if(n.charAt(0)=='y' || n.charAt(0)=='Y')
            {
               getName();
            }
            else
                System.exit(0);
   
           
             
        }
   /* boolean bedefault()
    {
        return true;
      
        
      
    }*/

   
   
    void getName() throws IOException
    {
        System.out.println("COLLEGE PLACEMENT FOR ---> CE,IT,CSE");
        while(n.equalsIgnoreCase("y"))
        {
         
        System.out.println("1:Companies Name\n2:Student Information\n3:Students Eligibility\n4:Test for Qualifying in 2 round\n5:Search");
        System.out.println("Enter Your Choice: ");
        p=sc.nextInt();
           
       
        switch(p)
                {
            case 1:
                System.out.println(" ");
                System.out.println("*Apple");
                System.out.println("*Samsung");
                System.out.println("*TCS");
                System.out.println("*Tata");
                System.out.println("*Facebook");
                System.out.println("*Idea");
                System.out.println("*Infosys");
                System.out.println("*Wipro");
                System.out.println("*HCL Tech.");
                System.out.println("*Reliance");
                System.out.println("*Tech Mahindra");
                System.out.println("*Google");
                System.out.println("*Myntra");
                System.out.println("*Flipkart");
                System.out.println("*Huawei");
                System.out.println(" ");
                idefault();
               
                 break;
       
           
       
           
        case 2:
System.out.println(" ");
        System.out.println("           Students Information!!                     ");
        String str;
        int st;
        int m=6;
        System.out.println("Enter Number of Students intrested in Placement: ");
        str=sc.next();
        st=Integer.parseInt(str);
        if(st<=0)
        {
            System.out.println("Not Possible");
            idefault();
        }
            
        //System.out.println(str.length());
        for(int i1=1;i1<str.length();i1++)
        {
            for(char c='a';c<='z' && m!=5 ;c++)
            {
                if(str.charAt(i1)==c)
                {
                    System.out.println("Invalid");
                   m=5;
                   if( true)
                    {
                        getName();
                    }
                    else
                    {
                        System.out.println("no");
                    }
                }
               
            }
        }
        s=Integer.parseInt(str);
       // System.out.println(""+s);
       
       // FileWriter fw = new FileWriter("Data.txt",true);
       
        for(i=1;i<=s;i++)
           
       
        {
        System.out.println("Enter Student Name: ");
        student[i]=sc.next();
       // fw.write(student[i]);
       // fw.write(" ");
       
       
        System.out.println("Enter Branch name: ");
        branch[i]=sc.next();
       // fw.write(branch[i]);
       // fw.write(" ");
        int m2=6;
        for(int i1=0;i1<branch[i].length();i1++)
        {
           
               
            for(char c='1';c<='9' && m2!=5 ;c++)
            {
             //   System.out.println(""+branch[i].charAt(i1));
                if(branch[i].charAt(i1)==c)
                {
                    System.out.println("Invalid");
                   
                      idefault();
                    
                  
                   m2=5;
                }
               
            }
        }
       
        System.out.println("Enter Student Id: ");
        id[i]=sc.next();
      
        //fw.write(id[i]);
        //fw.write(" ");
       
       

               
        //int m1=6 , st;
        /* for(int i3=0;i3<=id[i].length();i3++)
        {                      
            for(char c='a';c<='z' && m1!=2 ;c++)
            {
                if(str.charAt(i3)==c)
                {
                    System.out.println("Invalid");
                   //m1=5;
                    if(idefault())
                    {
                         getName();

                    }
                    else
                    {
                        System.out.println("no");
                       
                    }
                     m1=2;
                }
               
               
            }
        }*/
           
       
            syyyt[i]=Integer.parseInt(id[i]);
            if(syyyt[i]<=0)
            {
                System.out.println("Invalid");
            }
           
           else
            {
                 System.out.println("Enter Student CGPA");
        CGPA[i]=sc.nextFloat();
                System.out.println("Information Stored");
                
                    }
                    
                   
           // System.out.println(""+syyyt[i]);
       
        
       
      // fw.write(String.valueOf(CGPA[i]));
      // fw.write(" ");
       //fw.write("\n");
      // fw.close();
       
        }
       
         idefault();
     
       
       
       
   
break;
       
       
   
                case 3:
            String id1;
            System.out.println("");
         for(i=1;i<=s;i++)
         {
            try{
               
           
         System.out.println("Enter Student Id:  ");
         id1=sc.next();
             System.out.println("Analyzing Result...");
             Thread.sleep(1000);
             
           
               
             
         if(id1.equals(id[i]))
         {
           
         if(CGPA[i]==10)
         {
             System.out.println("Congrajulations!!!\nYou can get in all\nPriority: \n*Apple\n*Google\n*Facebook");
              }
         if(CGPA[i]>=9.5 &&CGPA[i]<10)
         {
             System.out.println("*Samsung\n*Tata\n*Myntra\n*Flipkart\n*Huawei\n*Infosys\n*Wipro\n*Reliance\n*TCS\n*Idea\n*Tech Mahindra\n*HCL Tech.");
             }
         if(CGPA[i]>=9 &&CGPA[i]<9.5)
         {
             System.out.println("*Tata\n*Myntra\n*Flipkart\n*Wipro\n*TCS\n*Idea\n*Tech Mahindra\n*HCL Tech.");
             }
          if(CGPA[i]>=8.5 &&CGPA[i]<9)
         {
             System.out.println("*Tata\n*Myntra\n*Flipkart\n*Tech Mahindra\n*HCL Tech.");
              }
         
           if(CGPA[i]>=7.5 &&CGPA[i]<8.5)
         {
             System.out.println("*Myntra\n*Flipkart\n*Tech Mahindra\n*HCL Tech.");
                     
         }
           if(CGPA[i]>=6.5 &&CGPA[i]<7.5)
         {
             System.out.println("*Flipkart\n*Tech Mahindra");
                 
         }
            if(CGPA[i]<=6.5)
         {
             System.out.println("Sorry! You are not eligible for interview in any of the companies...");
                       }
         }
         else
         {
             System.out.println("Invalid");
              if(true)
                    {
                        getName();
                    }
                    else
                    {
                        System.out.println("no");
                    }
         }
            }
         catch(Exception e)
                 {
                     System.out.println(""+e);
                 }
         
         }
         idefault();
       
        break;
         
        case 4:
          String id2;
           
             
            for(i=1;i<=s;i++)
            {
                if(CGPA[i]>6.5)
                {
                System.out.println("Enter id: ");
                id2=sc.next();
                if(id2.equals(id[i]))
                try{
                   
                 System.out.println("Please Wait a While...");
             Thread.sleep(1000);
             {
                    System.out.println("Ans The Following Questions from 1 to 5: ");
            System.out.println("1: Under which package is the string class encapsulated?\n" +"\n" +
                                "a. java.lang\n" +
                                "b. java.util\n" +
                                "c. java.io\n" +
                                "d. java.awt\n");
            a=sc.next().charAt(0);
                    System.out.println("Verifying Ans...");
                    Thread.sleep(1000);
            if (a=='a')
            {
                System.out.println("Correct Ans");
                ii++;
               // System.out.println(""+ii);
               
            }
            else
            {
                System.out.println("Wrong Ans");
                ss++;
            }
            Thread.sleep(1000);
                    System.out.println("Next Question ...");
                    Thread.sleep(1000);
             System.out.println("2: The life cycle of the thread is controlled by ?\n" +
                                 "a. JVM\n" +
                                 "b. JDK\n" +
                                 "c. JRE\n" +
                                 "d. None of the above\n");

            b=sc.next().charAt(0);
           System.out.println("Verifying Ans...");
                    Thread.sleep(1000);
         
            if (b=='a')
            {
                System.out.println("Correct Ans");
                ii++;
               // System.out.println(""+ii);
            }
            else
            {
                System.out.println("Wrong Ans");
                ss++;
                 if(ss==3)
                {
                   
                   System.out.println("Sorry, not Qualified for Interview Round");
                   interview[i]="Not Selected";
                       //throw new ArithmeticException("Over");
                       break;
                }
               
            }
              Thread.sleep(1000);
                    System.out.println("Next Question ...");
                    Thread.sleep(1000);
             System.out.println("3: Which of the package is used to enable interaction with garbage collector?\n" +
                                   "a. java.lang.reflect\n" +
                                   "b. java.lang.ref\n"+
                                   "c. java.lang\n" +
                                   "d. java.awt ");
            c=sc.next().charAt(0);
             System.out.println("Verifying Ans...");
                    Thread.sleep(1000);
         
            if (c=='b')
            {
                System.out.println("Correct Ans");
                ii++;
               
              // System.out.println(""+ii);
            }
            else  
            {
                System.out.println("Wrong Ans");
                ss++;
                if(ss==3)
                {
                   // System.out.println("hello");
                     System.out.println("Sorry, not Qualified for Interview Round");
                       interview[i]="Not Selected";
                     break;
                   
                 //      throw new ArithmeticException("Over");
                }
               
             
            }
              Thread.sleep(1000);
                    System.out.println("Next Question ...");
                    Thread.sleep(1000);
               System.out.println("4. Which field cannot be changed after the object has been constructed?\n"+
                                      "a. Static field\n"+
                                      "b. Non-static field\n"+
                                      "c. Final field\n"+
                                      "d. Naming field\n");
            d=sc.next().charAt(0);
            if (d=='c')
            {
                System.out.println("Correct Ans");
                ii++;
                 
                //System.out.println(""+ii);
            }
               
           
            else
            {
                System.out.println("Wrong Ans");
                ss++;
                if(ss==3)
                {
                   // System.out.println("hello");
                     System.out.println("Sorry, not Qualified for Interview Round");
                       interview[i]="Not Selected";
                     break;
                   
                 //      throw new ArithmeticException("Over");
                }
               
             
            }
              Thread.sleep(1000);
                    System.out.println("Next Question ...");
                    Thread.sleep(1000);
            System.out.println("5. EJB is like COM, Abbreviate the term COM?\n" +"\n" +
                                   "a. Component Object Model \n" +
                                   "b. Component Oriented Model\n" +
                                   "c. Common Object Model\n" +
                                   "d. Common Oriented Model");
            e=sc.next().charAt(0);
             System.out.println("Verifying Ans...");
                    Thread.sleep(1000);
         
            if (e=='a')
            {
                System.out.println("Correct Ans");
                ii++;
               
                System.out.println(""+ii);
            }
            else
            {
                System.out.println("Wrong Ans");
                ss++;
                if(ss==3)
                {
                   // System.out.println("hello");
                     System.out.println("Sorry, not Qualified for Interview Round");
                       interview[i]="Not Selected";
                     break;
                   
                 //      throw new ArithmeticException("Over");
                }
               
             
            }
           
           
            System.out.println("total points: "+ii);
            if(CGPA[i]>=7.5 && CGPA[i]<=9 && ii>=3 && ii<=5 && ss<=2)
                {
                    System.out.println("Selected for Interview ");
                      interview[i]="Selected";
                   
                   // System.out.println(""+interview[i]);
                }
               
             
            else if(CGPA[i]>=9 && ii==5)
                {
                    System.out.println("Selected For Interview");
                      interview[i]=" Selected";
                    //System.out.println(""+interview[i]);
                }
            else if(CGPA[i]<7.5 && CGPA[i]>6.5 && ss<=3 && (ii<=5 || ii>=3))
                {
                    System.out.println(" Selected for Interview");
                      interview[i]=" Selected";
                    // System.out.println(""+interview[i]);              
                }
            else
            {
                System.out.println("Not Selected");
            }
           
                    }
                    }
                catch(InterruptedException e1)
                {
                    System.out.println("Not Valid ID");
                     if(true)
                    {
                        getName();
                    }
                    else
                    {
                        System.out.println("no");
                    }
                }
                    }
                else
                {
                    System.out.println("Sorry! Not Eligible for Test.");
                     if(true)
                    {
                        getName();
                    }
                    else
                    {
                        System.out.println("no");
                    }
                   
                }
            }
           idefault();
            break;
           
           
            case 5:
            String id3;
           
           
           
            System.out.println("Enter Student Id to get information of that Student:   ");
             id3=sc.next();
             
             for(i=1;i<=s;i++)
             {
           if(id[i].equals(id3))
           {
             
                 
               FileWriter fwi = new FileWriter("Data1.txt",true);
     
            {
               System.out.println("Student Name: "+student[i]);
               System.out.println("Branch Name: "+branch[i]);
               System.out.println("CGPA is: "+CGPA[i]);
               System.out.println("RESULT: "+interview[i]);
               
               // System.out.println(""+syyyt[i]);
             
       fwi.write("");
               fwi.write(String.valueOf(student[i]));
               fwi.write(" ");
       
       fwi.write(" ");
              fwi.write(String.valueOf(branch[i]));
               fwi.write(" ");
       
       fwi.write(" ");
               fwi.write(String.valueOf(CGPA[i]));
                fwi.write(" ");
       
       fwi.write(" ");
       
               
       
         
                //System.out.println(""+id[i]);
                fwi.write(String.valueOf(interview[i]));
       fwi.write(" ");
               
       fwi.write("\n");
                fwi.close();
                System.out.println("Files saved");
                ii=0;
                ss=0;
                
     
           }}
           
             
             
       
             
             else
             {
                 System.out.println("Invalid");
                 
                 if(true)
                    {
                       getName();
                    }
                    else
                    {
                        System.out.println("no");
                    }
             }
             }
             idefault();
             
              default:
             
            System.out.println(" ");
            break;
        }
        }
        //System.out.println(num);
       
   
   
    }
   
             
    }
 
     class colleges extends Students
    {
          public static void main(String[] args)throws Exception {
           
       
  try
  {
      Scanner s=new Scanner(System.in);
        colleges s1 = new colleges();
               
        s1.getName();
        Integer a;
       
  }catch(InputMismatchException e)
  {
      System.out.println(e);
  }
  finally
  {
      //StudentsInfo s1=new StudentsInfo();
       colleges s1 = new colleges();
       
      System.out.println("Some Error Occured");
      s1.getName();
      
  }
       
    }
}

