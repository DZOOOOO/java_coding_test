import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[Item_Storage_V3]");
        System.out.println("------------------------------");
        System.out.println("[System] 코드스테이츠 점장님 어서오세요.");
        System.out.println("[System] 해당 프로그램의 기능입니다.");
        System.out.println("1. 물건 정보(제품명) 등록하기");
        System.out.println("2. 물건 정보(제품명) 등록 취소하기");
        System.out.println("3. 물건 넣기 (제품 입고)");
        System.out.println("4. 물건 빼기 (제품 출고)");
        System.out.println("5. 재고 조회");
        System.out.println("6. 프로그램 종료");
        System.out.println("------------------------------");

        int index = 0;
        String[][] goods = {{"등록가능", "0"}, {"등록가능", "0"}, {"등록가능", "0"}, {"등록가능", "0"}, {"등록가능", "0"}};

        boolean button = true;

        while (button) {
            System.out.println("[System] 원하는 기능의 번호를 입력하세요 : ");
            int selectMenu = scanner.nextInt();

            switch (selectMenu) {
                case 1:
                    System.out.println("[System] 제품 등록을 원하는 제품명을 입력하세요 : ");
                    String selectGoods = scanner.next();
                    if (index < 5) {
                        goods[index][0] = selectGoods;
                        index++;

                        System.out.println("[System] 제품 등록이 완료되었습니다.");
                        System.out.println("[System] 현제 등록된 제품 목록 ▼");

                        for (String[] good : goods) {
                            System.out.println("> " + good[0]);
                        }

                    } else {
                        System.out.println("등록이 불가능합니다.");
                    }
                    break;
                case 2:


                case 3:
                    System.out.println("[System] 물건의 수량을 추가합니다.(입고)");
                    System.out.println("[System] 현재 등록된 제품 및 수량 ▼");
                    for (String[] good : goods) {
                        System.out.println("> " + good[0] + " : " + good[1] + "개");
                    }

                    System.out.println("[System] 수량을 추가할 제품명을 입력하세요 :");
                    String goodsName = scanner.next();

                    System.out.println("[System] 추가할 수량을 입력해주세요 :");
                    String goodsQuantity = scanner.next();

                    for (int i = 0; i < goods.length; i++) {
                        if (goods[i][0].equals(goodsName)) {
                            goods[i][1] = goodsQuantity;
                        } else {
                            System.out.println("제품명이 일치하지 않습니다..! 다시 입력해주세요..!");
                            break;
                        }
                    }

                    System.out.println("[Clear] 정상적으로 제품의 수량 추가가 완료되었습니다.");
                    System.out.println("[System] 현재 등록된 제품 및 수량 ▼");

                    for (String[] good : goods) {
                        System.out.println("> " + good[0] + " : " + good[1] + "개");
                    }

                case 4:


                case 5:


                case 6:
                    System.out.println("[System] 프로그램을 종료합니다.");
                    System.out.println("[System] 감사합니다.");
                    button = false;
            }
        }


    }
}
