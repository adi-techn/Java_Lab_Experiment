public class Que17{
     public static void main(String[] args) {
          String[] stockNames = {"ONGC", "TATASTEEL"};
          double[][] stocks = {{9.00, 150.50, 0},{9.30, 152.75, 0},
          {9.00, 300.00, 1},
          {9.30, 302.50, 1},
          {10.00, 301.75, 1}};
          System.out.println("Time | Stock Name | Stock Value");
          System.out.println("---------------------------------");
          for (int i = 0; i < stocks.length; i++) {
               double time = stocks[i][0];
               double value = stocks[i][1];
               int stockIndex = (int) stocks[i][2];
               String stockName = stockNames[stockIndex];
               System.out.printf("%.2f | %-10s | %.2f%n", time, stockName, value);
          }
     }
}
