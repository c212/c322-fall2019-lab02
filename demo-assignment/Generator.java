public class Generator {
  public Generator() { } // I could have used the default 
  public void addRange() { } 
  public String nextString(int size) { return "haha"; }
  public static void main(String[] args) {
    Generator a = new Generator(); 
    a.addRange(); 
    a.addRange(); 
    String result = a.nextString(10); 
    System.out.println( result ); 
  }
}