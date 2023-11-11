package com.train;

public class Tester {
      int totalTicket;
      int roundTripTicket;
      public int getSum(int totalTicket, int roundTripTicket) {
          this.totalTicket = totalTicket;
          this.roundTripTicket = roundTripTicket;
          return (totalTicket - roundTripTicket)*1000 + (roundTripTicket * 2000) * 90 /100;
      }
}
