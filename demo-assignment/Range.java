public class Range {
  private char a, b; 
  public Range(char a, char b) {
    this.a = a; 
    this.b = b;
  }
  public char getChar() {
    return (char) (Math.random() * (this.b - this.a + 1) + this.a); 
  }
  public static void main(String[] args) {
    Range a = new Range('e', 'm'); 
    System.out.println( a.getChar() ); 
    System.out.println( a.getChar() ); 
    System.out.println( a.getChar() ); 
  }
}