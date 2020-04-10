***Step by Step Guide to perform MongoDB operations using Java***


**Step1**

Open Eclipse. If it’s not already installed in your computer, installed from below link
https://www.eclipse.org/downloads/


**Step2**

Create  a New Java Project

File ==> New ==> Java Project ==> Give any Project Name (Example MongoDB) ==> Finish

**Step3**

It will create a new folder with same name (which we provided in step2 as Project Name)

If we expand it – we could see two folders 

a) JRE System library (contains some system java classes)
b) src (empty folder)

**Step4**

Inside ‘src’ folder – we will placed our all Java Codes.

Right click on the ‘src’ folder ==> New ==> Class ==> Give a class Name (example : ReadMongo) ==> Check mark on ‘public static void main (String[] args)  ==> Finish

**Step5**

Java does not provide the inbuilt mongo DB Modules. So We need to First download the .Jar File for MongoDB

Download from below link

https://jar-download.com/?search_box=mongo-java-driver

Save in your computer at any location (it not matters)

**Step6**

Go Back to eclipse ==> Right Click on Project Folder (which we created in Step2) ==.> click on Properties ==> click on ‘Java Build Path’ ==> Click on the ‘Libraries Tab’ ==> Click on “Add External Jar’s ==> Browse form your Downloaded location ==> Apply and Close

**Step7**

Once Step6 done, We could notice; One more sub-folder created with Name (Referenced Libraries)

if we expand it ; we could see our MongoDB Java .jar file 
and If we further expand it ; we could see all the drivers 
We will import or use the required ones in our Java Code.

**Step8**

Now, direct jumping to Java Code Part ; We need to first install the MongoDB into our computer.
MongoDB is a NoSQL free database.

**Step9**

Go to https://www.mongodb.com
Click on Try Free 
We will see 3 Tabs (Cloud/Server/Tools)
Click on Server
and Click on Download

For Windows Users ==> Just click on msi/exe (downloaded file) and install it (Just by clicking on Next, Next :)

It will installed in your  C drive 

generally 

C://ProgramFiles/MongoDB/Server/version_no/bin 

Inside bin ==> we could see many files

But mongod  && mongo   are the ones’ which we need

mongod ==> basically to start the server
mongo ==> basically to start the mongo shell

Open termial ==> Go to installed location as cd C://ProgramFiles/MongoDB/Server/version_no/bin 

and type ‘mongod’  and hit enter

It start the mongodb server; But sometimes it gives error as – Some file is not found   (generally data directory)

To sort this; just manually create the directory (on required expected location – as shown in error)

if sub directory also required (generall ‘db’)  - create the same in ‘data’  directory

Now; again type ‘mongod’   ==> your mongodb server will get started on your localhost (generally in port 27017)

Once it sucessfully started ; do not exit the terminal

Open a New Terminal ==> again go to same location where we have mongo (file) i.e. inside bin folder ==> and type mongo   (to start the mongo shell)

try running command on mongo shell

show dbs ;  ==> this will show existing database (initially it will show you default database)

**Step10 **

Now,  we have setup everything i.e. mongoDB server and JAR files in eclipse
Now write the code :)

I have put the codes  https://github.com/Sumanshu-Nankana/java_codes.git

MongoDB terminology ==>

Database        ====  Database
Collection      ====  Same as of Table (in Other DB’s)
Document      ==== (Same of of record or row in a Table)



************************************************************
***Just copy paste the code and run it. If you have any doubt, Feel free to ask
Happy Learning !!***

