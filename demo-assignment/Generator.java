import java.util.ArrayList; 

public class Generator {
  public Generator() { } // I could have used the default 
  private ArrayList<Range> mark = new ArrayList<Range>(); 
  public void addRange(char start, char end) { 
    // assume that start < end 
    this.mark.add(new Range(start, end)); 
    
  } 
  public String toString() {
    return mark + "";  
  }
  public String nextString(int size) { 
    String answer = ""; 
    for (int i = 0; i < size; i++) {
      int index = ((int) (Math.random() * this.mark.size()) ); // why 0?
      System.out.println( index ); 
      answer += this.mark.get(index).getChar();  
    }
    return answer; 
  }
  public static void main(String[] args) {
    Generator a = new Generator(); 
    a.addRange('a', 'f'); 
    a.addRange('5', '8'); 
    a.addRange('m', 'q');     
    System.out.println( a ); 
    String result = a.nextString(10); 
    System.out.println( result ); 
  }
}