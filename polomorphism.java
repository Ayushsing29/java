public class polomorphism {
  public static void main(String[] args) {
    
  }  
}
class college{
    String name;
    String address;

    void study() {
        System.out.println("study1");
    }
    void study(int a){
        System.out.println("study2");
    }
    void study(int a,string b){}
}