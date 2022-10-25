class Book{
String bookname;
long ISBNnumber;
String authorname;
String publisher;
Book(){
String bookname= authorname= publisher=" ";
long ISBNnumber=0;
}
Book(String b,int i,String a,String p){
this.bookname=b;
this.ISBNnumber=i;
this.authorname=a;
this.publisher=p;
}
public String getBookname() {
return bookname;
}
public void setBookname(String bookname) {
this.bookname = bookname;
}
public long getISBNnumber() {
return ISBNnumber;
}
public void setISBNnumber(long iSBNnumber) {
ISBNnumber = iSBNnumber;
}
public String getAuthorname() {
return authorname;
}
public void setAuthorname(String authorname) {
this.authorname = authorname;
}
public String getPublisher() {
return publisher;
}
public void setPublisher(String publisher) {
this.publisher = publisher;
}
void getBookInfo() {
System.out.println(bookname+" "+ISBNnumber+" "+authorname+" "+publisher);
}
}