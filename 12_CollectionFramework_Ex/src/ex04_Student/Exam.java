package ex04_Student;

public class Exam {

    private int kro;
    private int eng;
    private int math;
    
    // new Exam(100, 100, 100)
    public Exam(int kro, int eng, int math) {
      super();
      this.kro = kro;
      this.eng = eng;
      this.math = math;
    }

    public int getKro() {
      return kro;
    }

    public void setKro(int kro) {
      this.kro = kro;
    }

    public int getEng() {
      return eng;
    }

    public void setEng(int eng) {
      this.eng = eng;
    }

    public int getMath() {
      return math;
    }

    public void setMath(int math) {
      this.math = math;
    }

    @Override
    public String toString() {
      return "Exam [kro=" + kro + ", eng=" + eng + ", math=" + math + "]";
    }
    
    
}
