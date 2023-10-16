public class Km2Mile extends Converter {
  public Km2Mile(double ratio) {
      this.ratio = ratio;
  }
  @Override //없으면 오버라이드가 되지않았다고만 하고 제대로 알려주지 않는다.
  protected double convert(double src) {
    return src / ratio;
  }
  @Override
  protected String getSrcString() {
    return "Km";
  }
  @Override
  protected String getDestString() {
    return "Mile";
  }
}