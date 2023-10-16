import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    /*
    Won2Dollar toDollar = new Won2Dollar(1200); //1달러 1200원 //new 있는거 없는거??
    toDollar.run();
    Km2Mile toMile = new Km2Mile(1.6);
    toMile.run();*/
    Scanner scanner = new Scanner(System.in);
    Converter converter;
    while(true) {
      System.out.print("1:원 ->달러, 2:Km->Mile, 0: 종료>>");
      int menu = scanner.nextInt();
      if(menu == 0) {
        System.out.println("종료합니다.");
        break;
      }
      switch(menu) {
        case 1:
          converter = new Won2Dollar(1200);
          break;
        case 2:
          converter = new Km2Mile(1.6);
          break;
        default:
          System.out.println("메뉴 선택 오류");
          continue;
      }
      converter.run();
    }
    scanner.close();
  }
}