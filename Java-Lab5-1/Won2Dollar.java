public class Won2Dollar extends Converter {
  public Won2Dollar(double ratio) {
    this.ratio = ratio;
  }
  //어노테이션 : 컴파일러가 개발자에게 정보를 주는것
  @Override //없으면 오버라이드가 되지않았다고만 하고 제대로 알려주지 않는다.
  protected double convert(double src) {
    return src / ratio;
  }
  @Override
  protected String getSrcString() {
    return "원";
  }
  @Override
  protected String getDestString() {
    return "달러";
  }
}