public class Generator {
  public Generator() { } // I could have used the default 
  public void addRange(char start, char end) { 
    // assume that start < end 
    
  } 
  public String nextString(int size) { return "haha"; }
  public static void main(String[] args) {
    Generator a = new Generator(); 
    a.addRange('a', 'z'); 
    a.addRange('A', 'Z'); 
    String result = a.nextString(10); 
    System.out.println( result ); 
  }
}