package de.hska.iwi.vislab.lab1.example.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "de.hska.iwi.vislab.lab1.example.ws.FibonacciService")
public class FibonacciServiceImpl implements FibonacciService {

  @Override
  public int getFibonacci(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n is expected to be >= 0");
    }
    return calcFibonacci(n);
  }

  private int calcFibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }
    return calcFibonacci(n - 1) + calcFibonacci(n - 2);
  }
}
