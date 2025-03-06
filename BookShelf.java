import java.util.ArrayList;

public class BookShelf {
    public char titleLetter;
    ArrayList<Book> myAL= new ArrayList<Book>(8);

    public BookShelf (char tl){
        titleLetter=tl;
    }
    public char gettitleLetter(){
        return titleLetter;
    }
    public void settitleLetter(char tl){
        titleLetter=tl;
    }
    public void addBook(Book toAdd){
        char x=toAdd.getTitle().charAt(0);
        if (x == titleLetter){
            myAL.add(toAdd);
        }
        //else{
        //    System.out.println("Book is not appropriate for this shelf");
        //}
    }
    public void removeBook(Book toRemove){
        int x=myAL.indexOf(toRemove);
        myAL.remove(x);
    }
    public String toString(){
        String output="";
        if(myAL.size()==0){
            output="Empty";
        }
        else{
            for (int i =0; i<myAL.size();i++){
                output+=myAL.get(i).getTitle();
                output+="   ";
                
            }
        }
        return (output);
    }
    
}
